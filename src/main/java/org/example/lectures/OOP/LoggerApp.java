package org.example.lectures.OOP;

import org.example.infrastructure.logger.FileTestLogger;
import org.example.infrastructure.logger.StdTestLogger;
import org.example.infrastructure.logger.TestLogger;

public class LoggerApp {
    public static void main(String[] args) {
        TestLogger logger = getLogger();
        logger.log("step 1");
        logger.log("step 2");
        logger.log("step 3");
        logger.log("step 4");
        logger.log("step 5");
        logger.log("step 6");
        logger.log("step 7");
    }

    public static TestLogger getLogger(){
        return System.getenv("testLogger").equals("file") ? new FileTestLogger("temp.txt") : new StdTestLogger();
    }
}
