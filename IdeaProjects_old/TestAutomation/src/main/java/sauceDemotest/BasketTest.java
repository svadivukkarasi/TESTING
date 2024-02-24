package sauceDemotest;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasketTest {
    public static WebDriver driver;
    @Before
    public void beforeTest(){
       // WebDriverManager.chromedriver().setup();
       WebDriver  driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        Assert.assertTrue(driver.findElement(By.className("login_logo")).isDisplayed());
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String expectedProductPageHeading = "Products";
        String actualProductPageHeading = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(expectedProductPageHeading, actualProductPageHeading);
    }
    @Test
    public void addProductsToBag()
    {
    driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']").click;
    Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).isDisplayed());
    driver .findElement(By.xpath("//button[text()='addtocart']")).click();

     Assert.assertTrue(driver.findElement(By.className("fa-layers-counter shopping_cart_badge")).getText().equals("1"));
     String expectedBagPageHeading = "your cart";
     String actualBagPageHeading = driver.findElement(By.className("title")).getText();
     Assert.assertEquals(expectedBagPageHeading,actualBagPageHeading);
     Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).isDisplayed());




    }
    @Test
    public void  removeProductFromBag()
        {
        driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']"));
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).isDisplayed());
                        driver .findElement(By.xpath("//button[text()='addtocart']")).click();

        Assert.assertTrue(driver.findElement(By.className("fa-layers-counter shopping_cart_badge")).getText().equals("1"));
        String expectedbagpageHeading = "your cart";
        String actualbagpageHeading = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(expectedbagpageHeading,actualbagpageHeading);
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).isDisplayed());
        driver.findElement(By.xpath("//button[text()='REMOVE']")).click();


    }

    @After
    public void afterTest() {
      //  driver.quit();

    }
    }