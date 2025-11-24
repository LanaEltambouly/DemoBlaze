package Pages;

import Pages.LogInPage;
import Pages.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    By SignUpLocator = By.id("signin2");
    By LogInLocator = By.id("login2");
    By LogOutLocator = By.id("logout2");
    By WelcomeLocator = By.id("nameofuser");
    By CartLocator = By.id("cartur");
    By AboutUsLocator = By.xpath("//a[contains(@data-target, '#videoModal')]");
    By ContactLocator = By.xpath("//a[contains(@data-target,'#exampleModal')]");
//    By CategoriesLocator = By.id("cat");
//    By PhonesCategoryLocator = By.xpath("//a[contains(@onclick, byCat('phone'))]");
//    By LaptopsCategoryLocator = By.xpath("//a[contains(@onclick, byCat('notebook'))]");
//    By MonitorsCategoryLocator = By.xpath("//a[contains(@onclick, byCat('monitor'))]");
//    By NextButtonLocator = By.xpath("//button[text()='Next']");
//    By PreviousButtonLocator = By.xpath("//button[text()='Previous']");
//    By ProductsLocator = By.className("col-lg-4 col-md-6 mb-4");
    //By imgLocator = By.className("d-block img-fluid");


    public HomePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public SignUpPage clickOnSignUp(){
        driver.findElement(SignUpLocator).click();
        return new SignUpPage(driver);
    }
    public LogInPage clickOnLogIn(){
        driver.findElement(LogInLocator).click();
        return new LogInPage(driver);
    }
    public String getActualWelcomeMess(){
        return  wait.until(ExpectedConditions.visibilityOf(driver.findElement(WelcomeLocator))).getText();

    }
}
//        public ContactPage clickOnContact(){
//            driver.findElement(ContactLocator).click();
//            return new ContactPage(driver);
//        }
//        public void ClickOnCategories(){
//            driver.findElement(CategoriesLocator).click();
//        }
//        public void ClickOnPhonesCat(){
//            driver.findElement(PhonesCategoryLocator).click();
//        }
//        public void ClickOnLaptopsCat(){
//            driver.findElement(LaptopsCategoryLocator).click();
//        }
//        public void ClickOnMonitorsCat(){
//            driver.findElement(MonitorsCategoryLocator).click();
//        }
//        public NextPage ClickOnNextButton(){
//            driver.findElement(NextButtonLocator).click();
//            return new NextPage(driver);
//        }
//        public PreviousPage ClickOnPreviousButton(){
//            driver.findElement(PreviousButtonLocator).click();
//            return new PreviousPage(driver);
//        }
//
//            public String getActualWelcomeStatement(){
//                return driver.findElement(WelcomeLocator).getText();
//            }
//            public void ClickOnLogout(){
//                driver.findElement(LogOutLocator).click();
//            }
//


//    public ProductPage clickOnProduct(int i){
//        List<WebElement> Products = driver.findElements(ProductsLocator);
//        Products.get(i).click();
//        return new ProductPage(driver);
//    }
//    public boolean imgIsDisplayed(){
//        return driver.findElement(imgLocator).isDisplayed();
//    }


