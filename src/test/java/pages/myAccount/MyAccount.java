package pages.myAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;
import pages.register.CreateAccount;

public class MyAccount extends BasePage {

    private static final Logger LOG = LoggerFactory.getLogger(MyAccount.class);
    public static MyAccount instance;


 String url2 = "https://www.epiesa.ro/autentificare-epiesa/";

  //Detalii cont

 private By numeField = By.xpath("//input[@name='nume']");
 private By prenumeField = By.xpath("//input[@name='prenume']");
 String ziNastere = "//select[@name='zi_nastere']";
 String lunaNastere = "//select[@name='luna_nastere']";
 String anNastere = "//select[@name='an_nastere']";
 String domeniuActivitate ="//select[@name='domeniu_activitate']";
 String cumAiAflat = "//select[@name='cum_ai_aflat']";
 private By website = By.xpath("//input[@name='website']");
 String newsletter = "//select[@name='newsletter']";
 private By emailField = By.xpath("//input[@name='email']");
 private By parolaNoua = By.xpath("//input[@name='parola']");
 private By confirmareParolaNoua = By.xpath("//input[@name='confirmare_parola']");
 private By actualizeazaDatele = By.xpath("//input[@value='ACTUALIZEAZA']");

 //Masinile mele

 private By masinileMeleIcon = By.xpath("//a/i[@class='tab-icon icon-car']");

 //Istoric comenzi

 private By istoricComenziIcon = By.xpath("//a/i[@class='tab-icon icon-calendar']");

 //Adresa de livrare


 private By adreseLivrareIcon = By.xpath("//a/i[@class='tab-icon icon-home']");
 private By adresa = By.xpath("//input[@name='adresa']");
 private By punctReper = By.xpath("//input[@name='punct_reper']");
 String judet = "//select[@name='judet']";
 String localitate = "//select[@name='localitate']";
 private By codPostal = By.xpath("//input[@name='cod_postal']");
 private By adaugaAdresa = By.xpath("//input[@value='ADAUGA ADRESA']");

 //Date facturare


 private By dateFacturareIcon = By.xpath("//a/i[@class='tab-icon icon-heart']");
 String tipPersoana = "//select[@name='tip_persoana']";
 private By numePrenume = By.xpath("//input[@name='nume_prenume']");
 private By adresaFizica = By.xpath("//input[@name='adresa_fizica']");
 String judetFizica = "//select[@name='judet_fizica']";
 String localitateFizica = "//select[@name='localitate_fizica']";
 private By codPostalFizica = By.xpath("//input[@name='cod_postal_fizica']");
 private By adaugaDate = By.xpath("//input[@value='ADAUGA DATE']");




    private MyAccount() {
    }

    public static MyAccount getInstance() {
        if (instance == null) {
            instance = new MyAccount();
        }
        return instance;


    }

    public void setBirthDay(String ziua, String luna, String anul){
        LOG.info("Select birthday");
        Select newZiua = new Select(driver.findElement(By.xpath(ziNastere)));
        newZiua.selectByValue(ziua);
        Select newLuna = new Select(driver.findElement(By.xpath(lunaNastere)));
        newLuna.selectByValue(luna);
        Select newAnul = new Select(driver.findElement(By.xpath(anNastere)));
        newAnul.selectByValue(anul);
    }

    public void goToNewLink(){
        LOG.info("Go to my account link");
        driver.get(url2);
    }

    public void setDomeniuActivitate(String domeniu){
        LOG.info("Select domeniul de activitate");
        Select newDomeniu = new Select(driver.findElement(By.xpath(domeniuActivitate)));
        newDomeniu.selectByValue(domeniu);
    }

    public void selectCumAtiAflat(String cumAtiAflat){
        LOG.info("Select cum ai aflat de epiesa");
        Select newCumAtiAflat = new Select(driver.findElement(By.xpath(cumAiAflat)));
        newCumAtiAflat.selectByValue(cumAtiAflat);
    }

