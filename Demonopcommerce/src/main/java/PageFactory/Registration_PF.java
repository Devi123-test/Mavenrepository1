package PageFactory;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;
public class Registration_PF {

    WebDriver driver3;

    public Registration_PF(WebDriver driver2) {
        this.driver3 = driver2;
        PageFactory.initElements(driver3, this);
        System.out.println("Webelements are called in driver3()");
    }

    @FindBy(linkText = "Register")
    private WebElement registerpage;
    @FindBy(id = "gender-male")
    private WebElement gendermale;
    @FindBy(id = "gender-female")
    private WebElement genderfemale;
    @FindBy(id = "FirstName")
    private WebElement firstname;
    @FindBy(id = "LastName")
    private WebElement lastname;
    @FindBy(name = "DateOfBirthDay")
    private WebElement DOBday;
    @FindBy(name = "DateOfBirthMonth")
    private WebElement DOBmonth;
    @FindBy(name = "DateOfBirthYear")
    private WebElement DOByear;
    @FindBy(id = "Email")
    private WebElement Email;
    @FindBy(id = "Company")
    private WebElement company;
    @FindBy(id = "Newsletter")
    private WebElement newsletter;
    @FindBy(id = "Password")
    private WebElement password;
    @FindBy(id = "ConfirmPassword")
    private WebElement confirmpassword;

    @FindBy(id = "register-button")
    private WebElement Register;

    //    @FindBy(linkText="Continue")
//    private WebElement Continue;
    @FindBy(css = "a.button-1.register-continue-button")
    private WebElement continuebutton;

    @FindBy(linkText = "My account")
    private WebElement homepage;

    public boolean Registerpage() {
        return registerpage.isDisplayed();
    }

    public void navigatetoregisterpage() {
        registerpage.click();
    }

    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("Male")) {
            gendermale.click();
        }
        if (gender.equalsIgnoreCase("Female")) {
            genderfemale.click();
        }
    }

    public void EnterFirstname(String firstname) {
        this.firstname.sendKeys(firstname);
    }

    public void Lastname(String lastname) {
        this.lastname.sendKeys(lastname);
    }

    public void selectDOBday(String day) {
        new Select(this.DOBday).selectByValue(day);
    }

    public void selectDOBmonth(String month) {
        new Select(this.DOBmonth).selectByVisibleText(month);
    }

    public void selectDOByear(String year) {
        new Select(this.DOByear).selectByValue(year);
    }

    public void enteremail(String email) {
        (this.Email).sendKeys(email);
    }

    public void entercompany(String company) {
        this.company.sendKeys(company);
    }

    public void selectnewsletter(String Newsletter) {
        if (newsletter.equals("No") || newsletter.equals("uncheck"))
            this.newsletter.click();
    }

    public void enterpassword(String password) {
        this.password.sendKeys(password);
    }

    public void enterconfirmpassword(String confirmpassword) {
        this.confirmpassword.sendKeys(confirmpassword);
    }

    public void Clickregister() {
        this.Register.click();
    }

    public void Clickcontinue() {
        this.continuebutton.click();
    }

    public boolean verifyhomepage() {
        return this.homepage.isDisplayed();
    }
}