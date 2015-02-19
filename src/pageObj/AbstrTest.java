package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstrTest {

    protected FirefoxDriver driver;

    public AbstrTest(FirefoxDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void waitUntilVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilInvisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.visibilityOf(element)).equals(null);
    }

}
