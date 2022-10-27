package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.services.InventoryPageService;
import org.tms.services.LoginPageService;

public class InventoryPageTest extends BaseTest{

   @Test
    public void addToCartProductTest(){

       LoginPageService setLoginPageService = new LoginPageService();
       User user = new User();
       InventoryPageService addProductToCart = new InventoryPageService();

       setLoginPageService.login(user);

       String actualNameOfProductInCart = addProductToCart.addProduct().getNameOfProductInCart();
       String expectedNameOfProductInCart = "Sauce Labs Backpack";
       Assert.assertEquals(actualNameOfProductInCart, expectedNameOfProductInCart, "Product was added to Cart");
    }
}
