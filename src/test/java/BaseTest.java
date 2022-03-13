import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest
{

    public ChromeDriver openChromeDriver ()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--start-maximized"});
        options.addArguments(new String[]{"--ignore-certificate-errors"});
        options.addArguments(new String[]{"--disable-popup-blocking"});
        options.addArguments(new String[]{"--incognito"});
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(Strings.HOME_PAGE);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-primary']")));
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        return driver;
    }

    public void print (String text)
    {
        System.out.println(text);
    }


}
