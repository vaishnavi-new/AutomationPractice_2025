package Steps;

import CommonMethodsForSteps.CommonMethodsMain;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class Login extends CommonMethodsMain
{
    @Override
    public void launchDriver() throws IOException {
        super.launchDriver();
    }

    @Given("Click the elements")
    public void click_the_elements() {
        Scroll(0,500);
        click("//div[@class='category-cards']/div[1]");
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("Click the TextBox")
    public void click_the_text_box()
    {

    }

    @Given("Enter the require details")
    public void enter_the_require_details() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Click submit button")
    public void click_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify the submitted details")
    public void verify_the_submitted_details() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
