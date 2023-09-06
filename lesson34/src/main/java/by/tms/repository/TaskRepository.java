package by.tms.repository;

import by.tms.Task;
import by.tms.TaskStatus;
import by.tms.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.EnumType;
import javax.persistence.OptimisticLockException;
import java.util.List;

public class TaskRepository {

    private SessionFactory sessionFactory;

    public TaskRepository() {
        Configuration configuration = new Configuration();

        configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/postgres");
        configuration.setProperty("hibernate.connection.username", "postgres");
        configuration.setProperty("hibernate.connection.password", "postgres");
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL95Dialect");
        configuration.setProperty("hibernate.current_session_context_class", "thread");

        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Task.class);

        sessionFactory = configuration.buildSessionFactory();
    }

    public void createTask (Task task){
        Session currentSession = sessionFactory.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        currentSession.save(task);
        transaction.commit();
        currentSession.close();
    }

    public void changeTaskStatus (Task task){
        Session currentSession = sessionFactory.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        try {
            currentSession.update(task);
            transaction.commit();
        } catch (OptimisticLockException e){
           transaction.rollback();
        } finally {
            currentSession.close();
        }
    }


    public Task getTaskById(Integer id){
        Session currentSession = sessionFactory.getCurrentSession();
        return currentSession.get(Task.class, id);
    }

    public List<Task> getTaskByUser (Integer userId){
        Session currentSession = sessionFactory.getCurrentSession();
        User user = currentSession.get(User.class, userId);
        return user.getTasks();
    }
}
