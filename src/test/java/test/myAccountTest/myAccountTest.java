package test.myAccountTest;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import test.BaseTest;
import static pages.BasePage.sleep;
import pages.myAccount.MyAccount;


public class myAccountTest extends BaseTest {



    @Test
    public void testMyAccount(){


    myAccount.goToNewLink();
    sleep(2000);
    createAccount.loginAccount("sdaadsa@das.com","numb22");
    sleep(2000);
    createAccount.clickSubmitLogging();
    sleep(4000);
    myAccount.setBirthDay("22","06","1997");
    sleep(1000);
    myAccount.setDomeniuActivitate("Arhitectura/Design");
    sleep(2000);
    myAccount.selectCumAtiAflat("Facebook");
    sleep(2000);
    myAccount.enterAdresaWeb("DieHard.co.jp");
    sleep(2000);
    myAccount.selectNewsletter("1");
    sleep(2000);
    myAccount.selectParola("numb22");
    myAccount.selectConfirmareParola("numb22");
    sleep(2000);
    myAccount.clickActualizeazaButton();
    sleep(2000);
    myAccount.clickMasinileMele();
    sleep(1000);
    myAccount.clickIstoricComenzi();
    sleep(1000);
    myAccount.clickAdreseLivrareIcon();
    sleep(2000);
    myAccount.enterAdresa("adresa");
    sleep(1000);
    myAccount.enterPunctReper("reper");
    sleep(1000);
    myAccount.setJudetul("Arad");
    sleep(1000);
    myAccount.setLocalitatea("Arad");
    sleep(2000);
    myAccount.enterCodulPostal("447334");
    sleep(1000);
    myAccount.clickAdaugaAdresa();
    sleep(2000);
    myAccount.clickDateFacturareLink();
    sleep(2000);
    myAccount.selectTipPersoana("fizica");
    sleep(2000);
    myAccount.enterNumePrenume("Chivari Manuel");
    sleep(1000);
    myAccount.enterAdresa1("Calea Armatei");
    sleep(1000);
    myAccount.setJudet2("Arad");
    sleep(1000);
    myAccount.setLocalitate3("Arad");
    sleep(1000);
    myAccount.setCodulPostal("3542423");
    sleep(1000);
    myAccount.clickAdaugaDate2();
    sleep(2000);



    }


}
