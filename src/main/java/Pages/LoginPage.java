package Pages;

import Models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    User user;
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".col-md-6 > input")
    private WebElement email;

    @FindBy(css=".input-group > input")
    private WebElement password;

    @FindBy(css="no-account a")
    private WebElement createAcc;

    public RegisterationPage createAnAccount(){
        click(By.className("no-account"));
        return new RegisterationPage(getDriver());
    }

    public void LoginAsExistingUser(User user){
      getSentKey(email, user.getEmail());
      getSentKey(password, user.getPassword());
   }

}
