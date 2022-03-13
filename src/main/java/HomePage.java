import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{

    @FindBy(xpath = "//button[@data-id='854']")
    WebElement winterTyreIcon;

    @FindBy(xpath = "//button[@data-id='855']")
    WebElement summerTyreIcon;

    @FindBy(xpath = "//button[@data-id='936']")
    WebElement allSeasonTyreIcon;

    @FindBy(xpath = "//button[@data-id='930']")
    WebElement carTyreButton;

    @FindBy (xpath = "//button[@data-id='931']")
    WebElement suvTyreButton;

    @FindBy (xpath = "//button[@data-id='932']")
    WebElement vanTyreButton;

    @FindBy (id = "size")
    WebElement tyreSizeButton;

    @FindBy (id = "searchTires")
    WebElement tyreSearchButton;

    @FindBy (xpath = "//div[@id='select_width']/div[6]/div[1]")
    WebElement carTyreWidth;

    @FindBy (xpath = "//label[@for='height65']")
    WebElement carTyreHeight;

    @FindBy (xpath = "//label[@for='base15']")
    WebElement carWheelSize;

    @FindBy (xpath = "//label[@for='width235']")
    WebElement suvTyreWidth;

    @FindBy (xpath = "//label[@for='height55']")
    WebElement suvTyreHeight;

    @FindBy (xpath = "//label[@for='base18']")
    WebElement suvWheelSize;

    @FindBy (xpath = "//label[@for='width195']")
    WebElement vanTyreWidth;

    @FindBy (xpath = "//label[@for='height65']")
    WebElement vanTyreHeight;

    @FindBy (xpath = "//label[@for='base16']")
    WebElement vanWheelSize;

    @FindBy (id = "nav-cars-tab")
    WebElement searchByBrandButton;

    @FindBy (xpath = "//span[text()=' Izaberite brend']")
    WebElement dropDownBrandList;

    @FindBy (className = "search-txt")
    WebElement searchBrandBox;

    @FindBy (xpath = "//label[text()='HONDA']")
    WebElement honda;

    @FindBy (xpath = "//span[text()=' Model']")
    WebElement modelOfCarDropDownList;

    @FindBy (xpath = "//label[text()='Civic']")
    WebElement modelOfCarSelectionButton;

    @FindBy (xpath = "//span[text()=' Tip']")
    WebElement typeOfTheCar;

    @FindBy (xpath = "//label[text()='Civic Type R']")
    WebElement typeOfTheCarSelectionButton;

    @FindBy (xpath = "//span[text()=' Motor']")
    WebElement engineSelectionList;

    @FindBy (xpath = "//label[text()='2.0 VTEC 320']")
    WebElement engineTypeButton;

    @FindBy (xpath = "//span[text()=' Godište']")
    WebElement yearOfCarProduction;

    @FindBy (xpath = "//label[text()='2017']")
    WebElement yearOfCarProductionButton;

    @FindBy (xpath = "//span[text()=' Dimenzije']")
    WebElement carDimensionDropDownListButton;

    @FindBy (xpath = "//label[text()='235/40 R 18 90Y']")
    WebElement carDimensionButton;

    public HomePage(ChromeDriver driver) {
        super(driver);
    }
}
