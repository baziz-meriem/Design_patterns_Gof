package creationalPatterns.singleton;

public class Logger {
    private static Logger LoggerInstance;

    // Private constructor to prevent instantiation
    private Logger() {}

    public static Logger getInstnace() {
        //make sure only one thread executes this

        if (LoggerInstance == null) {
            //no other thread can access the class
            synchronized(Logger.class) {
                LoggerInstance = new Logger();
            }
        }
        return LoggerInstance;

    }
    public void log(String message) {
        System.out.println(message);
    }
}
