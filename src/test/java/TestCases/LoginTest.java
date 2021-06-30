package TestCases;

import Pages.BasePage;
import Pages.HomePage;
import TestBaseFolder.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginTest extends TestBase {

    Logger logger = LoggerFactory.getLogger(LoginTest.class);
    HomePage homePage = new HomePage(driver);

    @FindBy(css=".user-info")
    private WebElement signin;

    @Test
    public void openBrowser(){
        logger.info("opening web page");
        homePage.click(By.className(".user-info"));
    }


}
