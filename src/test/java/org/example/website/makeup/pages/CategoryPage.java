package org.example.website.makeup.pages;

import org.example.website.makeup.components.ProductsSlider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CategoryPage {
    private WebDriver webDriver;

    public CategoryPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public ProductsSlider getBlock (String blockName){

        List<WebElement> blocks = webDriver.findElement(By.className("page-header"))
                .findElements(By.cssSelector(".slider.ajax-loadable-slider.catalog-promo.loaded"));

        for (WebElement block: blocks){
            try {
                if (block.findElement(By.className("page-header")).getText().contains(blockName)) {

                    return new ProductsSlider(block);

                }

            }catch (Exception ex){


            }

            System.out.println(block.getText());
        }

        throw new RuntimeException("Block");
    }
}
