package by.tms.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String username;
    private String password;
    private List<Task> tasks = new ArrayList<>();

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Customer(String username, String password, List<Task> tasks) {
        this.username = username;
        this.password = password;
        this.tasks = tasks;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
