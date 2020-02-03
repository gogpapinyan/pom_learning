package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.AutomationPaths;

public class BaseTest {

    protected WebDriver driver;


    @BeforeClass
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", AutomationPaths.CHROME_DRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
