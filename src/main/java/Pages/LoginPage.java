package Pages;

import Models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import provider.UserFactory;


public class LoginPage extends BasePage{
    User user;
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    Logger logger = LoggerFactory.getLogger(LoginPage.class);

    @FindBy(css="no-account a")
    private WebElement createAcc;

    public RegisterationPage createAnAccount(){
        click(By.className("no-account"));
        return new RegisterationPage(getDriver());
    }

    @FindBy(css = ".form-control[name='email']")
    private WebElement emailInput;

    @FindBy(css = ".form-control[name='password']")
    private WebElement passwordInput;

    @FindBy(id = "submit-login")
    private WebElement submit;

    public LoggerInUserAccountPage LoginAsExistingUser(User user){
        user = new UserFactory().registerNewUser();
        getSentKey(emailInput, user.getEmail());
        getSentKey(passwordInput, user.getPassword());
        logger.info("password successfully inputed");
        click(By.cssSelector(".input-group-btn > button"));
        logger.info(">>>>> click set visible password <<<<<< ");
        submit.click();
        logger.info("sign in button clicked");
        return new LoggerInUserAccountPage(getDriver());
    }

}
