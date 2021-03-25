package org.example.website.makeup.components;

import org.example.website.imdb.pages.MainPage;
import org.example.website.makeup.pages.CategoryPage;
import org.example.website.makeup.pages.CheckoutPage;
import org.example.website.makeup.pages.ProductPage;
import org.example.website.makeup.pages.ShoppingCardPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MakeUpUAWebsite {
    private WebDriver webDriver;

    public MakeUpUAWebsite(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public MainPage mainPage() {

        return new MainPage(webDriver);

    }

    public CategoryPage categoryPage() {

        return new CategoryPage(webDriver);
    }

    public ProductPage productPage() {

        return new ProductPage(webDriver);
    }

    public ShoppingCardPage shoppingCardPage() {

        return new ShoppingCardPage(webDriver);

    }


    public CheckoutPage checkoutPage() {

        return new CheckoutPage(webDriver);

    }

    public Menu menu(){

        return new Menu (webDriver.findElement(By.className("menu-list")), webDriver);
    }
}
