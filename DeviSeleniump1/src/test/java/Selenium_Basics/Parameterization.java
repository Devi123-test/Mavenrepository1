package Selenium_Basics;

import io.basc.framework.env.Sys;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.stylesheets.LinkStyle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Parameterization {
    public static void main(String[] args) throws IOException, InterruptedException {
     FileInputStream fis;
     FileOutputStream fos;
     XSSFWorkbook workbook1;

    String filepath = "C:\\Users\\devid\\IdeaProjects\\DeviSeleniump1\\src\\test\\resources\\Test_data.xlsx";


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();

//        driver= BrowserSetup.getBrowser();

       //FileInputStream fis = new FileInputStream("C:\\Users\\devid\\IdeaProjects\\DeviSeleniump1\\src\\test\\resources\\Test_data.xlsx");
        fis = new FileInputStream(filepath);

        workbook1 = new XSSFWorkbook(fis); // XSSFWorkbook It is a class that is used to represent both high and low level Excel file formats.
        XSSFSheet sheet1 = workbook1.getSheet("Inputdata"); // workbook1.getSheet("Inputdata");

//        Scanner sc = new Scanner(System.in);
//       String Stuname =  sc.next();

       String url = sheet1.getRow(1).getCell(20).getStringCellValue();
       System.out.println(url.trim());

//     File f = new File(filepath);
//     if (!f.exists()) {
//       workbook1= new XSSFWorkbook();
//       fos = new FileOutputStream(filepath);
//     }
//     fis = new FileInputStream(filepath);
//     workbook1 = new XSSFWorkbook(fis);
////     if (workbook1.getSheetIndex(sheet1)==-1) {
////         workbook1.createSheet(filepath);
////     }

//        workbook1.getSheet("Inputdata");
//        XSSFRow row = sheet1.getRow(1);
//        XSSFCell cell = row.createCell(22);
//        cell.setCellValue("Test string written in excel");

//        fos = new FileOutputStream(filepath);
//        workbook1.write(fos);
//        fos.close();

//        driver.get("https://mycontactform.com/");

        driver.get(url.trim());
        driver.findElement(By.linkText("Sample Forms")).click();
        //how to declare webelement
        WebElement dropdown = driver.findElement(By.id("q3"));
        Select s = new Select(dropdown);
//
        WebElement preusstates = driver.findElement(By.name("q8"));
        Select s2 = new Select(preusstates);

        WebElement countries = driver.findElement(By.id("q9"));
        Select s3 = new Select(countries);

        WebElement canprovince = driver.findElement(By.id("q10"));
        Select s4 = new Select(canprovince);

        WebElement titlename = driver.findElement(By.name("q11_title"));
        Select s5 = new Select(titlename);

        WebElement dobmm = driver.findElement(By.name("q12_month"));
        Select s6 = new Select(dobmm);

        WebElement dobdd = driver.findElement(By.name("q12_day"));
        Select s7 = new Select(dobdd);

        WebElement dobyy = driver.findElement(By.name("q12_year"));
        Select s8 = new Select(dobyy);

//        XSSFSheet sheet2 = workbook1.getSheet("Sheet2");

        String sendto = sheet1.getRow(1).getCell(0).getStringCellValue(); //    MARKEting Department  ,  Customer Service, Sales

//        sendto  = "Customer Service,Sales,Marketing Department";
//        sendto = "1,2,0";
        String subject = sheet1.getRow(1).getCell(1).getStringCellValue();
        String email = sheet1.getRow(1).getCell(2).getStringCellValue();
        String txtboxfield = sheet1.getRow(1).getCell(3).getStringCellValue();
        String txtboxmultiline = sheet1.getRow(1).getCell(4).getStringCellValue();
        String dropdownopt = sheet1.getRow(1).getCell(5).getStringCellValue();
        String radiobtn = sheet1.getRow(1).getCell(6).getStringCellValue();
        String checkboxsingle = sheet1.getRow(1).getCell(7).getStringCellValue();
        String checkboxmultiple = sheet1.getRow(1).getCell(8).getStringCellValue();
        String DateSelect = sheet1.getRow(1).getCell(9).getStringCellValue();
        String usstates = sheet1.getRow(1).getCell(10).getStringCellValue();
        String country  = sheet1.getRow(1).getCell(11).getStringCellValue();
        String province = sheet1.getRow(1).getCell(12).getStringCellValue();
        String title = sheet1.getRow(1).getCell(13).getStringCellValue();
        String firstname = sheet1.getRow(1).getCell(14).getStringCellValue();
        String lastname = sheet1.getRow(1).getCell(15).getStringCellValue();
        String dobmonth = sheet1.getRow(1).getCell(16).getStringCellValue();
        String dobday = sheet1.getRow(1).getCell(17).getStringCellValue();
        String dobyear = sheet1.getRow(1).getCell(18).getStringCellValue();
        String attachfile = sheet1.getRow(1).getCell(19).getStringCellValue();

////       String userid1 = sheet2.getRow(1).getCell(0).getStringCellValue();
//
//        //handling dropdown
//
//
////        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/fieldset/div/input[@name='user']")).sendKeys();
        String senttoarray[] = sendto.split(","); // 1,2,0
        for (int i = 0; i < senttoarray.length; i++) {
//            System.out.println(senttoarray[i]);
//            driver.findElement(By.xpath("//input[@name='email_to[]'][@value='"+senttoarray[i]+"']")).click();
//                                      driver.findElement(By.xpath("//input[@name='email_to[]'][@value='1']")).click();
            Thread.sleep(2000);
            if (senttoarray[i].trim().equalsIgnoreCase("Marketing Department")) {
                driver.findElement(By.xpath("//input[@name='email_to[]'][@value='0']")).click();
            } else if (senttoarray[i].trim().equalsIgnoreCase("Sales")) {
                driver.findElement(By.xpath("//input[@name='email_to[]'][@value='1']")).click();
            } else if (senttoarray[i].trim().equalsIgnoreCase("Customer Service")) {
                driver.findElement(By.xpath("//input[@name='email_to[]'][@value='2']")).click();
            } else {
                System.out.println("Invalid Send To option");
            }
        }
//
//        if (sendto.trim().equalsIgnoreCase("Marketing Department")) {
//            driver.findElement(By.xpath("//input[@name='email_to[]'][@value='0']")).click();
//        } else if (sendto.trim().equalsIgnoreCase("Sales")) {
//            driver.findElement(By.xpath("//input[@name='email_to[]'][@value='1']")).click();
//        } else if (sendto.trim().equalsIgnoreCase("Customer Service")) {
//            driver.findElement(By.xpath("//input[@name='email_to[]'][@value='2']")).click();
//        } else {
//            System.out.println("Invalid Send To option");
//        }

        driver.findElement(By.id("subject")).sendKeys(subject.trim());
        driver.findElement(By.name("email")).sendKeys(email.trim());
        driver.findElement(By.id("q1")).sendKeys(txtboxfield.trim());
        driver.findElement(By.name("q2")).sendKeys(txtboxmultiline.trim());
        s.selectByVisibleText(dropdownopt.trim());


//            radiobtn = "Second Option";
////        driver.findElement(By.xpath("//input[@name='q4'][@value='Third Option']")).click();
//        driver.findElement(By.xpath("//input[@name='q4'][@value='" +radiobtn.trim()+  "']")).click();
////        driver.findElement(By.xpath("//input[@name='q4'][@value='" +radiobtn.trim() +  "']")).click();

//        radiobtn = "Second Option";
        driver.findElement(By.xpath("//input[@name='q4'][@value='"+radiobtn+"']")).click();

//        if (radiobtn.trim().equalsIgnoreCase("First Option")) {
//            driver.findElement(By.xpath("//input[@name='q4'][@value='First Option']")).click();
//        } else if (radiobtn.trim().equalsIgnoreCase("Second Option")) {
//            driver.findElement(By.xpath("//input[@name='q4'][@value='Second Option']")).click();
//        } else if (radiobtn.trim().equalsIgnoreCase("Third Option")) {
//            driver.findElement(By.xpath("//input[@name='q4'][@value='Third Option']")).click();
//        } else if (radiobtn.trim().equalsIgnoreCase("Fourth Option")) {
//            driver.findElement(By.xpath("//input[@name='q4'][@value='Fourth Option']")).click();
//        } else if (radiobtn.trim().equalsIgnoreCase("Fifth Option")) {
//            driver.findElement(By.xpath("//input[@name='q4'][@value='Fifth Option']")).click();
//        } else {
//            System.out.println("Invalid radio button option");
//        }

        Thread.sleep(5000);

//        if (driver.findElement(By.name("q5")).isDisplayed()){
//         driver.findElement(By.name("q5")).click();
//        } else
//        {
//            System.out.println("Checkbox is not displayed");
//        }

        if ((checkboxsingle.trim().equalsIgnoreCase("Check")) && (!( driver.findElement(By.name("q5")).isSelected())))
        {
            driver.findElement(By.name("q5")).click();
        } else {
            System.out.println("Checkbox is already selected or no need to select");

        }

        String checkboxmultiplearray[] = checkboxmultiple.split(",");// Fourth Check Box Second Check Box Fifth Check Box
        for (int i = 0; i < checkboxmultiplearray.length; i++) {
//           driver.findElement(By.xpath("//input[@name='checkbox6[]'][@value='"+checkboxmultiplearray[i].trim()+"']")).click();
           driver.findElement(By.cssSelector("input[name='checkbox6[]'][value='"+checkboxmultiplearray[i].trim()+"']")).click();
        Thread.sleep(3000);
        }

        TakesScreenshot scrt1 = (TakesScreenshot) driver;
        File src1 = scrt1.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src1, new File("C:\\Anna Automation\\SeleniumDemo1\\Screenshots2\\ParaSC1.jpg"));
//            FileUtils.copyFile(src1, new File("C:\\Users\\Annadurai\\Desktop\\Screenshottemp\\Cycle1\\abcd1.jpg"));


//        driver.findElement(By.xpath("//input[@name='checkbox6[]'][@value='"+checkboxmultiple+"']")).click();
        driver.findElement(By.id("q7")).sendKeys(DateSelect.trim());
        driver.findElement(By.id("q7")).sendKeys(Keys.ESCAPE);
        s2.selectByValue(usstates.trim());
        s3.selectByVisibleText(country.trim());
        s4.selectByValue(province.trim());
        s5.selectByVisibleText(title.trim());
        driver.findElement(By.name("q11_first")).sendKeys(firstname.trim());
        driver.findElement(By.name("q11_last")).sendKeys(lastname.trim());
        s6.selectByVisibleText(dobmonth.trim());
        s7.selectByValue(dobday.trim());
        s8.selectByVisibleText(dobyear.trim());

        Cell data1 = sheet1.getRow(1).createCell(25);
        data1.setCellValue("Data1 written for sample");
        Cell data2 = sheet1.getRow(1).createCell(26);
        String daata2=  driver.findElement(By.xpath("//p[@class='name']")).getText();
        data2.setCellValue(daata2);
        Cell data3 = sheet1.getRow(1).createCell(27);
        String daata3=  driver.findElement(By.xpath("//p[@class='link']")).getText();
        data3.setCellValue(daata3);
        fos = new FileOutputStream(filepath);
        workbook1.write(fos);
        workbook1.close();
//
//////      driver.findElement(By.name("attach4589")).sendKeys("C:\\Anna Automation\\SeleniumDemo1\\Screenshots\\ss1.jpg");
        driver.findElement(By.name("attach4589")).sendKeys("C:\\Users\\devid\\IdeaProjects\\DeviSeleniump1\\Fileattach\\"+attachfile+".txt");

         TakesScreenshot scrt2 = (TakesScreenshot) driver;
        File src2 = scrt2.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(src2, new File("C:\\Anna Automation\\SeleniumDemo1\\Screenshots2\\abcd2.jpg"));
        FileUtils.copyFile(src2, new File("C:\\Users\\devid\\IdeaProjects\\DeviSeleniump1\\screenshots1\\abcd2.jpg"));
      Thread.sleep(12000); // To enter verification code
//        driver.findElement(By.name("submit")).click();
//        TakesScreenshot scrt2 = (TakesScreenshot) driver;
//        File src2 = scrt2.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(src2, new File("C:\\Anna Automation\\SeleniumDemo1\\Screenshots\\ssafter1.jpg"));



    }
}



