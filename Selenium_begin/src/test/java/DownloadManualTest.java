import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class DownloadManualTest {

    private WebDriver driver;
    CheckDownload checkDownload = new CheckDownload();

    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void getTheManualTest() throws InterruptedException {
        FluentWait<WebDriver> fluentWait = new FluentWait(driver);
        fluentWait.withTimeout(Duration.ofSeconds(10));
        driver.navigate().to("https://xtm.cloud/");

        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnHamburgerButton();

        LeftMenuPage leftMenuPage = new LeftMenuPage(driver);
        leftMenuPage.clickOnAcademyField();
        leftMenuPage.clickOnKnowledgeBaseField();
        leftMenuPage.clickOnAcademyField();
        leftMenuPage.clickOnDocumentationField();

        DocumentationPage documentationPage = new DocumentationPage(driver);
        documentationPage.clickManualDownloadField();
        checkDownload.checkDownloadFile();
    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}

