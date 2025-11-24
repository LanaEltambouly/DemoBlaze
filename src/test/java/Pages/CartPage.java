package Pages;

import io.cucumber.java.hu.De;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait ;
    By placeOrderStatementLocator = By.id("orderModalLabel");
    String expectedPlaceOrderStatement = "Place order";
    By PlaceOrderButtonLocator = By.xpath("//button[text()='Place Order']");
    By DeleteLocator = By.linkText("Delete") ;
    By actualTitleLocator = By.xpath("//table[@class='table table-bordered table-hover table-striped']//td[2]");
    By actualPriceLocator = By.xpath("//table[@class='table table-bordered table-hover table-striped']//td[3]");
    By imageLocator = By.xpath("//table[@class='table table-bordered table-hover table-striped']//img");
    By actualTotalPriceLocator = By.id("totalp");
    List<WebElement> products;

    public CartPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public PlaceOrderPage ClickOnPlaceOrder(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(PlaceOrderButtonLocator))).click();
        return new PlaceOrderPage(driver);
    }

    public void ClickOnDelete(int i){
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DeleteLocator));
            products = driver.findElements(DeleteLocator);
            products.get(i).click();
    }

    public boolean checkTitle(int i){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(actualTitleLocator));
        products = driver.findElements(actualTitleLocator);
        return products.get(i).isDisplayed();
    }
    public boolean checkPrice(int i){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(actualPriceLocator));
         products = driver.findElements(actualPriceLocator);
        return products.get(i).isDisplayed();
    }
    public boolean checkTotalPrice(int i){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(actualTotalPriceLocator));
        products = driver.findElements(actualTotalPriceLocator);
        return products.get(i).isDisplayed();
    }


    public boolean displayedImage(int i){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(imageLocator));
        products = driver.findElements(imageLocator);
        return products.get(i).isDisplayed();
    }
    public String getExpectedPlaceOrderStatement(){
        return expectedPlaceOrderStatement;
    }
    public String getActualPlaceOrderStatement(){
        return driver.findElement(placeOrderStatementLocator).getText();
    }

//    public Double getProductPrice(){
//        return Double.parseDouble(wait.until(ExpectedConditions.visibilityOfElementLocated(actualPriceLocator)).getText());
//    }

//    public String getTitle(){
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(actualTitleLocator)).getText();
//    }
//    public Double getTotalPrice(){
//        return Double.parseDouble(wait.until(ExpectedConditions.visibilityOfElementLocated(actualTotalPriceLocator)).getText());
//    }


}
