package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AddressDetailsPage extends Utils {



    public void enterYourAddressDetails (){
        //User should select the Country "United Kingdom"
        Select Country = new Select( driver.findElement(By.id("BillingNewAddress_CountryId")));
        Country.selectByIndex(233);

        //user should enter his City
        typeText(By.id("BillingNewAddress_City"),"London");

        //User should enter his Address "123 Downing Street"
        typeText(By.name("BillingNewAddress.Address1"),"123 Downing Street");

        //User should enter his Postal Code "LO98SW"
        typeText(By.id("BillingNewAddress_ZipPostalCode"),"LO98SW");

        //user should enter his Phone Number "0987654321"
        typeText(By.id("BillingNewAddress_PhoneNumber"),"0987654321");

        //user should click on Continue
        ClickOnElements(By.xpath("//button[@name=\"save\"]"));

    }
}
