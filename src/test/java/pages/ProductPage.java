package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductPage {
    public ProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[@id='productTitle']")
    public WebElement productName;

    @FindBy (id = "nav-cart-text-container")
    public WebElement cartButton;
}
