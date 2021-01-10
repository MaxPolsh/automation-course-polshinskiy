package org.example.homework.hw9;


public class RemoteWebDriverFactory implements WebDriverFactory{

    @Override
    public String create() {

        String browser = "Mozilla Firefox";

        return browser;
    }
}
