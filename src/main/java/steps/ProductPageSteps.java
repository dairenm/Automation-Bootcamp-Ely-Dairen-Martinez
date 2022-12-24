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



    public String actualProductName () {
        int selectedProductName= homePageSteps.selectProduct();
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
        String str=names.get(selectedProductName-1);
        System.out.println(str);
        return str;
    }

    public void compareActualAndExpectedProductName() throws InterruptedException {

        String actualSelectedProductName = actualProductName();
        System.out.println("Actual selected Product Name: "+ actualSelectedProductName);
        String expectedProductName = productName();
        System.out.println("Expected Product Name: " + expectedProductName);
        CustomAssertions.isTextEqual(actualSelectedProductName, expectedProductName);

    }

    public void actualProductPrice () {

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


    }

}
