package org.example.homework.hw9;


public class LocalWebDriverFactory implements WebDriverFactory{

    @Override
    public String create() {
        String browser = "Google Chrome";

        return browser;

    }
}
