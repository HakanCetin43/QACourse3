package selenium;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static selenium.LocatorMethods.*;
import static selenium.SeleniumHelper.*;

public class Stepdefs {
    @Given("user navigates {string}")
    public void userNavigates(String url) {
        navigatesHelper(url);
    }

    @When("user enters {string} to {string} area")
    public void userEntersToArea(String input, String area) throws InterruptedException {

        entersToAreaHelper(input, area);
    }

    @Then("user views {string}")
    public void userViews(String arg0) {

        userViewsHelper(arg0);
    }

    @And("user clicks {string}")
    public void userClicks(String element) throws InterruptedException {

        clicksHelper(element);
    }

    @Then("user should see {string} page")
    public void userShouldSeePage(String arg0) {

        userShouldSeePageHelper(arg0);
    }
}
