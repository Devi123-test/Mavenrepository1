package Annotation;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Annotation/annotation.feature",
        glue = "Annotation",
        plugin = {"pretty", "html:target/cucumber"})

    public class runTest { }

