package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazonsample1 {

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
//        driver.manage().deleteAllCookies();

        driver.findElement(By.name("field-keywords")).sendKeys("Sony TV");
        driver.findElement(By.name("field-keywords")).sendKeys(Keys.ENTER);


    }
}
