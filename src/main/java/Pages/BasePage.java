package Pages;

import Models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;


public class BasePage {
private final WebDriver driver;
User user;
private Logger logger = LoggerFactory.getLogger(BasePage.class);


    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void getSentKey(WebElement element, String text){
//        element.sendKeys(text);
        WebElement afterFluent = locateWebElement(element);
        afterFluent.sendKeys(text);
    }

    public void click(By by){
        logger.info(">>>> element clicked on <<<<<<<< ");
        WaitUntilClickable(by).click();
    }

    public Wait<WebDriver> getFluentWait() {
       return  new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
               .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
    }

    public WebElement WaitUntilClickable(By by) {
        try{
            return getFluentWait().until(ExpectedConditions.elementToBeClickable(by));
        }catch (Exception e){
            logger.info(">>>>>> timeout finding element clickable <<<<<<");
            throw e;
        }
    }


    public WebElement locateWebElement(WebElement el) {
        try{
            return getFluentWait().until(ExpectedConditions.visibilityOf(el));
        }catch (Exception e){
            logger.info(">>>>>> timeout finding element clickable <<<<<<");
            throw e;
        }
    }

    public void waitForPresenceOfElement(WebDriver driver, WebElement el, String text,int timeout){
        try{
            System.out.println("waiting for element: " + el);
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.textToBePresentInElement(el,text));
            logger.debug(">>> element is visible on the web page <<< ");
        } catch(Exception e){
            logger.debug("Element not visible on the web page");
        }
    }


    public WebElement getRandomProduct(List<WebElement> el){
        Random random = new Random();
        return el.get(random.nextInt(el.size()));
    }

}
