package by.tms.repository;

import by.tms.model.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository{

    private Map<String, String> db = new HashMap<>(){{
        put("login1", "pass1");
        put("login2", "pass2");
        put("login3", "pass3");
    }};

    @Override
    public Customer getCustomerByLogin(String login) {
        String password = db.get(login);
        if (password == null){
            System.out.println("Customer is not found");
            return null;
        } else {
            return new Customer(login, password);
        }
    }
}
