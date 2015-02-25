package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;



public class HomePage extends AbstrTest {

    public HomePage(FirefoxDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='user_menu']//a")
    WebElement loginForm;

    @FindBy(xpath = ".//*[@class='popup-css popup-css-blue popup-auth']//input[@name='login']")
    WebElement loginInput;

    @FindBy(xpath = ".//*[@class='popup-css popup-css-blue popup-auth']//input[@name='password']")
    WebElement passInput;

    @FindBy(xpath = ".//*[@class='popup-css popup-css-blue popup-auth']//button")
    WebElement loginButton;

    @FindBy(xpath = ".//*[@class='header-search-input-text']")
    WebElement searchForm;

    @FindBy(xpath = ".//*[@class='btn-link-i']")
    WebElement searchButton;

    @FindBy(xpath = ".//*[@class='m-user-profile']//a")
    WebElement loginLink;


    public HomePage login(String login, String password){

        loginForm.click();
        loginInput.sendKeys(login);
        passInput.sendKeys(password);
        loginButton.click();
        waitUntilVisible(loginLink);

        return new HomePage(driver);


    }


    public SearchPage search(String text) {
        searchForm.sendKeys(text);
        searchButton.click();
        return new SearchPage(driver);
    }
}
