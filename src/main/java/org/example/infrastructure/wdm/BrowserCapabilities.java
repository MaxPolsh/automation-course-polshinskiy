package org.example.infrastructure.wdm;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserCapabilities {
    public static void main(String[] args) {
        MutableCapabilities sauceOptions = new MutableCapabilities();

        ChromeOptions options = new ChromeOptions();

        options.setExperimentalOption("w3c", true);
        options.setCapability("platformName", "Windows 7");
        options.setCapability("browserVersion", "latest-1");
        options.setCapability("sauce:options", sauceOptions);

        WebDriver webDriver = new ChromeDriver(options);

        webDriver.quit();
    }
}
