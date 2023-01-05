package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;
	
	//TestData
	
	String userName = "demo@techfios.com";
	String password = "abc123";

	@Test
	public void validUserShouldbeableToLogin() {

		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSignIn();
		
	}
}
