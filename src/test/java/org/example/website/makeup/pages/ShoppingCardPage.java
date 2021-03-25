package org.example.website.makeup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCardPage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public ShoppingCardPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(this.webDriver, 30);
    }

    public void clickCheckout(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Оформить заказ")));

        webDriver.findElement(By.linkText("Оформить заказ")).click();
    }
}
