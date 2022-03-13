import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HomePageSearchTest extends BaseTest
{

  ChromeDriver driver = openChromeDriver();
  HomePage homePage = new HomePage(driver);
  InventoryPage inventoryPage = new InventoryPage(driver);
  WebDriverWait wait = new WebDriverWait(driver, 5);

  @Test
    public void winterCarTyreSearchBySizeFromHomePage ()
  {
      try
      {
          homePage.tyreSizeButton.click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='select_width']/div[6]/div[1]")));
          homePage.carTyreWidth.click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='height65']")));
          homePage.carTyreHeight.click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='base15']")));
          homePage.carWheelSize.click();

          assert driver.getCurrentUrl().equals(Strings.INVENTORY_PAGE_WINTER_CAR_TYRES);
          print("Expected to be: " + Strings.INVENTORY_PAGE_WINTER_CAR_TYRES + " ; Actual is: " + driver.getCurrentUrl());
          assert inventoryPage.winterTyreButton.isEnabled();
          assert inventoryPage.carButton.isEnabled();
          assert inventoryPage.winterTyreButton.getText().equals(Strings.WINTER_BUTTON_TEXT);
          print("Expected to be: " + Strings.WINTER_BUTTON_TEXT + " ; Actual is: " + inventoryPage.winterTyreButton.getText());
          assert inventoryPage.winterIcon.isDisplayed();

      }
      finally
      {
          driver.quit();
      }
  }

  @Test
    public void summerSuvTyreSearchBySizeFromHomePage ()
  {
      try
      {
          homePage.summerTyreIcon.click();
          homePage.suvTyreButton.click();
          homePage.tyreSizeButton.click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='width235']")));
          homePage.suvTyreWidth.click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='height55']")));
          homePage.suvTyreHeight.click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='base18']")));
          homePage.suvWheelSize.click();

          assert driver.getCurrentUrl().equals(Strings.INVENTORY_PAGE_SUMMER_SUV_TYRES);
          print("Expected to be: " + Strings.INVENTORY_PAGE_SUMMER_SUV_TYRES + " ; Actual is: " + driver.getCurrentUrl());
          assert inventoryPage.summerTyreButton.isEnabled();
          assert inventoryPage.suvButton.isEnabled();
          assert inventoryPage.summerTyreButton.getText().equals(Strings.SUMMER_BUTTON_TEXT);
          print("Expected to be: " + Strings.SUMMER_BUTTON_TEXT + " ; Actual is: " + inventoryPage.summerTyreButton.getText());
          assert inventoryPage.summerTyreButton.isDisplayed();

      }
      finally
      {
          driver.quit();
      }
  }

  @Test
    public void allSeasonVanTyreSearchBySizeFromHomePage ()
  {
      try
      {
          homePage.allSeasonTyreIcon.click();
          homePage.vanTyreButton.click();
          homePage.tyreSizeButton.click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='width195']")));
          homePage.vanTyreWidth.click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='height65']")));
          homePage.vanTyreHeight.click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='base16']")));
          homePage.vanWheelSize.click();

          assert driver.getCurrentUrl().equals(Strings.INVENTORY_PAGE_ALLSEASONS_VAN_TYRES);
          print("Expected to be: " + Strings.INVENTORY_PAGE_ALLSEASONS_VAN_TYRES + " ; Actual is: " + driver.getCurrentUrl());
          assert inventoryPage.allSeasonsTyreButton.isEnabled();
          assert inventoryPage.vanButton.isEnabled();
          assert inventoryPage.allSeasonsTyreButton.getText().equals(Strings.ALLSEASONS_BUTTON_TEXT);
          print("Expected to be: " + Strings.ALLSEASONS_BUTTON_TEXT + " ; Actual is: " + inventoryPage.allSeasonsTyreButton.getText());
          assert inventoryPage.allSeasonsTyreButton.isDisplayed();
      }
      finally
      {
          driver.quit();
      }
  }

  @Test
    public void searchCarTyreByBrandFromHomePage ()
  {
      try
      {
          homePage.searchByBrandButton.click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Izaberite brend']")));
          homePage.dropDownBrandList.click();
          homePage.searchBrandBox.sendKeys("HONDA");
          homePage.honda.click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Model']")));
          homePage.modelOfCarDropDownList.click();
          homePage.modelOfCarSelectionButton.click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Tip']")));
          homePage.typeOfTheCar.click();
          homePage.typeOfTheCarSelectionButton.click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Motor']")));
          homePage.engineSelectionList.click();
          homePage.engineTypeButton.click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Godište']")));
          homePage.yearOfCarProduction.click();
          homePage.yearOfCarProductionButton.click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Dimenzije']")));
          homePage.carDimensionDropDownListButton.click();
          homePage.carDimensionButton.click();

          assert driver.getCurrentUrl().equals(Strings.INVENTORY_PAGE_CAR_BRAND_SEARCH);
          print("Expected to be: " + Strings.INVENTORY_PAGE_CAR_BRAND_SEARCH + " ; Actual is: " + driver.getCurrentUrl());
          assert inventoryPage.carButton.isEnabled();
      }
      finally
      {
          driver.quit();
      }
  }
}
