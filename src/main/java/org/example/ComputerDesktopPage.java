package org.example;

import org.openqa.selenium.By;

public class ComputerDesktopPage extends Utils {

    public void clickOnAddToCartForComputer (){
        //user should click on Build your own Computer
        ClickOnElements(By.xpath("//h2/a[@href=\"/build-your-own-computer\"]"));
    }

}
