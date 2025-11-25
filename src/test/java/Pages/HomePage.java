package Pages;

import Pages.OtherPages.NextPage;
import Pages.OtherPages.PreviousPage;
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
    By CategoriesLocator = By.id("cat");
    By PhonesCategoryLocator = By.xpath("//a[contains(@onclick, byCat('phone'))]");
    By LaptopsCategoryLocator = By.xpath("//a[contains(@onclick, byCat('notebook'))]");
    By MonitorsCategoryLocator = By.xpath("//a[contains(@onclick, byCat('monitor'))]");
    By ProductsLocator = By.cssSelector(".card.h-100 .hrefch");
    By NextButtonLocator = By.xpath("//button[text()='Next']");
    By PreviousButtonLocator = By.xpath("//button[text()='Previous']");
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
    public CartPage clickOnCart(){
        driver.findElement(CartLocator).click();
        return new CartPage(driver);
    }

    public ContactPage clickOnContact(){
        driver.findElement(ContactLocator).click();
        return new ContactPage(driver);
    }

    public AboutUsPage clickOnAboutUs(){
        driver.findElement(AboutUsLocator).click();
        return new AboutUsPage(driver);
    }

    public void ClickOnLogout(){
        driver.findElement(LogOutLocator).click();
    }


    public ProductPage clickOnProduct(int i){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ProductsLocator));//*
        List<WebElement> products = driver.findElements(ProductsLocator);
        products.get(i).click();
        return new ProductPage(driver);
    }
        public void ClickOnCategories(){
            driver.findElement(CategoriesLocator).click();
        }
        public void ClickOnPhonesCat(){
            driver.findElement(PhonesCategoryLocator).click();
        }
        public void ClickOnLaptopsCat(){
            driver.findElement(LaptopsCategoryLocator).click();
        }
        public void ClickOnMonitorsCat(){
            driver.findElement(MonitorsCategoryLocator).click();
        }
        public NextPage ClickOnNextButton(){
            driver.findElement(NextButtonLocator).click();
            return new NextPage(driver);
        }
        public PreviousPage ClickOnPreviousButton(){
            driver.findElement(PreviousButtonLocator).click();
            return new PreviousPage(driver);
        }





}
