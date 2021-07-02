package TestCases;

import Models.User;
import Pages.HomePage;
import TestBaseFolder.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginTest extends TestBase {

    Logger logger = LoggerFactory.getLogger(LoginTest.class);
    HomePage homePage = new HomePage(driver);
    User user;

    @FindBy(css=".user-info")
    private WebElement signin;

    @Test
    public void openBrowser() throws Exception {
        logger.info("opening web page");
        homePage.navigateToLoginPage().LoginAsExistingUser(user);
    }


}
