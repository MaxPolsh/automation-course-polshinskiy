package org.example.website.makeup.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductsSlider {
    private WebElement root;

    public ProductsSlider(WebElement root) {
        this.root = root;
    }

    public void openProduct(String productTitle){

        for (WebElement item: root.findElement(By.className("simple-slider-list")).findElements(By.tagName("li"))) {

            if (item.getText().contains(productTitle)){

                item.findElement(By.tagName("a")).click();
                break;
            }
        }
    }
}
