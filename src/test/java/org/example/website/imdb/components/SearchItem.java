package org.example.website.imdb.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchItem {
    private WebElement root;

    public SearchItem(WebElement root) {
        this.root = root;
    }

    public WebElement get(){

        return root;
    }

    public WebElement image(){

        return root.findElement(By.cssSelector("div[class*='__image']"));
    }

    public WebElement title(){

        return textItems().get(0);
    }

    public WebElement year(){

        return textItems().get(1);
    }

    public WebElement producers(){

        return textItems().get(2);
    }

    private List<WebElement> textItems (){

        return root.findElements(By.cssSelector("div[class*='searchResults__ResultTextItem-sc']"));
    }
}
