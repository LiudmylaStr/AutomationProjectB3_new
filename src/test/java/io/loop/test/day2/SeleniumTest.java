package io.loop.test.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {


        //create an instance of webdriver
        WebDriver driver = new ChromeDriver();
        //maximise the window
        driver.manage().window().maximize();
  //driver.manage().window().fullscreen(); another way to maximize window
        //navigate to the webpage
        driver.get("https://www.loopcamp.io");
        Thread.sleep(5000);
        driver.navigate().to("https://www.etsy.com");

        //navigate back

        driver.navigate().back();

        //navigate forward
        driver.navigate().forward();

        //refresh
        driver.navigate().refresh();

        //quit and close
       // driver.close();
        driver.quit();
    }
}