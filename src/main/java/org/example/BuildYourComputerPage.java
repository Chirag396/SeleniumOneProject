package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BuildYourComputerPage extends Utils {

    public void BuildingYourComputerDetails(){
        //user should select 2.2 GHz Intel Core-Dual
        Select GHzIntel = new Select(driver.findElement(By.name("product_attribute_1")));
        GHzIntel.selectByIndex(1);

        //user should select 2GB RAM
        Select HddRam = new Select(driver.findElement(By.name("product_attribute_2")));
        HddRam.selectByIndex(1);

        //user should select HDD 320GB
        ClickOnElements(By.name("product_attribute_3"));

        //User should select Vista Premium
        ClickOnElements(By.id("product_attribute_4_9"));

        //user should unselect  Microsoft Office
        ClickOnElements(By.id("product_attribute_5_10"));

        //user should select  Microsoft Office again
        ClickOnElements(By.id("product_attribute_5_10"));

        //user should select Acrobat Reader
        ClickOnElements(By.xpath("//input[@id=\"product_attribute_5_11\"]"));

        //user should select Total Commander
        ClickOnElements(By.id("product_attribute_5_12"));

        //User should click on Add to Cart
        ClickOnElements(By.xpath("//button[@id=\"add-to-cart-button-1\"]"));

        //User should click on  Homepage
        ClickOnElements(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));

    }
    public void ClickOnEmailAFriend(){
        //user should click on Email a Friend
        ClickOnElements(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]"));
    }



}
