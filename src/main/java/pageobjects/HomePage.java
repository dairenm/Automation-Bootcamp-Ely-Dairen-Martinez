package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage{

    public HomePage(WebDriver webDriver) { super(webDriver); }

    @FindBy(how = How.XPATH, using = "//a[@id='itemc'][1]")
    private WebElement txtFirstCategorie;

    @FindBy(how = How.XPATH, using = "//a[@id='itemc'][2]")
    private WebElement txtSecondCategorie;

    @FindBy(how = How.XPATH, using = "//a[@id='itemc'][3]")
    private WebElement txtThirdCategorie;

    @FindBy(how = How.XPATH, using = "//a[@href='prod.html?idp_=1']")
    private WebElement txtFirstProduct;

    @FindBy(how = How.XPATH, using = "//a[@href='prod.html?idp_=2']")
    private WebElement txtSecondProduct;

    @FindBy(how = How.XPATH, using = "//a[@href='prod.html?idp_=3']")
    private WebElement txtThirdProduct;

    @FindBy(how = How.XPATH, using = "//a[@href='prod.html?idp_=4']")
    private WebElement txtFourthProduct;

    @FindBy(how = How.XPATH, using = "//a[@href='prod.html?idp_=5']")
    private WebElement txtFifthProduct;

    @FindBy(how = How.XPATH, using = "//a[@href='prod.html?idp_=6']")
    private WebElement txtSixthProduct;

    @FindBy(how = How.XPATH, using = "//a[@href='prod.html?idp_=7']")
    private WebElement txtSeventhProduct;

    @FindBy(how = How.XPATH, using = "//a[@href='prod.html?idp_=8']")
    private WebElement txtEightProduct;

    @FindBy(how = How.XPATH, using = "//a[@href='prod.html?idp_=9']")
    private WebElement txtNinthProduct;


    public WebElement getTxtFirstCategorie() { return txtFirstCategorie; }

    public WebElement getTxtSecondCategorie() { return txtSecondCategorie; }

    public WebElement getTxtThirdCategorie() { return txtThirdCategorie; }

    public WebElement getTxtFirstProduct() { return txtFirstProduct; }

    public WebElement getTxtSecondProduct() { return txtSecondProduct; }

    public WebElement getTxtThirdProduct() { return txtThirdProduct; }

    public WebElement getTxtFourthProduct() { return txtFourthProduct; }

    public WebElement getTxtFifthProduct() { return txtFifthProduct; }

    public WebElement getTxtSixthProduct() { return txtSixthProduct; }

    public WebElement getTxtSeventhProduct() { return txtSeventhProduct; }

    public WebElement getTxtEightProduct() { return txtEightProduct; }

    public WebElement getTxtNinthProduct() { return txtNinthProduct; }



}

