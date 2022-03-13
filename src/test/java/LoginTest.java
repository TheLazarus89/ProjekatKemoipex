import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest
{

    ChromeDriver driver = openChromeDriver();

    @Test
    public void loginWithValidCredentials()
    {
        try
        {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.loginButton.click();
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
            loginPage.usernameField.sendKeys(Strings.LOGIN_USERNAME);
            loginPage.passwordField.sendKeys(Strings.LOGIN_PASSWORD);
            loginPage.loginSubmitButton.click();

            assert driver.getCurrentUrl().equals(Strings.HOME_PAGE);
            print("Expected to be: " + Strings.HOME_PAGE + " . Actual is: " + driver.getCurrentUrl());

            String currentLogonAccountButtonText = loginPage.logonAccountButton.getText();
            assert currentLogonAccountButtonText.equals(Strings.LOGON_ACCOUNT_BUTTON_TEXT);
            print("Expected to be: " + Strings.LOGON_ACCOUNT_BUTTON_TEXT + " . Actual is: " + currentLogonAccountButtonText);
        }
        finally
        {
            driver.quit();
        }

    }

}
