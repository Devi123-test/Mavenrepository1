package Selenium_Basics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class Mycontactformsimple {
    public static void main(String[] args) throws InterruptedException, IOException {

        System.out.println("MY CONTACT FORM practice");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mycontactform.com/");
        /*driver.findElement(By.linkText("Features")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Pricing")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Help")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("About Us")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Resources")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Home")).click();
        Thread.sleep(3000);*/
//Filling SAMPLE FORMS By just locators
        driver.findElement(By.linkText("Sample Forms")).click();
        driver.findElement(By.xpath("//input[@value='0']")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/input[2]")).click();
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.name("subject")).sendKeys("Filling sample data");
        String email = "Sample@Email.com";
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("q1")).sendKeys("Textbox field Entered");
        driver.findElement(By.name("q2")).sendKeys("Text Multiline Entered- TEST1. " +
                "Text Multiline Entered- TEST2." +
                "Text Multiline Entered- TEST3." +
                "Text Multiline Entered- TEST4." +
                "Text Multiline Entered- TEST5.");

        //Dropdownbox
        Select s = new Select(driver.findElement(By.xpath("//select[@id='q3']")));
        s.selectByValue("Second Option");
        //SelectRadiobutton
        driver.findElement(By.cssSelector("input[name='q4'][value='Third Option']")).click();
        Thread.sleep(6000);
        TakesScreenshot scrt1 = (TakesScreenshot) driver;
        File src1 = scrt1.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src1, new File("C:\\Users\\devid\\IdeaProjects\\DeviSeleniump1\\screenshots\\ssbeforesubmit_1.jpg"));
        Thread.sleep(3000);

        //check box single answer
        driver.findElement(By.id("q5")).click();
        //check box multiple answer
        driver.findElement(By.xpath("//input[@value='First Check Box']")).click();
        driver.findElement(By.xpath("//input[@value='Second Check Box']")).click();//check box multiple answer
        //dateselector
        driver.findElement(By.name("q7")).sendKeys("12-06-2022");
        driver.findElement(By.name("q7")).sendKeys(Keys.ESCAPE);

        // Section to create object for the dropdown in the application
        WebElement preusstates = driver.findElement(By.name("q8"));
        Select s2 = new Select(preusstates);
        s2.selectByVisibleText("DC");

        //selecting country without object
        driver.findElement(By.name("q9")).sendKeys("India");

        //selecting Province with object
        WebElement canprovince = driver.findElement(By.id("q10"));
        Select s4 = new Select(canprovince);
        s4.selectByVisibleText("Ontario");

        driver.findElement(By.name("q11_title")).sendKeys("Dr.");
        driver.findElement(By.name("q11_first")).sendKeys("Ishwarya");
        driver.findElement(By.name("q11_last")).sendKeys("Shankar");

        driver.findElement(By.name("q12_month")).sendKeys("4");
        driver.findElement(By.name("q12_day")).sendKeys("21");
        driver.findElement(By.name("q12_year")).sendKeys("2011");

        driver.findElement(By.name("attach4589")).sendKeys("C:\\Users\\devid\\IdeaProjects\\DeviSeleniump1\\Fileattach\\Attachfile1.txt");


        //SCREENSHOT
        TakesScreenshot scrt2 = (TakesScreenshot) driver;
        File src2 = scrt2.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src2, new File("C:\\Users\\devid\\IdeaProjects\\DeviSeleniump1\\screenshots\\ssbeforesubmit_2.jpg"));

        Thread.sleep(15000);
        driver.findElement(By.name("submit")).click();

        Thread.sleep(3000);
        TakesScreenshot scrt3 = (TakesScreenshot) driver;
        File src3 = scrt3.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src3, new File("C:\\Users\\devid\\IdeaProjects\\DeviSeleniump1\\screenshots\\ssaftersubmit.jpg"));

    }

}




