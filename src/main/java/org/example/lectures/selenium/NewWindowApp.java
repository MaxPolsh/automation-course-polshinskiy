package org.example.lectures.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowApp {
    public static void main (String [] args) {

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://next.privat24.ua/history/transactions");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        webDriver.findElement(By.linkText("Регламент")).click();

        SeleniumUtils seleniumUtils = new SeleniumUtils(webDriver);
        seleniumUtils.switchToWindow("Переказ на картку/Рахунок у Приватбанку");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        seleniumUtils.switchToParentWindow();
        seleniumUtils.closeExtraWindows();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        webDriver.quit();

    }
}
