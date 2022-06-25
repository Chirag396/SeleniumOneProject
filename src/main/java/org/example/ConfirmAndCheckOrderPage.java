package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ConfirmAndCheckOrderPage extends Utils{
    public void userShouldVerifyOrder(){

        //user should Confirm and Check Order
        String BillingAddress = driver.findElement(By.xpath("//div/div/div[1]/div[1]/ul[@class=\"info-list\"]")).getText();

        //System.out.println(BillingAddress);
        String ShippingAddress = driver.findElement(By.xpath("//div/div[2]/div[1]/ul[@class=\"info-list\"]")).getText();

        //System.out.println(ShippingAddress);
        Assert.assertEquals(BillingAddress,ShippingAddress,"Your Billing Address dose not Match Shipping Address");

        //User should check Total Price
        String TotalPrice = driver.findElement(By.xpath("//tr[1]/td/span[@class=\"value-summary\"]")).getText();
        System.out.println("This is Total Price to be paid for your new computer - "+TotalPrice);
    }
    public void clickOnContinuedButton(){
        //user should click on continue
        ClickOnElements(By.xpath("//button[@class=\"button-1 confirm-order-next-step-button\"]"));

    }
}
