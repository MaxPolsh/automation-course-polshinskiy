package org.example.lectures.OOP;

import org.example.infrastructure.TestLogger;
import org.example.infrastructure.TestServer;
import org.example.infrastructure.WebDriverManager;

public class App {
    public static void main(String[] args) {
        TestLogger logger = new TestLogger();

        logger.log("Start browser");
        WebDriverManager wdm = new WebDriverManager();
        String testBR = wdm.getBrowser();
        System.out.println("--> Starting  " + testBR);

        logger.log("Start browser");
        System.out.println("--> Opening  " + TestServer.getUrl() + " browser");


        logger.log("step");
        logger.log("step");
        logger.log("step");
        logger.log("step");
        logger.log("check");

        logger.log("Close browser");
        wdm.destroyBrowser(testBR);
    }
}
