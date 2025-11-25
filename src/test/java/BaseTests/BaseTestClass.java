package BaseTests;

import Pages.*;
import Pages.Categories.CategoriesPage;
import Pages.Categories.LaptopsCatPage;
import Pages.Categories.MonitorsCatPage;
import Pages.Categories.PhonesCatPage;
import Pages.OtherPages.NextPage;
import Pages.OtherPages.PreviousPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTestClass {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected HomePage homepage;
    protected SignUpPage signuppage;
    protected LogInPage loginPage;
    protected CartPage cartPage;
    protected ProductPage productPage;
    protected PlaceOrderPage placeOrderPage;
    protected AboutUsPage aboutUsPage;
    protected ContactPage contactPage;
    protected CategoriesPage categoriesPage;
    protected LaptopsCatPage laptopsCatPage;
    protected PhonesCatPage phonesCatPage;
    protected MonitorsCatPage monitorsCatPage;
    protected NextPage nextPage;
    protected PreviousPage previousPage;


    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        homepage = new HomePage(driver);
        wait = new WebDriverWait(driver,Duration.ofSeconds(15));
    }

    @BeforeMethod
    public void goToHomePage(){
        driver.get("https://demoblaze.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
