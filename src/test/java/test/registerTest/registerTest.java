package test.registerTest;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.register.Register;
import test.BaseTest;
import static pages.BasePage.sleep;



public class registerTest extends BaseTest {

    @Test
    public void testRegister(){


    register.hoverOverContulMeu();
    sleep(2000);
    register.clickContNouRegisterLink();
    sleep(2000);
    register.createAccount("sdaadsa@das.com","Manuel","Chivari","numb22","numb22");
    sleep(2000);
    register.clickSubmitButton();
    sleep(2000);










    }


}
