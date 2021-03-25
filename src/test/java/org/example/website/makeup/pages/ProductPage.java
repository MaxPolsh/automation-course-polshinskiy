package org.example.website.makeup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
    public WebDriver webDriver;

    private WebDriverWait wait;

    public ProductPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(webDriver,30);
    }

    public void clickByButton(){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".button.buy")));
        webDriver.findElement(By.cssSelector(".button.buy")).click();
    }
}
