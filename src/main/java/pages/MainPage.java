package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    private final By HEADER_TEXT = By.className("heading");
    /**
     * Constructor
     *
     * @param driver
     */
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getHeaderText(){
        return getText(HEADER_TEXT);
    }
}
