package Hooks;

import Utils.UtilMethods;
import jdk.jshell.execution.Util;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class Hooks {

    private static WebDriver driver;


    private Hooks(){}
    UtilMethods util = new UtilMethods(driver);
    public static WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        if (driver == null){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            //driver.navigate().to("https://core-uat.atlasbyelements.com/#/");


        }
        return driver;

    }


}
