package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver webDriver) { super(webDriver); }


    @FindBy(how = How.XPATH, using = "//h2[@class='name']")
    private WebElement txtProductName;

    @FindBy(how = How.XPATH, using = "//h3[@class='price-container']")
    private WebElement txtProductPrice;

    @FindBy(how = How.ID, using = "more-information")
    private WebElement txtProductDescription;

    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-success btn-lg']")
    private WebElement btnAddToCart;

    public WebElement getTxtProductName() { return txtProductName; }

    public WebElement getTxtProductPrice() { return txtProductPrice; }

    public WebElement getTxtProductDescription() { return txtProductDescription; }

    public WebElement getBtnAddToCart() { return btnAddToCart; }





}
