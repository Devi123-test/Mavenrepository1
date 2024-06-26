package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sampleprogram {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("welcome to Automation Testing");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.findElement(By.id("L2AGLb")).click();

//        driver.findElement(By.name("q")).sendKeys("Selenium benefits"); //APjFqb
        driver.findElement(By.id("APjFqb")).sendKeys("Selenium benefits");

    // driver.findElement(By.name("q")).sendKeys("IT Talent Hub in Ilford");
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().refresh();
        Thread.sleep(5000);



    }
}
