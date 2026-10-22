public class LoggerService {
    private final Logger logger;
    public LoggerService(Logger logger) {
        this.logger = logger != null ? logger : new NullObjectLogger();
    }

    public void log(String message) {
        logger.log(message);
    }
}
