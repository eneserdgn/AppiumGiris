package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.welcomePage;
import util.DriverFactory;

public class welcomePageSteps {

    welcomePage welcomePage = new welcomePage(DriverFactory.getDriver());


    @Given("Enes is opened Faladdin App")
    public void enesIsOpenedFaladdinApp() {
        welcomePage.checkAppOpen();
    }

    @Then("should see Faladdin Icon")
    public void shouldSeeFaladdinIcon() {
        welcomePage.checkFaladdinIcon();
    }

    @Then("should see {string} title")
    public void shouldSeeTitleTitle(String title) {
        welcomePage.checkTitle(title);
    }

    @Then("should see {string} title description")
    public void shouldSeeDescTitleDescription(String desc) {
        welcomePage.checkTitleDescription(desc);
    }

    @Then("should see {string} button")
    public void shouldSeeButtonButton(String btn) {
        welcomePage.checkButtonName(btn);
    }

    @When("click Explore button")
    public void clickButtonButton() {
        welcomePage.clickButtonName();
    }

}
