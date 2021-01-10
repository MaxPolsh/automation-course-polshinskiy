package org.example.homework.hw9;

import org.example.infrastructure.config.ConfigurationManager;

public abstract class DefaultWebDriverManager implements WebDriverManager {

    @Override
    public String getBrowser() {

        switch (ConfigurationManager.getInstance().getTestBrowser()) {
            case "local":
                return "Google Chrome";
            case "remote":
                return "Mozilla Firefox";
            case "cloud":
                return "Microsoft Edge";
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