package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    private final By INVALID_DATA_ERROR = By.id("flash");
    private final By USERNAME_INPUT_FIELD = By.id("username");
    private final By PASSWORD_INPUT_FIELD = By.id("password");
    private final By LOGIN_PAGE_LABEL = By.className("heading");
    private final By LOGIN_BUTTON = By.cssSelector("button.radius");


    /**
     * Constructor
     *
     * @param driver
     */
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String getHeaderText(){
        return getText(LOGIN_PAGE_LABEL);
    }

    public String getInvalidDataError(){
        return getText(INVALID_DATA_ERROR);
    }

    public void fillInUsername(String username){
        fillInText(USERNAME_INPUT_FIELD, username);
    }

    public void fillInPassword(String password){
        fillInText(PASSWORD_INPUT_FIELD, password);
    }

    public void clickOnLoginButton(){
        click(LOGIN_BUTTON);
    }

}
