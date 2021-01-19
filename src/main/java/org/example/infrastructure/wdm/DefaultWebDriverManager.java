package org.example.infrastructure.wdm;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.wdm.enums.RunOn;
import org.example.infrastructure.wdm.factories.CloudWebDriverFactory;
import org.example.infrastructure.wdm.factories.LocalWebDriverFactory;
import org.example.infrastructure.wdm.factories.RemoteWebDriverFactory;
import org.example.infrastructure.wdm.factories.WebDriverFactory;

import java.util.Locale;

public class DefaultWebDriverManager implements WebDriverManager {

    @Override
    public String getWebDriver() {

        WebDriverFactory factory;

        switch (RunOn.valueOf(ConfigurationManager.getInstance().getRunOn().toUpperCase())) {
            case REMOTE:
                factory = new RemoteWebDriverFactory();
                break;
            case CLOUD:
                factory = new CloudWebDriverFactory();
                break;
            case LOCAL:
            default:
                factory = new LocalWebDriverFactory();
                break;

        }
        return factory.create();

    }

    @Override
    public void destroyWebDriver(String webDriver) {
        if (webDriver != null)
            System.out.println("Closing browser:" + webDriver);
    }
}