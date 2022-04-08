package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.mainPage.MainPage;
import pages.myAccount.MyAccount;
import pages.register.CreateAccount;


public class BaseTest {

    public MainPage mainPage = MainPage.getInstance();
    public CreateAccount createAccount = CreateAccount.getInstance();
    public MyAccount myAccount = MyAccount.getInstance();

    @BeforeSuite
    public void init() { BasePage.setUP(); }

    @AfterSuite
    public void teardown() { BasePage.teardown(); }

}
