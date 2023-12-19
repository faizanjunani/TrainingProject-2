package Pages;

import Hooks.Hooks;
import Locators.LoginLocators;
import Utils.UtilMethods;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class LoginPage {

    Hooks hook;
    public WebDriver driver = hook.getDriver();
    LoginLocators loginLocators = new LoginLocators();
    UtilMethods utils = new UtilMethods(driver);


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void userIsPresentOnLoginPage() throws IOException {
        utils.AssertElementTextXpath
                (loginLocators.userPresentOnLoginPage,"Please enter your email and password to log in.");
        utils.TakeScreenshot("C:\\Users\\FaizanJunani\\Desktop\\AutomationTraining\\TrainingProject-2\\TrainingProject\\TEST.png");
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
