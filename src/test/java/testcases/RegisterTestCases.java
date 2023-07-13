package testcases;

import org.testng.annotations.Test;

import pages.CartPage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.TemplatesPage;
import utilities.BaseDriver;

public class RegisterTestCases extends BaseDriver {

	RegisterPage registerPage = new RegisterPage();
	TemplatesPage templatePage = new TemplatesPage();
	CartPage cartPage = new CartPage();
	LoginPage loginPage = new LoginPage();

	@Test
	public void registerWithValidData() throws InterruptedException {

		getDriver().get(registerPage.REGISTER_URL);
		registerPage.registerWithValidDataCreateNewUsers(registerPage.MAIL, "A1", "01502000000", registerPage.PASSWORD);
		Thread.sleep(2000);
		registerPage.assertionURL(registerPage.REGISTER_MY_PROFILE_URL);

	}

	@Test
	public void registerWithExistingUserMail() throws InterruptedException {
		getDriver().get(registerPage.REGISTER_URL);
		Thread.sleep(1000);
		registerPage.findElement(registerPage.EMAIL_INPUT_FIELD).sendKeys("kabbo@augnitive.com");
		registerPage.findElement(registerPage.CONTINUE_BUTTON).click();
		registerPage.assertionHard(registerPage.EXISITING_MAIL_VALIDATION_LOCATOR,
				registerPage.EXISTING_MAIL_VALIDATION_TEXT);
		Thread.sleep(1000);

	}

	@Test
	public void registerWithInvalidEmailFormat() throws InterruptedException {
		getDriver().get(registerPage.REGISTER_URL);
		Thread.sleep(1000);
		registerPage.findElement(registerPage.EMAIL_INPUT_FIELD).sendKeys("a!Q@.....com");
		registerPage.findElement(registerPage.CONTINUE_BUTTON).click();
		registerPage.assertionHard(registerPage.EMAIL_VALIDATION_TEXT_LOCATOR, registerPage.MAIL_VALIDATION_TEXT);
		Thread.sleep(1000);

	}

	@Test
	public void registerPageSigninButtonTest() throws InterruptedException {
		getDriver().get(registerPage.REGISTER_URL);
		Thread.sleep(1000);
		registerPage.findElement(registerPage.SIGN_IN_BUTTON).click();
		Thread.sleep(1000);
		registerPage.assertionURL("https://ur-cv.com/login");
		Thread.sleep(1000);

	}

	@Test
	public void registerPageBacktoHomeButtonTest() throws InterruptedException {
		getDriver().get(registerPage.REGISTER_URL);
		Thread.sleep(1000);
		registerPage.findElement(registerPage.BACK_TO_HOME).click();
		Thread.sleep(1000);
		registerPage.assertionURL(registerPage.BASE_URL);
		Thread.sleep(1000);

	}

	@Test
	public void registerPageValidationtextsVerify() throws InterruptedException {
		getDriver().get(registerPage.REGISTER_URL);
		registerPage.findElement(registerPage.EMAIL_INPUT_FIELD).sendKeys("ki00@gmail.com");
		registerPage.findElement(registerPage.CONTINUE_BUTTON).click();
		Thread.sleep(1000);
		registerPage.findElement(registerPage.CREATE_ACCOUNT_WITH_PASSWORD).click();
		Thread.sleep(1000);
		registerPage.findElement(registerPage.CREATE_ACCOUNT_BUTTON).click();
		Thread.sleep(1000);
		registerPage.assertionHard(registerPage.NAME_FIELD_VALIDATION_LOCATOR, registerPage.NAME_FIELD_VALIDATION_TEXT);
		Thread.sleep(1000);
		registerPage.assertionHard(registerPage.PHONE_VALIDATION_LOCATOR, registerPage.PHONE_FIELD_VALIDATION_TEXT);
		Thread.sleep(1000);
		registerPage.assertionHard(registerPage.PASSWORD_VALIDATION_LOCATOR, registerPage.PASSWORD_VALIDATION_TEXT);
		Thread.sleep(1000);

	}

