package org.example.lectures.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {

    private WebDriver webDriver;
    private String parentWindow;

    public SeleniumUtils(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.parentWindow = webDriver.getWindowHandle();
    }

    public void switchToWindow(String title) {

        WebDriverWait wait = new WebDriverWait(webDriver, 30);

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String wId : webDriver.getWindowHandles()) {

            webDriver.switchTo().window(wId);

            if (webDriver.getTitle().equals(title)) {
                return;
            }
        }
    }


    public void switchToParentWindow() {

        webDriver.switchTo().window(parentWindow);
    }

    public void closeExtraWindows() {

        for (String wId : webDriver.getWindowHandles()) {

            if(!wId.equals(parentWindow)){

                webDriver.switchTo().window(wId);
                webDriver.close();
            }
        }
    }
}
