package org.tms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage extends BasePage{

    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfPageSection;

    @FindBy(xpath = "//button[@id= 'add-to-cart-sauce-labs-backpack']")
    private WebElement buttonAddToCart;

    @FindBy(xpath = "//a[@class= 'shopping_cart_link']")
    private WebElement buttonCart;

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public String getTextOfNameOfMainPageSection(){

       return nameOfPageSection.getText();
    }

    public void addToCartProduct(){
        buttonAddToCart.click();
    }

    public void openCart(){
        buttonCart.click();
        wait.until(ExpectedConditions.titleIs("Swag Labs"));
    }

}
