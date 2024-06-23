package io.loop.test.day5;
import org.testng.Assert;
import org.testng.annotations.*;

public class T1_testNG_intro {
    @Test (priority =2)
    public void test2(){
        System.out.println("2");}

    @Test(priority =1)
    public void test1()
    {
        System.out.println("1");
        String actual = "Feiruz";
        String expected = "Feiruz";
        Assert.assertEquals(actual,expected,"Message from actual, it will show if only test fails");
    }
@BeforeMethod
    public void setUpMethod(){
    System.out.println("Before method is running");
}
@AfterMethod
    public void tearDownMethod() {
    System.out.println("After method is running");
}
@BeforeClass
    public void setUp(){
    System.out.println("Before class is running");}

    @AfterClass
            public void tearDown(){
        System.out.println("After class is running");
    }
}

