package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LeftNav_Ayser extends HelperFunctions_Ayser {

    public LeftNav_Ayser() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    WebElement myElement;

    public WebElement createElementByXpath(String elementText) {
        return waitUntilClickableAndReturn(GWD.getDriver().findElement(By.xpath("//span[text()='" + elementText + "']")));
    }

    public void findAndClick(String strElement) {
        myElement = createElementByXpath(strElement);
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {

        }
        verifyContainsTextFunction(myElement, text);
    }
}
