package Databases;

import Customers.Customer;

public class HibernateCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Eklendi : Hibernate");
    }

    public void remove(Customer customerl) {
        System.out.println("Silindi : Hibernate");
    }
}
