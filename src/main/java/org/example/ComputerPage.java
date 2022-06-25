package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ComputerPage extends Utils {

    public void clickOnDesktopIcon(){

        //user should click on Desktops Icon
        ClickOnElements(By.xpath("//h2/a[@title=\"Show products in category Desktops\"]"));

    }

    public void verifyUserCanChangeCurrency(){

        //user Should check the price for build your own computer
        String ActualResults = driver.findElement(By.xpath("//div[1]/div/div[2]/div[3]/div[1]/span")).getText();
        String ExpectedResults = "$1,200.00";
        Assert.assertEquals(ActualResults,ExpectedResults,"Your Price in US Dollar for 'Build your own Computer' is Wrong");
        System.out.println(" Your price for Build your own computer in US Dollar - "+ActualResults);

    }





}
