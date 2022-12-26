package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage extends BasePage{
    public CartPage(WebDriver webDriver) { super(webDriver); }


    @FindBy(how = How.XPATH, using = "//a[@class='nav-link'][.='Cart']")
    private WebElement txtCartLink;

    public WebElement getTxtCartLink() { return txtCartLink; }

}
