package org.example.infrastructure.wdm;

public interface WebDriverManager {
    String getWebDriver();

    void destroyBrowser(String webDriver);
}
