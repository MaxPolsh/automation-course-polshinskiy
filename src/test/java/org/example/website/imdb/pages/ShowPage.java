package org.example.website.imdb.pages;

import org.example.website.imdb.components.Info;
import org.example.website.imdb.components.Sidebar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShowPage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public ShowPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(this.webDriver,30);
    }

    public Sidebar sidebar (){

        return new Sidebar(webDriver.findElement(By.id("sidebar")));
    }

    public Info info(){

        return new Info(webDriver.findElement(By.id("main_top")));
    }
}
