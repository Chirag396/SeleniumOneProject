package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EuroPricedPage extends Utils {

    public void verifyUserCanChangeCurrencyToEuro(){
        //User should change the Currency From US Dollar to Euro
        Select Euro = new Select(driver.findElement(By.id("customerCurrency")));
        Euro.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2Fdesktops");

        //user should check the price in Euro
        String ActualResult = driver.findElement(By.xpath("//div[1]/div/div[2]/div[3]/div[1]/span")).getText();
        String ExpectedResult = "€1032.00";
        Assert.assertEquals(ActualResult,ExpectedResult,"Your Price in Euro for 'Build your own Computer' is Wrong");

        System.out.println("Your price for Build your own computer in Euro - "+ActualResult);

    }
}
