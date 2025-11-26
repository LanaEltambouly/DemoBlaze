package Pages.Categories;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class PhonesCatPage extends HomePage {
    WebDriver driver;

    public PhonesCatPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public List<String> expectedPhones = Arrays.asList("Samsung galaxy s6",
            "Nokia lumia 1520", "Nexus 6", "Samsung galaxy s7", "Iphone 6 32gb",
            "Sony xperia z5", "HTC One M9");


}
