package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.ProductPage;
import tests.CustomAssertions;


public class ProductPageSteps extends BaseSteps{
    ProductPage productPage = PageFactory.initElements(webDriver, ProductPage.class);
    HomePageSteps homePageSteps = PageFactory.initElements(webDriver, HomePageSteps.class);
    CustomAssertions customAssertions = PageFactory.initElements(webDriver, CustomAssertions.class);


    public ProductPageSteps(WebDriver webDriver) { super(webDriver); }


    public String productName() throws InterruptedException {
        Thread.sleep(3000);
        return getElementText(productPage.getTxtProductName());
    }

    public String productPrice() {
        return getElementText(productPage.getTxtProductPrice());
    }

    public String productDescription() {
        return getElementText(productPage.getTxtProductDescription());
    }


    public String actualProductName() {
        String actualSelectedProductName = homePageSteps.selectProduct();
        System.out.println(actualSelectedProductName);

        if (actualSelectedProductName == String.valueOf(1)){
            actualSelectedProductName= "Samsung galaxy s6";
        } else if (actualSelectedProductName == String.valueOf(2)){
            actualSelectedProductName= "Nokia lumia 1520";
        } else if (actualSelectedProductName == String.valueOf(3)) {
            actualSelectedProductName= "Nexus 6";
        } else if (actualSelectedProductName == String.valueOf(4)) {
            actualSelectedProductName= "Samsung galaxy s7";
        } else if (actualSelectedProductName == String.valueOf(5)) {
            actualSelectedProductName= "Iphone 6 32gb";
        } else if (actualSelectedProductName == String.valueOf(6)) {
            actualSelectedProductName= "Sony xperia z5";
        } else if (actualSelectedProductName == String.valueOf(7)) {
            actualSelectedProductName= "HTC One M9";
        } else if (actualSelectedProductName == String.valueOf(8)) {
            actualSelectedProductName= "Sony vaio i5";
        } else if (actualSelectedProductName == String.valueOf(9)) {
            actualSelectedProductName= "Sony vaio i7";
        }
        return actualSelectedProductName;

    }
    public void compareActualAndExpectedProductName() throws InterruptedException {


        String actualSelectedProductName = actualProductName();
        System.out.println("Selected option is: "+ actualSelectedProductName);
        String expectedProductName = productName();
        System.out.println("Expected Product Name: " + expectedProductName);
        CustomAssertions.isTextEqual(actualSelectedProductName, expectedProductName);

    }

}
