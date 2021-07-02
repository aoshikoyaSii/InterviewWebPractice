package TestCases;

import Models.User;
import Pages.AddressConfirmationPage;
import Pages.HomePage;
import Pages.LoggerInUserAccountPage;
import TestBaseFolder.TestBase;
import org.junit.jupiter.api.Test;

public class AddAddressTest extends TestBase {

    HomePage homePage = new HomePage(driver);
    AddressConfirmationPage addressConfirmationPage = new AddressConfirmationPage(driver);

User user;
    @Test
    void TestNewAddressForm() throws Exception{
        LoggerInUserAccountPage loggerInUserAccountPage = new LoggerInUserAccountPage(driver);
        homePage.navigateToLoginPage().LoginAsExistingUser(user);
        loggerInUserAccountPage.navigateToAddSecondAddress().fillAddressForm();

        addressConfirmationPage.assertAddressPage();
    }
}
