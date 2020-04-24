package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class SignInPage extends TestBase {

	/********** Initializing Page Objects **********/
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}

	/********** PageFactory or Object Repository **********/
	@FindBy(id = "login-email-input")
	WebElement email_id;

	@FindBy(id = "login-password-input")
	WebElement password;

	@FindBy(css = "input[id='login-rememberme-checkbox']")
	WebElement stay_Sign_In_Checkbox;

	@FindBy(id = "login-submit-button")
	WebElement signInButton;

	
	@FindBy(id="pageHeaderText")
	WebElement heading;
	/********************** Actions **********************/

	public void enter_Email(String email) {
		//email_id.sendKeys("john_doe1@mailinator.com");
		email_id.sendKeys(email);
	}

	public void enter_Password(String pwd) {
		password.sendKeys(pwd);	
	}

	public void unselect_stay_signed_in_checkbox() {
		stay_Sign_In_Checkbox.click();
	}

	public HomePage click_SignIn_Button() {
		signInButton.click();
		return new HomePage();
	}
	
	public String getHeadingText() {
		return heading.getText();
	}
	
	public String validatePage() {
		return driver.getTitle();
	}

}
