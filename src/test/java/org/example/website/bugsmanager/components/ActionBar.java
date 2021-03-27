package org.example.website.bugsmanager.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionBar {

    private WebElement root;
    private WebDriverWait wait;

    public ActionBar(WebElement root, WebDriverWait wait) {
        this.root = root;
        this.wait = wait;
    }

}
