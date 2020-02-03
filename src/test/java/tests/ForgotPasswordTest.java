package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AutomationPaths;
import pages.ForgotPasswordPage;

public class ForgotPasswordTest extends BaseTest{
    ForgotPasswordPage forgotPasswordPage;

    @BeforeClass
    public void setUpForgotPasswordPage(){
        forgotPasswordPage = new ForgotPasswordPage(driver);

    }

    @BeforeMethod
    public void openLink(){
        forgotPasswordPage.openLink(AutomationPaths.URL_FORGOT_PASSWORD);
    }

    @Test
    public void checkLinkOpenSuccess(){
        String headerText = forgotPasswordPage.getHeaderText();
        Assert.assertEquals(headerText, "Forgot Password", "Link is not opened.");
    }

    @Test
    public void checkEmailSentSuccess(){
        sendEmail("testemail@domain.com");
        String emailSentText = forgotPasswordPage.getEmailSentText();
        Assert.assertEquals(emailSentText, "Your e-mail's been sent!", "Something wrong with retrieving password of valid email. ");
    }

    @Test
    public void checkEmptyEmail(){
        sendEmail("");
        String errorText = forgotPasswordPage.getErrorText();
        Assert.assertEquals(errorText,"Internal Server Error", "Empty email sent, not get internal server error.");
    }
    public void sendEmail(String email) {
        forgotPasswordPage.typeEmail(email);
        forgotPasswordPage.retrievePassword();
    }


}
