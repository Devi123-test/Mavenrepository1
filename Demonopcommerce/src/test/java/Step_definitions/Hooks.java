package Step_definitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hooks {
    public static WebDriver driver1;
    @Before
    public void browsersetup() throws InterruptedException {
        System.out.println("I'm inside browser setup");
        String appUrl = "https://demo.nopcommerce.com/";
        driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get(appUrl);
        Thread.sleep(3000);
           }
    @After
    public void teardown() throws InterruptedException {
        driver1.quit();
        Thread.sleep(3000);
    }

}
