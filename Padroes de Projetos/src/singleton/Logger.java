package singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static Logger instance;
    private PrintWriter logFile;

    private Logger() {
        try {
            logFile = new PrintWriter(new FileWriter("application.log", true), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logMessage(String message) {
        logFile.println(message);
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.logMessage("Log message 1");
        logger2.logMessage("Log message 2");

        // Both logger1 and logger2 are the same instance
        System.out.println(logger1 == logger2);  // Deve imprimir true
    }
}

