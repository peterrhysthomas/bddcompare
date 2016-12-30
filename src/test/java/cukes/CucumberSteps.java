package cukes;

import concordion.SwiftMatchStatusMappingFixture;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class CucumberSteps {
    private String swiftStatus = "";
    private String matchStatus = "";

    @Given("^a swift message containing a 25D status of (.*)$")
    public void a_25d_status_of(String swiftStatus) throws Throwable {
        this.swiftStatus = swiftStatus;
    }

    @When("^this is mapped to the Match Status$")
    public void this_is_mapped_to_the_match_status() throws Throwable {
        this.matchStatus = SwiftMatchStatusMappingFixture.mapSwiftStatus(this.swiftStatus);
    }

    @Then("^the Match Status is (.*)$")
    public void the_match_status_is(String matchStatus) throws Throwable {
        assertThat(this.matchStatus, equalTo(matchStatus));
    }
}