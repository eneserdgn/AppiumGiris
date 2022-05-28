package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.homePage;
import util.DriverFactory;

public class homePageSteps {

    homePage homePage = new homePage(DriverFactory.getDriver());


    @Then("should see Home Page")
    public void shouldSeeHomePage() {
        homePage.checkHomePage();
    }

}
