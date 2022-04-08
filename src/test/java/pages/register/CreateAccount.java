package pages.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.Timer;
import java.util.concurrent.TimeUnit;


public class CreateAccount extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(CreateAccount.class);
    public static CreateAccount instance;


    //login/cont nou

    private By contulMeuLink = By.xpath("//li[@class='dropdown hover-dropdown']");
    private By contNouRegisterLink = By.xpath("//*[@id=\"myNavbar\"]/ul[2]/li/ul/li/a");

    //create account

    private By emailField = By.xpath("//input[@name='email']");
    private By numeField = By.xpath("//input[@name='nume']");
    private By prenumeField = By.xpath("//input[@name='prenume']");
    private By parolaField = By.xpath("//input[@name='parola']");
    private By confirmareParolaField = By.xpath("//input[@name='confirmare_parola']");

    //Hit create button

    private By submitButton = By.xpath("//input[@value='INREGISTRARE']");

    //Login account

    private By userLoginField = By.xpath("//input[@name='login_utilizator']");
    private By passLoginField = By.xpath("//input[@name='login_parola']");
    private By submitLoggingData = By.xpath("//button[@class='btn text-uppercase radius4 large-btn btn-warning btn-lg']");

    //logout account

    private By logoutAccount = By.xpath("//ul[2]//a[@href='/logout-epiesa/']");


    private CreateAccount() {
    }

    public static CreateAccount getInstance() {
        if (instance == null) {
            instance = new CreateAccount();
        }
        return instance;


    }

    public void hoverOverContulMeu() {
        LOG.info("Hover over contul meu link");
        driver.findElement(contulMeuLink).click();

    }

    public void clickContNouRegisterLink(){
        LOG.info("Click cont nou register link");
        driver.findElement(contNouRegisterLink).click();
    }

    public void createAccount(String email,String nume,String prenume,String parola, String confirmareParola){
        LOG.info("Create account");
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(numeField).sendKeys(nume);
        driver.findElement(prenumeField).sendKeys(prenume);
        driver.findElement(parolaField).sendKeys(parola);
        driver.findElement(confirmareParolaField).sendKeys(confirmareParola);
    }

    public void clickSubmitButton(){
        LOG.info("Click submit button");
        driver.findElement(submitButton).click();
    }

    public void loginAccount(String logemail, String logpass){
        LOG.info("Log account");
        driver.findElement(userLoginField).sendKeys(logemail);
        driver.findElement(passLoginField).sendKeys(logpass);
    }

    public void clickSubmitLogging(){
        LOG.info("Click submit logging data");
        driver.findElement(submitLoggingData).click();
    }

    public void clickDelogheazaLink(){
        LOG.info("Click delogheaza ma link");
        driver.findElement(logoutAccount).click();
    }




}