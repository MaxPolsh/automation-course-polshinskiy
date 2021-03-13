package org.example.website;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class LoginTests {

    @Test
    public void emptyFieldsTest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://polshinsky.iblogger.org");

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement metaBlock = webDriver.findElement(By.id("meta-2"));
        List<WebElement> links = metaBlock.findElements(By.tagName("a"));

        Actions actions = new Actions(webDriver);
        actions.moveToElement(metaBlock).perform();

        for (WebElement link: links){
            if (link.getText().contains("Войти")){
                link.click();
                break;
            }
        }

        WebElement loginField = webDriver.findElement(By.id("user_login"));
        loginField.click();
        loginField.clear();
        loginField.sendKeys("");

        WebElement passField = webDriver.findElement(By.id("user_pass"));
        passField.click();
        passField.clear();
        passField.sendKeys("");

        webDriver.findElement(By.id("wp-submit")).click();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement errorEl = webDriver.findElement(By.id("login_error"));

        assertTrue("Incorrect error", errorEl.getText().contains("ОШИБКА"));

        webDriver.quit();
    }

    @Test
    public void emptyLoginTest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://polshinsky.iblogger.org");

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement metaBlock = webDriver.findElement(By.id("meta-2"));
        List<WebElement> links = metaBlock.findElements(By.tagName("a"));

        Actions actions = new Actions(webDriver);
        actions.moveToElement(metaBlock).perform();

        for (WebElement link: links){
            if (link.getText().contains("Войти")){
                link.click();
                break;
            }
        }

        WebElement loginField = webDriver.findElement(By.id("user_login"));
        loginField.click();
        loginField.clear();
        loginField.sendKeys("");

        WebElement passField = webDriver.findElement(By.id("user_pass"));
        passField.click();
        passField.clear();

        for (Character c:"admin".toCharArray()){
            passField.sendKeys("" + c);

            try{
                Thread.sleep(300);
            }

            catch  (Exception e){
                e.printStackTrace();
            }
        }
        webDriver.findElement(By.id("wp-submit")).click();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement errorEl = webDriver.findElement(By.id("login_error"));

        assertTrue("Incorrect error", errorEl.getText().contains("ОШИБКА"));

        webDriver.quit();
    }

    @Test
    public void emptyPassTest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://polshinsky.iblogger.org");

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement metaBlock = webDriver.findElement(By.id("meta-2"));
        List<WebElement> links = metaBlock.findElements(By.tagName("a"));

        Actions actions = new Actions(webDriver);
        actions.moveToElement(metaBlock).perform();

        for (WebElement link: links){
            if (link.getText().contains("Войти")){
                link.click();
                break;
            }
        }

        WebElement loginField = webDriver.findElement(By.id("user_login"));
        loginField.click();
        loginField.clear();
        loginField.sendKeys("admin");

        WebElement passField = webDriver.findElement(By.id("user_pass"));
        passField.click();
        passField.clear();
        passField.sendKeys("");

        webDriver.findElement(By.id("wp-submit")).click();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement errorEl = webDriver.findElement(By.id("login_error"));

        assertTrue("Incorrect error", errorEl.getText().contains("ОШИБКА"));

        webDriver.quit();
    }

    @Test
    public void incorrectPassTest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://polshinsky.iblogger.org");

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement metaBlock = webDriver.findElement(By.id("meta-2"));
        List<WebElement> links = metaBlock.findElements(By.tagName("a"));

        Actions actions = new Actions(webDriver);
        actions.moveToElement(metaBlock).perform();

        for (WebElement link : links) {
            if (link.getText().contains("Войти")) {
                link.click();
                break;
            }
        }

        WebElement loginField = webDriver.findElement(By.id("user_login"));
        loginField.click();
        loginField.clear();
        loginField.sendKeys("admin");

        WebElement passField = webDriver.findElement(By.id("user_pass"));
        passField.click();
        passField.clear();

        for (Character c : "admin".toCharArray()) {
            passField.sendKeys("" + c);

            try {
                Thread.sleep(300);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        webDriver.findElement(By.id("wp-submit")).click();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement errorEl = webDriver.findElement(By.id("login_error"));

        assertTrue("Incorrect error", errorEl.getText().contains("ОШИБКА"));

        webDriver.quit();
    }

    @Test
    public void correctLogin() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://polshinsky.iblogger.org");

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement metaBlock = webDriver.findElement(By.id("meta-2"));
        List<WebElement> links = metaBlock.findElements(By.tagName("a"));

        Actions actions = new Actions(webDriver);
        actions.moveToElement(metaBlock).perform();

        for (WebElement link: links){
            if (link.getText().contains("Войти")){
                link.click();
                break;
            }
        }

        WebElement loginField = webDriver.findElement(By.id("user_login"));
        loginField.click();
        loginField.clear();
        loginField.sendKeys("admin");

        WebElement passField = webDriver.findElement(By.id("user_pass"));
        passField.click();
        passField.clear();

        for (Character c:"24Killer".toCharArray()){
            passField.sendKeys("" + c);

            try{
                Thread.sleep(300);
            }

            catch  (Exception e){
                e.printStackTrace();
            }
        }
        webDriver.findElement(By.id("wp-submit")).click();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement menuEl = webDriver.findElement(By.id("wpcontent"));

        assertTrue("Enter success", menuEl.getText().contains("Профиль"));

        webDriver.quit();
    }
}
