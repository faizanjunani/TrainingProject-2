package Pages;


import Hooks.Hooks;
import Locators.TimeoffLocators;
import Locators.TimesheetLocators;
import Utils.UtilMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TimesheetPage {
    Hooks hook;
    public WebDriver driver = hook.getDriver();
    TimesheetLocators tsl = new TimesheetLocators();
    TimeoffLocators tl = new TimeoffLocators();
    UtilMethods util = new UtilMethods(driver);



    public TimesheetPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void userPresentonTimeManagement()
    {
        util.AssertElementTextXpath(tl.userPresentOnTimeManagement,"Time Available");
    }

    public void navigateToTimesheetTab() throws InterruptedException {
        Thread.sleep(10000);
        util.clickByXpath(tsl.accessTimeSheetTab);
    }
    public void verifyUserPresentonTimesheetTab()
    {
        util.AssertElementTextXpath(tsl.verifyTimesheetTab,"Time Sheet");
    }
    public void openTimesheetCard() throws InterruptedException {
        Thread.sleep(15000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)", "");
        Thread.sleep(3000);
        util.clickByXpath(tsl.openTimesheetCard);
        js.executeScript("window.scrollBy(0,800)", "");
    }
    public void editTimesheet()
    {
        util.clickByXpath(tsl.editTimesheet);
    }
    public void enterStarTime(String startTime)
    {
        util.sendKeysXpath(tsl.addStartTime,startTime);
    }
    public void enterEndTime(String endTime)
    {
        util.sendKeysXpath(tsl.addEndTime,endTime);
    }
    public void confirmTimesheet()
    {
        util.clickByXpath(tsl.confirmTimesheet);
    }
}
