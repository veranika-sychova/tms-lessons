package by.tms.repository;

import by.tms.model.Customer;
import by.tms.model.Task;
import by.tms.model.TaskStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static by.tms.model.TaskStatus.CREATED;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static CustomerRepositoryImpl instance;

    private CustomerRepositoryImpl() {
    }

    public static synchronized CustomerRepositoryImpl getInstance() {
        if (instance == null) {
            instance = new CustomerRepositoryImpl();
        }
        return instance;
    }

    private Map<String, Customer> db = new HashMap<>() {{
        put("login1", new Customer("login1", "pass1"));
        put("login2", new Customer("login2", "pass2", new ArrayList<Task>() {{
            add(new Task("go to yoga", CREATED));
            add(new Task("go to grocery", CREATED));
            add(new Task("feed a cat", CREATED));
        }}));
        put("login3", new Customer("login3", "pass3", new ArrayList<Task>() {{
            add(new Task("go to university", CREATED));
            add(new Task("meet friends", CREATED));
        }}));
    }};

    @Override
    public Optional<Customer> getCustomerByLogin(String login) {
        return Optional.of(db.get(login));
    }

    @Override
    public void saveCustomer(String login, String password) {
        db.put(login, new Customer(login, password));
    }
}
