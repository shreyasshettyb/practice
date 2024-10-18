package cucumber;

import com.selenium.DayCheck;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MyStepdefs {
    private String dayResult;
    private final DayCheck dayCheck=new DayCheck();
    @Given("today is Sunday")
    public void today_is_sunday() {
        dayCheck.setDay("Sunday");
        assertTrue(true);
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        dayResult=dayCheck.check("Friday");
        assertTrue(true);
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        // Write code here that turns the phrase above into concrete actions
       assertEquals(dayResult,string);
    }
}
