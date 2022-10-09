public class Main {

    public static void main(String[] args) {
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new DataBaseLogger(), new EmailLogger(), new ConsoleLogger()};
        for (BaseLogger logger : loggers) {
            logger.log("log Massage");
        }
        System.out.println("-------------------");
        CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
        customerManager.add();
    }
}
