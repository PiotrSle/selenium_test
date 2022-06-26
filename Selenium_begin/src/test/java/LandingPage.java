import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class LandingPage {

    @FindBy(id="hamburger")
    private WebElement hamburgerButton;

    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnHamburgerButton(){
        WebElement hamburgerButton = driver.findElement(By.id("hamburger"));
        hamburgerButton.click();
    }
}
