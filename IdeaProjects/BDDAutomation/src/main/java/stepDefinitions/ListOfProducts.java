package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonFunctions;

import java.lang.String;



import java.util.List;



public class ListOfProducts extends CommonFunctions {
    //private String imgAlt;

    @Then("I should  see {int} Products listed")
    public void verifyProductsListed(int expNumberOfProducts) {
        List<WebElement> products = driver.findElements(By.className("inventory_item"));
        Assert.assertEquals(expNumberOfProducts, products.size());
        System.out.println("No.of.list : " + expNumberOfProducts);
    }

    @Then("I should see products with {string} {string},{string},{string} and {string} button")
    public void verifyListOfProductContents(String title, String price, String description, String imgAlt, String addToCartButton) {
//       // Assert.assertEquals(title,
        String pageTitle = driver.findElement(By.xpath("//div[text()='" + title + "']")).getText();
        System.out.println("pageTitle : " + title);

       // Assert.assertEquals
          String priceP =driver.findElement(By.xpath("//div[text()='" + title + "']/ancestor::div[@class='inventory_item_label']/following-sibling::div[@class='pricebar']/div")).getText();
        System.out.println("product price: " + price);

        Assert.assertTrue(description, driver.findElement(By.xpath("//div[text()='" + title + "']/ancestor::a/following-sibling::div")).getText().contains(description));
        System.out.println("product description: " + description);

        Assert.assertEquals(imgAlt, driver.findElement(By.xpath("//div[text()='" + title + "']/ancestor::div[@class='inventory_item']/div[@class='inventory_item_img']/a/img")).getAttribute("alt"));
        System.out.println("product img: " + imgAlt);

        Assert.assertEquals(addToCartButton, driver.findElement(By.xpath("//div[text()='" + title + "']/ancestor::div[@class='inventory_item_label']/following-sibling::div[@class='pricebar']/button")).getText());
        System.out.println("product click: " + addToCartButton);


    }


}









