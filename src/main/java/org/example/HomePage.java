package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Utils {

    public void clickOnFacebookLink(){

        ClickOnElements(By.xpath("//li[@class='facebook']"));
        //sendKeys(driver.findElement(By.tagName("html")), Keys.CONTROL);

    }

    public void getProductTitles() {

        List<WebElement> productTitles = driver.findElements(By.xpath("//div[contains(@class,'product-grid')]//div[@class='item-box']"));
        System.out.println(productTitles.size());
        List<String> productName=new ArrayList<String>();

        for (WebElement e:productTitles){
            System.out.println(e.getText());
        }
    }

    public void searchNikeProducts(){
        typeText(By.xpath("//input[@type='text']"),"Nike");
        ClickOnElements(By.xpath("//button[@type='submit']"));
    }

    public void clickOnRegistrationPage() {
        //Click on Register Button
        ClickOnElements(By.className("ico-register"));
    }

    public void clickOnShoppingCart() {
        //user should be on add to cart page
        ClickOnElements(By.xpath("//span[@class=\"cart-label\"]"));
    }

    public void clickOnComputerPage() {
        //user should click on Computer
        ClickOnElements(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a[contains(text(),'Computers ')]"));


    }




}
