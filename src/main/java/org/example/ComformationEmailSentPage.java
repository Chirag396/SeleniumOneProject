package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ComformationEmailSentPage extends Utils {

    public void verifyEmailSentSuccessfully(){

        String ActualResults = driver.findElement(By.className("result")).getText();
        String ExpectedResults = "Your message has been sent.";
        Assert.assertEquals(ExpectedResults,ActualResults,"Your Email has not been send TRY Again");
        System.out.println("Checking you Message is a match Expected Resuults = " + ExpectedResults + " Actual Results =  " + ActualResults);


    }
}
