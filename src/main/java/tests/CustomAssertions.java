package tests;

import org.testng.Assert;

public class CustomAssertions extends Assert {

    public static void isTextEqual (String expectedText, String actualText) {
        String errorMsg = "Text " + actualText + " is not as expected. Expected was: " + expectedText;
        Assert.assertEquals(actualText, expectedText, errorMsg);
    }

    public static void isElementDisplayed (boolean actual, Boolean expected) {
        String errorMsg =  "The element is not displayed Value:" + actual + " is not as expected. Expected was: " + expected;
        Assert.assertEquals(actual, expected, errorMsg);
    }


}

