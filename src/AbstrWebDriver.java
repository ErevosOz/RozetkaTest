import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class AbstrWebDriver {

    protected FirefoxDriver driver;
    protected HomePage home;


    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        home = new HomePage(driver);
    }

    @AfterClass
    public void End(){
        driver.quit();

    }
}
