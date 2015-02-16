import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class MainTest extends AbstrWebDriver{


    @BeforeClass
    public void testSetup() {
        home.navigateToHome();
    }


    @Test
    public void buyTest() {
        home.login("ostap.oleksyn@gmail.com", "omnius123");
        SearchPage result = home.search("pinguin explorer 60");
        result.buyFistItem();
        result.checkCart();

    }
}
