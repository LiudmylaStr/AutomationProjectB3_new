package io.loop.test.day6;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T2_iframe extends TestBase {
     /*
    1- Open a chrome browser
    2- Go to: https://loopcamp.vercel.app/iframe.html
    3- Clear text from comment body
    4- Type "Loop Academy" in comment body
    5- Verify "Loop Academy" text is written in comment body
    6- Verify header "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed
     */

    @Test
    public void iframeTest(){
        driver.get("https://loopcamp.vercel.app/iframe.html");

        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);
        WebElement textBox = driver.findElement(By.xpath("//*[@id='tinymce']"));
        textBox.clear();

//        WebElement header = driver.findElement(By.xpath("// h3[contains(text(),'An iframe')]"));
//        System.out.println(header.getText());
//
//        WebElement textBox = driver.findElement(By.xpath("//*[@id='tinymce']"));
//        System.out.println("textBox = " + textBox);





    }
}