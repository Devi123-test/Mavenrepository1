package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Synchronisation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestingplayground.com/clientdelay");
        driver.manage().window().maximize();

        //synchronisation using implicit wait
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //synchronisation using explicit wait
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-primary")));
//       wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button.btn.btn-primary")));

        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();//click on button to get data

       // Thread.sleep(30000);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("p.bg-success")));
        String dataStatus= driver.findElement(By.cssSelector("p.bg-success")).getText();
        System.out.println("Client side status is: "+  dataStatus);


        /*
        Thread.sleep - Hard wait
        Thread.sleep(2000);
         */
//
//        //synchronisation using Thread.sleep
//        Thread.sleep(30000);







    }
}
