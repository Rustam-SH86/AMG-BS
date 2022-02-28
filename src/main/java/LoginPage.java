import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//div//input[@placeholder='Логин']")
    WebElement login;
    @FindBy(xpath = "//div//input[@placeholder='Пароль']")
    WebElement password;
    @FindBy(xpath = "//div//button[@type='submit']")
    WebElement enter;
    @FindBy(xpath = "//div//img[@alt='exit icon']")
    WebElement exit;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void logIn () {
        Actions action = new Actions(getDriver());
        action.click(login).sendKeys("test_a").click(password).sendKeys("1-1").click(enter).build().perform();
        exit.click();


    }




}
