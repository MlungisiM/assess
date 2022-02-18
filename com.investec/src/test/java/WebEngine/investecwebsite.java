package WebEngine;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import driver_handlers.WebDriverHandler;
import pages.Web.Ebay_HomePage;
import pages.Web.Ebay_SellPage;
import pages.Web.investechomepage;

public class investecwebsite extends WebDriverHandler {
	String email = prop.getProperty("email");
	String scriteria = prop.getProperty("searchcriteria");
    investechomepage homePage;
    Ebay_SellPage sellPage;

    @BeforeClass
    public void investechomepage() {
        startBrowser();
        homePage = new investechomepage();
    }
    /*
    @AfterClass
    public void tearDown() {
        closeBrowser();
    }*/
}
