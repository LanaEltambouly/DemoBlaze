package Tests;

import BaseTests.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTestClass {
    @Test
    public void verifyAddProductsToCartSuccessfully(){
        cartPage = homepage.clickOnCart();
        Assert.assertTrue(cartPage.checkTitle(0));
        Assert.assertTrue(cartPage.displayedImage(0));
        Assert.assertTrue(cartPage.checkPrice(0));
        Assert.assertTrue(cartPage.checkTotalPrice(0));
        Assert.assertTrue(cartPage.checkTitle(1));
        Assert.assertTrue(cartPage.displayedImage(1));
        Assert.assertTrue(cartPage.checkPrice(1));
        Assert.assertTrue(cartPage.checkTotalPrice(1));
    }

    @Test
    public void verifyDeleteFromCart(){
        cartPage = homepage.clickOnCart();
        cartPage.ClickOnDelete(0);
        Assert.assertFalse(cartPage.checkTitle(0));
        Assert.assertFalse(cartPage.displayedImage(0));
        Assert.assertFalse(cartPage.checkPrice(0));
        Assert.assertFalse(cartPage.checkTotalPrice(0));
    }

    @Test
    public void verifyPlaceOrder(){
        cartPage =homepage.clickOnCart();
        cartPage.ClickOnPlaceOrder();

    }


}
