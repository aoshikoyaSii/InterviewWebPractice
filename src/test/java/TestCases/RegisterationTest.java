package TestCases;

import Models.User;
import Pages.HomePage;
import Pages.LoggerInUserAccountPage;
import Pages.RegisterationPage;
import TestBaseFolder.TestBase;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import provider.UserFactory;

public class RegisterationTest extends TestBase {
    Logger logger = LoggerFactory.getLogger(RegisterationTest.class);
    HomePage homePage = new HomePage(driver);
    RegisterationPage registerationPage = new RegisterationPage(driver);
    LoggerInUserAccountPage loggerInUserAccountPage = new LoggerInUserAccountPage(driver);


    @Test
    public void registerTest() throws Exception{
        logger.info(">>>>>>> register user <<<<<<<<");
        User user = new UserFactory().registerNewUser();
        homePage.navigateToLoginPage()
                .createAnAccount()
                .registerUser(user);


//        homePage.LoginPage()
//                .LoginAsExistingUser(user);

        Thread.sleep(3000);

        //loggerInUserAccountPage = registerationPage.navigateUserToSecondAddress();


    }
}
