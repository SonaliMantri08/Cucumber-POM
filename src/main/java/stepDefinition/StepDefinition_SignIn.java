package stepDefinition;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LandingPage;
import pages.SignInPage;
import testBase.TestBase;

public class StepDefinition_SignIn extends TestBase {

	LandingPage landingPage;
	SignInPage signInPage;
	HomePage homePage;

	@Given("^User open the landing page$")
	public void user_open_the_landing_page() {
		TestBase.initialization();
		System.out.println("User is on landing page");
	}

	@When("^User clicked the Sign in link$")
	public void user_clicked_the_Sign_in_link() {
		landingPage = new LandingPage();
		signInPage = landingPage.click_SignIn();
		System.out.println("User clicked on sign in link");
	}

	@Then("^User navigated to sign in page$")
	public void user_navigated_to_sign_in_page() {
		Assert.assertEquals("Sign In | Indeed Accounts", signInPage.validatePage());
		System.out.println("User successfully navigated to sign in page");
	}

	@Given("^User is on Sign in page$")
	public void user_is_on_Sign_in_page() {
		Assert.assertEquals("Sign In", signInPage.getHeadingText());
		System.out.println("User is on Sign in page and views the Sign In heading");
	}

	@When("^User enters email and password$")
	public void user_enters_email_and_password() {
		signInPage.enter_Email(properties.getProperty("email"));
		System.out.println("Email id entered is : " + properties.getProperty("email"));
		signInPage.enter_Password(properties.getProperty("password"));
		System.out.println("Password entered is : " + properties.getProperty("password"));
	}

	@When("^User unselect Stay signed in checkbox$")
	public void user_unselect_Stay_signed_in_checkbox() {
		signInPage.unselect_stay_signed_in_checkbox();
		System.out.println("Checkbox unselected");
	}

	@When("^User click on Sign In button$")
	public void user_click_on_Sign_In_button() {
		homePage = signInPage.click_SignIn_Button();
		System.out.println("User clicked the Sign In button");
	}

	@Then("^User navigates to home page$")
	public void user_navigates_to_home_page() {
		homePage.user_Is_On_Home_Page();
	}
	
	@Then("^User closes the browser\\.$")
	public void user_closes_the_browser() {
	    TestBase.closeBrowser();
	}
}
