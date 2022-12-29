package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {

        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Locations']")
    private WebElement locations;

    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement departments;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parametersButton;

    @FindBy(xpath = "(//span[text()='Bank Accounts'])[1]")
    private WebElement bankAccountButton;



    WebElement myElement;

    public void findAndClick(String strElement)
    {
        switch (strElement)
        {
            case "setupOne" :myElement=setupOne;break;
            case "schoolSetup" : myElement=schoolSetup;break;
            case "locations" : myElement=locations;break;
            case "departments":myElement=departments;break;
            case "parametersButton":myElement=parametersButton;break;
            case "bankAccountButton":myElement=bankAccountButton;break;
        }
        clickFunction(myElement);










    }








}
