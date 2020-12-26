package org.example.lectures.OOP;

import org.example.infrastructure.TestLogger;

public class TestApp {
    public static void main(String[] args) {

        TestLogger logger = new TestLogger();

        logger.log("Open browser");
        logger.log("Open web site");
        logger.log("Open login page");
        logger.log("Enter email");
        logger.log("Enter password");
        logger.log("Click Login button");
        logger.log("Check account page");
        logger.log("Close browser");
    }

}
