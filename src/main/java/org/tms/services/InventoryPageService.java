package org.tms.services;


import org.tms.pages.CartPage;
import org.tms.pages.InventoryPage;

public class InventoryPageService {

    protected InventoryPage inventoryPage = new InventoryPage();

    public CartPage addProduct(){
        inventoryPage.addToCartProduct();
        inventoryPage.openCart();
        return new CartPage();
    }
}
