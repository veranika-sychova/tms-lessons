package by.tms;

import by.tms.repository.TaskRepository;
import by.tms.repository.UserRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();
        TaskRepository taskRepository = new TaskRepository();

        Date date = new Date(1220, 01, 01);

        User user1 = new User();
        User user2 = new User();
        Task task1 = new Task();
        Task task2 = new Task();
        Task task3 = new Task();
        Task task4 = new Task();

        task1.setId(1);
        task1.setName("Go to the grocery");
        task1.setDescription("Description task1");
        task1.setStatus(TaskStatus.NEW);
        task1.setUser(user1);

        task2.setId(2);
        task2.setName("Go to the school");
        task2.setDescription("Description task2");
        task2.setStatus(TaskStatus.IN_PROGRESS);
        task2.setUser(user1);

        List<Task> tasks12 = new ArrayList<>();
        tasks12.add(task1);
        tasks12.add(task2);

        task3.setId(3);
        task3.setName("Go to the library");
        task3.setDescription("Description task3");
        task3.setStatus(TaskStatus.DONE);
        task3.setUser(user2);

        task4.setId(4);
        task4.setName("Go to the downtown");
        task4.setDescription("Description task4");
        task4.setStatus(TaskStatus.NEW);
        task4.setUser(user2);

        List<Task> tasks34 = new ArrayList<>();
        tasks34.add(task3);
        tasks34.add(task4);

        user1.setId(1);
        user1.setName("Vasya");
        user1.setGender("male");
        user1.setBirthDate(date);
        user1.setTasks(tasks12);
        user1.setType(UserType.USER);

        user2.setId(2);
        user2.setName("Olya");
        user2.setGender("female");
        user2.setBirthDate(date);
        user2.setTasks(tasks34);
        user2.setType(UserType.SUPPORT);

        userRepository.saveUser(user1);
        userRepository.saveUser(user2);

        task1.setStatus(TaskStatus.IN_PROGRESS);
        taskRepository.changeTaskStatus(task1);

        task4.setStatus(TaskStatus.DONE);
        taskRepository.changeTaskStatus(task4);

        System.out.println(userRepository.getUsersWithTaskInProgress());

        userRepository.deleteUser(user1);
        userRepository.deleteUser(user2);

    }
}
