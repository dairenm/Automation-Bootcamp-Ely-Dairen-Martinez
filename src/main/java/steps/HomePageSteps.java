package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.HomePage;
import java.time.Duration;
import java.util.Random;

public class HomePageSteps extends BaseSteps{

    HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);

    public HomePageSteps(WebDriver webDriver) { super(webDriver); }


    public String selectPhoneCategorie() {
        return getElementText(homePage.getTxtFirstCategorie());
    }

    public String selectLaptopCategorie() {
        return getElementText(homePage.getTxtSecondCategorie());
    }

    public String selectMonitorCategorie() {
        return getElementText(homePage.getTxtThirdCategorie());
    }

    public int selectProduct() { // Randomly select a product on the page
        new WebDriverWait(webDriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//a[@href='prod.html?idp_=1']")));
        int expectedProduct = Integer.parseInt(String.valueOf(1));

        Random rand = new Random();
        switch(rand.nextInt(8)+1)
        {
            case 1:
                homePage.getTxtFirstProduct().click();
                expectedProduct = 1;
                System.out.println("First product selected: "+ expectedProduct);
                break;
            case 2:
                homePage.getTxtSecondProduct().click();
                expectedProduct = 2;
                System.out.println("Second product selected: " + expectedProduct);
                break;
            case 3:
                homePage.getTxtThirdProduct().click();
                expectedProduct = 3;
                System.out.println("Third product selected: " + expectedProduct);
                break;
            case 4:
                homePage.getTxtFourthProduct().click();
                expectedProduct = 4;
                System.out.println("Fourth product selected: " + expectedProduct);
                break;
            case 5:
                homePage.getTxtFifthProduct().click();
                expectedProduct = 5;
                System.out.println("Fifth product selected: " + expectedProduct);
                break;
            case 6:
                homePage.getTxtSixthProduct().click();
                expectedProduct = 6;
                System.out.println("Sixth product selected: " + expectedProduct);
                break;
            case 7:
                homePage.getTxtSeventhProduct().click();
                expectedProduct = 7;
                System.out.println("Seventh product selected: " + expectedProduct);
                break;
            case 8:
                homePage.getTxtEightProduct().click();
                expectedProduct = 8;
                System.out.println("Eight product selected: " + expectedProduct);
                break;
            case 9:
                homePage.getTxtNinthProduct().click();
                expectedProduct = 9;
                System.out.println("Ninth product selected: " + expectedProduct);
                break;
        }
        return expectedProduct;
    }
}
