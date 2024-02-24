package sauceDemoTest;

import io.cucumber.java.bs.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class BasketTests {
    public static WebDriver driver;
    @Before
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().fullscreen();
        driver.findElement(By.className("login_logo")).isDisplayed();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String expectedPageHeading="Products";
        String actualPageHeading=driver.findElement(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals(expectedPageHeading,actualPageHeading);


    }@Test
    public void addProductsToBag(){
        driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']")).click();
        Assert.assertTrue(driver.findElement(By.id("back-to-products")).isDisplayed());
        //driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).isDisplayed());
    }
    @Test
    public void removeProductsFromBag()
    {
        driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']")).click();
        Assert.assertTrue(driver.findElement(By.id("back-to-products")).isDisplayed());
       // driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
         driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt")).click();
         driver.findElement(By.className("shopping_cart_link")).click();
         driver.findElement(By.xpath("//*[text()='Remove']")).click();
        //assertTrue(driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).isDisplayed());
        String expectedCartPageTitle= "Your Cart";
        String actualCartPageTitle=driver.findElement(By.className("title")).getText();
        Assert.assertEquals(expectedCartPageTitle,actualCartPageTitle);
        System.out.println("You are in remove " +actualCartPageTitle+ " page");
    }
    @After
    public void afterTest(){

        //driver.quit();
    }
}
