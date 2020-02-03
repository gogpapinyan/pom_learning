package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AutomationPaths;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    private LoginPage loginPage;

    @BeforeClass
    public void setUpLoginPage(){
        loginPage = new LoginPage(driver);
        loginPage.openLink(AutomationPaths.URL_LOGIN);
    }

    @Test
    public void checkLinkOpensSuccess() {
        String headerText = loginPage.getHeaderText();
        Assert.assertEquals(headerText, "Login Page", "Login page in not opened");
    }

    @Test
    public void verifySuccessfulLogin() {
        loginByUsernamePassword("tomsmith","SuperSecretPassword!");
        String currentURL = loginPage.getCurrentURL();
        Assert.assertEquals(currentURL, "http://the-internet.herokuapp.com/secure", "Login failed, but should have been successfull");
    }
    @Test
    public void verifyErrorWrongUserName(){
        loginByUsernamePassword("wrongusername", "SuperSecretPassword!");
        String errorMessage = loginPage.getInvalidDataError();
        Assert.assertEquals(errorMessage,"Your username is invalid!\n×", "Error message is wrong");
    }

    @Test
    public void verifyErrorWrongPassword(){
        loginByUsernamePassword("tomsmith", "wrongpassword");
        String errorMessage = loginPage.getInvalidDataError();
        Assert.assertEquals(errorMessage,"Your password is invalid!\n×", "Error message is wrong");
    }

    @Test
    public void verifyErrorEmptyUsername(){
        loginByUsernamePassword("","SuperSecretPassword!");
        String errorMessage = loginPage.getInvalidDataError();
        Assert.assertEquals(errorMessage, "Your username is invalid!\n×", "Error message is wrong");
    }

    @Test
    public void verifyErrorEmptyPassword(){
        loginByUsernamePassword("tomsmith", "");
        String errorMessage = loginPage.getInvalidDataError();
        Assert.assertEquals(errorMessage,"Your password is invalid!\n×", "Error message is wrong");
    }

    private void loginByUsernamePassword(String username, String password) {
        loginPage.fillInUsername(username);
        loginPage.fillInPassword(password);
        loginPage.clickOnLoginButton();
}
}
