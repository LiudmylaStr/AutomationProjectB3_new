package io.loop.test.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverUtil {
    /*create a static method getDriver
    Accepts argument String - browser Type
    return webdriver
     */
    public static WebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")){
            return new ChromeDriver();
        }
        else if (browserType.equalsIgnoreCase("firefox")){
            return new FirefoxDriver();
        }
        else if (browserType.equalsIgnoreCase("safary")) {
            return new SafariDriver();
        }
        else {
            System.out.println("No driver found");
            System.out.println("Driver is null");
        return null;}


        }
    }

