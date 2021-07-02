package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerInUserAccountPage extends BasePage{

    Logger logger = LoggerFactory.getLogger(LoggerInUserAccountPage.class);
    public LoggerInUserAccountPage(WebDriver driver) {
        super(driver);
    }


    public LoggerInUserAccountPage navigateToAddSecondAddress() {
        click(By.cssSelector("#identity-link>span"));
        return this;
    }

    @FindBy(css="form-control[name='address1']")
    private WebElement address;

    @FindBy(css = "input[name='city']")
    private WebElement city;

    @FindBy(css = "input[name='postcode']")
    private WebElement postalcode;

    @FindBy(css = "select[name='id_country']")
    private WebElement country;

    @FindBy(css = "input[name='phone']")
    private WebElement phone;

    @FindBy(className = ".page-header")
    private WebElement newAddress;

    public LoggerInUserAccountPage validatePresenceOfEl(){
        waitForPresenceOfElement(getDriver(),newAddress,"New Address", 20);
        return this;
    }
    public LoggerInUserAccountPage fillAddressForm() throws Exception{
      validatePresenceOfEl();
      getSentKey(address,"omodoctor 22");
      getSentKey(city,"igbogbo");
      getSentKey(postalcode,"22654");
      selectCountry();
      getSentKey(phone,"978550484");
      click(By.cssSelector(".form-footer > button"));
      logger.info(">>>> form submitted successfully <<<<");
      return this;
    }

    public WebElement selectCountry(){
       Select select = new Select(country);
       return select.getOptions().get(1);
    }
}
