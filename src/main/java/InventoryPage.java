import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends BasePage
{

    @FindBy (xpath = "//a[contains(@class,'btn simbol')]")
    WebElement winterTyreButton;

    @FindBy (xpath = "(//a[contains(@class,'btn simbol')])[2]")
    WebElement summerTyreButton;

    @FindBy (xpath = "//i[@title='Zimske gume za auto']")
    WebElement winterIcon;

    @FindBy (xpath = "//a[contains(@class,'btn category')]")
    WebElement carButton;

    @FindBy (xpath = "(//a[contains(@class,'btn category')])[2]")
    WebElement suvButton;

    @FindBy (xpath = "(//a[contains(@class,'btn simbol')])[3]")
    WebElement allSeasonsTyreButton;

    @FindBy (xpath = "(//a[contains(@class,'btn simbol')])[3]")
    WebElement vanButton;

    @FindBy (id = "sidebarCollapse")
    WebElement burgerIcon;

    @FindBy (xpath = "//span[text()='Klasa']")
    WebElement filterKlasaDropDownButton;

    @FindBy (xpath = "//label[text()='Srednja']")
    WebElement filterKlasaCheckBoxSrednja;

    @FindBy (xpath = "//span[text()='Program']")
    WebElement filterProgramDropDownButton;

    @FindBy (xpath = "//label[text()='Preporučene gume']")
    WebElement filterProgramCheckBoxPreporuceneGume;

    @FindBy (xpath = "//label[text()='Akcija']")
    WebElement filterProgramCheckBoxAkcija;

    @FindBy (xpath = "//span[text()='Cena']")
    WebElement filterCenaDropDownButton;

    @FindBy (xpath = "//label[text()='5,001 - 10,000']")
    WebElement filterCenaCheckBoxFrom5001To10000;

    @FindBy (xpath = "//i[@class='svg-icon icon-arrow-next']")
    WebElement nextPageButtonInInventory;

    @FindBy (xpath = "(//div[@class='product-wrapper'])[3]")
    WebElement summerCarTyreLassaGreenways;



    public InventoryPage(ChromeDriver driver)
    {
        super(driver);
    }
}
