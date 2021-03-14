package org.example.website;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class LoginTests {

    @Test
    public void emptyFieldsTest() {
        WebDriver webDriver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(webDriver,30);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;

        webDriver.get("http://polshinsky.iblogger.org");

        WebElement metaBlock = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("meta-2")));
        List<WebElement> links = metaBlock.findElements(By.tagName("a"));

        js.executeScript("arguments[0].scrollIntoView()",metaBlock);

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

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wp-submit")));
        webDriver.findElement(By.id("wp-submit")).click();

        WebElement errorEl = webDriver.findElement(By.id("login_error"));

        assertTrue("Incorrect error", errorEl.getText().contains("ОШИБКА"));

        webDriver.quit();
    }

    @Test
    public void emptyLoginTest() {
        WebDriver webDriver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(webDriver,30);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;

        webDriver.get("http://polshinsky.iblogger.org");

        WebElement metaBlock = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("meta-2")));
        List<WebElement> links = metaBlock.findElements(By.tagName("a"));

        js.executeScript("arguments[0].scrollIntoView()",metaBlock);

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
        }

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wp-submit")));
        webDriver.findElement(By.id("wp-submit")).click();

        WebElement errorEl = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login_error")));

        assertTrue("Incorrect error", errorEl.getText().contains("ОШИБКА"));

        webDriver.quit();
    }

    @Test
    public void emptyPassTest() {
        WebDriver webDriver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(webDriver,30);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;

        webDriver.get("http://polshinsky.iblogger.org");

        WebElement metaBlock = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("meta-2")));
        List<WebElement> links = metaBlock.findElements(By.tagName("a"));

        js.executeScript("arguments[0].scrollIntoView()",metaBlock);

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

        WebElement errorEl = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login_error")));

        assertTrue("Incorrect error", errorEl.getText().contains("ОШИБКА"));

        webDriver.quit();
    }

    @Test
    public void incorrectPassTest() {
        WebDriver webDriver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(webDriver,30);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;

        webDriver.get("http://polshinsky.iblogger.org");

        WebElement metaBlock = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("meta-2")));
        List<WebElement> links = metaBlock.findElements(By.tagName("a"));

        js.executeScript("arguments[0].scrollIntoView()",metaBlock);

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
        }

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wp-submit")));
        webDriver.findElement(By.id("wp-submit")).click();

        WebElement errorEl = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login_error")));

        assertTrue("Incorrect error", errorEl.getText().contains("ОШИБКА"));

        webDriver.quit();
    }

    @Test
    public void correctLogin() {
        WebDriver webDriver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(webDriver,30);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;

        webDriver.get("http://polshinsky.iblogger.org");

        WebElement metaBlock = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("meta-2")));
        List<WebElement> links = metaBlock.findElements(By.tagName("a"));

        js.executeScript("arguments[0].scrollIntoView()",metaBlock);

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
        }

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wp-submit")));
        webDriver.findElement(By.id("wp-submit")).click();

        WebElement menuEl = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wpcontent")));

        assertTrue("Enter success", menuEl.getText().contains("Профиль"));

        webDriver.quit();
    }
}
