package step_definition;

import io.cucumber.java.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_hooks {

    public static WebDriver driver1;//public-access to all class, static- own object

    @Before
    public void browsersetup(){
        driver1 = new ChromeDriver();
        driver1.get("https://www.saucedemo.com");
        driver1.manage().window().maximize();
        System.out.println("URL opened");
    }
    @After
    public void teardown(){
        driver1.quit();
        System.out.println("Website closed");
    }
}
