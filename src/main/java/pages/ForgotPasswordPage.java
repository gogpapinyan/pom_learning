package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends BasePage{

    private final By EMAIL_FIELD = By.id("email");
    private final By RETRIEVE_PASSWORD = By.id("form_submit");

    /**
     * Constructor
     *
     * @param driver
     */
    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void typeEmail(String email) {
        fillInText(EMAIL_FIELD, email);
    }

    public void retrievePassword(){
        click(RETRIEVE_PASSWORD);
    }

}
