package Loggers;

public class FileLogger implements Logger {
    public void log(String data) {
        System.out.println("Logged: File/"+data);
    }
}
