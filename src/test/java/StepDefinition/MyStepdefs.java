package StepDefinition;

import Pages.LoginPage;
import Pages.TimeoffPage;
import Pages.TimesheetPage;
import Utils.UtilMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Hooks.Hooks;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class MyStepdefs {
    Hooks hook;
    public WebDriver driver = hook.getDriver();
    LoginPage lp = new LoginPage(driver);
    TimeoffPage tp = new TimeoffPage(driver);
    TimesheetPage tsp = new TimesheetPage(driver);
    UtilMethods util = new UtilMethods(driver);

    public MyStepdefs() throws IOException {
    }


    @Given("user is present on Atlas Login page")
    public void userIsPresentOnAtlasLoginPage() throws IOException {
        lp.setURL("URL");
        lp.userIsPresentOnLoginPage();
    }

    @When("user logins to Atlas with username and password")
    public void userLoginsToAtlasWithUsernameAsAndPasswordAs() throws IOException {
        lp.setUserName("Email");
        lp.setPassword("Password");
        lp.loginToPortal();

    }
    @Then("user navigates to Time management tab")
    public void userNavigatesToTimeManagementTab() throws InterruptedException, IOException {
        tp.navigateToTimeManagement();
    }

    @When("user clicks the request timeoff button")
    public void userClicksTheRequestTimeoffButton() {
        tp.navigateToTimeoffScreen();
    }

    @And("user is present on request timeoff popup")
    public void userIsPresentOnRequestTimeoffPopup() throws IOException {
        tp.userIsPresentonRequestTimeoff();
    }

    @And("user selects option for PTO")
    public void userSelectsOptionForPTO() {
        tp.selectTimeoffType();
    }

    @And("user selects option for FromDate")
    public void userSelectsOptionForFromDate() throws IOException {
        tp.selectTImeOffFromDate("PTOFromDate");
    }

    @And("user selects option for ToDate")
    public void userSelectsOptionForToDate() throws IOException {
        tp.selectTimeOffToDate("PTOToDate");
    }

    @And("user clicks the request button")
    public void userClicksTheRequestButton() {
        tp.submitTimeOffRequest();
    }

    @Then("PTO should be submitted successfully")
    public void ptoShouldBeSubmittedSuccessfully() throws IOException {
        tp.timeOffSubmissionSuccessful();
    }

    @Given("user is present on Time Management tab")
    public void userIsPresentOnTimeManagementTab() {
        tsp.userPresentonTimeManagement();
    }

    @When("user vists Timesheet tab")
    public void userVistsTimesheetTab() throws InterruptedException {
        tsp.navigateToTimesheetTab();
        tsp.verifyUserPresentonTimesheetTab();
    }

    @Then("user opens the timesheet date range")
    public void userOpensTheTimesheetDateRange() throws InterruptedException {
        tsp.openTimesheetCard();
    }

    @And("user edits the timesheet for particular date")
    public void userEditsTheTimesheetForParticularDate() {
        tsp.editTimesheet();
    }

    @Then("user enters the starttime and endtime for that date")
    public void userEntersTheStarttimeAsAndEndtimeAsForThatDate() throws IOException {
     tsp.enterStarTime("TimesheetStartTime");
     tsp.enterEndTime("TimesheetEndTime");
    }

    @Then("user confirms his timesheet entry")
    public void userConfirmsHisTimesheetEntry() {
        tsp.confirmTimesheet();
    }
}
