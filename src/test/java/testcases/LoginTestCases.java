package testcases;

import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.TemplatesPage;
import utilities.BaseDriver;

public class LoginTestCases extends BaseDriver {
	
	LoginPage logInPage = new LoginPage();
	TemplatesPage templatePage= new TemplatesPage();
	CartPage cartPage= new CartPage();
	RegisterPage registerPage = new RegisterPage();
	

	
	@Test	
	public void loginSccuessWithValidData() throws InterruptedException {
		
		getDriver().get(logInPage.LOGIN_URL);
		logInPage.loginWithValidData(logInPage.USER_NAME, logInPage.PASSWORD);
		Thread.sleep(3000);

	}
	
	
	
	@Test
	public void loginWithWrongPassword() throws InterruptedException {
		
		getDriver().get(logInPage.LOGIN_URL);
		logInPage.loginWithValidData(logInPage.USER_NAME,"1234789");
		Thread.sleep(2000);
		logInPage.assertionHard(logInPage.PASSWORD_VALIDATION_LOCATOR,logInPage.PASSWORD_VALIDATION_TEXT);
		Thread.sleep(2000);
		
	}
	
	@Test
	public void loginWithInvalidMailFormat() throws InterruptedException {
		getDriver().get(logInPage.LOGIN_URL);
		logInPage.findElement(logInPage.EMAIL_FIELD).sendKeys("ab3434422");
		logInPage.findElement(logInPage.CONTINUE_BUTTON).click();
		Thread.sleep(2000);
		logInPage.assertionHard(logInPage.MAIL_VALIDATION_LOCATOR, logInPage.MAIL_VALIDATION_TEXT);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void loginFromCartPageUrlVerify() throws InterruptedException{
		getDriver().get(templatePage.TEMPLATES_URL);
		templatePage.findElement(templatePage.FIRST_TEMPLATE).click();
		templatePage.findElement(templatePage.ADD_TO_CART_BUTTON).click();
		Thread.sleep(1000);
		templatePage.findElement(templatePage.CHECK_OUT_BUTTON).click();
		Thread.sleep(1000);
		cartPage.findElement(cartPage.CHECKOUT_BUTTON).click();
		logInPage.loginWithValidData(logInPage.USER_NAME, logInPage.PASSWORD);
		Thread.sleep(1000);
		logInPage.assertionURL(cartPage.CART_URL);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void loginButtonTestFromNav() throws InterruptedException{
		getDriver().get(logInPage.BASE_URL);
		logInPage.findElement(logInPage.NAV_LOGIN_BUTTON).click();
		Thread.sleep(1000);
		logInPage.assertionURL(logInPage.LOGIN_URL);		
		
	}
	
	@Test
	public void loginPageBackButtonTestFromEmailPage() throws InterruptedException{
		getDriver().get(logInPage.BASE_URL);
		logInPage.findElement(logInPage.NAV_LOGIN_BUTTON).click();
		Thread.sleep(1000);
		logInPage.findElement(logInPage.BACK_TO_HOME).click();
		Thread.sleep(1000);
		logInPage.assertionURL(logInPage.BASE_URL);
		
	}
	
	@Test
	public void loginPageBackButtonTestFromPasswordPage() throws InterruptedException{
		getDriver().get(logInPage.BASE_URL);
		logInPage.findElement(logInPage.NAV_LOGIN_BUTTON).click();
		Thread.sleep(1000);
		logInPage.findElement(logInPage.EMAIL_FIELD).sendKeys(logInPage.USER_NAME);
		logInPage.findElement(logInPage.CONTINUE_BUTTON).click();
		Thread.sleep(2000);
		logInPage.findElement(logInPage.BACK_TO_HOME).click();
		Thread.sleep(1000);
		logInPage.assertionURL(logInPage.BASE_URL);
		
	}
	
	
	@Test
	public void loginPagePreviousBackButtonTestFromPasswordPage() throws InterruptedException{
		getDriver().get(logInPage.BASE_URL);
		logInPage.findElement(logInPage.NAV_LOGIN_BUTTON).click();
		Thread.sleep(1000);
		logInPage.findElement(logInPage.EMAIL_FIELD).sendKeys(logInPage.USER_NAME);
		logInPage.findElement(logInPage.CONTINUE_BUTTON).click();
		Thread.sleep(2000);
		logInPage.findElement(logInPage.BACK_PREVIOUS).click();
		Thread.sleep(1000);
		logInPage.findElement(logInPage.CONTINUE_BUTTON).click();
		
	}
	
	@Test
	public void loginPageForgetPasswordButtonTest() throws InterruptedException{
		getDriver().get(logInPage.BASE_URL);
		logInPage.findElement(logInPage.NAV_LOGIN_BUTTON).click();
		Thread.sleep(1000);
		logInPage.findElement(logInPage.EMAIL_FIELD).sendKeys(logInPage.USER_NAME);
		logInPage.findElement(logInPage.CONTINUE_BUTTON).click();
		Thread.sleep(2000);
		logInPage.findElement(logInPage.RESET_CODE).click();
		Thread.sleep(1000);
		
	}
	
	@Test
	public void loginPageCreateAccountButtonTest() throws InterruptedException{
		getDriver().get(logInPage.BASE_URL);
		logInPage.findElement(logInPage.NAV_LOGIN_BUTTON).click();
		Thread.sleep(1000);
		logInPage.findElement(logInPage.CREATE_ACCOUNT).click();
		Thread.sleep(1000);
		logInPage.assertionURL(registerPage.REGISTER_URL);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void loginPageCreateAccountButtonTestFromPasswordField() throws InterruptedException{
		getDriver().get(logInPage.BASE_URL);
		logInPage.findElement(logInPage.NAV_LOGIN_BUTTON).click();
		Thread.sleep(1000);
		logInPage.findElement(logInPage.EMAIL_FIELD).sendKeys(logInPage.USER_NAME);
		logInPage.findElement(logInPage.CONTINUE_BUTTON).click();
		logInPage.findElement(logInPage.CREATE_ACCOUNT).click();
		Thread.sleep(1000);
		logInPage.assertionURL(registerPage.REGISTER_URL);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void loginPageSignInButtonTest() throws InterruptedException {
		
		getDriver().get(logInPage.LOGIN_URL);
		logInPage.findElement(logInPage.CREATE_ACCOUNT).click();
		Thread.sleep(1000);
		logInPage.assertionURL(registerPage.REGISTER_URL);
		logInPage.findElement(logInPage.SIGN_IN_LINK_BUTTON).click();	
		Thread.sleep(1000);
		logInPage.assertionURL(logInPage.LOGIN_URL);
	}
	
	@Test
	public void loginUsingKeyboardEnterButton() throws InterruptedException {
		getDriver().get(logInPage.LOGIN_URL);
		logInPage.findElement(logInPage.EMAIL_FIELD).sendKeys(logInPage.USER_NAME);
		Thread.sleep(1000);
		logInPage.tabOnEnterOnKeyboard();
		Thread.sleep(1000);
		logInPage.findElement(logInPage.PASSWORD_FIELD).sendKeys(logInPage.PASSWORD);
		Thread.sleep(1000);
		logInPage.tabOnEnterOnKeyboard();
		Thread.sleep(1000);
		logInPage.assertionURL(logInPage.PROFILE_URL);
		Thread.sleep(1000);
	}
	

}
