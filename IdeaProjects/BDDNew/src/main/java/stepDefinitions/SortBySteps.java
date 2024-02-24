package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonFunctions;

import java.util.List;


public class SortBySteps extends CommonFunctions {
    @Given("I am on home page {string}")
    public void openHomePage(String url)
    {
driver.get(url);

Assert.assertTrue(driver.findElement(By.className("login_logo")).isDisplayed());
    }
    @When("I do login with username {string} and password {string}")
    public void loginCredentials (String username, String password){
driver.findElement(By.id("user-name")).sendKeys(username);
driver.findElement(By.id("password")).sendKeys(password);
String expectedPageHeading="Products";
String actualPageHeading=driver.findElement(By.className("product_label")).getText();
Assert.assertEquals(expectedPageHeading,actualPageHeading);
    }
    @Then("I should see {string} and {string} options in drop down")
    public void verifySortOptions(String option1,String option2){
    new Select(driver.findElement(By.className("product_sort_container"))).selectByVisibleText(option1);
    new Select(driver.findElement(By.className("product_sort_container"))).selectByVisibleText(option2);
    }
    @When("I choose {string} sort option")
    public void chooseSortOptions(String priceLowToHigh)

    {
        WebElement sortContainer=driver.findElement(By.className("product_sort_container"));
        Select priceLtoH=new Select(sortContainer);
        priceLtoH.selectByValue("lohi");
        WebElement selectedValue=priceLtoH.getFirstSelectedOption();


    }
    @Then("I should see the products sorted accordingly")
    public void resultantProducts(String inOrder){
        List<WebElement>productPrice=driver.findElements(By.className("inventory_item_price"));
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='7.99']")).isDisplayed());
    }


} /*WebElement birthday = driver.findElement(By.name("birthday_day"));
Select myDay= new Select(birthday);
        myDay.selectByValue("10");
WebElement selectedDay = myDay.getFirstSelectedOption();
        System.out.println(selectedDay.getText());*/
