package io.loop.test.homeWorks.day7;

import io.loop.test.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//task2
//=============
//
// https://loopcamp.vercel.app/
//login as an advisor
//go to users
//validate that full name for alex.de.souza@gmail.com is Alex De Souza - we did in class
//validate that user name for alex.de.souza@gmail.com is alexdesouze
//validate that phone number for alex.de.souza@gmail.com is +994512060042
//validate that role for alex.de.souza@gmail.com is client
//validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1
public class ValidateName extends TestBase {
   @Test
    public void validateFullName ()throws InterruptedException{
       WebDriver driver = new ChromeDriver();
       driver.get("https://loopcamp.vercel.app/");
       driver.manage().window().maximize();

   }
}
