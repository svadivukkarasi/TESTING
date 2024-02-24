package faceBookTests;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.CommonFunctions;

import java.time.Duration;

import static utils.CommonFunctions.driver;

public class SignInTest extends CommonFunctions {
    @Given("The user is on homepage {string}")
    public void openHomePage(String url) {
        driver.get("url");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//button[text()='Allow all cookies']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed());
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
    }


    @When("The user enters firstname {string} lastname {string}")
    public void userEntersName(String string, String string2) {
        // driver.findElement(By.name("firstname")).sendKeys("jia");
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Jia");
        driver.findElement(By.name("lastname")).sendKeys("mark");
    }

    @Then("The user enters email {string}")
    public void userEntersE_mail(String string) {
        driver.findElement(By.name("reg_email__")).sendKeys("jiamark2000@gmail.com");

    }

    @Then("The user re-enters email {string}")
    public void the_user_re_enters_email(String string) {

    }

    @Then("the user enters password {string}")
    public void the_user_enters_password(String string) {

    }

    @Then("the user enters date of birth {string}")
    public void the_user_enters_date_of_birth(String string) {

    }

    @Then("the user clicks gender")
    public void the_user_clicks_gender() {

    }

    @Then("the user clicks signup")
    public void the_user_clicks_signup() {

    }


    @Given("The user is on homepage{string}")
    public void theUserIsOnHomepage(String arg0) {
    }
}
