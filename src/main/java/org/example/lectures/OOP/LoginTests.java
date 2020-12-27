package org.example.lectures.OOP;

import org.example.infrastructure.TestBase;

public class LoginTests extends TestBase {
    @Override
    protected void beforeTest() {
        logger.log("Open login dialog");
    }

    public void testIncorrectLogin(){
        logger.log("Enter incorrect login");
        logger.log("Enter password");
        logger.log("Click login button");
        logger.log("Check error message");

    }

    public void testIncorrectPassword(){
        logger.log("Enter login");
        logger.log("Enter incorrect password");
        logger.log("Click login button");
        logger.log("Check error message");
    }

    public void testEmptyPassword(){
        logger.log("Enter login");
        logger.log("Click login button");
        logger.log("Check error message");
    }

    public void testEmptyLoginForm(){
        logger.log("Click login button");
        logger.log("Check error message");
    }
}
