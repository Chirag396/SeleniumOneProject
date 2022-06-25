package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils extends BasePage{

    public void verifyHomePageTitles (){


    }




    //code for entering Text
    public  void typeText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    //code for clicking on button
    public  void ClickOnElements(By by){
        driver.findElement(by).click();
    }

    //time stamp for random date email generate
    public  String randomDate(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmss");
        return formatter.format(date);
    }

    //Code For Taking ScreenShot
    public  void takeSnapshot (String fileName){
        //Convert Web Driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        //Call getScreenshotAs method to create image file
        File srcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Copy file at destination
        try {
            FileUtils.copyFile(srcFile,new File("ScreenShots\\"+fileName+randomDate()+".png"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    //Codes below for waiting time needed for the Compiler
    public void driverWaitUntilOpenUrl(int time,String url){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.urlToBe(url));}
    public void waitForClickable(int time,By by){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));

    }
    public void driverWaitUntilInvisibilityOf(WebElement element, int time){
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait2.until(ExpectedConditions.invisibilityOf(element));
    }
    public void driverWaitUntilPresenseOfElement(By by, int time){
        WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait3.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }
    public void driverWaitUntilElementTitleContains(By by, int time, String TitleContains){
        WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait4.until(ExpectedConditions.titleContains(TitleContains));

    }
    public void driverWaitUntilFrameToBeAvaliableAndSwitchToIt(By by,int time){
        WebDriverWait wait5 = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait5.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
    }
    public  void waitUntilAttributeContains(int time, By by, String attribute, String value){
        WebDriverWait wait6 = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait6.until(ExpectedConditions.attributeContains(by,attribute,value));
    }
    public void waitUntilTextIsVisibility(int time,By by){
        WebDriverWait wait7 = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait7.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }





}
