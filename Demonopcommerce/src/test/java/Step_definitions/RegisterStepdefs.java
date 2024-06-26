package Step_definitions;

import PageFactory.Registration_PF;
import Step_definitions.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterStepdefs {
    WebDriver driver2 = Hooks.driver1;
    Registration_PF Object = new Registration_PF(driver2);

    @Given("User is on registration page")
    public void user_is_on_registration_page(){
        Assert.assertTrue(Object.Registerpage());
        Object.navigatetoregisterpage();
    }
    @When("^User enters valid registration details \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void userEntersValidRegistrationDetails(String gender, String firstname, String lastname, String day, String month, String year, String email, String companyname, String newsletter, String password, String confirmpwd) throws InterruptedException {
        Thread.sleep(2000);
        Object.selectGender(gender);
        Thread.sleep(2000);
        Object.EnterFirstname(firstname);
        Thread.sleep(2000);
        Object.Lastname(lastname);
        Object.selectDOBday(day);
        Thread.sleep(5000);
        Object.selectDOBmonth(month);
        Object.selectDOByear(year);
        Object.enteremail(email);
        Object.entercompany(companyname);
        Object.selectnewsletter(newsletter);
        Object.enterpassword(password);
        Object.enterconfirmpassword(confirmpwd);
    }
        @And("User clicks register and continue")
    public void user_clicks_register_and_continue() throws InterruptedException {
        Object.Clickregister();
        Thread.sleep(3000);
        Object.Clickcontinue();
    }

    @Then("User registered successfully")
    public void user_registered_successfully() throws InterruptedException {
Assert.assertTrue(Object.verifyhomepage());
Thread.sleep(5000);
    }
}
