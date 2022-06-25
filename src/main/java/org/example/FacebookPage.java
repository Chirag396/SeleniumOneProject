package org.example;

import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class FacebookPage extends Utils{

    public void userShouldVerifyFacebookPage(){

        // current window is main window
        String MainWindow=driver.getWindowHandle();


        //  open facebook tab window
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();
        while(i1.hasNext())
        {
            String ChildWindow=i1.next();

            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {

                // Verify User is on correct window
                driver.switchTo().window(ChildWindow);
                String ActualFacebookURL = driver.getCurrentUrl();
                String ExpectedFacebookURL = "https://www.facebook.com/nopCommerce";
                Assert.assertEquals(ActualFacebookURL,ExpectedFacebookURL,"Actual URL is not matching expected URL.");

                // Closing tab Window.
                driver.close();
            }
        }
        // Main Window.
        driver.switchTo().window(MainWindow);


    }

}
