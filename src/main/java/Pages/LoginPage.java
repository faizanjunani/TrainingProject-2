package Pages;

import Locators.LoginLocators;
import Utils.UtilMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.Set;


public class LoginPage {

    private static WebDriver driver;
    LoginLocators loginLocators = new LoginLocators();
    UtilMethods utils = new UtilMethods(driver);

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void userIsPresentOnLoginPage() throws IOException {
        utils.AssertElementTextXpath
                (loginLocators.userPresentOnLoginPage,"Please enter your email and password to log in.");
       // utils.TakeScreenshot(driver,"C:\\Users\\FaizanJunani\\Desktop\\AutomationTraining\\TrainingProject-2\\TrainingProject\\TEST.png");
    }
    public void setUserName(String userName)
    {
        utils.sendKeysXpath(loginLocators.email,userName);
    }
    public void setPassword(String password)
    {
        utils.sendKeysName(loginLocators.password,password);
    }
    public void loginToPortal()
    {
        utils.clickByXpath(loginLocators.loginBtn);
    }

}
