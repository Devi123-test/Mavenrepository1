package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public static void main(String[] args) throws InterruptedException {
    System.out.println("Welcome to Selenium Automation");
       /* WebDriver driver = new ChromeDriver();
//        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.name("q")).sendKeys("Selenium benefits");
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
        Thread.sleep(3000);
        driver.close();
       driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);*/

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com");
Thread.sleep(3000);
        driver.findElement(By.id("L2AGLb")).click();
    driver.findElement(By.name("q")).sendKeys("IT Talent Hub in Ilford");
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.close();


    }
}
