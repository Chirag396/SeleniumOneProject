package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends Utils {

    LoadProp loadProp = new LoadProp();
    By _selectMaleGender = By.id("gender-male");
    By _firstNameField = By.id("FirstName");
    By _lastNameField = By.id("LastName");
    By _dateOfBirthDay = By.name("DateOfBirthDay");
    By _dateOfBirthMonth = By.name("DateOfBirthMonth");
    By _dateOfBirthYear = By.name("DateOfBirthYear");
    By _EmailAddress = By.name("Email");
    By _Password = By.xpath("//input[@type='password']");
    By _ConfirmPassword = By.name("ConfirmPassword");
    By _RegisterConfirmButton = By.id("register-button");
    By _clickOnContinueButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a");


   public void verifyUserIsOnRegistrationPage(){
//Verify on is registration

   }
    public void userEnterRegistrationDetail(){
        //user select male or female
        ClickOnElements(_selectMaleGender);

        //user should input first name
        typeText(_firstNameField, loadProp.getProperty("Firstname"));
        //driver.findElement(By.id("FirstName")).sendKeys("Jack");

        //user should input surname
        typeText(_lastNameField, loadProp.getProperty("Lastname"));
        //driver.findElement(By.id("LastName")).sendKeys("Smith");

        //user should enter your day of birth
        Select birthDay = new Select(BasePage.driver.findElement(_dateOfBirthDay));
        birthDay.selectByIndex(12);

        //user should enter your Month of birth
        Select birthMonth = new Select(BasePage.driver.findElement(_dateOfBirthMonth));
        birthMonth.selectByIndex(2);
        //user should enter your Year of birth
        Select birthYear = new Select((BasePage.driver.findElement(_dateOfBirthYear)));
        birthYear.selectByValue("1988");

        //user should input Email
        typeText(_EmailAddress, loadProp.getProperty("EmailPartOne") + randomDate() + loadProp.getProperty("EmailPartTwo"));
        //driver.findElement(By.name("Email")).sendKeys("jacksmith3987@gmail.com");
        //System.out.println(randomDate());

        //user should input password (Jacks12345)
        typeText(_Password, loadProp.getProperty("Password1"));
        //driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Jacks12345");

        //user should Confirm the password (Jacks12345)
        typeText(_ConfirmPassword, loadProp.getProperty("ConfirmPassword1"));
        //driver.findElement(By.name("ConfirmPassword")).sendKeys("Jacks12345");

        //user should click on Register Button
        ClickOnElements(_RegisterConfirmButton);
        //driver.findElement(By.id("register-button")).click();



    }

    public void userClicksOnContinueButton (){

        //user should click on Continue Button
        ClickOnElements(_clickOnContinueButton);
   }

}
