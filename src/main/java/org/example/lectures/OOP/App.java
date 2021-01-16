package org.example.lectures.OOP;

import org.example.infrastructure.logger.StdTestLogger;
import org.example.infrastructure.utils.TestServer;
import org.example.homework.hw9.WebDriverManager;

public class App {
    public static void main(String[] args) {
        StdTestLogger logger = new StdTestLogger();

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
