package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.ProductPage;
import tests.CustomAssertions;
import java.time.Duration;
import java.util.ArrayList;


public class ProductPageSteps extends BaseSteps{
    ProductPage productPage = PageFactory.initElements(webDriver, ProductPage.class);
    HomePageSteps homePageSteps = PageFactory.initElements(webDriver, HomePageSteps.class);

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

    public boolean productAddToCartButton() {
        return isElementDisplayed(productPage.getBtnAddToCart());
    }

    public String browserTextAlert() throws InterruptedException {
        Thread.sleep(2000);
        return webDriver.switchTo().alert().getText();
    }

    public void browserBtnAlert() {
        webDriver.switchTo().alert().accept();
    }

    public static ArrayList<String> names = new ArrayList<String>();
    public static ArrayList<String> prices = new ArrayList<String>();
    public static ArrayList<String> description = new ArrayList<String>();
    public static ArrayList<WebElement> images=new ArrayList();

    public void constants() {
        names.add("Samsung galaxy s6");
        names.add("Nokia lumia 1520");
        names.add("Nexus 6");
        names.add("Samsung galaxy s7");
        names.add("Iphone 6 32gb");
        names.add("Sony xperia z5");
        names.add("HTC One M9");
        names.add("Sony vaio i5");
        names.add("Sony vaio i7");

        prices.add("$360 *includes tax");
        prices.add("$820 *includes tax");
        prices.add("$650 *includes tax");
        prices.add("$800 *includes tax");
        prices.add("$790 *includes tax");
        prices.add("$320 *includes tax");
        prices.add("$700 *includes tax");
        prices.add("$790 *includes tax");
        prices.add("$790 *includes tax");

        description.add("Product description\nThe Samsung Galaxy S6 is powered by 1.5GHz octa-core Samsung Exynos 7420 processor and it comes with 3GB of RAM. The phone packs 32GB of internal storage cannot be expanded.");
        description.add("Product description\nThe Nokia Lumia 1520 is powered by 2.2GHz quad-core Qualcomm Snapdragon 800 processor and it comes with 2GB of RAM.");
        description.add("Product description\nThe Motorola Google Nexus 6 is powered by 2.7GHz quad-core Qualcomm Snapdragon 805 processor and it comes with 3GB of RAM.");
        description.add("Product description\nThe Samsung Galaxy S7 is powered by 1.6GHz octa-core it comes with 4GB of RAM. The phone packs 32GB of internal storage that can be expanded up to 200GB via a microSD card.");
        description.add("Product description\nIt comes with 1GB of RAM. The phone packs 16GB of internal storage cannot be expanded. As far as the cameras are concerned, the Apple iPhone 6 packs a 8-megapixel primary camera on the rear and a 1.2-megapixel front shooter for selfies.");
        description.add("Product description\nSony Xperia Z5 Dual smartphone was launched in September 2015. The phone comes with a 5.20-inch touchscreen display with a resolution of 1080 pixels by 1920 pixels at a PPI of 424 pixels per inch.");
        description.add("Product description\nThe HTC One M9 is powered by 1.5GHz octa-core Qualcomm Snapdragon 810 processor and it comes with 3GB of RAM. The phone packs 32GB of internal storage that can be expanded up to 128GB via a microSD card.");
        description.add("Product description\nSony is so confident that the VAIO S is a superior ultraportable laptop that the company proudly compares the notebook to Apple's 13-inch MacBook Pro. And in a lot of ways this notebook is better, thanks to a lighter weight.");
        description.add("Product description\nREVIEW Sony is so confident that the VAIO S is a superior ultraportable laptop that the company proudly compares the notebook to Apple's 13-inch MacBook Pro. And in a lot of ways this notebook is better, thanks to a lighter weight, higher-resolution display, more storage space, and a Blu-ray drive.");


        images.add(productPage.getImgGalaxyS6());
        images.add(productPage.getImgNokia1520());
        images.add(productPage.getImgNexus6());
        images.add(productPage.getImgGalaxyS7());
        images.add(productPage.getImgIphone6());
        images.add(productPage.getImgXperiaZ5());
        images.add(productPage.getImgHTCM9());
        images.add(productPage.getImgVaio5());
        images.add(productPage.getImgVaio7());
    }


    public void productElements () throws InterruptedException {
        int selectedProduct= homePageSteps.selectProduct();
        constants();
        String actualSelectedProductName=names.get(selectedProduct-1);
        System.out.println("Actual selected Product Name: "+ actualSelectedProductName);
        String expectedProductName = productName();
        System.out.println("Expected Product Name: " + expectedProductName);
        CustomAssertions.isTextEqual(actualSelectedProductName, expectedProductName);

        String actualSelectedProductPrice=prices.get(selectedProduct-1);
        System.out.println("Actual selected Product Price: "+ actualSelectedProductPrice);
        String expectedProductPrice = productPrice();
        System.out.println("Expected Product Price: " + expectedProductPrice);
        CustomAssertions.isTextEqual(actualSelectedProductPrice, expectedProductPrice);

        String actualSelectedProductDescription=description.get(selectedProduct-1);
        System.out.println("Actual selected Product Description: "+ actualSelectedProductDescription);
        String expectedProductDescription = productDescription();
        System.out.println("Expected Product Description: " + expectedProductDescription);
        CustomAssertions.isTextEqual(actualSelectedProductDescription, expectedProductDescription);

        WebElement actualSelectedImage= images.get(selectedProduct-1);
        Thread.sleep(1000);
        boolean actualSelectedProductImage= isElementDisplayed(actualSelectedImage);
        CustomAssertions.isBooleanEqual(actualSelectedProductImage, true);
        System.out.println("Image Displayed");

    }

    public void addToCartButton() {
        CustomAssertions.isBooleanEqual(productAddToCartButton(),true);
        System.out.println("Button Displayed");
    }

    public void addToCartButtonClick(){
        new WebDriverWait(webDriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//a[@class='btn btn-success btn-lg']")));
        productPage.getBtnAddToCart().click();
    }

}
