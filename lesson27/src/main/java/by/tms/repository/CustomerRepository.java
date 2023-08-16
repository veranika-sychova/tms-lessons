package by.tms.repository;

import by.tms.model.Customer;

import java.util.Optional;

public interface CustomerRepository {

    Optional<Customer> getCustomerByLogin (String login);

    void saveCustomer (String login, String pasword);
}

