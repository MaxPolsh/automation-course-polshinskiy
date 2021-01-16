package org.example.infrastructure.wdm.factories;


import org.example.infrastructure.config.ConfigurationManager;

public class RemoteWebDriverFactory implements WebDriverFactory {

    @Override
    public String create() {

        switch(ConfigurationManager.getInstance().getTestBrowser()) {

            case "chrome":

                return "REMOTE Google Chrome";

            case "firefox":

                return "REMOTE Mozilla Firefox";

            case "edge":

                return "REMOTE Microsoft Edge";

            default:

                return "";


        }
    }
}
