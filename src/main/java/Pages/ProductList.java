package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class ProductList extends BasePage{
    public ProductList(WebDriver driver, WebElement el) {
        super(driver);
        PageFactory.initElements(new DefaultElementLocatorFactory(el), this);
    }
}
