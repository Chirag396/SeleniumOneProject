package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class OrderSuccessfullyProcessedPage extends Utils {

    public void verifyOrderSuccessfullyProcessed (){
        //user should check order has Successfully Processed
        String Expected = "Your order has been successfully processed!";
        String Actual = driver.findElement(By.xpath("//strong[.='Your order has been successfully processed!']")).getText();
        Assert.assertEquals(Actual,Expected,"You have Not Successfully Completed Process please check and trying again");

        //User should click on continue Button
        ClickOnElements(By.xpath("//button[@class=\"button-1 order-completed-continue-button\"]"));
        System.out.println("You have Successfully Completed Add To Cart Process!!!!");
    }
}
