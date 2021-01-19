package org.example.infrastructure.wdm.factories;


import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.wdm.enums.WebDriverType;

public class RemoteWebDriverFactory implements WebDriverFactory {

    @Override
    public String create() {

        switch(WebDriverType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase())) {

            case CHROME:

                return "REMOTE Google Chrome";

            case FIREFOX:

                return "REMOTE Mozilla Firefox";

            case EDGE:

                return "REMOTE Microsoft Edge";

            default:

                return "";


        }
    }
}
