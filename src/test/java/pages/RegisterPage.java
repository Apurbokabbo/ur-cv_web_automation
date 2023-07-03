package pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage{
	
	public String REGISTER_URL ="https://ur-cv.com/register";
	public String REGISTER_MY_PROFILE_URL ="https://ur-cv.com/dashboard/my-profile";
	public String MAIL_VALIDATION_TEXT="Enter a valid email.";
	public String EXISTING_MAIL_VALIDATION_TEXT="Email already exists.";
	public String CREATE_ACCOUNT_SUGGESTION_TEXT="You no need to remember different password for this app. Just use google"; 
	public String NAME_FIELD_VALIDATION_TEXT="The name field is required";
	public String PHONE_FIELD_VALIDATION_TEXT ="Phone number is required.";
	public String PHONE_FIELD_INVALID_VALIDATION_TEXT ="Invalid phone number.";
	public String PASSWORD_VALIDATION_INVALID_TEXT="The password field must be at least 6 characters";
	public String PASSWORD_VALIDATION_TEXT="The password field is required";
	public String USER_NAME="Test Id";
	public String Password="123456";
	public String Mail="kii@gmail.com";
	
	
	
	public By BACK_TO_HOME = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/a[1]");
	public By EMAIL_INPUT_FIELD =By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/input[1]");
	public By EMAIL_VALIDATION_TEXT_LOCATOR= By.xpath("//span[contains(text(),'Enter a valid email.')]");
	public By CONTINUE_BUTTON = By.xpath("//button[contains(text(),'Continue')]");
	public By CREATE_ACCOUNT_FACEBOOK= By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]");
	public By CREATE_ACCOUNT_GOOGLE = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/a[2]/img[1]");
	public By SIGN_IN_BUTTON = By.xpath("//a[contains(text(),'Sign in')]");
	public By GIVEN_MAIL_LOCATOR=By.xpath("//h3[contains(text(),'.com')]");
	public By LOGIN_WITH_GOOGLE=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]/div[3]/a[1]");
	public By CREATE_ACCOUNT_SUGGESTION_TEXT_LOCATOR=By.xpath("//p[contains(text(),'You no need to remember different password for thi')]");
	public By CREATE_ACCOUNT_WITH_PASSWORD=By.xpath("//button[contains(text(),'Create account with password')]");
	public By NAME_INPUT_FIELD=By.xpath("//input[@id='name']");
	public By NAME_FIELD_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The name field is required')]");
	public By PHONE_INPUT_FIELD=By.xpath("//input[@id='phone']");
	public By PHONE_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'Phone number is required.')]");
	public By PHONE_VALIDATION_INVALID_LOCATOR=By.xpath("//span[contains(text(),'Invalid phone number.')]");
	public By PASSWORD_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/input[1]");
	public By PASSWORD_VALIDATION_INVALID_LOCATOR=By.xpath("//span[contains(text(),'The password field must be at least 6 characters')]");
	public By PASSWORD_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The password field is required')]");
	public By PASSWORD_EYE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/span[1]");
	public By TERMS_CONDITION_CHECKBOX=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[4]/div[1]/input[1]");
	public By TERMS_CONDTION_LINK=By.xpath("//a[contains(text(),'terms & conditions')]");
	public By CREATE_ACCOUNT_BUTTON=By.xpath("//button[contains(text(),'Create account')]");
	public By EXISITING_MAIL_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'Email already exists.')]");
	
	public void registerWithValidDataCreateNewUsers(String email, String name,String phone ,String password) throws InterruptedException {	
		
		findElement(EMAIL_INPUT_FIELD).sendKeys(email);
		findElement(CONTINUE_BUTTON).click();
		Thread.sleep(1000);
		findElement(CREATE_ACCOUNT_WITH_PASSWORD).click();
		findElement(NAME_INPUT_FIELD).sendKeys(name);
		findElement(PHONE_INPUT_FIELD).sendKeys(phone);
		findElement(PASSWORD_INPUT_FIELD).sendKeys(password);
		Thread.sleep(2000);
		clickOn(CREATE_ACCOUNT_BUTTON);
		
		
	}
	

}
