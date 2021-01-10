package org.example.homework.hw9;


public class CloudWebDriverFactory implements WebDriverFactory{

    @Override
    public String create() {
        String browser = "Microsoft Edge";

        return browser;
    }
}
