package pages;

import org.openqa.selenium.By;



public class LoginPage extends BasePage {
	
	
	
	public String LOGIN_URL = "https://ur-cv.com/login";
	public String PROFILE_URL = "https://ur-cv.com/dashboard/my-profile";
	public String MAIL_VALIDATION_TEXT = "Enter a valid email.";
	public String PASSWORD_VALIDATION_TEXT ="Your password is incorrect !";
	public String USER_NAME="kabbo@augnitive.com";
	public String PASSWORD="123456	";
	
	
	
	public By BACK_TO_HOME =By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/a[1]"); 
	public By EMAIL_FIELD = By.xpath("//input[@id='email']");
	public By CONTINUE_BUTTON = By.xpath("//button[contains(text(),'Continue')]");
	public By SIGN_IN_FACEBOOK =By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]/div[6]/div[1]/div[1]/div[1]/a[1]/img[1]");
	public By SIGN_IN_GOOGLE =By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]/div[6]/div[1]/div[1]/div[1]/a[2]/img[1]");
	public By CREATE_ACCOUNT =By.xpath("//a[contains(text(),'Create account')]");
	public By PASSWORD_FIELD = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/input[1]");
	public By RESET_CODE = By.xpath("//a[contains(text(),'Send me reset code')]");
	public By SIGN_IN_BUTTON =By.xpath("//button[contains(text(),'Sign in')]");
	public By SIGN_IN_LINK_BUTTON =By.xpath("//a[contains(text(),'Sign in')]");
	public By BACK_PREVIOUS =By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]/div[7]/button[1]");
	public By DYNAMIC_MAIL_TEXT = By.xpath("//span[contains(text(),'.com')]");
	public By MAIL_VALIDATION_LOCATOR = By.xpath("//span[contains(text(),'Enter a valid email.')]");
	public By PASSWORD_VALIDATION_LOCATOR =By.xpath("//span[contains(text(),'Your password is incorrect !')]");
	
	
	public void loginWithValidData(String username,String password) 
	{
		
		findElement(EMAIL_FIELD).sendKeys(username);
		clickOn(CONTINUE_BUTTON);
		findElement(PASSWORD_FIELD).sendKeys(password);
		clickOn(SIGN_IN_BUTTON);	
		
	}
	
	
	
}
