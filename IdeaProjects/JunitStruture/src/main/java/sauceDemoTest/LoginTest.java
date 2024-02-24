package sauceDemoTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import static jdk.internal.agent.Agent.getText;

public class LoginTest {
   public static WebDriver driver;
@Before
 public void beforeTest(){
     WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
     driver.get("https://www.saucedemo.com");
     Assert.assertTrue(driver.findElement(By.className("login_logo")).isDisplayed());
 }
 @Test
 public void verifyValidLogin(){
   driver.findElement(By.id("user-name")).sendKeys("standard_user");
   driver.findElement(By.id("password")).sendKeys("secret_sauce");
   driver.findElement(By.id("login-button")).click();
   String expectedPageHeading="Products";
   String actualPageHeading=driver.findElement(By.xpath("//span[@class='title']")).getText();
   //String actualPageHeading=driver.findElement(By.className("title")).getText();
   Assert.assertEquals(expectedPageHeading,actualPageHeading);
     System.out.println("PAge Title is : " +actualPageHeading);

 }
 @Test
public void verifyInvalidLogin(){
    driver.findElement(By.id("user-name")).sendKeys("standard_user_inv");
    driver.findElement(By.id("password")).sendKeys("secret_sauce_inv");
    driver.findElement(By.id("login-button")).click();
    String expectedFailedPageHeading="Epic sadface: Username and password do not match any user in this service";
    String actualFailedPageHeading=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
    Assert.assertEquals(expectedFailedPageHeading,actualFailedPageHeading);
}

@After
public void afterTest(){
   // driver.quit();
}
}
