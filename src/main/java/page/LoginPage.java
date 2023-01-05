package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	//Element List
	
	@FindBy(how = How.XPATH,using ="//input[@id='username']" ) WebElement UserName_Element;
	@FindBy(how = How.XPATH,using ="//input[@id='password']" ) WebElement Password_Element;
	@FindBy(how = How.XPATH,using ="/html/body/div/div/div/form/div[3]/button") WebElement SignInButton_Element;
	


public void insertUserName(String username) {
	UserName_Element.sendKeys(" username");
}
  public void insertPassword(String password) {
	  Password_Element.sendKeys("password");
  }
  
  public void clickSignIn() {
	  SignInButton_Element.click();
  }
}