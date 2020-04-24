package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.TestBase;

public class LandingPage extends TestBase {
	
	/********** Initializing Page Objects **********/

	public LandingPage() {
		PageFactory.initElements(driver, this);
	}

	/********** PageFactory or Object Repository **********/

	@FindBy(className = "gnav-LoggedOutAccountLink-text")
	WebElement signInLink;

	/********************** Actions  ***********************/

	public SignInPage click_SignIn() {
		signInLink.click();
		return new SignInPage();
	}
	
	
}