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
       driver = new ChromeDriver();
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
    driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).click();
    Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).isDisplayed());
    driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
   // driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
    Assert.assertTrue(driver.findElement(By.className("shopping_cart_badge")).getText().equals("1"));
     driver.findElement(By.className("shopping_cart_badge")).click();

     String expectedBagPageHeading = "Your Cart";
     String actualBagPageHeading = driver.findElement(By.xpath("//span[@class='title']")).getText();
     Assert.assertEquals(expectedBagPageHeading,actualBagPageHeading);
        System.out.println("You are in " +actualBagPageHeading+ "page");
     Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).isDisplayed());

    }

    @Test
    public void removeProductFromBag()
        {
        driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']"));
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).isDisplayed());
        driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
        Assert.assertTrue(driver.findElement(By.className("shopping_cart_badge")).getText().equals("1"));
        driver.findElement(By.className("shopping_cart_badge")).click();
        String expectedbagpageHeading = "Your Cart";
        String actualbagpageHeading = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(expectedbagpageHeading,actualbagpageHeading);
       // Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).isDisplayed());
        driver.findElement(By.xpath("//button[text()='Remove']")).click();


    }
    @After
    public void afterTest() {
    // driver.quit();

    }
    }