import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class LeftMenuPage {

    @FindBy(linkText = "Pricing")
    private WebElement pricingField;

    @FindBy(linkText = "Calculator")
    private WebElement calculatorField;

    public WebDriver driver;

    public LeftMenuPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnPricingField(){
        //    WebElement pricingField = driver.findElement(By.linkText("Pricing"));
        pricingField.click();
    }

    public void clickOnCalculatorField(){
        FluentWait<WebDriver> fluentWait = new FluentWait(driver);
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Calculator")));
//      WebElement calculatorField = driver.findElement(By.linkText("Calculator"));
        calculatorField.click();
    }
}
