import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage
{

    @FindBy(xpath = "//a[@title='Prijavi se']")
    WebElement loginButton;

    @FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    WebElement loginSubmitButton;

    @FindBy(id = "dropdownMenuUser")
    WebElement logonAccountButton;


    public LoginPage(ChromeDriver driver)
    {
        super(driver);
    }
}
