package org.example.infrastructure.wdm.factories;


import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.wdm.enums.WebDriverType;

public class LocalWebDriverFactory implements WebDriverFactory {

    @Override
    public String create() {
        switch(WebDriverType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase())) {

            case CHROME:

                return "LOCAL Google Chrome";

            case FIREFOX:

                return "LOCAL Mozilla Firefox";

            case EDGE:

                return "LOCAL Microsoft Edge";

            default:

                return "";
        }
    }
}
