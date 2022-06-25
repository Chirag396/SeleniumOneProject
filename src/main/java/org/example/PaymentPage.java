package org.example;

import org.openqa.selenium.By;

public class PaymentPage extends Utils {

    public void userShouldChoosePaymentOptional(){

        //User should click on Check/Money Order
        ClickOnElements(By.id("paymentmethod_0"));

        //User should click on Continue
        ClickOnElements(By.xpath("//button[@class=\"button-1 payment-method-next-step-button\"]"));
    }
}
