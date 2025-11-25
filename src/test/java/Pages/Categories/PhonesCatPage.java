package Pages.Categories;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;

public class PhonesCatPage extends HomePage {
    WebDriver driver;

    public PhonesCatPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
