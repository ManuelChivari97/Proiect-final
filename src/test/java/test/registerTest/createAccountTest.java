package test.registerTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import test.BaseTest;
import static pages.BasePage.sleep;



public class createAccountTest extends BaseTest {

    @Test
    public void testCreateAccount(){


    createAccount.hoverOverContulMeu();
    sleep(2000);
    createAccount.clickContNouRegisterLink();
    sleep(2000);
    createAccount.createAccount("sdaadsa@das.com","Manuel","Chivari","numb22","numb22");
    sleep(2000);
    createAccount.clickSubmitButton();
    sleep(2000);


    createAccount.loginAccount("sdaadsa@das.com","numb22");
    sleep(1000);
    createAccount.clickSubmitLogging();
    sleep(2000);
    createAccount.hoverOverContulMeu();
    createAccount.clickDelogheazaLink();
    sleep(2000);







    }


}
