package org.example.infrastructure.wdm.factories;


import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.wdm.enums.WebDriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloudWebDriverFactory implements WebDriverFactory {

    @Override
    public WebDriver create() {
        switch(WebDriverType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase())) {

            case CHROME:

                return new ChromeDriver();

            case FIREFOX:

                return new FirefoxDriver();

            case EDGE:

                return new EdgeDriver();

            default:

                throw new IllegalArgumentException("Unsupported driver");

        }
    }
}
