package Pages;

import Hooks.Hooks;
import Locators.TimeoffLocators;
import Utils.UtilMethods;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class TimeoffPage {

    Hooks hook;
    public WebDriver driver = hook.getDriver();
    TimeoffLocators tl = new TimeoffLocators();
    UtilMethods util = new UtilMethods(driver);
    public TimeoffPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void navigateToTimeManagement() throws InterruptedException, IOException {
        Thread.sleep(20000);
        util.clickByXpath(tl.accessTimeManagementTab);
        util.AssertElementTextXpath
                (tl.userPresentOnTimeManagement, "Time Available");
        util.TakeScreenshot("C:\\Users\\FaizanJunani\\Desktop\\AutomationTraining\\TrainingProject-2\\TrainingProject\\test1.png");
    }
    public void navigateToTimeoffScreen()
    {
        util.clickByXpath(tl.accessRequestTimeoffPage);
    }
    public void userIsPresentonRequestTimeoff() throws IOException {
        util.AssertElementTextXpath(tl.userPresentOnTimeoff, "Request Time Off");
        util.TakeScreenshot("C:\\Users\\FaizanJunani\\Desktop\\AutomationTraining\\TrainingProject-2\\TrainingProject\\test2.png");
    }
    public void selectTimeoffType()
    {
        util.clickByXpath(tl.openTimeOffTypeDropdown);
        util.clickByXpath(tl.selectTimeOffType);
    }
    public void selectTImeOffFromDate()
    {
        util.clickByXpath(tl.openFromDateCalendar);
        util.sendKeysXpath(tl.enterFromDate,"04 Jan 2024");
    }
    public void selectTimeOffToDate()
    {
        util.clickByXpath(tl.openToDateCalendar);
        util.sendKeysXpath(tl.enterToDate,"05 Jan 2024");
    }
    public void submitTimeOffRequest()
    {
        util.clickByXpath(tl.requestTimeoff);
    }
    public void timeOffSubmissionSuccessful() throws IOException {
        util.AssertElementTextXpath
                (tl.timeOffSubmittedSuccessfully,"Request successfully submitted.");
        util.TakeScreenshot("C:\\Users\\FaizanJunani\\Desktop\\AutomationTraining\\TrainingProject-2\\TrainingProject\\test3.png");
    }



}
