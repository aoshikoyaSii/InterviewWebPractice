package TestCases;

import Models.User;
import Pages.HomePage;
import Pages.RegisterationPage;
import TestBaseFolder.TestBase;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import provider.UserFactory;

public class RegisterationTest extends TestBase {
    Logger logger = LoggerFactory.getLogger(RegisterationTest.class);
    HomePage homePage = new HomePage(driver);
    RegisterationPage registerationPage;


    @Test
    public void registerTest(){
        logger.info(">>>>>>> register user <<<<<<<<");
        User user = new UserFactory().registerNewUser();
        homePage.LoginPage()
                .createAnAccount()
                .registerUser(user);
    }
}
