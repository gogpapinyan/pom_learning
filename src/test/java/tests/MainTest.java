package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AutomationPaths;
import pages.MainPage;

public class MainTest extends BaseTest {

    private MainPage mainPage;
    @BeforeClass
    public void setUpMainPage(){
        mainPage = new MainPage(driver);
        // openMainPage
        mainPage.openLink(AutomationPaths.URL_MAIN);
    }

     @Test
    public void checkPageOpened(){
        String headerText = mainPage.getHeaderText();
         Assert.assertEquals(headerText,"Welcome to the-internet");
     }


}
