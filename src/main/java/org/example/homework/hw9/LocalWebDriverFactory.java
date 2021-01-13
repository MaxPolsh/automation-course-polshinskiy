package org.example.homework.hw9;


import org.example.infrastructure.config.ConfigurationManager;

public class LocalWebDriverFactory implements WebDriverFactory{

    @Override
    public String create() {
        switch(ConfigurationManager.getInstance().getTestBrowser()) {

            case "chrome":

                return "LOCAL Google Chrome";

            case "firefox":

                return "LOCAL Mozilla Firefox";

            case "edge":

                return "LOCAL Microsoft Edge";

            default:

                return "";


        }
    }
}
