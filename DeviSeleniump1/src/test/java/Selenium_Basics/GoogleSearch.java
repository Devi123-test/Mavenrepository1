package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleSearch {


    int a = 10, b = 20;

    public void add() {
        System.out.println(a + b);
    }

    public void sub() {
        System.out.println(a - b);
    }

    public void mul() {
        System.out.println(a * b);
    }

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.name("q")).sendKeys("selenium advantages");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        String title = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();

        System.out.println(title);
        System.out.println(currentUrl);
//        driver.quit();

    }
}

