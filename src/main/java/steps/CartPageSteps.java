package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.CartPage;


public class CartPageSteps extends BaseSteps{

    CartPage cartPage = PageFactory.initElements(webDriver, CartPage.class);

    public CartPageSteps(WebDriver webDriver) { super(webDriver); }


}
