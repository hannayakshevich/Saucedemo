package org.tms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage{

    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfPageSection;

    public String getTextOfNameOfMainPageSection(){

       return nameOfPageSection.getText();
    }
}
