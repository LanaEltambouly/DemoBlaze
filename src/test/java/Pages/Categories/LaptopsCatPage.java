package Pages.Categories;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LaptopsCatPage extends HomePage{
    WebDriver driver;
    //List<WebElement>
    public LaptopsCatPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

}
