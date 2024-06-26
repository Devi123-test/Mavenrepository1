package Selenium_Basics;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

public class Parameterisationpractice1 {

    public static <checkboxmultiplearray> void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
      //  driver.get("https://www.mycontactform.com/");
        FileInputStream fis;
        FileOutputStream fos;
        String filepath = "src/test/resources/Test_data.xlsx";//inside SRC - SRC path, outside SRC - give full path
        fis = new FileInputStream(filepath);//passing file path into Input stream
        XSSFWorkbook workbook1 = new XSSFWorkbook(fis);//passing Input stream into workbook
       // XSSFSheet sheet1 = workbook1.getSheetAt(0);//passing sheet index into sheet
        XSSFSheet sheet1 = workbook1.getSheet("Inputdata");//passing sheet name into sheet
        String url = sheet1.getRow(1).getCell(0).getStringCellValue();//getting data(URL) to the variable
        System.out.println(url.trim());
        driver.get(url.trim());
        driver.findElement(By.linkText("Sample Forms")).click();
       String sendto = sheet1.getRow(1).getCell(1).getStringCellValue();
        String senttoarray[] = sendto.split(","); // 1,2,0
        for (String eachSendto : senttoarray) {
            Thread.sleep(2000);
            if (eachSendto.trim().equalsIgnoreCase("Marketing Department")) {
                driver.findElement(By.xpath("//input[@name='email_to[]'][@value='0']")).click();
            } else if (eachSendto.trim().equalsIgnoreCase("Sales")) {
                driver.findElement(By.xpath("//input[@name='email_to[]'][@value='1']")).click();
            } else if (eachSendto .trim().equalsIgnoreCase("Customer Service")) {
                driver.findElement(By.xpath("//input[@name='email_to[]'][@value='2']")).click();
            } else {
                System.out.println("Invalid Send To option");
            }

        }

        String subject = sheet1.getRow(1).getCell(2).getStringCellValue();
        driver.findElement(By.id("subject")).sendKeys(subject.trim());

        String email = sheet1.getRow(1).getCell(3).getStringCellValue();
        driver.findElement(By.id("email")).sendKeys(email.trim());

        String txtboxfield = sheet1.getRow(1).getCell(4).getStringCellValue();
        driver.findElement(By.id("q1")).sendKeys(txtboxfield.trim());

        String txtboxmultiline = sheet1.getRow(1).getCell(5).getStringCellValue();
        driver.findElement(By.id("q2")).sendKeys(txtboxmultiline.trim());

        WebElement dropdn = driver.findElement(By.id("q3"));
        String dropdown = sheet1.getRow(1).getCell(6).getStringCellValue();
        Select s = new Select(dropdn);
        s.selectByVisibleText(dropdown.trim());

        String radiobutton = sheet1.getRow(1).getCell(7).getStringCellValue();
        driver.findElement(By.xpath("//input[@id='q4'][@value='"+radiobutton+"']")).click();

        String checkboxsingle = sheet1.getRow(1).getCell(8).getStringCellValue();
        if (checkboxsingle.trim().equals("check")){
            driver.findElement(By.id("q5")).click();
        }

        String checkboxmultiple = sheet1.getRow(1).getCell(9).getStringCellValue();
        String checkboxmultiplearray[] = checkboxmultiple.split(",");
        for (int i = 0; i < checkboxmultiplearray.length; i++) {
            driver.findElement(By.xpath("//input[@name='checkbox6[]'][@value='" + checkboxmultiplearray[i].trim() + "']")).click();
        }

        String dateselect = sheet1.getRow(1).getCell(10).getStringCellValue();
        driver.findElement(By.id("q7")).sendKeys(dateselect.trim());
        driver.findElement(By.id("q7")).sendKeys(Keys.ESCAPE);

        WebElement preusstates = driver.findElement(By.id("q8"));
        String usstates = sheet1.getRow(1).getCell(11).getStringCellValue();
        Select S2 = new Select(preusstates);
        S2.selectByVisibleText(usstates.trim());

        WebElement country = driver.findElement(By.id("q9"));
        String countries = sheet1.getRow(1).getCell(12).getStringCellValue();
        Select S3 = new Select(country);
        S3.selectByVisibleText(countries.trim());

        WebElement province = driver.findElement(By.id("q10"));
        String provinces = sheet1.getRow(1).getCell(13).getStringCellValue();
        Select S4 = new Select(province);
        S4.selectByVisibleText(provinces.trim());

        WebElement titlename = driver.findElement(By.name("q11_title"));
        String title = sheet1.getRow(1).getCell(14).getStringCellValue();
        Select S5 = new Select(titlename);
        S5.selectByVisibleText(title.trim());

        String firstname = sheet1.getRow(1).getCell(15).getStringCellValue();
        driver.findElement(By.name("q11_first")).sendKeys(firstname.trim());

        String lastname = sheet1.getRow(1).getCell(16).getStringCellValue();
        driver.findElement(By.name("q11_last")).sendKeys(lastname.trim());

        WebElement dobmm = driver.findElement(By.name("q12_month"));
        String dobmonth = sheet1.getRow(1).getCell(17).getStringCellValue();
        Select S7 = new Select(dobmm);
        S7.selectByVisibleText(dobmonth.trim());

        WebElement dobdd = driver.findElement(By.name("q12_day"));
        String dobday = sheet1.getRow(1).getCell(18).getStringCellValue();
        Select S8 = new Select(dobdd);
        S8.selectByVisibleText(dobday.trim());

        WebElement dobyr = driver.findElement(By.name("q12_year"));
        String dobyear = sheet1.getRow(1).getCell(19).getStringCellValue();
        Select S9 = new Select(dobyr);
        S9.selectByVisibleText(dobyear.trim());

        String file = sheet1.getRow(1).getCell(20).getStringCellValue();
        driver.findElement(By.name("attach4589")).sendKeys("C:\\Users\\devid\\IdeaProjects\\DeviSeleniump1\\Fileattach\\"+file+".txt");
       Thread.sleep(15000);

        driver.findElement(By.name("submit")).click();
        Thread.sleep(3000);
        driver.quit();

        Cell data = sheet1.createRow(7).createCell(4);
        String sample = "File Uploaded Successfully";
        data.setCellValue(sample);
        fos = new FileOutputStream(filepath);
        workbook1.write(fos);
        workbook1.close();

    }
}
