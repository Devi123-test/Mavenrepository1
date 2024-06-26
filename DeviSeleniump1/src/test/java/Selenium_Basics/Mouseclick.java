package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseclick {

    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.className("fc-button-label")).click();

        WebElement move = driver.findElement(By.id("windowhandling1"));
        WebElement move2 = driver.findElement(By.name("list_box_name[]"));
        WebElement dblclick = driver.findElement(By.id("doubleClickBtn"));
        WebElement rightclick = driver.findElement(By.id("rightClickBtn"));

		Actions act = new Actions(driver);

        act.moveToElement(move).doubleClick(dblclick).build().perform();
        Thread.sleep(4000);
        driver.switchTo().alert().accept();
        act.moveToElement(move2).doubleClick(dblclick).build().perform();
        Thread.sleep(4000);
driver.switchTo().alert().accept();

	//	act.doubleClick(dblclick).build().perform();
//
//		act.moveToElement(move).doubleClick(dblclick).build().perform();
//         act.moveToElement(move2).doubleClick(dblclick).build().perform();
//        act.doubleClick(dblclick).build().perform();

        WebElement email = driver.findElement(By.id("email"));//email
        act.moveToElement(email).contextClick(email).build().perform();
//       Thread.sleep(4000);
//       email.sendKeys(Keys.ESCAPE);
//
//
//       Thread.sleep(4000);
//        WebElement right = driver.findElement(By.id("rightClickBtn"));
//        act.contextClick(right).build().perform();
//

    }
}
