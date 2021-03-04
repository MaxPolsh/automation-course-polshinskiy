package org.example.infrastructure.wdm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PlatformCapabilities {
    public static void main(String[] args) {

        DesiredCapabilities caps = new DesiredCapabilities();

        ChromeOptions options = new ChromeOptions();
        caps.setCapability("chromedriverVersion", "2.45");
        caps.setCapability("geckodriverVersion", "0.27.0");
        caps.setCapability("seleniumVersion", "2.46.0");
        caps.setCapability("avoidProxy", "true");
        caps.setCapability("extendedDebugging", "true");
        caps.setCapability("capturePerformance", "true");
        caps.setCapability("webdriver.remote.quietExceptions", "false");
        options.merge(caps);

        WebDriver webDriver = new ChromeDriver(options);

        webDriver.quit();
    }
}
