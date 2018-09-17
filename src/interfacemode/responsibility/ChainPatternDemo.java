package interfacemode.responsibility;

public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        fileLogger.setNextLogger(errorLogger);
        consoleLogger.setNextLogger(fileLogger);

        return consoleLogger;
    }

    public static void test() {
        AbstractLogger chainLogger = getChainOfLoggers();
        chainLogger.logMessage(AbstractLogger.ERROR,"This is an error information.");
        chainLogger.logMessage(AbstractLogger.DEBUG,"This is an debug level information.");
        chainLogger.logMessage(AbstractLogger.INFO,"This is an information.");
    }
}
