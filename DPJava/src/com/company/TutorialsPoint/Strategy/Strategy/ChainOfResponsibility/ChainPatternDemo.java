package com.company.TutorialsPoint.Strategy.Strategy.ChainOfResponsibility;

public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "this is an information");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information");
        loggerChain.logMessage(AbstractLogger.ERROR, "this is an error information.");
    }
}
