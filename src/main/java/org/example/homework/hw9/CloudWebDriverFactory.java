package org.example.homework.hw9;

import org.example.infrastructure.config.ConfigurationManager;

public abstract class CloudWebDriverFactory implements WebDriverFactory{

    @Override
    public String create() {
        return ConfigurationManager.getInstance().getTestBrowser();
    }
}
