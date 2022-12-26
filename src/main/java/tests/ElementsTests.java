package tests;

import steps.*;
import org.testng.annotations.Test;


public class ElementsTests extends BaseTest {
    HomePageSteps homePageSteps = new HomePageSteps(driver);
    ProductPageSteps productPageSteps = new ProductPageSteps(driver);


    @Test(description = "SR-12111 Verify categories on the home page",groups = "SmokeSuite")
    public void testVerifiedCategories() {
        String phoneCategorie = homePageSteps.selectPhoneCategorie();
        String laptopCategorie = homePageSteps.selectLaptopCategorie();
        String monitorCategorie = homePageSteps.selectMonitorCategorie();
        CustomAssertions.isTextEqual("Phones", phoneCategorie);
        CustomAssertions.isTextEqual("Laptops", laptopCategorie);
        CustomAssertions.isTextEqual("Monitors", monitorCategorie);
    }

    @Test(description = "SR-12120 Verify the items of any product in the catalog")
    public void testCatalogDisplayed() throws InterruptedException {
        productPageSteps.verifyProductElements();
        productPageSteps.verifyAddToCartButton();
    }

    @Test(description ="SR-12121 Verify the elements of the alert by clicking the Add to cart button")
    public void testAlertAddToCartButton() throws InterruptedException {
        homePageSteps.selectProduct();
        productPageSteps.addToCartButtonClick();
        String browserAlert=productPageSteps.browserTextAlert();
        CustomAssertions.isTextEqual("Product added", browserAlert);
        productPageSteps.browserBtnAlert();
    }

}