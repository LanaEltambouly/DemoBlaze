package Pages.StepDefinitions;

import BaseTests.HooksPackage.Hooks;
import Pages.HomePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutUs_stepDef {
    HomePage homePage = new HomePage(Hooks.driver);

    @Given("user is on About Us page")
    public void userIsOnAboutUsPage() {
        homePage.clickOnAboutUs();


    }

    @When("the About Us video loads")
    public void theAboutUsVideoLoads() {
        ;
    }

    @Then("the video player should be visible")
    public void theVideoPlayerShouldBeVisible() {

    }

    @Given("the About Us video is displayed")
    public void theAboutUsVideoIsDisplayed() {

    }

    @When("user clicks on the close button")
    public void userClicksOnTheCloseButton() {

    }

    @Then("the About Us modal should close successfully")
    public void theAboutUsModalShouldCloseSuccessfully() {

    }

    @Then("the video should no longer be visible")
    public void theVideoShouldNoLongerBeVisible() {

    }

    @Then("the video poster should be shown")
    public void theVideoPosterShouldBeShown() {
    }

    @When("About Us video component appears")
    public void aboutUsVideoComponentAppears() {
      ;
    }

    @Then("About Us modal should be active")
    public void aboutUsModalShouldBeActive() {

    }
}