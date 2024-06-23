package io.loop.test.day3;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
    go to docuport app
    identify docuport with css
    get value of the attribute
    validate if it is "Docuport"

    the rest is home work
    locate:
    username
    password
    login
        with css
    login to docuport
    locate home icon of docuport after login or any other element after login
    validated that you logged in

     */
public class T3_getAttribute_Css {
    public static void main(String[] args) throws InterruptedException {
      //go to URL

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");

        // identify the logo with css
        WebElement logo= driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));
        String docuport = logo.getAttribute("alt");


        System.out.println("docuport = " + docuport);

        if(DocuportConstants.LOGO_DOCUPORT.equals(docuport)){
            System.out.println("Expected matches with actual");
            System.out.println("TEST PASS");
        } else {
            System.err.println("Expected does NOT match with actual");
            System.out.println("TEST FAIL");
        }

        WebElement userName = driver.findElement(By.cssSelector("input[id='input-14' "));
       userName.sendKeys("b1g3_client@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("input[id='input-15' "));
       password.sendKeys("Group3");

        WebElement loginButton = driver.findElement(By.cssSelector("span[class='v-btn__content' "));
        Thread.sleep(3000);
        loginButton.click();

        Thread.sleep(3000);
WebElement chooseAccountClick = driver.findElement(By.cssSelector("#app > div.v-dialog__content.v-dialog__content--active > div > div > div.d-modal__footer > div > button"));
chooseAccountClick.click();

        Thread.sleep(5000);
        WebElement homeIcon= driver.findElement(By.cssSelector("span[class='body-1' "
                ));
        System.out.println(homeIcon.getText());
    }

}



