package org.example.website.imdb.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Info {
    private WebElement root;

    public Info(WebElement root) {
        this.root = root;
    }

    public WebElement title (){

        return root.findElement(By.className("title_wrapper")).findElement(By.tagName("h1"));
    }

    public WebElement ratingValue(){

        return root.findElement(By.cssSelector("span[itemprop='ratingValue']"));
    }
}
