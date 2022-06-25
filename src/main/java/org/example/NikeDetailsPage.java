package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NikeDetailsPage extends Utils{

    public void UserShouldVerifyNikePageURLAndProduct(){

        String ExpectedUrlNikePage = "https://demo.nopcommerce.com/search?q=nike";
        String ActualURLForNikePage = driver.getCurrentUrl();
        Assert.assertEquals(ActualURLForNikePage,ExpectedUrlNikePage,"Your URL Is Wrong");
        System.out.println(ActualURLForNikePage);

        ArrayList<String> ObtainedProductList = new ArrayList<>();
        List<WebElement> elementList= driver.findElements(By.className("item-grid"));
        for(WebElement we:elementList){
            ObtainedProductList.add(we.getText());
            System.out.println(ObtainedProductList);
        }
        ArrayList<String> sortedProductList = new ArrayList<>();
        for (String s:ObtainedProductList){
            sortedProductList.add(s);
        }
        Collections.sort(sortedProductList);
        Assert.assertEquals(ObtainedProductList,sortedProductList,"Your Product List dose not match");




    }
}
