package org.example.homework.hw9;


import org.example.infrastructure.config.ConfigurationManager;

public class CloudWebDriverFactory implements WebDriverFactory{

    @Override
    public String create() {
        switch(ConfigurationManager.getInstance().getTestBrowser()) {

            case "chrome":

                return "CLOUD Google Chrome";

            case "firefox":

                return "CLOUD Mozilla Firefox";

            case "edge":

                return "CLOUD Microsoft Edge";

            default:

                return "";


        }
    }
}
