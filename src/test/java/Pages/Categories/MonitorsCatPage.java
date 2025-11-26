package Pages.Categories;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class MonitorsCatPage extends HomePage {
    WebDriver driver;

    public MonitorsCatPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
    public List<String> expectedMonitors = Arrays.asList(
            "Apple monitor 24",
            "ASUS Full HD"
    );
}
