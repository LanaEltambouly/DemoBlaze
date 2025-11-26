package Tests;

import BaseTests.BaseTestClass;

import Pages.Categories.CategoriesPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.Categories.PhonesCatPage ;
import Pages.Categories.LaptopsCatPage;
import Pages.Categories.LaptopsCatPage ;



public class CategoriesTest extends BaseTestClass {

    @Test(priority = 0)
    public void verifyAllphones() {



        homepage.ClickOnPhonesCat();
        Assert.assertTrue(categoriesPage.getProducts().containsAll(phonesCatPage.expectedPhones));

    }
    @Test(priority = 1)
    public void verifyalllaptops() {


        homepage.ClickOnLaptopsCat();
        Assert.assertTrue(categoriesPage.getProducts().containsAll(laptopsCatPage.expectedLaptops));


    }
    @Test(priority = 2)
    public void verifyMonitors(){


        homepage.ClickOnMonitorsCat();

        Assert.assertTrue(categoriesPage.getProducts().containsAll(monitorsCatPage.expectedMonitors));
    }
}
