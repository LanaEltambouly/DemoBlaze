package Tests;

import BaseTests.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTestClass {
    @Test
    public void verifyMultipleProductsAddedToCartSuccessfully(){
        productPage = homepage.clickOnProduct(1);
        productPage.clickAddToCart();
        productPage.clickOnOk();
        productPage.clickOnHome();

        productPage = homepage.clickOnProduct(6);
        productPage.clickAddToCart();
        productPage.clickOnOk();

        cartPage = productPage.clickOnCart();
        Assert.assertTrue(cartPage.displayedImage());
        Assert.assertTrue(cartPage.checkTitles());
        Assert.assertTrue(cartPage.checkPrices());
        Assert.assertTrue(cartPage.checkTotalPrice());
    }

    @Test
    public void verifyCorrectTotalPrice(){
        productPage = homepage.clickOnProduct(1);
        productPage.clickAddToCart();
        productPage.clickOnOk();
        productPage.clickOnHome();

        productPage = homepage.clickOnProduct(6);
        productPage.clickAddToCart();
        productPage.clickOnOk();

        cartPage = productPage.clickOnCart();
        Assert.assertEquals(cartPage.getActualTotalProductPrice(), cartPage.getFoundTotalPrice());
    }


    @Test
    public void verifyPlaceOrderFromCart(){
        productPage = homepage.clickOnProduct(1);
        productPage.clickAddToCart();
        productPage.clickOnOk();
        productPage.clickOnHome();

        productPage = homepage.clickOnProduct(6);
        productPage.clickAddToCart();
        productPage.clickOnOk();

        cartPage = productPage.clickOnCart();
        placeOrderPage = cartPage.ClickOnPlaceOrder();
        Assert.assertEquals(placeOrderPage.getActualPlaceOrderStatement(), placeOrderPage.getExpectedPlaceOrderStatement());
    }

    @Test
    public void verifyDeleteFromCart(){
        productPage = homepage.clickOnProduct(1);
        productPage.clickAddToCart();
        productPage.clickOnOk();
        productPage.clickOnHome();

        productPage = homepage.clickOnProduct(6);
        productPage.clickAddToCart();
        productPage.clickOnOk();

        cartPage = productPage.clickOnCart();
        cartPage.ClickOnDelete(0);
    }
    @Test
    public void verifyEmptyCartDisplaysNothing(){
        cartPage = homepage.clickOnCart();


    }
    @Test
    public void verify(){

    }



}
