import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import static java.lang.Thread.sleep;

public class DocumentationPage {

    @FindBy(linkText = "XTM Editor - User Manual")
    private WebElement manualDownload;

    public WebDriver driver;

    public DocumentationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickManualDownloadField() throws InterruptedException {
        FluentWait<WebDriver> fluentWait = new FluentWait(driver);
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated((By.linkText("XTM Editor - User Manual"))));
        manualDownload.click();
        sleep(2500);
    }
}
