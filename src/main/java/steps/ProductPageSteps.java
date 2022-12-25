package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.ProductPage;
import tests.CustomAssertions;

import java.util.ArrayList;


public class ProductPageSteps extends BaseSteps{
    ProductPage productPage = PageFactory.initElements(webDriver, ProductPage.class);
    HomePageSteps homePageSteps = PageFactory.initElements(webDriver, HomePageSteps.class);
    CustomAssertions customAssertions = PageFactory.initElements(webDriver, CustomAssertions.class);

    public ProductPageSteps(WebDriver webDriver) { super(webDriver); }

    public String productName() throws InterruptedException {
        Thread.sleep(1000);
        return getElementText(productPage.getTxtProductName());
    }

    public String productPrice() {
        return getElementText(productPage.getTxtProductPrice());
    }

    public String productDescription() {
        return getElementText(productPage.getTxtProductDescription());
    }


    public void actualProductName () throws InterruptedException {
        ArrayList<String> names=new ArrayList();
        names.add("Samsung galaxy s6");
        names.add("Nokia lumia 1520");
        names.add("Nexus 6");
        names.add("Samsung galaxy s7");
        names.add("Iphone 6 32gb");
        names.add("Sony xperia z5");
        names.add("HTC One M9");
        names.add("Sony vaio i5");
        names.add("Sony vaio i7");

        ArrayList<String> prices=new ArrayList();
        prices.add("$360 *includes tax");
        prices.add("$820 *includes tax");
        prices.add("$650 *includes tax");
        prices.add("$800 *includes tax");
        prices.add("$790 *includes tax");
        prices.add("$320 *includes tax");
        prices.add("$700 *includes tax");
        prices.add("$790 *includes tax");
        prices.add("$790 *includes tax");

        ArrayList<String> description=new ArrayList();
        prices.add("$360 *includes tax");
        prices.add("$820 *includes tax");
        prices.add("$650 *includes tax");
        prices.add("$800 *includes tax");
        prices.add("$790 *includes tax");
        prices.add("$320 *includes tax");
        prices.add("$700 *includes tax");
        prices.add("$790 *includes tax");
        prices.add("$790 *includes tax");

        int selectedProductName= homePageSteps.selectProduct();
        String actualSelectedProductName=names.get(selectedProductName-1);
        System.out.println(actualSelectedProductName);
        String actualSelectedProductPrice=prices.get(selectedProductName-1);
        System.out.println(actualSelectedProductPrice);

        System.out.println("Actual selected Product Name: "+ actualSelectedProductName);
        String expectedProductName = productName();
        System.out.println("Expected Product Name: " + expectedProductName);
        CustomAssertions.isTextEqual(actualSelectedProductName, expectedProductName);

        System.out.println("Actual selected Product Name: "+ actualSelectedProductPrice);
        String expectedProductPrice = productPrice();
        System.out.println("Expected Product Name: " + expectedProductPrice);
        CustomAssertions.isTextEqual(actualSelectedProductPrice, expectedProductPrice);
        
    }


}
