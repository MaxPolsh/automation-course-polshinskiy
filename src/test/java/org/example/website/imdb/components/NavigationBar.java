package org.example.website.imdb.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class NavigationBar {
    
    private WebElement root;
    private WebDriverWait wait;

    public NavigationBar(WebElement root, WebDriverWait wait) {


        this.root = root;
        this.wait = wait;
    }

    public WebElement searchInput() {

        return root.findElement(By.id("suggestion-search"));
    }

    public WebElement itemWithName(String name) {

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[class*='searchResults_']")));

        List<WebElement> links = root.findElements(By.cssSelector("a[class*='searchResults_']"));

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
