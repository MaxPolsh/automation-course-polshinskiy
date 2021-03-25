package org.example.website.makeup.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(css = ".menu-list")

    private WebElement menuList;

    private WebDriver webDriver;

    public MainPage(WebDriver webDriver) {

        this.webDriver = webDriver;

        PageFactory.initElements(webDriver,this);
    }
}