	@Test
	public void registerPageTermsandConditionLinkcheck() throws InterruptedException {
		getDriver().get(registerPage.REGISTER_URL);
		registerPage.findElement(registerPage.EMAIL_INPUT_FIELD).sendKeys("ki00@gmail.com");
		registerPage.findElement(registerPage.CONTINUE_BUTTON).click();
		Thread.sleep(1000);
		registerPage.findElement(registerPage.CREATE_ACCOUNT_WITH_PASSWORD).click();
		Thread.sleep(1000);
		registerPage.findElement(registerPage.TERMS_CONDTION_LINK).click();
		Thread.sleep(1000);
		registerPage.windowSwitch(1);
		registerPage.assertionURL("https://ur-cv.com/terms-and-condition");
		Thread.sleep(1000);
		registerPage.windowSwitch(0);
		registerPage.assertionURL(registerPage.REGISTER_URL);
		Thread.sleep(1000);
	}

	@Test
	public void registerPageTermsandConditionSelectDeselect() throws InterruptedException {
		getDriver().get(registerPage.REGISTER_URL);
		registerPage.findElement(registerPage.EMAIL_INPUT_FIELD).sendKeys("ki00@gmail.com");
		registerPage.findElement(registerPage.CONTINUE_BUTTON).click();
		Thread.sleep(1000);
		registerPage.findElement(registerPage.CREATE_ACCOUNT_WITH_PASSWORD).click();
		Thread.sleep(1000);
		registerPage.findElement(registerPage.TERMS_CONDITION_CHECKBOX).click();
		Thread.sleep(1000);
		registerPage.findElement(registerPage.TERMS_CONDITION_CHECKBOX).click();
		Thread.sleep(1000);

	}

	@Test
	public void registerInvalidDataVerify() throws InterruptedException {
		getDriver().get(registerPage.REGISTER_URL);
		registerPage.findElement(registerPage.EMAIL_INPUT_FIELD).sendKeys("ki00@gmail.com");
		registerPage.findElement(registerPage.CONTINUE_BUTTON).click();
		Thread.sleep(1000);
		registerPage.findElement(registerPage.CREATE_ACCOUNT_WITH_PASSWORD).click();
		Thread.sleep(1000);
		registerPage.findElement(registerPage.PHONE_INPUT_FIELD).sendKeys("001101");
		registerPage.findElement(registerPage.PASSWORD_INPUT_FIELD).sendKeys("123");
		registerPage.findElement(registerPage.CREATE_ACCOUNT_BUTTON).click();
		Thread.sleep(1000);
		registerPage.assertionHard(registerPage.PASSWORD_VALIDATION_INVALID_LOCATOR,
				registerPage.PASSWORD_VALIDATION_INVALID_TEXT);
		registerPage.assertionHard(registerPage.PHONE_VALIDATION_INVALID_LOCATOR,
				registerPage.PHONE_FIELD_INVALID_VALIDATION_TEXT);
		Thread.sleep(1000);
	}

	@Test
	public void registerFromCartPage() throws InterruptedException {

		getDriver().get(registerPage.BASE_URL);
		registerPage.findElement(registerPage.NAV_TEMPALTE_BUTTON).click();
		templatePage.findElement(templatePage.FIRST_TEMPLATE).click();
		Thread.sleep(1000);
		templatePage.findElement(templatePage.ADD_TO_CART_BUTTON).click();
		templatePage.findElement(templatePage.CHECK_OUT_BUTTON).click();
		Thread.sleep(1000);
		cartPage.findElement(cartPage.CHECKOUT_BUTTON).click();
		Thread.sleep(1000);
		loginPage.findElement(loginPage.CREATE_ACCOUNT).click();
		Thread.sleep(1000);
		registerPage.registerWithValidDataCreateNewUsers(registerPage.MAIL_CART_PAGE_REGISTRATION,"R1","01902020000",registerPage.PASSWORD); 
		Thread.sleep(2000);
		registerPage.assertionURL(cartPage.CART_URL);
		Thread.sleep(1000);

	}

}
