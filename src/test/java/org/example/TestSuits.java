package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuits extends BaseTest {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessfullyPage registrationSuccessfullyPage = new RegistrationSuccessfullyPage();
    ComputerPage computerPage = new ComputerPage();
    BuildYourComputerPage buildYourComputerPage = new BuildYourComputerPage();
    ComputerDesktopPage computerDesktopPage = new ComputerDesktopPage();
    ShoppingCartAddToCartSuccessfullyPage shoppingCartAddToCartSuccessfully = new ShoppingCartAddToCartSuccessfullyPage();
    AddressDetailsPage addressDetailsPage = new AddressDetailsPage();
    DeliveryPage deliveryPage = new DeliveryPage();
    PaymentPage paymentPage = new PaymentPage();
    MoneyOrderAddressPage moneyOrderAddress = new MoneyOrderAddressPage();
    ConfirmAndCheckOrderPage confirmAndCheckOrder = new ConfirmAndCheckOrderPage();
    OrderSuccessfullyProcessedPage orderSuccessfullyProcessedPage = new OrderSuccessfullyProcessedPage();
    EuroPricedPage euroPricedPage = new EuroPricedPage();
    SendEmailToFriendDetails sendEmailToFriendDetails = new SendEmailToFriendDetails();
    ComformationEmailSentPage comformationEmailSentPage = new ComformationEmailSentPage();
    NikeDetailsPage nikeDetailsPage = new NikeDetailsPage();
    FacebookPage facebookPage  = new FacebookPage();


    @Test
    public void UserShouldBeAbleToRegistrationSuccessfully()   {


    //Click On Registration Page
        homePage.clickOnRegistrationPage();
    //Enter Registration Details
        registrationPage.userEnterRegistrationDetail();
    //Verify User Register Successfully
        registrationSuccessfullyPage.verifyUserRegistrationSuccessfully();
    }


    @Test
    public void GetProductsList(){
        homePage.getProductTitles();


    }
    @Test
    public void UserShouldBeAbleToRegisterAndAddProductToShoppingCart(){
        //Click on Register Button and Enter User Details
        homePage.clickOnRegistrationPage();
        registrationPage.userEnterRegistrationDetail();
        registrationSuccessfullyPage.verifyUserRegistrationSuccessfully();

        //************************************Registration Process Completed*************************************************//

        //User should click on Desktop Icon And click on Add to Cart
        registrationSuccessfullyPage.clickOnComputerPage();
        computerPage.clickOnDesktopIcon();
        computerDesktopPage.clickOnAddToCartForComputer();

        //User should enter Build you Own Computer details
        buildYourComputerPage.BuildingYourComputerDetails();

        //user should be on add to cart page
        homePage.clickOnShoppingCart();
        shoppingCartAddToCartSuccessfully.verifyUserAddToCartSuccessfully();

        //***************************************Successfully Added Product To Cart *********************************//

        //User should enter your Address details
        addressDetailsPage.enterYourAddressDetails();

        //User should Choose Delivery Optional
        deliveryPage.userShouldChoseDeliveryOptional();

        //User Should Choose Payment Optional
        paymentPage.userShouldChoosePaymentOptional();

        //User Should Verify Money Order Address
        moneyOrderAddress.verifyMoneyOrderAddress();

        //**************************************Successfully Completed Address*********************************************************??///

        //User should Verify Order and Continue
        confirmAndCheckOrder.userShouldVerifyOrder();
        confirmAndCheckOrder.clickOnContinuedButton();

        //User should verify order successfully processed
        orderSuccessfullyProcessedPage.verifyOrderSuccessfullyProcessed();

        //************************Completed Registration To Add To Cart & Confirming Process****************************//

    }

    @Test
    public void UserShouldBeAbleToChangeCurrency(){

        //User should click on Computer Page
        homePage.clickOnComputerPage();
        //User should click on Computer Desktop Icon
        computerPage.clickOnDesktopIcon();
        //User should verify Product price is in US Dollar
        computerPage.verifyUserCanChangeCurrency();
        //User should verify product price changed in Euro
        euroPricedPage.verifyUserCanChangeCurrencyToEuro();
    }

    @Test
    public void UserShouldBeAbleToSendEmailToFriend(){

        //Click on Register Button and Enter User Details
        homePage.clickOnRegistrationPage();
        registrationPage.userEnterRegistrationDetail();
        registrationSuccessfullyPage.verifyUserRegistrationSuccessfully();

        //***************************Registration Is Completed************************************//

        //user should click on Computer
        homePage.clickOnComputerPage();

        //user should click on Desktops Icon
        computerPage.clickOnDesktopIcon();

        //user should click on Build your own Computer
        computerDesktopPage.clickOnAddToCartForComputer();

        //user should click on Email a Friend
        buildYourComputerPage.ClickOnEmailAFriend();

        //User should enter details for emailing friend
        sendEmailToFriendDetails.userShouldEnterEmailDetails();

        //User should Verify Email sent Successfully
        comformationEmailSentPage.verifyEmailSentSuccessfully();
    }

    @Test
    public void UserShouldBeAbleToVoteOnHomePage(){

        //User should select good from vote
        ClickOnElements(By.id("pollanswers-2"));
        //user should click on vote
        ClickOnElements(By.id("vote-poll-1"));
        //User should verify vote message
        waitUntilTextIsVisibility(60,By.xpath("//div[@class=\"poll-vote-error\"]"));

        String VerifyExpectedVoteMessage = "Only registered users can vote.";
        String VerifyActualVoteMessage = driver.findElement(By.xpath("//div[@class=\"poll-vote-error\"]")).getText();
        Assert.assertEquals(VerifyActualVoteMessage,VerifyExpectedVoteMessage,"Your vote is not Successfully");
        System.out.println(VerifyActualVoteMessage);

        //User should click on Register
        homePage.clickOnRegistrationPage();
        //User should enter Registration Details
        registrationPage.userEnterRegistrationDetail();
        //User should confirm of Registration is completed Successfully
        registrationSuccessfullyPage.verifyUserRegistrationSuccessfully();
        //User should click on Homepage
        registrationSuccessfullyPage.clickOnHomepage();

        //User should select good from vote
        ClickOnElements(By.id("pollanswers-2"));
        //user should click on vote
        ClickOnElements(By.id("vote-poll-1"));

        //User should verify vote message
        //waitUntilTextIsVisibility(60,By.xpath("//div[@class=\"poll-vote-error\"]"));

        String VerifyExpectedVoteMessage1 = "vote(s)...";
        String VerifyActualVoteMessage1 = driver.findElement(By.xpath("//span[@class=\"poll-total-votes\"]")).getText();
        Assert.assertEquals(VerifyActualVoteMessage1,VerifyExpectedVoteMessage1,"Your Vote Has Not Been Successful");
        System.out.println(VerifyActualVoteMessage1);






    }

    @Test
    public void UserShouldVerifyFacebookURL(){

        //User should click on Facebook link
        homePage.clickOnFacebookLink();


        //User should verify Facebook page
        facebookPage.userShouldVerifyFacebookPage();


    }

    @Test
    public void UserShouldVerifyNikeProduct (){
        //User should enter in search bar 'Nike'
        homePage.searchNikeProducts();

        //User should verify Nike Page URL and products on page
        nikeDetailsPage.UserShouldVerifyNikePageURLAndProduct();









    }







}




