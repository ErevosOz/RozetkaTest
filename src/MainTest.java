import pageObj.HomePage;
import pageObj.SearchPage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class MainTest{

    private FirefoxDriver driver;



    @BeforeClass
    public void testSetup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://rozetka.com.ua");
    }

    @AfterClass
    public void End(){
        driver.quit();

    }


    @Test
    public void buyTest() {
        HomePage home = new HomePage(driver);
        home.login("ostap.oleksyn@gmail.com", "omnius123");
        SearchPage result = home.search("pinguin explorer 60");
        result.buyFistItem();
        result.checkCart();

    }
}
