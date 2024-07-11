package io.loop.test.homeWorks.day7;
//task1
//=============
//go to https://loopcamp.vercel.app/nested-frames.html
//validate "LEFT", "MIDDLE", "RIGHT", "BOTTOM"

import io.loop.test.base.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;






public class ValidateLeft extends TestBase {
    @Test
    public void left() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        WebElement left = driver.findElement(By.xpath("//*[contains(text(),'LEFT')]"));
        String actualLeft = left.getText();

        Assert.assertEquals(actualLeft.trim(), "LEFT");
    }
    @Test
    public void middle() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
        driver.manage().window().maximize();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        WebElement middle = driver.findElement(By.xpath("//*[contains(text(),'MIDDLE')]"));
        String actualMiddle = middle.getText();
        Assert.assertEquals(actualMiddle.trim(), "MIDDLE");
    }
    @Test
    public void right() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-right");
        WebElement right = driver.findElement(By.xpath("//*[contains(text(),'RIGHT')]"));
        String actualRight= right.getText();
        Assert.assertEquals(actualRight.trim(), "RIGHT");
    }
    @Test
    public void bottom() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
        driver.manage().window().maximize();
        driver.switchTo().frame("frame-bottom");
        WebElement bottom = driver.findElement(By.xpath("//*[contains(text(),'BOTTOM')]"));
        String actualBottom = bottom.getText();
        Assert.assertEquals(actualBottom.trim(),"BOTTOM");
    }

    }
