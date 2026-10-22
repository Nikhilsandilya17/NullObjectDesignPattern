public class NullObjectDPDemo {
    static void main() {
        LoggerService loggerService = new LoggerService(new ConsoleLogger());
        loggerService.log("Hello World");

    }
}
