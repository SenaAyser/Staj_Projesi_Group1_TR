package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.*;
import org.apache.commons.lang3.RandomStringUtils;

public class _01_LocationsSteps {


    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();

    @And("Navigate to Location page")
    public void navigateToLocationPage() {

        ln.findAndClick("setupOne");
        ln.findAndClick("schoolSetup");
        ln.findAndClick("locations");

    }

    @When("create  a locations")
    public void createALocations() {

        String randomGenName= RandomStringUtils.randomAlphanumeric(8);
        String randomGenShortName=RandomStringUtils.randomNumeric(5);


        dc.findAndClick("addLocationButton");
        dc.findAndSend("nameInput",randomGenName);
        dc.findAndSend("shortNameInput",randomGenShortName);
        dc.findAndSend("capacityInput","12");
        dc.findAndClick("activeBtn");
        dc.findAndClick("saveButton");

    }
    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        dc.findAndContainsText("successMessage","success");
        dc.findAndContainsText("successDeleteMessage","success");

    }

    @When("delete a school location")
    public void deleteASchoolLocation() {

        dc.findAndClick("deletedBtn");
        dc.findAndClick("dltBtnn");
    }
}
