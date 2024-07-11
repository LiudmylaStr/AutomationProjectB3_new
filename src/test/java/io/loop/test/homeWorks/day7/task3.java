package io.loop.test.homeWorks.day7;

import io.loop.test.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//go to https://loopcamp.vercel.app/web-tables.html
//
//create a method to test given field for a given name
//test type
//test amount
//test date
//test street
//test city
//test state
//test zip
//test card
//test card number
//test exp
public class task3 extends TestBase {
    @Test
    public void testFields() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        driver.manage().window().maximize();

    }

}
