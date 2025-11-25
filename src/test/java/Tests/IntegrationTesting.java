package Tests;

import BaseTests.BaseTestClass;
import org.testng.annotations.Test;

public class IntegrationTesting extends BaseTestClass {
    @Test
    public void verifyScenarioFromSignUpToPlaceOrder(){
        signuppage = homepage.clickOnSignUp();
        signuppage.setUsername("FULL SCENARIO");
        signuppage.setPassword("111000");
        signuppage.clickOnSignUp();
        signuppage.clickOnOk();

        loginPage = homepage.clickOnLogIn();
        loginPage.setUsername("FULL SCENARIO");
        loginPage.setPassword("111000");
        loginPage.clickOnLogIn();


        phonesCatPage = homepage.ClickOnPhonesCat();
        productPage = phonesCatPage.clickOnProduct(1);
        productPage.clickAddToCart();

        homepage = productPage.clickOnHome();
        laptopsCatPage = homepage.ClickOnLaptopsCat();
        productPage = laptopsCatPage.clickOnProduct(4);
        productPage.clickAddToCart();

        homepage = productPage.clickOnHome();
        monitorsCatPage = homepage.ClickOnMonitorsCat();
        productPage = monitorsCatPage.clickOnProduct(0);
        productPage.clickAddToCart();

        cartPage = productPage.clickOnCart();
        placeOrderPage = cartPage.ClickOnPlaceOrder();

        //placeOrderPage.
    }

}
