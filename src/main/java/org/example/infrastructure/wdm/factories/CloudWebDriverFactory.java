package org.example.infrastructure.wdm.factories;


import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.wdm.enums.WebDriverType;

public class CloudWebDriverFactory implements WebDriverFactory {

    @Override
    public String create() {
        switch(WebDriverType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase())) {

            case CHROME:

                return "CLOUD Google Chrome";

            case FIREFOX:

                return "CLOUD Mozilla Firefox";

            case EDGE:

                return "CLOUD Microsoft Edge";

            default:

                return "";


        }
    }
}
