package Pages.Categories;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;

public class CategoriesPage extends HomePage {
    WebDriver driver;

    public CategoriesPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
}
