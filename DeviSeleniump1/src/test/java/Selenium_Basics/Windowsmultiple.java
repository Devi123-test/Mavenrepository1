package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windowsmultiple {

    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/popup.php");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        WebElement Frame = driver.findElement(By.cssSelector("iframe#gdpr-consent-notice"));
        driver.switchTo().frame(Frame);
        driver.findElement(By.id("save")).click();

        Thread.sleep(2000);
        driver.switchTo().defaultContent();


        Thread.sleep(3000);

//   driver.findElement(By.className("mat-button-wrapper")).click();
//       Thread.sleep(2000);

        driver.findElement(By.xpath("//a[contains(@href,'articles_popup.php')]")).click();
        Thread.sleep(2000);

//        WebElement Frame1 = driver.findElement(By.cssSelector("iframe#ad_iframe"));
//        driver.switchTo().frame(Frame1);
//        driver.findElement(By.id("dismiss-button")).click();

        String parentWindow = driver.getWindowHandle();  //Parent Window 1
        System.out.println(parentWindow);

        Set<String> s1 = driver.getWindowHandles(); //Parent 1 & Child Window 2

        for (String i : s1)   // 1   2

        {
            System.out.println("Window unique id is: " + i);

            if (!parentWindow.equals(i)) {   //(!1==2)  (!False)   (True)
                System.out.println(i);
                driver.switchTo().window(i);  //2
                driver.findElement(By.name("emailid")).sendKeys("student123@gmail.com");
                Thread.sleep(15000);
                driver.findElement(By.name("btnLogin")).submit();
                Thread.sleep(5000);
                driver.close(); // driver.quit();
            }
        }
        driver.switchTo().window(parentWindow);

        driver.findElement(By.xpath("//a[contains(@href,'www.guru99.com/java-tutorial.html')]")).click();

    }

}
