package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class _04_BankAccountSteps {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("navigate to bank accounts page")
    public void navigateToBankAccountsPage() {

        ln.findAndClick("setupOne");
        ln.findAndClick("parametersButton");
        ln.findAndClick("bankAccountButton");


    }

    @When("create a bank accounts")
    public void createABankAccounts() {

        dc.findAndClick("ekleButton");
        dc.findAndSend("isimButonu","seddd");
        dc.findAndSend("IbanButonu","TR1258687925");
        dc.findAndClick("currencyDropdownButonu");
        dc.findAndSend("integresyonKodButonu","123SD");
        dc.findAndClick("tryBtn");
        dc.findAndClick("kayitbutonu");
    }

    @When("delete a bank accounts")
    public void deleteABankAccounts() {
        dc.findAndClick("silmeButonu");
        dc.findAndClick("silButonu");



    }
}
