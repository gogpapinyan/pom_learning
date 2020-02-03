package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends BasePage{

    private final By FORGOT_PASSWORD_LABEL = By.cssSelector("div.example h2");
    private final By EMAIL_FIELD = By.id("email");
    private final By RETRIEVE_PASSWORD = By.id("form_submit");
    private final By EMAIL_SENT_TEXT = By.id("content");
    private final By INTERNAL_SERVER_ERROR_TEXT = By.tagName("h1");

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

    public String getHeaderText() { return getText(FORGOT_PASSWORD_LABEL);}

    public String getEmailSentText() {
        return getText(EMAIL_SENT_TEXT);
    }

    public String getErrorText(){
        return getText(INTERNAL_SERVER_ERROR_TEXT);
    }
}
