package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.TestBase;

public class HomePage extends TestBase {

	/********** Initializing Page Objects **********/

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	/********** PageFactory or Object Repository **********/

	/********************** Actions ***********************/

	public String validateTitle() {
		return driver.getTitle();
	}

	public void user_Is_On_Home_Page() {
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[aria-label='Toggle menu']")));
		Assert.assertEquals("Job Search | Indeed", new HomePage().validateTitle());
		System.out.println("Successful login--- User is on home page");
	}

}
