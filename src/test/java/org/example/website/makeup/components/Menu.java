package org.example.website.makeup.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Menu {
    private WebElement root;

    private WebDriver webDriver;

    public Menu(WebElement root, WebDriver webDriver) {
        this.root = root;
        this.webDriver = webDriver;
    }

    private WebElement getCategory(String category) {

        List<WebElement> menus = root.findElements(By.cssSelector("menu-list__item.full"));

        for (WebElement m : menus) {

            if (m.getText().contains(category)) {

                return m;
            }
        }

        throw new RuntimeException("Category not found");
    }

    public void openCategory(String category) {

        getCategory(category).click();
    }

    public void showSubCategories(String category) {

        new Actions(webDriver).moveToElement(getCategory(category)).perform();


    }

    public void openSubCategory(String category, String categoryName) {

        WebElement root = getCategory(category);

        showSubCategories(category);

        List<WebElement> subs = root.findElements(By.className("menu-column-header"));

        for (WebElement el : subs) {

            if (el.getText().contains(categoryName)) {

                el.findElement(By.tagName("a")).click();
                break;
            }
        }
    }
}
