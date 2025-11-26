package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ContactTest extends BaseTests.BaseTestClass {

    @Test

    public void verifyContactFormSubmission(){
        contactPage= homepage.clickOnContact();
        contactPage.setContactEmail("test@gimail.com");
        contactPage.setContactName("Test Name");
        contactPage.setContactMessage("This is a test message.");
        contactPage.clickOnSendMessage();
        Assert.assertEquals(contactPage.getActualMess(), contactPage.getExpectedMess());
        contactPage.clickOnOk();
    }

    @Test
    public void verifyContactFormSubmissionWithErrorName() {
        contactPage = homepage.clickOnContact();
        contactPage.setContactEmail("Test@gimail.com");
        contactPage.setContactName("11111111111");
        contactPage.setContactMessage("This is a test message.");
        contactPage.clickOnSendMessage();
        Assert.assertEquals(contactPage.getActualMess(), contactPage.getExpectedAnErrorMsgForName());
        contactPage.clickOnOk();

    }
    @Test
    public void verifyContactFormSubmissionWithErrorEmail() {
        contactPage = homepage.clickOnContact();
        contactPage.setContactEmail("1111111111");
        contactPage.setContactName("Test Name");
        contactPage.setContactMessage("This is a test message.");
        contactPage.clickOnSendMessage();
        Assert.assertEquals(contactPage.getActualMess(), contactPage.getExpectedAnErrorMsgForEmail());
        contactPage.clickOnOk();

    }
    @Test
    public void verifyContactFormSubmissionWithEmptyNameAndEmail() {
        contactPage = homepage.clickOnContact();
        contactPage.setContactMessage("This is a test message.");
        contactPage.clickOnSendMessage();
        Assert.assertEquals(contactPage.getActualMess(), contactPage.getExpectedAnErrorMsgForEmptyUsernameAndPassword());
        contactPage.clickOnOk();
        System.out.println("Test completed successfully.");
    }




}
