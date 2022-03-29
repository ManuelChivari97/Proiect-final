package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.Locator;

import java.sql.Driver;
import java.util.Set;

public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;


    public static void setUP() {
        LOG.info("Start Test");
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        String url = "https://www.epiesa.ro/";
        driver.get(url);
        LOG.info("Open browser");
        driver.manage().window().maximize();

    }


    public static void teardown() {
        LOG.info("Close the browser");
        driver.quit();
    }

    public static void clickBack() {
        LOG.info("Click back");
        driver.navigate().back();
    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void hoverOverElement(By locator){
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();


    }




}
