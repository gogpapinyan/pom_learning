package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Implementation of main methods that will be used to work with Web Elements.
 * @author gohar.papinyan
 * @version 1.0
 * @since 30-Jan-20
 */
public class BasePage {

    private WebDriver driver;

    /**
     * Constructor
     * @param driver
     */
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Click on the webElement
     * @param by
     */
    public void click(By by){
        driver.findElement(by).click();
    }

    /**
     * Fills in the input field
     * @param by
     * @param text
     */
    public void fillInText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    /**
     *  Returns the text
     * @param by
     * @return Returns the text value from a given Web Element
     */
    public String getText(By by){
        return driver.findElement(by).getText();
    }

    /**
     * Check if element is present
     * @param by
     * @return Returns true if element is displayed in page
     */
    public boolean isElementDisplayed(By by){
        return driver.findElement(by).isDisplayed();
    }

    /**
     * Get current URL
     * @return
     */
    public String getURL(){
        return driver.getCurrentUrl();
    }

}
