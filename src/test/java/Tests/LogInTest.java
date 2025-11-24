package Tests;

import BaseTests.BaseTestClass;
import Pages.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTestClass {

    @Test
    public void verifyLoginWithValidCredentials(){
        loginPage = homepage.clickOnLogIn();
        loginPage.setUsername("teamone1");
        loginPage.setPassword("1234");
        loginPage.clickOnLogIn();
        Assert.assertTrue(homepage.getActualWelcomeMess().contains("Welcome"));

    }
    @Test
    public void verifyLoginWithInvalidCredentials(){
        loginPage = homepage.clickOnLogIn();
        loginPage.setUsername("teammmm");
        loginPage.setPassword("012");
        loginPage.clickOnLogIn();
        Assert.assertEquals(loginPage.getActualMess(),loginPage.getExpectedWrongCredentialsMess());
        loginPage.clickOnOk();

    }
    @Test
    public void verifyLoginWithWrongUsername(){
        loginPage = homepage.clickOnLogIn();
        loginPage.setUsername("teammm");
        loginPage.setPassword("1234");
        loginPage.clickOnLogIn();
        Assert.assertEquals(loginPage.getActualMess(),loginPage.getExpectedWrongUsernameMess());
        loginPage.clickOnOk();

    }
    @Test
    public void verifyLoginWithWrongPassword(){
        loginPage = homepage.clickOnLogIn();
        loginPage.setUsername("teamone1");
        loginPage.setPassword("12");
        loginPage.clickOnLogIn();
        Assert.assertEquals(loginPage.getActualMess(),loginPage.getExpectedWrongPasswordMess());
        loginPage.clickOnOk();

    }
    @Test
    public void verifyLoginWithEmptyFields(){
        loginPage = homepage.clickOnLogIn();
        loginPage.clickOnLogIn();
        Assert.assertEquals(loginPage.getActualMess(),loginPage.getExpectedAnyEmptyFieldMess());
        loginPage.clickOnOk();


    }

}
