package com.virgingames.cucumber.steps;

import com.virgingames.cucumber.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I Accept Cookie$")
    public void iAcceptCookie() {
        new HomePage().clickOnAccept();
    }

    @When("^I click on Poker page$")
    public void iClickOnPokerPage() {
        new HomePage().clickOnPoker();
    }

    @And("^I click on joint now$")
    public void iClickOnJointNow() {
        new HomePage().clickOncanvas();
    }


}
