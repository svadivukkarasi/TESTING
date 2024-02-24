package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonFunctions;

import java.sql.SQLOutput;


public class LoginSteps extends CommonFunctions {

    @Given("I am on home page {string}")
    public void openHomePage(String url) {

        driver.get(url);
        Assert.assertTrue(driver.findElement(By.className("login_logo")).isDisplayed());

    }

    @When("I enter username {string} and password {string}")
    public void enterCredentials(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @When("I click login button")
    public void clickLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should login successfully and gets redirected to products page with {string}")
    public void verifyLoginSuccess(String expectedPageHeading) {
        Assert.assertEquals("Products", driver.findElement(By.className("title")).getText());

    }
   /* @Then("I should not be allowed login with error message{string}")
    public void verifyFailedLogin(String errorMessage){
        Assert.assertEquals( errorMessage,
        driver.findElement(By.xpath("//h3[@data-test='error']")).getText());

    }*/

    @Then("I should not be allowed login with error message {string}")
    public void iShouldNotBeAllowedLoginWithErrorMessage(String string) {
        String errorMessage = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(errorMessage,driver.findElement(By.xpath("//h3[@data-test='error']")).getText());
        System.out.println("The Error Message is " +errorMessage);
    }
}
