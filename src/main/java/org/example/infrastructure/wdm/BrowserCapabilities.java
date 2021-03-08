package org.example.infrastructure.wdm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserCapabilities {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        options.setCapability("platformName", "Windows 10");
        options.setCapability("browserName", "Chrome");
        options.setCapability("browserVersion", "latest");

        WebDriver webDriver = new ChromeDriver(options);

        webDriver.quit();
    }
}
