import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ShopingCartPage extends BasePage
{
    @FindBy(xpath = "//i[@class='svg-icon icon-plus']")
    WebElement addingMoreThenOneTyreInShoppingCart;

    @FindBy (xpath = "//button[@title='Dodaj u korpu']")
    WebElement addingToCartButton;

    @FindBy (id = "username")
    WebElement usernameFieldInShoppingCartPage;

    @FindBy (id = "password")
    WebElement passwordFieldInShoppingCartPage;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    WebElement submitButtonInShoppingCartPage;

    @FindBy (xpath = "//button[@data-id='2']")
    WebElement serviceShopButton;

    @FindBy (xpath = "//label[@class='custom-control-label']")
    WebElement sliderButton;

    //ne uspevam da lociram xpath da bi mogao da kliknem na check box za shopping test
    @FindBy (xpath = "(//label[@class='custom-control-label'])[0]")
    WebElement termsAndConditionsCheckBox;

    @FindBy (id = "shopURL_Buy")
    WebElement orderButton;


    public ShopingCartPage(ChromeDriver driver)
    {
        super(driver);
    }
}
