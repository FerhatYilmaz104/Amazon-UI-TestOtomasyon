package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchResultsPage {
    public SearchResultsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")
    public WebElement searchResult;

    @FindBy (xpath = "(//a[@class='s-pagination-item s-pagination-button s-pagination-button-accessibility'])[1]")
    public WebElement secondPageButton;

    @FindBy (xpath = "(//div[@class='a-section aok-relative s-image-fixed-height'])[3]")
    public WebElement thirdProduct;
}
