package by.tms.repository;

import by.tms.Task;
import by.tms.TaskStatus;
import by.tms.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class UserRepository {

    private SessionFactory sessionFactory;

    public UserRepository() {
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


    public void saveUser(User user) {
        Session currentSession = sessionFactory.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        currentSession.save(user);
        transaction.commit();
        currentSession.close();
    }

    public void updateUser(User user) {
        Session currentSession = sessionFactory.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        currentSession.update(user);
        transaction.commit();
        currentSession.close();
    }

    public void deleteUser(User user) {
        Session currentSession = sessionFactory.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        currentSession.delete(user);
        transaction.commit();
        currentSession.close();
    }

    public User getById(Integer id) {
        Session currentSession = sessionFactory.getCurrentSession();
        return currentSession.get(User.class, id);
    }

    public List<User> getUsersWithTaskInProgress() {
        Session currentSession = sessionFactory.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        String queryString = "SELECT DISTINCT u FROM User u JOIN u.tasks t WHERE t.status = :taskStatus";

        List<User> users = currentSession.createQuery(queryString, User.class)
                .setParameter("taskStatus", TaskStatus.IN_PROGRESS)
                .list();
        transaction.commit();
        currentSession.close();

        return users;
    }


}
