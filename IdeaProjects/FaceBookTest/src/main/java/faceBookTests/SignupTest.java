package faceBookTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SignupTest {
    public static WebDriver driver;
    @Before @Test
     public void openHomePage() {
        // WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//button[text()='Allow all cookies']")).click();
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();

    }
@Test
    public void detailPage() {
        driver.findElement(By.name("firstname")).sendKeys("Devi");
        driver.findElement(By.name("lastname")).sendKeys("Sundaresan");

    }

    /*@After
    public void closeBrowser() {
        driver.quit();
    }*/
}
