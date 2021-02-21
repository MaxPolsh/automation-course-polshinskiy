package org.example.lectures.OOP;

import org.example.infrastructure.base.TestBase;
import org.example.User;

public class LoginTests extends TestBase {
    @Override
    protected void beforeTest() {
        logger.log("Open login dialog");
    }

    public void testIncorrectLogin(){
        User user = userData.findUserByUsername("test7");

        logger.log("Enter incorrect login");
        System.out.println(user.getEmail());

        logger.log("Enter password");
        System.out.println(user.getPassword());

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
