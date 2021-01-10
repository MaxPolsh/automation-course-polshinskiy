package org.example.homework.hw9;

import org.example.infrastructure.config.ConfigurationManager;

public abstract class DefaultWebDriverManager implements WebDriverManager {

    @Override
    public String getBrowser() {

        switch (ConfigurationManager.getInstance().getTestEnv()) {
            case "local":
                LocalWebDriverFactory localWebDriverFactory = new LocalWebDriverFactory();

                return localWebDriverFactory.create();

            case "remote":
                RemoteWebDriverFactory remoteWebDriverFactory = new RemoteWebDriverFactory();

                return remoteWebDriverFactory.create();

            case "cloud":
                CloudWebDriverFactory cloudWebDriverFactory = new CloudWebDriverFactory();

                return cloudWebDriverFactory.create();

            default:
                return "";
        }
    }

    @Override
    public void destroyBrowser(String browser) {
        if (browser != null)
            System.out.println("Closing browser:" + browser);

    }
}