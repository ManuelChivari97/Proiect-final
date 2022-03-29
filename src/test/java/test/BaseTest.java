package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.mainPage.MainPage;
import pages.register.Register;


public class BaseTest {

    public MainPage mainPage = MainPage.getInstance();
    public Register register = Register.getInstance();

    @BeforeSuite
    public void init() { BasePage.setUP(); }

    @AfterSuite
    public void teardown() { BasePage.teardown(); }

}
