package tests;

import org.testng.Assert;

public class CustomAssertions extends Assert {
    public static void isElementDisplayed (Boolean isElementDisplayed, String view, String url) {
        String errorMessage = "The element is not displayed "
                + " in " + url + " and in view " + view;
        System.out.println(errorMessage); //This error messages will be logged to a log file whenever is configured
        Assert.assertTrue(isElementDisplayed, errorMessage);
    }

    public static void isURLValid (String expectedURL, String currentURL) {
        String errorMessage = "URL " + currentURL + " is not as expected. Expected was: " + expectedURL;
        System.out.println(errorMessage);
        Assert.assertEquals(currentURL, expectedURL, errorMessage);
    }

    public static void isTitleValid (String expectedTitle, String actualTitle) {
        String errorMsg = "The title is not as expected. Expected: " + expectedTitle + ", got: " + actualTitle;
        Assert.assertEquals(actualTitle, expectedTitle, errorMsg);
    }

    public static void isTitleValidNegative (String expectedTitle, String actualTitle) {
        String errorMsg = "The title is not as expected. Expected: " + expectedTitle + ", got: " + actualTitle;
        Assert.assertNotEquals(actualTitle, expectedTitle, errorMsg);
    }

    public static void isTextEqual (String expectedText, String actualText) {
        String errorMsg = "Text " + actualText + " is not as expected. Expected was: " + expectedText;
        Assert.assertEquals(actualText, expectedText, errorMsg);
    }


    public static void isBooleanEqual (boolean actual, Boolean expected) {
        String errorMsg = "Value " + actual + " is not as expected. Expected was: " + expected;
        Assert.assertEquals(actual, expected, errorMsg);
    }


}

