package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartAddToCartSuccessfullyPage extends Utils {

    public void verifyUserAddToCartSuccessfully(){
        //Verify user is on end Shopping Cart Page
        String ExpectedResults = "Shopping cart";
        String ActualResults = driver.findElement(By.xpath("//h1")).getText();

        Assert.assertEquals(ExpectedResults,ActualResults,"You have NOT Successfully Added Product to Cart");
        System.out.println("You have Successfully Added Product to "+ ActualResults);

        //User should click on Terms and conditions
        ClickOnElements(By.id("termsofservice"));

        //user should click on Checkout button
        ClickOnElements(By.name("checkout"));

    }
}
