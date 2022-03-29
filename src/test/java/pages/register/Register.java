package pages.register;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;
import pages.mainPage.MainPage;



public class Register extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(Register.class);
    public static Register instance;


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


    private Register() {
    }

    public static Register getInstance() {
        if (instance == null) {
            instance = new Register();
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


}