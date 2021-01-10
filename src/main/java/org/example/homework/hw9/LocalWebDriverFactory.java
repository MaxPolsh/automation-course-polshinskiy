package org.example.homework.hw9;

import org.example.infrastructure.config.ConfigurationManager;

public abstract class LocalWebDriverFactory implements WebDriverFactory{

    @Override
    public String create() {
        return ConfigurationManager.getInstance().getTestBrowser();
    }
}
