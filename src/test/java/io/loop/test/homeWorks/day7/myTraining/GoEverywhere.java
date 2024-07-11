package io.loop.test.homeWorks.day7.myTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoEverywhere {
    public static void goToWiki() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.manage().window().maximize();


        //WebElement searchBotton = driver.findElement(By.xpath();
       // searchBotton.click();
      //  System.out.println("searchBotton.getText() = " + searchBotton.getText());

        WebElement searchBox= driver.findElement(By.id("id='searchform')"));
       Thread.sleep(2000);
        searchBox.click();
       searchBox.sendKeys("Amazon");
        Thread.sleep(1000);
       searchBox.click();

    }

    public static void main(String[] args) throws InterruptedException {
        goToWiki();
    }
}
