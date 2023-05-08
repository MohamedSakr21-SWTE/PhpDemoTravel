package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_homepage;
import org.testng.Assert;

public class D01_homepage {
    P01_homepage homepage = new P01_homepage();

    @When("user enter first name {string} and last name {string}")
    public void userEnterFirstAndLastName(String firstname , String lastname){
        homepage.firstName().sendKeys(firstname);
        homepage.lastName().sendKeys(lastname);

    }

    @And("user enter business name {string}")
    public void userEnterBusinessName(String businessName) {
        homepage.businessName().sendKeys(businessName);
    }

    @And("user enter email {string}")
    public void userEnterEmail(String email) {
        homepage.email().sendKeys(email);
    }

    @And("user enter result")
    public void userEnterResult() {
        int firstNumber = Integer.parseInt(homepage.firstNumber().getText());
        int secondNumber = Integer.parseInt(homepage.secondNumber().getText());
        String result = Integer.toString(firstNumber+secondNumber);
        homepage.result().sendKeys(result);


    }

    @Then("user click submit")
    public void userClickSubmit() {
        homepage.submitButton().click();
    }


}
