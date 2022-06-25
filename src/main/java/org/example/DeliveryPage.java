package org.example;

import org.openqa.selenium.By;

public class DeliveryPage extends Utils {

    public void userShouldChoseDeliveryOptional(){
        //User should click on 'Next Day Air'
        ClickOnElements(By.xpath("//input[@id=\"shippingoption_1\"]"));

        //User should click on Continue
        ClickOnElements(By.xpath("//button[@class=\"button-1 shipping-method-next-step-button\"]"));
    }

}
