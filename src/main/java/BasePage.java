import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage
{
    ChromeDriver driver = null;

    @FindBy (id = "products")
    WebElement searchBar;

    @FindBy (id = "dropdownMenuCart")
    WebElement shoppingCartIcon;

    public BasePage(ChromeDriver driver)
    {
        driver.get(Strings.HOME_PAGE);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


}
