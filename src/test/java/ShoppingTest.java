import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ShoppingTest extends BaseTest
{

    ChromeDriver driver = openChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 5);
    BasePage basePage = new BasePage(driver);
    InventoryPage inventoryPage = new InventoryPage(driver);
    ShopingCartPage shopingCartPage = new ShopingCartPage(driver);

    @Test
    public void shoppingCarTyreFromSearchBar ()
        {
            try
            {
                basePage.searchBar.click();
                basePage.searchBar.sendKeys("lassa");
                basePage.searchBar.sendKeys(Keys.ENTER);
                inventoryPage.burgerIcon.click();
                inventoryPage.filterKlasaDropDownButton.click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Srednja']")));
                inventoryPage.filterKlasaCheckBoxSrednja.click();
                inventoryPage.filterProgramDropDownButton.click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Preporučene gume']")));
                inventoryPage.filterProgramCheckBoxPreporuceneGume.click();
                inventoryPage.filterProgramCheckBoxAkcija.click();
                inventoryPage.filterCenaDropDownButton.click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='5,001 - 10,000']")));
                inventoryPage.filterCenaCheckBoxFrom5001To10000.click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='svg-icon icon-arrow-next']")));
                inventoryPage.nextPageButtonInInventory.click();
                inventoryPage.summerCarTyreLassaGreenways.click();
                shopingCartPage.addingMoreThenOneTyreInShoppingCart.click();
                shopingCartPage.addingMoreThenOneTyreInShoppingCart.click();
                shopingCartPage.addingMoreThenOneTyreInShoppingCart.click();
                shopingCartPage.addingToCartButton.click();
                shopingCartPage.usernameFieldInShoppingCartPage.click();
                shopingCartPage.usernameFieldInShoppingCartPage.sendKeys(Strings.LOGIN_USERNAME);
                shopingCartPage.passwordFieldInShoppingCartPage.click();
                shopingCartPage.passwordFieldInShoppingCartPage.sendKeys(Strings.LOGIN_PASSWORD);
                shopingCartPage.submitButtonInShoppingCartPage.click();
                shopingCartPage.serviceShopButton.click();
                shopingCartPage.sliderButton.click();

                /* ne uspeva da klikne na check box - saglasnost i uslovi koriscenja prilikom obavljanja kupovine
                shopingCartPage.termsAndConditionsCheckBox.click();
                */


            }
            finally
            {
               // driver.quit();
            }

        }

}
