package sauceDemotest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAuto {
    public  void verifyValidLogin(String username, String password) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        Assert.assertTrue(driver.findElement(By.className("login_logo")).isDisplayed());
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        String expectedProductPageHeading = "Products";
        String actualProductPageHeading = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(expectedProductPageHeading, actualProductPageHeading);
        driver.quit();
    }
public void verifyInvalidLogin(String username, String password){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        Assert.assertTrue(driver.findElement(By.className("login_logo")).isDisplayed());
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        String expectedFailedLoginmsg =("Epic sadface: Username and password do not match any user in this service");
        String actualFailedLoginmsg = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        Assert.assertEquals(expectedFailedLoginmsg,actualFailedLoginmsg);
        driver.quit();

    }
    public static void main(String[] args) {
        LoginAuto tests= new LoginAuto();
        tests.verifyValidLogin("standard_user","secret_sauce");
        tests.verifyInvalidLogin("standard_user_inv","secret_sauce_inv");
    }

    }
