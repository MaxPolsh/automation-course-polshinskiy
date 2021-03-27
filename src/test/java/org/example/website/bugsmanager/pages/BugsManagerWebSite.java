package org.example.website.bugsmanager.pages;

import org.example.website.bugsmanager.components.ActionBar;
import org.example.website.imdb.components.SearchItem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BugsManagerWebSite {

    private WebElement root;
    private WebDriver webDriver;
    private WebDriverWait wait;

    public BugsManagerWebSite(WebDriver webDriver) {

        this.webDriver = webDriver;
        this.wait = new WebDriverWait(this.webDriver, 30);
    }

    public WebElement bugList(String name){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[class*='x-unselectable']")));

        List<WebElement> links = root.findElements(By.cssSelector("a[class*='x-unselectable']"));

        List <SearchItem> linksObjects = new ArrayList<>();

        for (WebElement a : links) {

            linksObjects.add (new SearchItem(a));
        }

        for (SearchItem item: linksObjects){

            if(item.title().getText().contains(name)){

                return item.get();
            }
        }

        throw new RuntimeException("Link with name["+ name+ "] was not found");
    }
}
