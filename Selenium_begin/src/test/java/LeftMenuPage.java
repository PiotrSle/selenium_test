import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class LeftMenuPage {

    @FindBy(linkText = "Academy")
    private WebElement academyField;

    @FindBy(linkText = "Knowledge Base")
    private WebElement knowledgeBaseField;

    @FindBy(linkText = "Documentation")
    private WebElement documentationField;

    public WebDriver driver;

    public LeftMenuPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAcademyField() {
        academyField.click();
    }

    public void clickOnKnowledgeBaseField() {
        FluentWait<WebDriver> fluentWait = new FluentWait(driver);
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Knowledge Base")));
        knowledgeBaseField.click();
    }

    public void clickOnDocumentationField() {
        FluentWait<WebDriver> fluentWait = new FluentWait(driver);
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Documentation")));
        documentationField.click();
    }
}