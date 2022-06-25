package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;


public class DriverManager extends Utils {
    LoadProp loadProp = new LoadProp();
    DesiredCapabilities caps = new DesiredCapabilities();

    public  final String AUTOMATE_USERNAME = loadProp.getProperty("BrowserStackUsername");
    public  final String AUTOMATE_ACCESS_KEY = loadProp.getProperty("BrowserStackAccessKey");
    public  final String BrowserStackURL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";



    boolean cloud = Boolean.parseBoolean(System.getProperty("cloud"));
    //String browserName ="chrome";
    String browsername = System.getProperty("browser");


    public void openBrowser () {
        //making decision cloud true or false
        //this will be run if cloud true (In cloud)
        if (cloud) {
            System.out.println("Running Browser in Cloud.........");
            //applying conditional loop for different browser options

            if (browsername.equalsIgnoreCase("chrome")) {
                caps.setCapability("browserName", "Chrome");
                caps.setCapability("browserVersion", "latest");
                HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                browserstackOptions.put("os", "Windows");
                browserstackOptions.put("osVersion", "10");
                caps.setCapability("bstack:options", browserstackOptions);
            }
            else if (browsername.equalsIgnoreCase("safari")) {
                caps.setCapability("os", "OS X");
                caps.setCapability("os_version", "Catalina");
                caps.setCapability("browser", "Safari");
                caps.setCapability("browser_version", "13.0");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.14.0");

            }
            else if (browsername.equalsIgnoreCase("edge")){

                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "11");
                caps.setCapability("browser", "Edge");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.5.2");

            }
            else{
                System.out.println("your browser name is wrong.");
            }

            try {
                driver = new RemoteWebDriver(new URL(BrowserStackURL), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        else {
          //this will be run if cloud false (locally)
            System.out.println("Running Browser Locally.............");
            if (browsername.equalsIgnoreCase("chrome")) {
                System.setProperty("webDriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");
                driver = new ChromeDriver();

            } else if (browsername.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/test/java/Drivers/geckodriver.exe");
                driver = new FirefoxDriver();

            } else if (browsername.equalsIgnoreCase("Edge")) {
                System.setProperty("webdriver.edge.driver", "src/test/java/Drivers/msedgedriver.exe");
                driver = new EdgeDriver();
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //type URL
        driver.get(loadProp.getProperty("URL"));







    }

    //code for Closing Browser
    public void closeBrowser() {
        driver.quit();}




}



