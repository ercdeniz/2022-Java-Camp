import Credits.CarCreditManager;
import Customers.Customer;
import Customers.IndividualCustomer;
import Databases.JdbcCustomerDao;
import Loggers.DatabaseLogger;
import Loggers.FileLogger;
import Loggers.Logger;

public class Main {

    public static void main(String[] args) {
        IndividualCustomer individualCustomer=new IndividualCustomer
                ("Ercan","Deniz","132413",1,"erc@mail");

        Logger[] loggers={new DatabaseLogger(),new FileLogger()};

        CustomerManager customerManager=new CustomerManager
                (new JdbcCustomerDao(), new CarCreditManager(),individualCustomer,loggers);
        customerManager.add(individualCustomer);
    }
}
