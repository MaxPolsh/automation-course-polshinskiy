package org.example.lectures.OOP;

public class TestRunner {
    public static void main(String[] args) {
        LoginTests loginTests = new LoginTests();
        RegisterTests registerTests = new RegisterTests();


        loginTests.setUp();
        loginTests.testEmptyLoginForm();
        loginTests.cleanUp();

        loginTests.setUp();
        loginTests.testEmptyPassword();
        loginTests.cleanUp();

        loginTests.setUp();
        loginTests.testIncorrectLogin();
        loginTests.cleanUp();

        loginTests.setUp();
        loginTests.testIncorrectPassword();
        loginTests.cleanUp();

        registerTests.setUp();
        registerTests.testEmptyRegisterForm();
        registerTests.cleanUp();


    }

}
