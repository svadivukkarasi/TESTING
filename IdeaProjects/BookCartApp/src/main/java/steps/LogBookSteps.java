package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class LogBookSteps {
     WebDriver driver;


    @Given(" User Should be on the homepage")
    public  void openHomePage() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MICROSECONDS);
        Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='Login']")).isDisplayed());
    }


    @Given("User Should be on the homepage\\({string})")
    public void userShouldBeOnTheHomepage(String arg0) {
        driver.get("url");
    }

    @When("The User login with <{string}> and <{string}>")
    public void theUserLoginWithAnd(String username, String password) {
        driver.findElement(By.className("")).sendKeys(username);
        driver.findElement(By.id("")).sendKeys(password);
        driver.findElement(By.className("r")).click();
        String expectedHeading= "Book Cart";
        String actualHeading=driver.findElement(By.className("" +
                "")).getText();
        Assert.assertEquals(expectedHeading,actualHeading);
    }

    @And("The User should search a <{string}>")
    public void theUserShouldSearchA(String arg0) {

    }
}



