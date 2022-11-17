package org.tms.tests;

import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.services.LoginPageService;

public class LoginPageTest extends BaseTest {

    @Step("Login SauceDemo")
    @Test
    public void loginTest(){
       LoginPageService setLoginPageService = new LoginPageService();
        User user = new User();
        String actualTextOfInventoryPage = setLoginPageService.login(user)
                .getTextOfNameOfMainPageSection();
        String expectedTextOfInventoryPage = "PRODUCTS";
        Assert.assertEquals(actualTextOfInventoryPage, expectedTextOfInventoryPage, "");
    }
}
