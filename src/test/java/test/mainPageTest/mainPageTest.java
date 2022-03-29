package test.mainPageTest;

import org.testng.annotations.Test;
import pages.BasePage;
import test.BaseTest;
import static pages.BasePage.sleep;

public class mainPageTest extends BaseTest {

      @Test
      public void testMainPage(){




        mainPage.clickPieseAutoLink();
        sleep(2000);
        mainPage.clickMagazineLink();
        sleep(2000);
        mainPage.clickInfoDropdownLink();
        sleep(2000);
        mainPage.clickContactLink();
        sleep(3000);
        mainPage.clickPieseUniversaleDropdownLink();
        sleep(2000);
        mainPage.hoverOverAllElementsInPieseUniversale();
        sleep(2000);
        BasePage.clickBack();
        BasePage.clickBack();
        BasePage.clickBack();
        mainPage.setCarBrand("881");
        sleep(2000);
        mainPage.setCarModel("38323");
        sleep(2000);
        mainPage.setCarburant("benzina");
        sleep(2000);
        mainPage.setCilindre("4.0");
        sleep(2000);
        mainPage.setPutere("129343");
        sleep(2000);
        BasePage.clickBack();
        sleep(2000);
        mainPage.clickAripaLink();
        sleep(2000);
        BasePage.clickBack();
        sleep(2000);
        mainPage.clickPieseAutoConstantaLink();
        sleep(2000);






      }
}
