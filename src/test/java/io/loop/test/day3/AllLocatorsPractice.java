package io.loop.test.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to the web page
        //driver.get("https://www.loopcamp.io");
       driver.get("https://loopcamp.vercel.app/registration_form.html");

        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Loop");

//        WebElement withClassName=driver.findElement(By.className("form-control"));
//        withClassName.sendKeys("Loop");
//
//        WebElement lastNameWithClass = driver.findElement(By.className("form-control"));
//        lastNameWithClass.sendKeys("academy");


        WebElement lastname= driver.findElement(By.name("lastname"));
        lastname.sendKeys("Academy");

        //this is return us 3 elements.and will click the first one ,that why we should pay attention to locate unique elements
        WebElement female = driver.findElement(By.name("gender"));
        female.click();


        Thread.sleep(5000);
        driver.navigate().to("https://www.etsy.com");

        // navigate back
        driver.navigate().back();

        // navigate forward
        driver.navigate().forward();

        // refresh
        driver.navigate().refresh();

        // quit close
        // driver.close();
        driver.quit();
    }
}
