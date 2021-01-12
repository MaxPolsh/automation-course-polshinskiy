package org.example.homework.hw9;

import org.example.infrastructure.config.ConfigurationManager;

public abstract class DefaultWebDriverManager implements WebDriverManager {

    @Override
    public String getWebDriver() {

        WebDriverFactory factory;

        switch (ConfigurationManager.getInstance().getRunOn()) {
            case "remote":
                factory = new RemoteWebDriverFactory();
                break;
            case "cloud":
                factory = new CloudWebDriverFactory();
                break;
            case "local":
            default:
                factory = new LocalWebDriverFactory();
                break;

        }
        return factory.create();

    }

    @Override
    public void destroyBrowser(String browser) {
        if (browser != null)
            System.out.println("Closing browser:" + browser);

    }
}