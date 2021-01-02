package org.example.lectures.OOP;

import org.example.infrastructure.base.TestBase;

public class RegisterTests extends TestBase {

    @Override
    protected void beforeTest() {
        logger.log("Open register dialog");

    }

    @Override
    protected void afterTest() {
        logger.log("Delete newly created user");
    }

    public void testEmptyRegisterForm(){
        logger.log("Click login button");
        logger.log("Check error message");

    }
}
