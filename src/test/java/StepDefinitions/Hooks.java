package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

    @Before
    public void before() {
        System.out.println("Senaryo basladi");
    }

    @After
    public void after(Scenario senaryo) {

        System.out.println("Senaryo bitti");
        //GWD.quitDriver();

    }
}
