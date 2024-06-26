package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert {

    public static void main(String[] args) throws InterruptedException {
//       WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
      //  driver.findElement(By.xpath("//*[contains(@class,'mat-focus-indicator solo-button mat-button mat-button-base mat-raised-button')]")).click();

     Thread.sleep(5000);

   WebElement Frame = driver.findElement(By.cssSelector("iframe#gdpr-consent-notice"));
        driver.switchTo().frame(Frame);
        driver.findElement(By.id("save")).click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
//     driver.findElement(By.xpath("//*[contains(@class,'mat-focus-indicator solo-button mat-button mat-button-base mat-raised-button')]")).click();

       Thread.sleep(3000);
        driver.findElement(By.name("cusid")).sendKeys("383234867");
      driver.findElement(By.name("submit")).submit();    //click();
        Thread.sleep(5000);
       //driver.switchTo().alert().dismiss();
        driver.switchTo().alert().accept();

      Thread.sleep(2000);

        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.findElement(By.name("cusid")).sendKeys("3744646353");
        driver.findElement(By.name("submit")).submit();    //click();
        driver.switchTo().alert().dismiss();


    }

}
