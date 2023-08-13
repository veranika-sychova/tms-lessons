package by.tms.repository;

import by.tms.model.Customer;

public interface CustomerRepository {

    Customer getCustomerByLogin (String login);
}
