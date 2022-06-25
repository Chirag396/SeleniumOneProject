package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSuccessfullyPage extends Utils {


    public void verifyUserRegistrationSuccessfully(){
        // user should be successfully Registered
        String RegistrationSuccessfullyExpectedMessage = "Your registration completed";
        String RegistrationSuccessfullyActualMessage = BasePage.driver.findElement(By.className("result")).getText();
        Assert.assertEquals(RegistrationSuccessfullyActualMessage,RegistrationSuccessfullyExpectedMessage,"Registration not Completed");
    }

    public void clickOnComputerPage(){
        //user should click on Computer
        ClickOnElements(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a[contains(text(),'Computers ')]"));
    }
    public void clickOnHomepage(){
        ClickOnElements(By.xpath("//img[@alt]"));
    }




}
