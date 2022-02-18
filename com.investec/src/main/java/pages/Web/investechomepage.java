package pages.Web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver_handlers.WebDriverHandler;

public class investechomepage extends WebDriverHandler {
	//Page Objects
    @FindBy(id = "search-toggler__cross") WebElement _searchbar;

    @FindBy(xpath = "//*[@id=\"search-toggle\"]/a/div") WebElement _searchbutton;

    //Initialize Page Objects
    public investechomepage() {
        PageFactory.initElements(driver, this);
    }

   /* //Perform action on Page Objects
    public void populatesearchbar() {
    	_searchbar.sendKeys(searchcriteria);
        //return _greetingMessage.getText();
    	
    }

    public void clicksearchbar() {

        _searchbutton.click();
        //return new clicksearchbar();
    }*/
}
