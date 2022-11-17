package org.tms.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage extends BasePage{

    @FindBy(xpath = "//span[@class='titl']")
    private WebElement nameOfPageSection;

    @FindBy(xpath = "//button[@id= 'add-to-cart-sauce-labs-backpack']")
    private WebElement buttonAddToCart;

    @FindBy(xpath = "//a[@class= 'shopping_cart_link']")
    private WebElement buttonCart;

    WebDriverWait wait = new WebDriverWait(driver, 10);

    @Step("Verification of Name of Main Page")
    public String getTextOfNameOfMainPageSection(){

       return nameOfPageSection.getText();
    }

    @Step("Add product to Cart")
    public void addToCartProduct(){
        buttonAddToCart.click();
    }

    @Step("Open Cart")
    public void openCart(){
        buttonCart.click();
        wait.until(ExpectedConditions.titleIs("Swag Labs"));
    }

}
