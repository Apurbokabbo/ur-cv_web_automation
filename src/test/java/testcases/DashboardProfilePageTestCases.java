package testcases;
import org.testng.annotations.Test;
import pages.DashboardProfilePage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.BaseDriver;

public class DashboardProfilePageTestCases extends BaseDriver {

	DashboardProfilePage dashboardPofileObj = new DashboardProfilePage();
	LoginPage loginObj = new LoginPage();
	RegisterPage registerPageObj = new RegisterPage();

	@Test
	public void dashboardURLVerify() throws InterruptedException {

		getDriver().get(loginObj.LOGIN_URL);
		loginObj.loginWithValidData(registerPageObj.Mail, registerPageObj.Password);
		Thread.sleep(2000);
		dashboardPofileObj.assertionURL(dashboardPofileObj.PROFILE_PAGE_URL);

	}

	@Test
	public void profilePictureCloseButtonTest() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		loginObj.loginWithValidData(registerPageObj.Mail, registerPageObj.Password);
		Thread.sleep(2000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_PROFILE_IMAGE_UPLOAD_BUTTON).click();
		Thread.sleep(2000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_IMAGE_CLOSE_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_PROFILE_IMAGE_UPLOAD_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_IMAGE_CANCEL_BUTTON).click();
		Thread.sleep(1000);

	}

	@Test  
	public void uploadProfileImage() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		String projectPath = System.getProperty("user.dir");
		loginObj.loginWithValidData(registerPageObj.Mail, registerPageObj.Password);
		Thread.sleep(2000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_PROFILE_IMAGE_UPLOAD_BUTTON).click();
		Thread.sleep(2000);
		dashboardPofileObj.findElement(dashboardPofileObj.PEROSNAL_INFO_IMAGE_LOAD_BUTTON).sendKeys(projectPath+"\\files\\image1.jpg");
    	Thread.sleep(2000);
		dashboardPofileObj.findElement(dashboardPofileObj.PEROSNAL_INFO_IMAGE_SAVE_BUTTON).click();
	    Thread.sleep(1000);
	    dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_IMAGE_UPLOIAD_MODAL_CLOSE_BUTTON).click();
	    Thread.sleep(1000);
			
		
	}

	@Test
	public void personalInfoValidationTest() throws InterruptedException {

		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.Mail, registerPageObj.Password);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_EDIT_BUTTON).click();
		dashboardPofileObj.scrolldown();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_SAVE_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.assertionHard(dashboardPofileObj.PERSONAL_INFO_DESINATION_VALIDATION_LOCATOR,
				dashboardPofileObj.DESIGNATION_VALIDATION_TEXT);
		dashboardPofileObj.assertionHard(dashboardPofileObj.PERSONAL_INFO_MAILLING_ADDRESS_VALIDATION_LOCATOR,
				dashboardPofileObj.MAILING_ADDRESS_VALIDATION_TEXT);
		Thread.sleep(1000);
	}

	@Test
	public void personalInfoDesignationEditButtonVerify() throws InterruptedException {

		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.Mail, registerPageObj.Password);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_ADDRESS_EDIT_BUTTON).click();
		Thread.sleep(1000);
		try {
			dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_MAILLING_ADDRESS_EDIT_BUTTON).click();
			System.out.println("Test Case Failed !!!");

		} catch (Exception e) {
			dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_CLOSE_BUTTON).click();
			Thread.sleep(1000);

		}
	}

	@Test
	public void personalInfoMaillingAdressnEditButtonVerify() throws InterruptedException {

		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.Mail, registerPageObj.Password);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_MAILLING_ADDRESS_EDIT_BUTTON).click();
		Thread.sleep(1000);
		try {
			dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_ADDRESS_EDIT_BUTTON).click();
			System.out.println("Test Case Failed !!!");

		} catch (Exception e) {
			dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_CLOSE_BUTTON).click();
			Thread.sleep(1000);

		}
	}

	@Test
	public void personalInfodesignationandmailingaddressAdd() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.Mail, registerPageObj.Password);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_EDIT_BUTTON).click();
		dashboardPofileObj.scrolldown();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_DESIGNATION_INPUT_FIELD)
				.sendKeys(dashboardPofileObj.PERSONAL_INFO_DESIGNATION_SEARCH_KEY);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_SELECT_DESIGNATION).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_EMAIL_INPUT_FIELD)
				.sendKeys(dashboardPofileObj.PERSONAL_INFO_ADDRESS_INPUT);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_SAVE_BUTTON).click();
		Thread.sleep(1000);

	}

	@Test
	public void personalInfoDesignationandMaillingAddressVeridy() throws InterruptedException {

		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.Mail, registerPageObj.Password);
		Thread.sleep(2000);
		dashboardPofileObj.assertionHard(dashboardPofileObj.PERSONAL_INFO_SELECT_DESIGNATION, "SQA Engineer");
		dashboardPofileObj.assertionHard(dashboardPofileObj.PERSONAL_INFO_MAILLING_ADDRESS_LOCATOR_VERIFY,
				dashboardPofileObj.PERSONAL_INFO_ADDRESS_INPUT);
		Thread.sleep(1000);

	}

	@Test
	public void personalInfoMultiMailandNumbertest() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.Mail, registerPageObj.Password);
		Thread.sleep(2000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_EDIT_BUTTON).click();
		dashboardPofileObj.scrolldown();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_EMAIL_PLUS_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_MOBILE_PLUS_BUTTON).click();
		Thread.sleep(1000);

	}

	@Test
	public void personalSummaryEditButton() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.Mail, registerPageObj.Password);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_ADDorEDIT_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_GET_SUGGESTION_BUTTON).click();
	}

	@Test
	public void personalSummarymanualDataInputandVerify() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		String input = "Hello world !!! Hello world !!!Hello world !!!Hello world !!!Hello world !!!Hello world !!!";
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.Mail, registerPageObj.Password);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_ADDorEDIT_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_INPUT_FIELD).clear();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_INPUT_FIELD).sendKeys(input);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_SAVE_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_ADDorEDIT_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.assertionHard(dashboardPofileObj.PERSONAL_SUMMARY_INPUT_FIELD, input);

	}

	@Test
	public void personalSummrySuggestionClosebuttonVerify() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.Mail, registerPageObj.Password);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_ADDorEDIT_BUTTON).click();
		Thread.sleep(1000);
		//System.out.println(dashboardPofileObj.findElement(By.xpath("//p[contains(text(),'Suggestion for')]")).getText());
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_SUGGESTION_CLOSE_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_GET_SUGGESTION_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_SUGGESTION_CLOSE_BUTTON).click();
	}

	@Test
	public void personalSummarySegguestion() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.Mail, registerPageObj.Password);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_ADDorEDIT_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_SUGGESTION_INPUT_FIELD).sendKeys(dashboardPofileObj.PERSONAL_INFO_DESIGNATION_SEARCH_KEY);
		Thread.sleep(3000);
	}
	
	
	@Test
	public void personalSummaryAddFromSegguestion() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.Mail, registerPageObj.Password);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_ADDorEDIT_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_INPUT_FIELD).clear();
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_SUGGESTION_INPUT_FIELD).sendKeys("SQA Engineer");
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_SUGGESTION_INPUT_FIELD).sendKeys(" ");
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_SUGGESTION_PROFESSION_SELECT_LOCATOR).click();
		Thread.sleep(10000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_SUGGESTION_SELECT_LOCATOR).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_SUMMARY_SAVE_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.takeScreenShotAllureAttach("Test Screenhot");
	}
	
	

}
