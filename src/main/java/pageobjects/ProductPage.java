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

    @FindBy(how = How.XPATH, using = "//img[@src='imgs/galaxy_s6.jpg']")
    private WebElement imgGalaxyS6;

    @FindBy(how = How.XPATH, using = "//img[@src='imgs/Lumia_1520.jpg']")
    private WebElement imgNokia1520;

    @FindBy(how = How.XPATH, using = "//img[@src='imgs/Nexus_6.jpg']")
    private WebElement imgNexus6;

    @FindBy(how = How.XPATH, using = "//img[@src='imgs/galaxy_s6.jpg']")
    private WebElement imgGalaxyS7;

    @FindBy(how = How.XPATH, using = "//img[@src='imgs/iphone_6.jpg']")
    private WebElement imgIphone6;

    @FindBy(how = How.XPATH, using = "//img[@src='imgs/xperia_z5.jpg']")
    private WebElement imgXperiaZ5;

    @FindBy(how = How.XPATH, using = "//img[@src='imgs/HTC_M9.jpg']")
    private WebElement imgHTCM9;

    @FindBy(how = How.XPATH, using = "//img[@src='imgs/sony_vaio_5.jpg']")
    private WebElement imgVaio5;

    @FindBy(how = How.XPATH, using = "//img[@src='imgs/sony_vaio_5.jpg']")
    private WebElement imgVaio7;



    public WebElement getTxtProductName() { return txtProductName; }

    public WebElement getTxtProductPrice() { return txtProductPrice; }

    public WebElement getTxtProductDescription() { return txtProductDescription; }

    public WebElement getBtnAddToCart() { return btnAddToCart; }

    public WebElement getImgGalaxyS6() { return imgGalaxyS6; }

    public WebElement getImgNokia1520() { return imgNokia1520; }

    public WebElement getImgNexus6() { return imgNexus6; }

    public WebElement getImgGalaxyS7() { return imgGalaxyS7; }

    public WebElement getImgIphone6() { return imgIphone6; }

    public WebElement getImgXperiaZ5() { return imgXperiaZ5; }

    public WebElement getImgHTCM9() { return imgHTCM9; }

    public WebElement getImgVaio5() { return imgVaio5; }

    public WebElement getImgVaio7() { return imgVaio7; }







}
