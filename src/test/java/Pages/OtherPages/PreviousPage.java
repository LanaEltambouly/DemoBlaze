package Pages.OtherPages;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;

public class PreviousPage extends HomePage {
    WebDriver driver;

    public PreviousPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
