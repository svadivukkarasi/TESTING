/*

package faceBookTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.Year;
public class FbLogin {


    public static  WebDriver driver;
    @Test
       public void loginPage() throws InterruptedException {
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get( "https://en-gb.facebook.com/");

        driver.findElement(By.xpath("//button[text()='Allow all cookies']")).click();
       // driver.findElement(By.xpath("//a[text()='Create new account']")).click();
           ////a[@data-testid='open-registration-form-button']
           driver.findElement(By.xpath("//a[text()='Create new account']")).click();

        //Entering data's into the forms

          driver.findElement(By.name("firstname")).sendKeys("Devi");
          driver.findElement(By.name("lastname")).sendKeys("sundaresan");
          driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("devisundaresan@85gmail.com");
          driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("devisundaresan@85gmail.com");
          driver.findElement(By.cssSelector("#password_step_input")).sendKeys("Facebook@2024");
          //DAY
        WebElement birthday = driver.findElement(By.name("birthday_day"));
        Select myDay= new Select(birthday);
        myDay.selectByValue("10");
        WebElement selectedDay = myDay.getFirstSelectedOption();
        System.out.println(selectedDay.getText());
        //MONTH
        WebElement birthdayMonth=driver.findElement(By.name("birthday_month"));
        Select myMonth=new Select(birthdayMonth);
        myMonth.selectByVisibleText("Aug");
        WebElement selectedMonth = myMonth.getFirstSelectedOption();
        System.out.println(selectedMonth.getText());
        //YEAR
        WebElement birthdayYear=driver.findElement(By.name("birthday_year"));
        Select myYear=new Select(birthdayYear);
        myYear.selectByValue("1985");
        WebElement selectedYear=myYear.getFirstSelectedOption();
        System.out.println(selectedYear.getText());
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        driver.findElement(By.name("websubmit")).click();

          Thread.sleep(5000);
          driver.close();



    }




}

*/
