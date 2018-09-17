package interfacemode.responsibility;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    private AbstractLogger nextLogger;//击鼓传花的具体实现1

    public void setNextLogger(AbstractLogger abstractLogger) {
        this.nextLogger = abstractLogger;//击鼓传花的具体实现2
    }

    public void logMessage(int level,String message) {
        if(this.level == level) {
            writeMessage(message);
        }
        if(nextLogger!=null) { //击鼓传花的具体实现3
            nextLogger.logMessage(level,message);
        }
    }

    abstract protected void writeMessage(String message);
}
