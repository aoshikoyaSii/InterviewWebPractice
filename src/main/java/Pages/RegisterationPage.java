package Pages;

import Models.Gender;
import Models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RegisterationPage extends  BasePage {

    Logger logger = LoggerFactory.getLogger(RegisterationPage.class);

    User user;
    Gender gender;
    public RegisterationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//input[@value='1']")
    private WebElement male;

    @FindBy(xpath="//input[@value='2']")
    private WebElement female;


    @FindBy(xpath="//input[@name='firstname']")
    private WebElement firstname;

    @FindBy(xpath="//input[@name='lastname']")
    private WebElement lastname;

    @FindBy(xpath="//input[@name='email']")
    private WebElement email;

    @FindBy(xpath="//input[@name='password']")
    private WebElement password;

    @FindBy(xpath="//input[@name='birthday']")
    private WebElement birthday;

    @FindBy(className=".custom-checkbox ")
    private List<WebElement> optin;

    @FindBy(xpath="//div[@class='user-info']/a[2]")
    private WebElement FirstNameLastName;



    @FindBy(css="save-customer']")
    private WebElement savecustomer;
    String expectedText = "Nya Nyasha";


    public void registerUser(User user){

      if(user.getGender() == Gender.male){
          logger.info("male radio button clicked");
          click(By.className("custom-radio"));
      } else if(user.getGender() == Gender.female){
          logger.info("female radio button clicked");
          click(By.className("custom-radio"));
      }

      getSentKey(firstname,user.getFirstname());
      getSentKey(lastname, user.getLastname());
      getSentKey(email,user.getEmail());
      getSentKey(password,user.getPassword());
      getSentKey(birthday, user.getBirth());
      click(By.xpath("//form/section/div[7]"));
      click(By.xpath("//form/section/div[8]"));
      click(By.xpath("//form/section/div[9]"));
      click(By.xpath("//form/section/div[10]"));
      click(By.xpath("//footer/button"));
      logger.info(">>>> form submitted successfully <<<<<<<");

      //assertThat(FirstNameLastName.getText(),equalTo(expectedText));
    }

    @FindBy(css = "#address-link .link-item")
    private WebElement secondAddress;

    public LoggerInUserAccountPage navigateUserToSecondAddress(){
        //click(By.css("address-link"));
        secondAddress.click();
        return new LoggerInUserAccountPage(getDriver());
    }
}
