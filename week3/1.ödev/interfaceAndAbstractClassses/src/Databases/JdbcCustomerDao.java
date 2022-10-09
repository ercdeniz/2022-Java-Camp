package Databases;

import Customers.Customer;

public class JdbcCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Eklendi : JDBC");
    }

    @Override
    public void remove(Customer customer) {
        System.out.println("Silindi : JDBC");

    }
}
