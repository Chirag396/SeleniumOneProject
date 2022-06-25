package org.example;

import org.openqa.selenium.By;

public class SendEmailToFriendDetails extends Utils {

    public void userShouldEnterEmailDetails(){

        //user should input Friends Email
        typeText(By.name("FriendEmail"),"Raj" + randomDate() + "@hotmail.co.uk");

        //User should enter his Email
        //typeText(By.name("YourEmailAddress"), "Jack" + randomDate() + "@gmail.com");

        //User should enter there message
        typeText(By.name("PersonalMessage"),    "Hi Raj, " +
                "I am sending this link to  'Build your Own Computer' " +
                "Let me know what you Think." +
                "Thanks Jack ");

        ClickOnElements(By.name("send-email"));
    }
}
