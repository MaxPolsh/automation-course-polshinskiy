package org.example.website.makeup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
    @FindBy(name = "fields[first_name]")
    private WebElement firstNameInput;

    @FindBy (name = "fields[last_name]")
    private WebElement lastNameInput;

    @FindBy (id = "phone")
    private WebElement phoneInput;

    @FindBy (id = "email")
    private WebElement emailInput;

    @FindBy (id = "city")
    private WebElement cityInput;

    @FindBy (id = "chk_pred_cost")
    private WebElement totalSumText;

    @FindBy (id = "chk_order_total")
    private WebElement total2SumText;

    private WebDriver webDriver;

    private WebDriverWait wait;

    public CheckoutPage (WebDriver webDriver) {
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(this.webDriver,30);

        PageFactory.initElements(webDriver, this);
    }

    public void fillCustomerInfoForm(String name, String lastName, String phone, String email){

        fillFirstName(name);
        lastNameInput.sendKeys(lastName);
        phoneInput.sendKeys(phone);
        emailInput.sendKeys(email);
    }

    public void fillFirstName(String name){

        try {
            firstNameInput.click();
            firstNameInput.clear();
            firstNameInput.sendKeys(name);

        } catch (Exception ex){

            throw new RuntimeException("Something wrong");
        }
    }

    public void fillCityField (String city) {

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("city")));

            cityInput.sendKeys(city);
        } catch (Exception ex) {
        }
    }

    public String getTotalSum(){

        return totalSumText.getText();
    }

    public String getTotalTotalSum(){

        return total2SumText.getText();
    }
}
