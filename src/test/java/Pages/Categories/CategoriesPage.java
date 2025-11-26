package Pages.Categories;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
public class CategoriesPage extends HomePage {

    WebDriver driver;
    WebDriverWait wait;
//    By categoryPhones = By.xpath("//a[text()='Phones']");
//    By categoryLaptops = By.xpath("//a[text()='Laptops']");
//    By categoryMonitors = By.xpath("//a[text()='Monitors']");
    By productsTitles = By.cssSelector(".card-title a");

    public CategoriesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

   /* public void openPhones() {
        driver.findElement(categoryPhones).click();
    }

    public void openLaptops() {
        driver.findElement(categoryLaptops).click();

    }

    public void openMonitors() {
        driver.findElement(categoryMonitors).click();

    }*/

    public List<String> getProducts() {
        List<String> productNames = new ArrayList<>();
        //List<WebElement> products = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productsTitles));
        List<WebElement> products = wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElementsLocatedBy(productsTitles)));
        for (WebElement product : products) {
            productNames.add(product.getText());
        }
        return productNames;
    }


}

