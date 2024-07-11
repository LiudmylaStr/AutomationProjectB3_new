package io.loop.test.homeWorks.lesson6;

import io.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TransferQueue;

import static org.testng.Assert.*;

public class HandleAlert extends TestBase {
   /* task1
=============
    go to https://demoqa.com/alerts
    click - click button to see alert
    handle alert
    click - On button click, alert will appear after 5 seconds
    handle alert
    click - On button click, confirm box will appear
    click ok and validate - You selected Ok
    after that do it again this time cancel and validate - You selected Cancel
    click - On button click, prompt box will appear
    enter "Loop Academy" and validate You entered Loop Academy */
@Test
    public void InfoAlert(){

    driver.get("https://demoqa.com/alerts");
        WebElement clickForAlert = driver.findElement
                (By.xpath("//button[@id ='alertButton']"));
        clickForAlert.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();



    }

    @Test
    public void WaitAlert () throws InterruptedException {
    driver.get("https://demoqa.com/alerts");
    WebElement ckickFor5sAlert = driver.findElement
            (By.xpath("//button[@id= 'timerAlertButton']"));
    ckickFor5sAlert.click();
    Thread.sleep(Duration.ofSeconds(12));
    Alert alert = driver.switchTo().alert();
    alert.accept();
    }
@Test
    public void ClickAlertConfirmBox() {
    driver.get("https://demoqa.com/alerts");
    WebElement clickAlertConfirmBox = driver.findElement
            (By.xpath("//button[@id='confirmButton']"));
    clickAlertConfirmBox.click();
    Alert alert = driver.switchTo().alert();
    alert.accept();}

    @Test
    public void ClickAlertPromtBox() throws InterruptedException {
    driver.get("https://demoqa.com/alerts");
    WebElement clickAlertPromtBox = driver.findElement
            (By.xpath("//button[@id='promtButton']"));
    clickAlertPromtBox.click();
    String text="Loop Academy";
    Alert alert = driver.switchTo().alert();
        Thread.sleep(Duration.ofSeconds(7));
        alert.sendKeys(text);
    alert.accept();

//        WebElement successMessagePromptAlert = driver.findElement
//                (By.xpath("//span[@id='promtResult']"));
//        String actual = successMessagePromptAlert.getText();
//        String expected = "You entered " + text;
//        assertEquals(actual, expected, "Actual does not match the expected");

//        clickAlertPromtBox.click();
//        alert.sendKeys(text);
//        alert.dismiss();
//        actual = successMessagePromptAlert.getText();
//        expected = "You entered " + null;
//        Assert.assertEquals(actual, expected, "Does not match");
}

}
