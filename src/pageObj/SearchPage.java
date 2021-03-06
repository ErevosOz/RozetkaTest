package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import org.testng.Assert;

public class SearchPage extends AbstrTest {

    @FindBy(xpath = "(.//*[@id='head_banner_container']//button)[1]")
    WebElement buyButton;

    @FindBy(xpath = ".//*[@id='cart-popup']/div")
    WebElement cart;

    @FindBy(xpath = ".//*[@id='cart-popup']//a[@name='delete']")
    WebElement deleteItem;

    public SearchPage(FirefoxDriver driver) {
        super(driver);
    }


    public void buyFistItem() {
        buyButton.click();
    }

    public void checkCart(){
        waitUntilVisible(cart);
        Assert.assertTrue(cart.isDisplayed());
        deleteItem.click();
        waitUntilInvisible(deleteItem);
    }
}
