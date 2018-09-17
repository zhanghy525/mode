package interfacemode.responsibility;

public class ErrorLogger extends AbstractLogger{
    protected ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void writeMessage(String message){
        System.out.println("Error Console::Logger: " + message);
    }
}
