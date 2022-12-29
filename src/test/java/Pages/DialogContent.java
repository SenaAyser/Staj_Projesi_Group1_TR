package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }


    @FindBy(css = "[formcontrolname='username']")
    private WebElement username;

    @FindBy(css = "[formcontrolname='password']")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    private WebElement txtTechnoStudy;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addLocationButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortNameInput;


    @FindBy(xpath = "//ms-integer-field[@formcontrolname='capacity']//input")
    private WebElement capacityInput;


    // //span[@class='mat-slide-toggle-thumb']
    // "//mat-slide-toggle[@formcontrolname='active']"
    @FindBy(xpath ="//mat-slide-toggle[@formcontrolname='active']" )
    private WebElement activeBtn;


    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    // dynamic-view[@class='ng-star-inserted'] bu da olur
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-delete-button[@class='ng-star-inserted']//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement dltBtn;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successDeleteMessage;


    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addDepartmentButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement inputName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveBtn;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successCreateMessage;



    @FindBy(xpath = "//ms-delete-button[@class='ng-star-inserted']//button")
    private WebElement deletedBtn;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement dltBtnn;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successdeletedMessage;



    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement ekleButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement isimButonu;

    @FindBy(xpath = "//ms-masked-text-field[@formcontrolname='iban']//input")
    private WebElement IbanButonu;



    @FindBy(xpath ="(//*[@formcontrolname='currency']//div)[1]")
    private WebElement currencyDropdownButonu;

    @FindBy(xpath = "(//mat-option[@role='option']//span)[4]")
    private WebElement tryBtn;


    @FindBy(xpath = "//ms-text-field[@formcontrolname='integrationCode']//input")
    private WebElement integresyonKodButonu;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement kayitbutonu;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement AccountSuccessfully;



    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted']//button)[1]")
    private WebElement silmeButonu;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement silButonu;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement basarilideletedMessage;


    @FindBy(css ="button[class='consent-give']" )
    private WebElement acceptCookies;


    WebElement myElement;

    public  void  findAndSend(String strElement, String value){
        switch (strElement){


            case "username":myElement=username;break;
            case "password":myElement=password;break;
            case "nameInput" :myElement=nameInput;break;
            case "shortNameInput":myElement=shortNameInput;break;
            case "capacityInput":myElement=capacityInput;break;
            case "inputName":myElement=inputName;break;
            case "codeInput":myElement=codeInput;break;
            case "isimButonu":myElement=isimButonu;break;
            case "IbanButonu":myElement=IbanButonu;break;
            case "integresyonKodButonu":myElement=integresyonKodButonu;break;

        }
        sendKeysFunction(myElement,value);
    }

    public void findAndClick(String strElement){
        switch (strElement){
            case "loginButton":myElement=loginButton;break;
            case "acceptCookies":myElement=acceptCookies;break;
            case "addLocationButton":myElement=addLocationButton;break;
            case "activeBtn":myElement=activeBtn;break;
            case "saveButton":myElement=saveButton;break;
            case "deleteButton":myElement=deleteButton;break;
            case "dltBtn":myElement=dltBtn;break;
            case "addDepartmentButton":myElement=addDepartmentButton;break;
            case "saveBtn":myElement=saveBtn;break;
            case "deletedBtn":myElement=deletedBtn;break;
            case "dltBtnn":myElement=dltBtnn;break;
            case "currencyDropdownButonu":myElement=currencyDropdownButonu;break;
            case "tryBtn":myElement=tryBtn;break;
            case "ekleButton":myElement=ekleButton;break;
            case "kayitbutonu":myElement=kayitbutonu;break;
            case "silmeButonu":myElement=silmeButonu;break;
            case "silButonu":myElement=silButonu;break;


        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {
            case "txtTechnoStudy":myElement = txtTechnoStudy;break;
            case "successMessage":myElement=successMessage;break;
            case "successDeleteMessage":myElement=successDeleteMessage;break;
            case "successCreateMessage":myElement=successCreateMessage;break;
            case "successdeletedMessage":myElement=successdeletedMessage;break;
            case "AccountSuccessfully":myElement=AccountSuccessfully;break;
            case "basarilideletedMessage":myElement=basarilideletedMessage;break;

        }
        verifyContainsTextFunction(myElement, text);
    }

}
