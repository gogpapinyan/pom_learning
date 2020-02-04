package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AutomationPaths;
import pages.InputsPage;

public class InputsTest extends BaseTest{

    InputsPage inputsPage;
    @BeforeClass
    public void setUpInputsPage(){
        inputsPage = new InputsPage(driver);
        inputsPage.openLink(AutomationPaths.URL_INPUTS);

    }

    @Test
    public void checkLinkOpensSuccess(){
        String inputLabel = inputsPage.getInputLabelText();
        Assert.assertEquals(inputLabel,"Inputs", "Link is not opened or label text is changed.");
    }

    @Test
    public void checkInputNumbers(){
        inputsPage.fillInInputField("123456789");
        String inputFieldText = inputsPage.getInputFieldText();
        Assert.assertEquals(inputFieldText, "123465789","Numbers are not typed.");
    }

    @Test
    public void checkInputNotNumbers(){
        inputsPage.fillInInputField("Test1");
        String inputFieldText = inputsPage.getInputFieldText();
        Assert.assertEquals(inputFieldText, "","Something goes wrong, input field should not allow entering not numbers.");
    }


}
