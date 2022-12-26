package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FormContent_Ayser extends HelperFunctions_Ayser{

    public FormContent_Ayser(){
        PageFactory.initElements(GWD.getDriver(), this);
    }

    WebElement myElement;


    public WebElement createElementByCss(String elementText) {

     return waitUntilClickableAndReturn(GWD.getDriver().findElement(By.cssSelector("[@formcontrolname='name']")));

    }

    public void findAndSend(String strElement, String value){
        myElement = createElementByCss(strElement);
        sendKeysFunction(myElement, value);
    }
}
