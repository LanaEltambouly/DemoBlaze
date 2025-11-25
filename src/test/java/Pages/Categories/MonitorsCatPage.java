package Pages.Categories;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;

public class MonitorsCatPage extends HomePage {
    WebDriver driver;

    public MonitorsCatPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
