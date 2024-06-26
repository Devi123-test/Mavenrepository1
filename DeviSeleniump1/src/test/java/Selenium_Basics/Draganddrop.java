package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement source = driver.findElement(By.id("draggable"));   //Dragme
		WebElement destination = driver.findElement(By.id("droppable")); //Drophere
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(source).build().perform();

		driver.findElement(By.id("droppableExample-tab-simple")).click();
    	Thread.sleep(2000);
		act.dragAndDrop(source, destination).build().perform();
		act.clickAndHold(source).moveToElement(destination).release().build().perform();

		//releasing the element not working
		act.clickAndHold(source).release().build().perform();
//		Thread.sleep(2000);


	}
}
