package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputsPage extends BasePage {

    private final By INPUT_FIELD = By.cssSelector("div.example input");
    private final By INPUT_LABEL = By.cssSelector("div.large-centered h3");

    /**
     * Constructor
     *
     * @param driver
     */
    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void fillInInputField(String text){
        fillInText(INPUT_FIELD, text);
    }

    public String getInputLabelText(){
        return getText(INPUT_LABEL);
    }
}
