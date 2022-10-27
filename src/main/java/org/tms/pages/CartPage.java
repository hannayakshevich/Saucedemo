package org.tms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement nameOfProduct;

    public String getNameOfProductInCart(){
        return nameOfProduct.getText();
    }
}
