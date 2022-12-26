package StepDefinitions;

import Pages.DialogContent_Ayser;
import Pages.FormContent_Ayser;
import Pages.LeftNav_Ayser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class _US10_GradeLevelSteps {
    LeftNav_Ayser lna = new LeftNav_Ayser();
    DialogContent_Ayser dca = new DialogContent_Ayser();
    FormContent_Ayser fca = new FormContent_Ayser();
    @Given("Left navdaki modullere tiklatiniz")
    public void leftNavdakiModullereTiklatiniz(DataTable elements) {
        List<String> elementsStr = elements.asList(String.class);

        for (String strButton : elementsStr){
            lna.findAndClick(strButton);
        }
    }


    @And("Add Grade Level butonuna tıklayınız.")
    public void addGradeLevelButonunaTıklayınız() {
        dca.findAndClick("addButton");
    }

    @And("Form content bilgilerini giriniz")
    public void formContentBilgileriniGiriniz(DataTable element) {
        List<List<String>> elementLists = element.asLists(String.class);

        for (int i = 0; i < elementLists.size(); i++) {
            fca.findAndSend(elementLists.get(i).get(0),elementLists.get(i).get(1));
        }
    }

    @And("Form Contentdeki bilgileri seciniz")
    public void formContentdekiBilgileriSeciniz() {
    }

    @When("Save butonuna tıklayınız")
    public void saveButonunaTıklayınız() {
    }

    @Then("Successfully mesaji görülmelidir")
    public void successfullyMesajiGörülmelidir() {
    }
}
