import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Price_calculator {

    private WebDriver driver;

    public static final double PRICE_OK_£ = 1164.00;
    public static final double PRICE_TO_CHECK_£ = 1065.00;
    public static final double PRICE_TO_CHECK_€ = 1214.10;
    public static final double PRICE_TO_CHECK_$ = 1533.60;

    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void calculateTest() throws InterruptedException {
        FluentWait<WebDriver> fluentWait = new FluentWait(driver);
        fluentWait.withTimeout(Duration.ofSeconds(5));
        driver.navigate().to("https://xtm.cloud/");

        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnHamburgerButton();

        LeftMenuPage leftMenuPage = new LeftMenuPage(driver);
        leftMenuPage.clickOnPricingField();
        leftMenuPage.clickOnCalculatorField();

    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}