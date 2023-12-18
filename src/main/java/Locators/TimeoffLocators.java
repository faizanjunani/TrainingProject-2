package Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class TimeoffLocators {

    public String accessTimeManagementTab  = "//*[text()='Time Management']";
    public String accessRequestTimeoffPage = "//*[@id=\"root\"]/div/div[5]/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[1]/button";

    public String openTimeOffTypeDropdown = "//*[@id=\"svg-icon\"]";

    public String selectTimeOffType = "//*[@id=\"options\"]/li[1]";

    public String openFromDateCalendar = "//*[@id=\"root\"]/div/div[5]/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[7]/div[1]/div/div[2]/div/div[2]/form/div[2]/div[1]/div/div/div[1]/div/input";
    public String enterFromDate = "//*[@id=\"root\"]/div/div[5]/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[7]/div[1]/div/div[2]/div/div[2]/form/div[2]/div[1]/div/div/div/div/input";
    public String selectFromDate = "//*[@id=\"root\"]/div/div[5]/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[7]/div[1]/div/div[2]/div/div[2]/form/div[2]/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[6]/div[4]";

    public String openToDateCalendar = "//*[@id=\"root\"]/div/div[5]/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[7]/div[1]/div/div[2]/div/div[2]/form/div[2]/div[2]/div/div/div[1]/div/input";
    public String enterToDate = "//*[@id=\"root\"]/div/div[5]/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[7]/div[1]/div/div[2]/div/div[2]/form/div[2]/div[2]/div/div/div[1]/div/input";
    public String selectToDate = "//*[@id=\"root\"]/div/div[5]/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[7]/div[1]/div/div[2]/div/div[2]/form/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[7]/div[3]";

    public String requestTimeoff = "//*[@id=\"root\"]/div/div[5]/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[7]/div[1]/div/div[2]/div/div[2]/form/div[7]/div/button[2]";

    public String userPresentOnTimeManagement = "//*[@id=\"root\"]/div/div[5]/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div";
    public String userPresentOnTimeoff = "//*[@id=\"root\"]/div/div[5]/div/div[2]/div/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[7]/div[1]/div/div[2]/div/div[1]/span";
    public String timeOffSubmittedSuccessfully = "//*[@id=\"1\"]/div[1]/div";

}

