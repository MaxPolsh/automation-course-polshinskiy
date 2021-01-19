package org.example.infrastructure.wdm;

public interface WebDriverManager {
    String getWebDriver();

    void destroyWebDriver(String webDriver);
}
