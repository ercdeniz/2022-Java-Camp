public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        System.out.println(customer.email = ".........@.....");
        System.out.println(employee.salary = 10000);

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();
        customerManager.Add();
        employeeManager.BestEmployee();
    }
}
