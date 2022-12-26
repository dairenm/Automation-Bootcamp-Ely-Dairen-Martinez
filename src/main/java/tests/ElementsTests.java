package tests;

import steps.*;
import org.testng.annotations.Test;


public class ElementsTests extends BaseTest {
    HomePageSteps homePageSteps = new HomePageSteps(driver);
    ProductPageSteps productPageSteps = new ProductPageSteps(driver);


    @Test(description = "SR-12111 Verify categories",groups = "SmokeSuite")
    public void testVerifiedCategories() {
        String phoneCategorie = homePageSteps.selectPhoneCategorie();
        String laptopCategorie = homePageSteps.selectLaptopCategorie();
        String monitorCategorie = homePageSteps.selectMonitorCategorie();
        CustomAssertions.isTextEqual("Phones", phoneCategorie);
        CustomAssertions.isTextEqual("Laptops", laptopCategorie);
        CustomAssertions.isTextEqual("Monitors", monitorCategorie);
    }

    @Test(description = "SR-12120 Verify products in the catalog displayed")
    public void testCatalogDisplayed() throws InterruptedException {
        productPageSteps.productElements();
        productPageSteps.addToCartButton();
    }

    @Test(description ="SR-12121 Verify the alert by clicking the add to cart button")
    public void testAlertAddToCartButton() throws InterruptedException {
        homePageSteps.selectProduct();
        productPageSteps.addToCartButtonClick();
        String browserAlert=productPageSteps.browserTextAlert();
        print("View option is: " + browserAlert);
        CustomAssertions.isTextEqual("Product added", browserAlert);
        productPageSteps.browserBtnAlert();
    }

}