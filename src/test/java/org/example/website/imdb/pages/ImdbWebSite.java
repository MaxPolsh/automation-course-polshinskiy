package org.example.website.imdb.pages;

import org.example.website.imdb.components.NavigationBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImdbWebSite {

    private WebDriver webDriver;
    private WebDriverWait wait;

    public ImdbWebSite(WebDriver webDriver) {


        this.webDriver = webDriver;
        this.wait = new WebDriverWait(this.webDriver, 30);
    }

    public MainPage main(){

        return new MainPage(webDriver);
    }

    public ShowPage showPage(){
        return new ShowPage(webDriver);

    }

    public NavigationBar navbar(){

        return  new NavigationBar(webDriver.findElement(By.id("imdbHeader")), wait);
    }
}
