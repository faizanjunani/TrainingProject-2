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


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void userIsPresentOnLoginPage() {
        utils.AssertElementTextXpath
                (loginLocators.userPresentOnLoginPage,"Please enter your email and password to log in.");
        utils.TakeScreenshot("C:\\Users\\FaizanJunani\\Desktop\\AutomationTraining\\TrainingProject-2\\TrainingProject\\TEST.png");
    }
    public void setURL(String url) throws IOException {
        String URL = utils.getvaluesfromconfigfile(url);
        driver.navigate().to(URL);


    }
    public void setUserName(String userName) throws IOException {
        String email = utils.getvaluesfromconfigfile(userName);
        utils.sendKeysXpath(loginLocators.email,email);
    }
    public void setPassword(String password) throws IOException {
        String pass = utils.getvaluesfromconfigfile(password);
        utils.sendKeysName(loginLocators.password,pass);
    }
    public void loginToPortal()
    {
        utils.clickByXpath(loginLocators.loginBtn);
    }

}
