package Pages.Categories;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LaptopsCatPage extends HomePage{
    WebDriver driver;


    public LaptopsCatPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


    public List<String> expectedLaptops = Arrays.asList( "Sony vaio i5",
            "Sony vaio i7", "MacBook air", "Dell i7 8gb",
              "2017 Dell 15.6 Inch","MacBook Pro");

}

