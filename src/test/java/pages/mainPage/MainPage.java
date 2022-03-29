package pages.mainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class MainPage extends BasePage {
       private static final Logger LOG = LoggerFactory.getLogger(MainPage.class);
       public static MainPage instance;

    //meniu top

    private By pieseAutoLink = By.xpath("//a[@title='piese auto dupa marca']");
    private By magazineLink = By.xpath("//a[@title='magazine epiesa.ro']");
    private By infoDropdownLink = By.xpath("//li[@class='dropdown']");
    private By serviceLink = By.xpath("//a[@href='/service/']");
    private By contactLink = By.xpath("//a[@href='/contact-epiesa/']");

    //meniu dropdown "Piese universale"

    private By pieseUniversaleDropdownLink = By.xpath("//div[@class='dropdown pise-universe-dropdown hidden-xs']");
    private By uleiLubrefiantiLink = By.xpath("//a[@href='/accesorii-auto/ulei-lubrifianti/']");
    private By lichideLink = By.xpath("//a[@href='/accesorii-auto/lichide/']");
    private By electriceLink = By.xpath("//a[@href='/accesorii-auto/electrice/']");
    private By intretinereAutoLink = By.xpath("//a[@href='/accesorii-auto/intretinere-auto/']");
    private By accesoriiDiverseLink = By.xpath("//a[@href='/accesorii-auto/accesorii-diverse/']");
    private By rotiLink = By.xpath("//a[@href='/accesorii-auto/roti/']");
    private By sasiuLink = By.xpath("//a[@href='/accesorii-auto/sasiu/']");
    private By portbagajeScuturiLink = By.xpath("//a[@href='/accesorii-auto/portbagaje-suporti/']");
    private By comunicatieLink = By.xpath("//a[@href='/accesorii-auto/comunicatie/']");
    private By sculeSiUnelteLink = By.xpath("//a[contains(text(), ' Scule si unelte')]");
    private By casaSiBucatarieLink = By.xpath("//a[contains(text(), ' Casa si bucatarie')]");
    private By gradinaLink = By.xpath("//a[contains(text(), ' Gradina')]");
    private By electrice2Link = By.xpath("/html/body/nav[2]/div/div[2]/ul/li[25]/a");
    private By constructiiLink = By.xpath("//a[contains(text(), ' Constructii')]");
    private By sanitareLink = By.xpath("//a[contains(text(), ' Sanitare')]");
    private By termiceLink = By.xpath("//a[contains(text(), ' Termice')]");
    private By zootehnieLink = By.xpath("//a[contains(text(), ' Zootehnie')]");

    //Alege masina selection menu

    String selectMarca = "//select[@name='select_marca']";
    String selectModelMarca = "model_marca";
    String selectCarburant = "carburant";
    String selectCilindre = "cilindree";
    String selectPutere = "motorizari";

    //SearchBar

    private By searchBar = By.id("headersearch");

    //Piese auto online links

    private By aripaLink = By.xpath("//a[@title='Aripa']");

    //Footer links

    private By pieseAutoConstantaLink = By.xpath("//a[@href='/magazin-piese-auto-constanta']");








    private MainPage(){
    }
    public static MainPage getInstance(){
         if (instance==null){
             instance = new MainPage();
         }
         return instance;

    }

    public void clickPieseAutoLink(){
        LOG.info("Click piese auto link");
        driver.findElement(pieseAutoLink).click();
    }

    public void clickMagazineLink(){
        LOG.info("Click magazine link");
        driver.findElement(magazineLink).click();
    }

    public void clickInfoDropdownLink(){
        LOG.info("CLick info dropdown link");
        driver.findElement(infoDropdownLink).click();
    }

    public void clickContactLink(){
        LOG.info("Click contact link");
        driver.findElement(contactLink).click();
    }

    public void clickPieseUniversaleDropdownLink(){
        LOG.info("Click piese universale dropdown link");
        driver.findElement(pieseUniversaleDropdownLink).click();
    }

    public MainPage hoverOverAllElementsInPieseUniversale() {
        LOG.info("Hover over all elements from piese universale dd");
        hoverOverElement(uleiLubrefiantiLink);
        hoverOverElement(lichideLink);
        hoverOverElement(electriceLink);
        hoverOverElement(intretinereAutoLink);
        hoverOverElement(accesoriiDiverseLink);
        hoverOverElement(rotiLink);
        hoverOverElement(sasiuLink);
        hoverOverElement(portbagajeScuturiLink);
        hoverOverElement(comunicatieLink);
        hoverOverElement(sculeSiUnelteLink);
        hoverOverElement(casaSiBucatarieLink);
        hoverOverElement(gradinaLink);
        hoverOverElement(electrice2Link);
        hoverOverElement(constructiiLink);
        hoverOverElement(sanitareLink);
        hoverOverElement(termiceLink);
        hoverOverElement(zootehnieLink);
        return this;
    }

    public void setCarBrand(String marca){
        LOG.info("Set car brand");
        Select newMarca = new Select(driver.findElement(By.xpath(selectMarca)));
        newMarca.selectByValue(marca);

    }

    public void setCarModel(String model){
        LOG.info("Set car model");
        Select newModel = new Select(driver.findElement(By.id(selectModelMarca)));
        newModel.selectByValue(model);
    }

    public void setCarburant(String carburant){
        LOG.info("Set carburant");
        Select newCarburant = new Select(driver.findElement(By.id(selectCarburant)));
        newCarburant.selectByValue(carburant);
    }

    public void setCilindre(String cilindre){
        LOG.info("Set cilindre");
        Select newCilindre = new Select(driver.findElement(By.id(selectCilindre)));
        newCilindre.selectByValue(cilindre);
    }

    public void setPutere(String motorizari){
        LOG.info("Set motorizari");
        Select newMotorizari = new Select(driver.findElement(By.id(selectPutere)));
        newMotorizari.selectByValue(motorizari);
    }


    public void clickSearchBar(){
        LOG.info("Click searchbar");
        driver.findElement(searchBar).click();

    }

    public void clickAripaLink(){
        LOG.info("Click aripa link");
        driver.findElement(aripaLink).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(aripaLink).click();
    }

    public void clickPieseAutoConstantaLink(){
        LOG.info("Click piese auto Constanta link");
        driver.findElement(pieseAutoConstantaLink).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(pieseAutoConstantaLink).click();
    }




}
