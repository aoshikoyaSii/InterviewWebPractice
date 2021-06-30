package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class HomePage extends BasePage {

    Logger logger = LoggerFactory.getLogger(HomePage.class);
    List<WebElement> allProduct;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".account")
    private WebElement signin;

    //SIGNIN
    public LoginPage LoginPage(){
        click(By.className("user-info"));
        return new LoginPage(getDriver());
    }

 public ProductList getRandomSingleProduct(){
        logger.info(">>>> random single product picked <<<<<<");
            return new ProductList(getDriver(), getRandomProduct(allProduct));
 }

}
