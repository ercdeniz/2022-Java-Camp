package Databases;

import Customers.Customer;

public interface CustomerDao {
    void add(Customer customer);
    void remove(Customer customer);
}
