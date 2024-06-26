package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class login_PF {

        public static WebDriver driver3;
        public login_PF(WebDriver driver)
        {
            PageFactory.initElements(driver,this);
            driver3= driver;
            System.out.println("Control given to Page Object");
        }
        @FindBy(id = "user-name")
        private WebElement user;
        @FindBy(id = "password")
        private WebElement pwd;
        @FindBy(id = "login-button")
        private WebElement loginbtn;
        @FindBy(name = "inventory_item_name")
        private WebElement homepage;
        @FindBy(name = "//h3[@data-test='error']")
        private WebElement errmsg;
        public boolean verifyloginpage()
        {
            return loginbtn.isDisplayed();
        }
        public void enterusername(String username)//it will choose element sendkeys to the elemnt
        {
            user.sendKeys(username);
        }

        public void enterpassword(String password) {
            pwd.sendKeys(password);
        }

        public void clickloginbtn() {
            loginbtn.click();
        }

        public boolean homepage() {
            return homepage.isDisplayed();
        }

        public boolean errormsg() {
            return errmsg.isDisplayed();
        }
    }

