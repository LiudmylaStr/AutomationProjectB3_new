package io.loop.test.homeWorks.lesson6;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task2_iframe extends TestBase {
    /*go to https://demoqa.com/nestedframes
Validate "Child Iframe" text
Validate "Parent Iframe" text
Validate the "Sample Nested Iframe page.
There are nested iframes in this page. Use browser
 inspecter or firebug to check out the HTML source.
In total you can switch between the parent
frame and the nested child frame."*/
    @Test
    public  void iFrame() throws InterruptedException {
        driver.get("https://demoqa.com/nestedframes");
        Thread.sleep(2000);

        driver.switchTo().frame("frame1");
        WebElement parent = driver.findElement(By.xpath("//body[text()='Parent frame']"));
        String actualParent= parent.getText();
        Assert.assertEquals(actualParent.trim(), "Parent frame");


        WebElement child = driver.findElement(By.xpath("//*[contains(text(),'Child Iframe')]"));
        driver.switchTo().frame(child);
        String actualchild= child.getText();
        Assert.assertEquals(actualchild.trim(), "Child Iframe");

    }
}
