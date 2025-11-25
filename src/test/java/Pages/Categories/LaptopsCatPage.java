package Pages.Categories;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;

public class LaptopsCatPage extends HomePage{
    WebDriver driver;

    public LaptopsCatPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

}
