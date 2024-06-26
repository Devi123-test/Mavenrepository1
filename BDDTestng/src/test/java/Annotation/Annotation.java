package Annotation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Annotation {
    WebDriver driver = null;

    @Given("^I am on Facebook login page$")

    public void goToFacebook() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //implicit wait
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
Thread.sleep(5000);
    }
        @When("^I enter username as \"(.*)\"$")
        public void enterUsername(String arg1) {
            driver.findElement(By.id("email")).sendKeys(arg1);
        }

        @When ("^I enter password as \"(.*)\"$")
        public void enterPassword(String arg1) {
            driver.findElement(By.id("pass")).sendKeys(arg1);
            driver.findElement(By.name("login")).click();
        }

        @Then("^Login should fail$")
        public void checkFail() {
            if(driver.getCurrentUrl().equalsIgnoreCase(
                    "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){
                System.out.println("Test1 Pass");
            } else {
                System.out.println("Test1 Failed");
            }
    }

        @Then("^Relogin option should be available$")
        public void checkRelogin() {
            if (driver.getCurrentUrl().equalsIgnoreCase(
                    "https://www.facebook.com/login.php?login_attempt=1&lwv=110")) {
                System.out.println("Test2 Pass");
            } else {
                System.out.println("Test2 Failed");
            }
            driver.quit();
        }
    }