    public void enterAdresaWeb(String adresaWeb){
        LOG.info("enter adresa web");
        driver.findElement(website).sendKeys(adresaWeb);
    }

    public void selectNewsletter(String newsLetter){
        LOG.info("Select newsletter");
        Select newNewsLetter = new Select(driver.findElement(By.xpath(newsletter)));
        newNewsLetter.selectByValue(newsLetter);
    }

    public void selectParola(String parola){
        LOG.info("enter parola");
        driver.findElement(parolaNoua).sendKeys(parola);
    }

    public void selectConfirmareParola(String confirmParola){
        LOG.info("Confirm parola");
        driver.findElement(confirmareParolaNoua).sendKeys(confirmParola);
    }

    public void clickActualizeazaButton(){
        LOG.info("Click actualizeaza button");
        driver.findElement(actualizeazaDatele).click();
    }

    public void clickMasinileMele(){
        LOG.info("Click masinile mele");
        driver.findElement(masinileMeleIcon).click();
    }

    public void clickIstoricComenzi(){
        LOG.info("Click istoric comenzi");
        driver.findElement(istoricComenziIcon).click();
    }

    public void clickAdreseLivrareIcon(){
        LOG.info("Click adrese livrare icon");
        driver.findElement(adreseLivrareIcon).click();
    }

    public void enterAdresa(String adresa1){
        LOG.info("Enter adresa");
        driver.findElement(adresa).sendKeys(adresa1);
    }

    public void enterPunctReper(String reper){
        LOG.info("Enter punct reper");
        driver.findElement(punctReper).sendKeys(reper);
    }

    public void setJudetul(String judetu){
        LOG.info("Enter judetul");
        Select newJudetu = new Select(driver.findElement(By.xpath(judet)));
        newJudetu.selectByValue(judetu);

    }

    public void setLocalitatea(String localitatea1){
        LOG.info("Enter localitatea");
        Select newLocalitatea1 = new Select(driver.findElement(By.xpath(localitate)));
        newLocalitatea1.selectByValue(localitatea1);
    }

    public void enterCodulPostal(String codul){
        LOG.info("Enter codul postal");
        driver.findElement(codPostal).sendKeys(codul);
    }

    public void clickAdaugaAdresa(){
        LOG.info("Click adauga adresa link");
        driver.findElement(adaugaAdresa).click();
    }

    public void clickDateFacturareLink(){
        LOG.info("Click date facturare link");
        driver.findElement(dateFacturareIcon).click();
    }

    public void selectTipPersoana(String persoana){
        LOG.info("Select tip persoana");
        Select newPersoana = new Select(driver.findElement(By.xpath(tipPersoana)));
        newPersoana.selectByValue(persoana);
    }

    public void enterNumePrenume(String numePrenume1){
        LOG.info("enter nume and prenume");
        driver.findElement(numePrenume).sendKeys(numePrenume1);
    }

    public void enterAdresa1(String adresa2){
        LOG.info("Enter adresa 2");
        driver.findElement(adresaFizica).sendKeys(adresa2);
    }

    public void setJudet2(String judet3){
        LOG.info("Select judet 3");
        Select newJudet3 = new Select(driver.findElement(By.xpath(judetFizica)));
        newJudet3.selectByValue(judet3);
    }

    public void setLocalitate3(String localitate3){
        LOG.info("select localitate 3");
        Select newLocalitate3 = new Select(driver.findElement(By.xpath(localitateFizica)));
        newLocalitate3.selectByValue(localitate3);
    }

    public void setCodulPostal(String codulPostal2){
        LOG.info("enter codul postal 2");
        driver.findElement(codPostalFizica).sendKeys(codulPostal2);
    }

    public void clickAdaugaDate2(){
        LOG.info("click adauga date 2");
        driver.findElement(adaugaDate).click();
    }




}