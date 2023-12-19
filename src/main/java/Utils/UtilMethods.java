package Utils;
import Hooks.Hooks;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class UtilMethods {
    SoftAssert softAssert = new SoftAssert();
    Hooks hook;
    public WebDriver driver = hook.getDriver();
    long Timeout = 25;

    public UtilMethods(WebDriver driver) {
        try {
            this.driver = driver;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void clickByXpath(String Xpath) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(Timeout)).until(ExpectedConditions
                    .visibilityOfElementLocated(By.xpath(Xpath)));
            driver.findElement(By.xpath(Xpath)).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void clickByName(String name) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(Timeout)).until(ExpectedConditions
                    .visibilityOfElementLocated(By.name(name)));
            driver.findElement(By.name(name)).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void sendKeysXpath(String Xpath, String value) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(Timeout)).until(ExpectedConditions
                    .visibilityOfElementLocated(By.xpath(Xpath)));
            WebElement element = driver.findElement(By.xpath(Xpath));
            element.clear();
            element.sendKeys(value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void sendKeysName(String name, String value) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(Timeout)).until(ExpectedConditions
                    .visibilityOfElementLocated(By.name(name)));
            WebElement element = driver.findElement(By.name(name));
            element.clear();
            element.sendKeys(value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void AssertElementTextXpath(String xpath, String expectedValue) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(Timeout)).until(ExpectedConditions
                    .visibilityOfElementLocated(By.xpath(xpath)));
            WebElement element = driver.findElement(By.xpath(xpath));
            String actualText = element.getText();
            softAssert.assertEquals(actualText, expectedValue);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void TakeScreenshot(String filePath) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File SrcFile = ts.getScreenshotAs(OutputType.FILE);
            File DestFile = new File(filePath);
            FileUtils.copyFile(SrcFile, DestFile);
            System.out.println("Screenshot captured and saved to: " + DestFile.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Error capturing screenshot: " + e.getMessage());
        }
    }
}


