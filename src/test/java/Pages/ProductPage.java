package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;
    By AddToCartLocator = By.xpath("//a[@onclick='addToCart(1)']");
    By ProductNameLocator = By.className("name");
    By ProductPriceLocator = By.className("price-container");
    By ProductDescriptionLocator = By.id("more-information");
    By okButtonLocator = By.xpath("//button[text()='OK']");
    String AddToCartExpectedMess = "Product added.";
    //By AddToCartActualMessLocator = By.

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickAddToCart(){
        driver.findElement(AddToCartLocator).click();
    }
    public String getProductName(){
        return driver.findElement(ProductNameLocator).getText();
    }
    public String getProductDescription(){
        return driver.findElement(ProductDescriptionLocator).getText();
    }
    public String getProductPrice(){
        return driver.findElement(ProductPriceLocator).getText();
    }
    public String getAddToCartExpectedMess(){
        return AddToCartExpectedMess;
    }
//    public String getAddToCartActualMess(){
//        return driver.findElement(AddToCartActualMessLocator).getText();
//    }
      public void clickOK() {
        driver.findElement(okButtonLocator).click();
     }

}
