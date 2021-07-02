package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;

public class AddressConfirmationPage extends BasePage{
    public AddressConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".alert-success>ul>li")
    private WebElement alertSuccess;

    String ExpectedValue = "Address successfully added!";
    public void assertAddressPage(){
        assertThat(ExpectedValue,equals(alertSuccess.getText()));
    }
}
