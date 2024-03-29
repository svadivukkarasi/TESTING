package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonFunctions;

public class LoginPage extends CommonFunctions{
    public LoginPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }
   @FindBy(className = "login_logo")
    public WebElement loginHeading;
   @FindBy(id = "user-name")
   public WebElement userFieldText;
   @FindBy(id = "password")
   public WebElement passWordTxtFld;
   @FindBy(id = "login-button")

    public WebElement loginButton;
   @FindBy(className = "title")
   public WebElement productPageHeading;

   @FindBy(xpath = "//h3[@data-test='error']")
   public WebElement errorMsg;

   public void loginVerify(){
       CommonFunctions.assertTrue(loginHeading);


    }
    public void enterUserName(String username){
       CommonFunctions.type(userFieldText,username);

    }
    public void enterPassword(String password){
       CommonFunctions.type(passWordTxtFld,password);

    }
    public void clickButton(){
       CommonFunctions.clickElement(loginButton);
    }
    public void landedProductPage(){
       CommonFunctions.assertTrue(productPageHeading);
    }
 public void verifyInvalidLogin(){
       CommonFunctions.assertTrue(errorMsg);
      // CommonFunctions.takeScreenShot("loginError.png");
   }
}
