package Loggers;

public class DatabaseLogger implements Logger{
    public void log(String data){
        System.out.println("Logged: Database/"+data);
    }
}
