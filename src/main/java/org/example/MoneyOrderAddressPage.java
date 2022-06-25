package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class MoneyOrderAddressPage extends Utils{

    public void verifyMoneyOrderAddress(){
        //User should check Address to send Money order
        String ExpectedResult = "NOP SOLUTIONS\n" +
                "your address here,\n" +
                "New York, NY 10001\n" +
                "USA";
        String ActualResult = driver.findElement(By.xpath("//table/tbody/tr/td/p[2]")).getText();
        System.out.println("Address to send Check to "+ ActualResult);
        Assert.assertEquals(ActualResult,ExpectedResult,"You are not on correct page Please check and try again");

        //User should click on continue
        ClickOnElements(By.xpath("//button[@class=\"button-1 payment-info-next-step-button\"]"));
    }
}
