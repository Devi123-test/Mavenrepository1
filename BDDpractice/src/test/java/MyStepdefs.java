//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import io.cucumber.java.en.Then;
import PageObject.login_PF;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import step_definition.Login_hooks;

public class MyStepdefs {

    private final WebDriver driver2 = Login_hooks.driver1;
    //changing the control-classname.variable,classname because that driver is static
    login_PF object = new login_PF(driver2);

    @Given("user is in sauce demo page")
    public void user_is_in_sauce_demo_page() {
        System.out.println("login vage verification");
        Assert.assertTrue(object.verifyloginpage());
    }
    @When("^user input \"([^\"]*)\" as username \"([^\"]*)\" as password$")
    public void user_input_as_username_as_password(String arg0, String arg1) throws InterruptedException {
        System.out.println("Enter username");
        object.enterusername(arg0);
       Thread.sleep(3000);
       object.enterpassword(arg1);
       Thread.sleep(3000);
       object.clickloginbtn();
       Thread.sleep(5000);
    }

    @Then("User navigated to homepage")
    public void user_navigated_to_homepage()
    {
        System.out.println("Homepage successful");
       Assert.assertTrue(object.homepage());
    }

    @Then("user get {string} as error message")
    public void user_get_as_error_message(String arg0) {
        System.out.println("Error msg displayed");
        Assert.assertTrue(object.errormsg());
        }
}

