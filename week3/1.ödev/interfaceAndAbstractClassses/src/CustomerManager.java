import Credits.ICreditManager;
import Customers.Customer;
import Databases.CustomerDao;
import Loggers.Logger;

public class CustomerManager {
    private CustomerDao customerDao;
    private ICreditManager creditManager;
    private Customer customer;
    private Logger[] loggers;

    public CustomerManager
            (CustomerDao customerDao, ICreditManager creditManager, Customer customer, Logger[] loggers) {
        this.creditManager = creditManager;
        this.customerDao = customerDao;
        this.customer = customer;
        this.loggers = loggers;
    }

    public void add(Customer customer) {
        customerDao.add(customer);
        creditManager.calculate(creditManager);
        System.out.println("Mail: " + customer.getMail());
        System.out.println("----------------");
        for (Logger logger : loggers) {
            logger.log(customer.getMail());
        }
    }

    public void remove(Customer customer) {
        customerDao.remove(customer);
    }
}
