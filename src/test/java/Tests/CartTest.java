package Tests;

import BaseTests.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTestClass {
    public void ProductToCartScenario(int i){
        productPage = homepage.clickOnProduct(i);
        productPage.clickAddToCart();
        productPage.clickOnOk();
    }


    @Test
    public void verifyMultipleProductsAddedToCartSuccessfully(){
        ProductToCartScenario(1);
        productPage.clickOnHome();

        ProductToCartScenario(6);
        cartPage = productPage.clickOnCart();

        Assert.assertTrue(cartPage.displayedImage());
        Assert.assertTrue(cartPage.checkTitles());
        Assert.assertTrue(cartPage.checkPrices());
        Assert.assertTrue(cartPage.checkTotalPrice());
        Assert.assertEquals(cartPage.getActualTotalProductPrice(), 2);
    }

    @Test
    public void verifyCorrectTotalPrice(){
        ProductToCartScenario(2);
        productPage.clickOnHome();
        ProductToCartScenario(2);
        productPage.clickOnHome();
        ProductToCartScenario(4);

        cartPage = productPage.clickOnCart();

        Assert.assertEquals(cartPage.getActualTotalProductPrice(), cartPage.getFoundTotalPrice());
    }


    @Test
    public void verifyPlaceOrderFromCart(){
        ProductToCartScenario(5);
        productPage.clickOnHome();

        ProductToCartScenario(6);
        cartPage = productPage.clickOnCart();
        placeOrderPage = cartPage.ClickOnPlaceOrder();
        Assert.assertEquals(placeOrderPage.getActualPlaceOrderStatement(), placeOrderPage.getExpectedPlaceOrderStatement());
    }

    @Test
    public void verifyDeleteFromCart(){
        ProductToCartScenario(7);
        productPage.clickOnHome();

        ProductToCartScenario(8);
        productPage.clickOnHome();

        cartPage = productPage.clickOnCart();
        cartPage.ClickOnDelete(0);
        Assert.assertEquals(cartPage.getProductsListSize(), 1);

    }
    @Test
    public void verifyEmptyCartDisplaysNothing(){
        cartPage = homepage.clickOnCart();
        Assert.assertEquals(cartPage.getProductsListSize(), 0);
    }

    @Test
    public void verifyEmptyCartDisablePlaceOrder(){
        cartPage = homepage.clickOnCart();
        Assert.assertEquals(cartPage.getProductsListSize(), 0);
        Assert.assertTrue(cartPage.PlaceOrderButtonDisability());
    }

    @Test
    public void verifyDeletingAllProducts(){
        ProductToCartScenario(7);
        productPage.clickOnHome();

        ProductToCartScenario(8);
        productPage.clickOnHome();

        ProductToCartScenario(5);
        productPage.clickOnHome();

        cartPage = productPage.clickOnCart();
        cartPage.ClickOnDelete(0);
        cartPage.ClickOnDelete(1);
        cartPage.ClickOnDelete(2);

        Assert.assertEquals(cartPage.getProductsListSize(), 0);
        Assert.assertTrue(cartPage.PlaceOrderButtonDisability());

    }



}
