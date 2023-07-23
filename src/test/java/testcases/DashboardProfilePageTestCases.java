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
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(2000);
		dashboardPofileObj.assertionURL(dashboardPofileObj.PROFILE_PAGE_URL);

	}

	@Test
	public void profilePictureCloseButtonTest() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
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
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
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
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_EDIT_BUTTON).click();
		dashboardPofileObj.scrolldown();
		Thread.sleep(1000);
		dashboardPofileObj.keyboardSelectAll(dashboardPofileObj.PERSONAL_INFO_DESIGNATION_INPUT_FIELD);
		Thread.sleep(1000);
		dashboardPofileObj.keyboardBackspace();
		dashboardPofileObj.keyboardSelectAll(dashboardPofileObj.PERSONAL_INFO_MAILLING_ADDRESS_INPUT_FIELD);
		dashboardPofileObj.keyboardBackspace();
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_SAVE_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.assertionHard(dashboardPofileObj.PERSONAL_INFO_DESINATION_VALIDATION_LOCATOR,dashboardPofileObj.DESIGNATION_VALIDATION_TEXT);
		dashboardPofileObj.assertionHard(dashboardPofileObj.PERSONAL_INFO_MAILLING_ADDRESS_VALIDATION_LOCATOR,dashboardPofileObj.MAILING_ADDRESS_VALIDATION_TEXT);
		Thread.sleep(1000);
	}

	@Test
	public void personalInfoDesignationEditButtonVerify() throws InterruptedException {

		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		//loginObj.loginWithValidData("ki00000@gmail.com", registerPageObj.PASSWORD);
		Thread.sleep(1000);
		
		
		
		try 
		{
			String degisnation = dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_DESIGNATION_LOCATOR).getText();
			Thread.sleep(1000);
			
			if (degisnation.length()>0 && degisnation.length()!=21) 
			{
				System.out.println(degisnation);
				
			}
			
			else 
			{
				dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_DEGISNATION_EDIT_BUTTON).click();
				Thread.sleep(2000);
				
			}
			
		} 
		catch (Exception e) 
		{
			try 
			{
				dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_MAILLING_ADDRESS_EDIT_BUTTON).click();
				System.out.println("Test Case Failed !!!");

			} catch (Exception e1) {
				dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_CLOSE_BUTTON).click();
				Thread.sleep(1000);

			}
		}
	}

	@Test
	public void personalInfoMaillingAdressnEditButtonVerify() throws InterruptedException {

		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL ,registerPageObj.PASSWORD);
		Thread.sleep(2000);
		
		try 
		{
			
			String address = dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_ADDRESS_LOCATOR).getText();
			Thread.sleep(1000);
			
			if (address.length()>0 && address.length()!=24) 
			{
				System.out.println(address);
				
			}
			
			else 
			{
				dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_MAILLING_ADDRESS_EDIT_BUTTON).click();
				Thread.sleep(1000);
				
			}
			
		}
		
		catch (Exception e) {
			
			
			try 
			{
				dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_ADDRESS_EDIT_BUTTON).click();
				System.out.println("Test Case Failed !!!");

			} catch (Exception e1) {
				dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_CLOSE_BUTTON).click();
				Thread.sleep(1000);

			}
		}
		
	}

	@Test
	public void personalInfodesignationandmailingaddressAdd() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_EDIT_BUTTON).click();
		dashboardPofileObj.scrolldown();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_DESIGNATION_INPUT_FIELD).clear();
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_DESIGNATION_INPUT_FIELD).sendKeys(dashboardPofileObj.PERSONAL_INFO_DESIGNATION_SEARCH_KEY);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_SELECT_DESIGNATION).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_EMAIL_INPUT_FIELD).clear();
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_EMAIL_INPUT_FIELD).sendKeys(dashboardPofileObj.PERSONAL_INFO_ADDRESS_INPUT);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_SAVE_BUTTON).click();
		Thread.sleep(1000);

	}

	@Test
	public void personalInfoDesignationandMaillingAddressVerify() throws InterruptedException {

		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(2000);
		dashboardPofileObj.assertionHard(dashboardPofileObj.PERSONAL_INFO_SELECT_DESIGNATION, "SQA Engineer");
		dashboardPofileObj.assertionHard(dashboardPofileObj.PERSONAL_INFO_MAILLING_ADDRESS_LOCATOR_VERIFY,dashboardPofileObj.PERSONAL_INFO_ADDRESS_INPUT);
		Thread.sleep(1000);

	}

	@Test
	public void personalInfoMultiMailandNumbertest() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
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
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
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
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
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
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
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
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
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
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
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
		dashboardPofileObj.takeScreenShotAllureAttach("Toaster Message & Added Summary From Suggestion");
	}
	
	@Test
	public void workExperienceAddButtonTest () throws InterruptedException  {
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_ADD_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_CLOSE_BUTTON).click();
		
	}
	
	@Test
	public void workExperienceFirstModalValidationVerify() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_ADD_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_NEXT_BUTTON).click();
		Thread.sleep(500);
		dashboardPofileObj.takeScreenShotAllureAttach("Validation ScreenShot");
		Thread.sleep(500);
		dashboardPofileObj.assertionHard(dashboardPofileObj.WORK_EXPERIENCE_COMPANY_NAME_VALIDATION_LOCATOR, dashboardPofileObj.COMPANY_NAME_VALIDATION_TEXT);
		dashboardPofileObj.assertionHard(dashboardPofileObj.WORK_EXPERIENCE_JOB_TITTLE_VALIDATION_LOCATOR, dashboardPofileObj.JOB_TITTLE_VALIDATION_TEXT);
		dashboardPofileObj.assertionHard(dashboardPofileObj.WORK_EXPERIENCE_START_DATE_VALIDATION_LOCATOR, dashboardPofileObj.START_DATE_VALIDATION_TEXT);
		dashboardPofileObj.assertionHard(dashboardPofileObj.WORK_EXPERIENCE_LAST_DATE_VALIDATION_LOCATOR, dashboardPofileObj.LAST_DATE_VALIDATION_TEXT);
	}
	
	@Test
	public void workExperienceFirstModalValidDataAdd() throws InterruptedException{
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_ADD_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_PROFESSION_INPUT_FIELD).sendKeys(dashboardPofileObj.PERSONAL_INFO_DESIGNATION_SEARCH_KEY);
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_PROFESSION_INPUT_FIELD).sendKeys(" ");
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_PROFESSION_SELECTION_LOCATOR).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_ORGANIZATION_INPUT_FIELD).sendKeys(dashboardPofileObj.SKILL_INPUT_TEXT);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_JOIN_DATE_INPUT_FIELD).click();
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_JOINT_DATE_SELECT).click();
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_END_DATE_INPUT_FIELD).click();
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_END_DATE_SELECT).click();
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_NEXT_BUTTON).click();
		
	}
	
	@Test
	public void workExperienceAddWithValidData() throws InterruptedException{
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(1000);
		dashboardPofileObj.workExperienceAdd(dashboardPofileObj.WORK_EXPERIENCE_ADD_BUTTON);
		
	}
	

	@Test
	public void workExperienceWorkExperienceValidation() throws InterruptedException{
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_ADD_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_PROFESSION_INPUT_FIELD).sendKeys(dashboardPofileObj.PERSONAL_INFO_DESIGNATION_SEARCH_KEY);
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_PROFESSION_INPUT_FIELD).sendKeys(" ");
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_PROFESSION_SELECTION_LOCATOR).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_ORGANIZATION_INPUT_FIELD).sendKeys(dashboardPofileObj.SKILL_INPUT_TEXT);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_JOIN_DATE_INPUT_FIELD).click();
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_JOINT_DATE_SELECT).click();
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_END_DATE_INPUT_FIELD).click();
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_END_DATE_SELECT).click();
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_NEXT_BUTTON).click();
		Thread.sleep(13000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_SAVE_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.assertionHard(dashboardPofileObj.WORK_EXPERIENCE_VALIDATION_TEXT_LOCATOR, dashboardPofileObj.WORK_EXPERIENCE_VALIDATION_TEXT);
		dashboardPofileObj.takeScreenShotAllureAttach("Validation");
		
	}
	
	@Test
	public void workExperienceDelete() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(1000);
		dashboardPofileObj.delete(dashboardPofileObj.WORK_EXPERIENCE_DELETE_BUTTON);
		
	}
	
	@Test
	public void workExperienceEdit()  throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_EDIT_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_PROFESSION_EDIT_INPUT_FIELD).sendKeys(" update");
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_ORGANIZATION_EDIT_INPUT_FIELD).sendKeys(" update");
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_CURRENT_WORK_CHECKBOX).click();
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_NEXT_BUTTON).click();
		Thread.sleep(13000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_RESPONSIBILITIES_EDIT_INPUT_FIELD).sendKeys("Updated !!!!!!!!!!!!!!!!");;
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_SAVE_BUTTON).click();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void workExperienceAddingBackButtonVerify() throws InterruptedException{
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_ADD_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_PROFESSION_INPUT_FIELD).sendKeys(dashboardPofileObj.PERSONAL_INFO_DESIGNATION_SEARCH_KEY);
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_PROFESSION_INPUT_FIELD).sendKeys(" ");
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_PROFESSION_SELECTION_LOCATOR).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_ORGANIZATION_INPUT_FIELD).sendKeys(dashboardPofileObj.SKILL_INPUT_TEXT);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_JOIN_DATE_INPUT_FIELD).click();
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_JOINT_DATE_SELECT).click();
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_END_DATE_INPUT_FIELD).click();
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_END_DATE_SELECT).click();
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_NEXT_BUTTON).click();
		Thread.sleep(13000);
		
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_BACK_BUTTON_FROM_SECOND_MODAL_ADD).click();
		
		try {
			Thread.sleep(500);
			dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_NEXT_BUTTON).click();
			
			
		} 
		catch (Exception e) {
			System.out.println("Back button working properly");
			dashboardPofileObj.takeScreenShotAllureAttach("Back Button working");
		}
	}
	
	@Test
	public void workExperienceEditingBackButtonVerify() throws InterruptedException{
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_EDIT_BUTTON).click();
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_NEXT_BUTTON).click();
		Thread.sleep(13000);
		
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_BACK_BUTTON_FROM_SECOND_MODAL_EDIT).click();
		
		try {
			Thread.sleep(500);
			dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_NEXT_BUTTON).click();
			
			
		} 
		catch (Exception e) {
			System.out.println("Back button working properly");
			dashboardPofileObj.takeScreenShotAllureAttach("Back Button working");
		}
	}
	
	@Test
	public void workExperienceGetSuggestionCloseButtonVerify() throws InterruptedException {
		
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_EDIT_BUTTON).click();
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_NEXT_BUTTON).click();
		Thread.sleep(13000);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_SUGGESTION_CLOSE_BUTTON).click();
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_GET_SUGGESTION_BUTTON).click();
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.WORK_EXPERIENCE_SUGGESTION_CLOSE_BUTTON).click();
	}
	
	@Test
	public void educationAddButtonVerify() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(1000);
		
		try {
			dashboardPofileObj.findElement(dashboardPofileObj.EDUCATION_ADD_BUTTON).click();
			Thread.sleep(500);
			dashboardPofileObj.findElement(dashboardPofileObj.EDUCATION_CLOSE_BUTTON).click();
						
		} 
		catch (Exception e) {
			dashboardPofileObj.scrollingDownTillElementFound(dashboardPofileObj.EDUCATION_LOCATOR);
			dashboardPofileObj.findElement(dashboardPofileObj.EDUCATION_ADD_BUTTON).click();
			Thread.sleep(500);
			dashboardPofileObj.findElement(dashboardPofileObj.EDUCATION_CLOSE_BUTTON).click();
		}
		
	}
	
	
	@Test
	public void educationValidationVerify() throws InterruptedException{
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(1000);
		
		try {
			dashboardPofileObj.findElement(dashboardPofileObj.EDUCATION_ADD_BUTTON).click();
			Thread.sleep(500);
			dashboardPofileObj.scrolldown();
			dashboardPofileObj.scrolldown800();
			Thread.sleep(1000);
			dashboardPofileObj.findElement(dashboardPofileObj.EDUCATION_SAVE_BUTTON).click();
			Thread.sleep(1000);
			dashboardPofileObj.takeScreenShotAllureAttach("Validation!");
			dashboardPofileObj.assertionHard(dashboardPofileObj.EDUCATION_INSTITUTION_VALIDATION_LOCATOR,dashboardPofileObj.EDUCATION_INSTITUTION_VALIDATION_TEXT);
			dashboardPofileObj.assertionHard(dashboardPofileObj.EDUCATION_INSTITUTION_LOCATION_VALIDATION_LOCATOR,dashboardPofileObj.EDUCATION_INSTITUTION_LOCATION_VALIDATION_TEXT);
			dashboardPofileObj.assertionHard(dashboardPofileObj.EDUCATION_INSTITUTION_DEGREE_VALIDATION_LOCATOR, dashboardPofileObj.EDUCATION_DEGREE_VALIDATION_TEXT);
			dashboardPofileObj.assertionHard(dashboardPofileObj.EDUCATION_INSTITUTION_RESULT_VALIDATION_LOCATOR, dashboardPofileObj.EDUCATION_RESULT_VALIDATION_TEXT);
			dashboardPofileObj.assertionHard(dashboardPofileObj.EDUCATION_START_DATE_VALIDATION_LOCATOR, dashboardPofileObj.START_DATE_VALIDATION_TEXT);
			dashboardPofileObj.assertionHard(dashboardPofileObj.EDUCATION_LAST_DATE_VALIDATION_LOCATOR, dashboardPofileObj.LAST_DATE_VALIDATION_TEXT);
			Thread.sleep(500);
		} 
		catch (Exception e) {
			dashboardPofileObj.scrollingDownTillElementFound(dashboardPofileObj.EDUCATION_LOCATOR);
			dashboardPofileObj.findElement(dashboardPofileObj.EDUCATION_ADD_BUTTON).click();
			Thread.sleep(500);
			dashboardPofileObj.scrolldown();
			dashboardPofileObj.scrolldown800();
			Thread.sleep(1000);
			dashboardPofileObj.findElement(dashboardPofileObj.EDUCATION_SAVE_BUTTON).click();
			Thread.sleep(1000);
			dashboardPofileObj.takeScreenShotAllureAttach("Validation!");
			dashboardPofileObj.assertionHard(dashboardPofileObj.EDUCATION_INSTITUTION_VALIDATION_LOCATOR,dashboardPofileObj.EDUCATION_INSTITUTION_VALIDATION_TEXT);
			dashboardPofileObj.assertionHard(dashboardPofileObj.EDUCATION_INSTITUTION_LOCATION_VALIDATION_LOCATOR,dashboardPofileObj.EDUCATION_INSTITUTION_LOCATION_VALIDATION_TEXT);
			dashboardPofileObj.assertionHard(dashboardPofileObj.EDUCATION_INSTITUTION_DEGREE_VALIDATION_LOCATOR, dashboardPofileObj.EDUCATION_DEGREE_VALIDATION_TEXT);
			dashboardPofileObj.assertionHard(dashboardPofileObj.EDUCATION_INSTITUTION_RESULT_VALIDATION_LOCATOR, dashboardPofileObj.EDUCATION_RESULT_VALIDATION_TEXT);
			dashboardPofileObj.assertionHard(dashboardPofileObj.EDUCATION_START_DATE_VALIDATION_LOCATOR, dashboardPofileObj.START_DATE_VALIDATION_TEXT);
			dashboardPofileObj.assertionHard(dashboardPofileObj.EDUCATION_LAST_DATE_VALIDATION_LOCATOR, dashboardPofileObj.LAST_DATE_VALIDATION_TEXT);
			Thread.sleep(500);
			
		}
		
		
	}
	
	@Test
	public void addEducationWithValidData() throws InterruptedException{
		
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(1000);
		dashboardPofileObj.addEducationValidData();
		
	}
	
	@Test
	public void educationUpdate() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.EDUCATION_EDIT_BUTTON).click();
		dashboardPofileObj.scrolldown800();
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.EDUCATION_INSTITUTION_NAME_INPUT_FIELD_UPDATE).sendKeys(" Updated");
		dashboardPofileObj.findElement(dashboardPofileObj.EDUCATION_INSTITUTION_LOCATION_INPUT_FIELD_UPDATE).sendKeys(" Updated");
		dashboardPofileObj.findElement(dashboardPofileObj.EDUCATION_DEGREE_INPUT_FIELD_UPDATE).sendKeys("Bsc updated");
		dashboardPofileObj.findElement(dashboardPofileObj.EDUCATION_FIELD_OF_STUDY_INPUT_FIELD_UPDATE).sendKeys("Cse Updated");
		dashboardPofileObj.findElement(dashboardPofileObj.EDUCATION_RESULT_INPUT_FIELD_UPDATE).sendKeys("3.20");
		dashboardPofileObj.scrolldown();
		Thread.sleep(500);
		dashboardPofileObj.findElement(dashboardPofileObj.EDUCATION_CURRENTLY_STUDY_CHECKBOX_UPDATE).click();
		dashboardPofileObj.scrolldown800();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.EDUCATION_UPDATE_BUTTON).click();
		
	}     
	
	@Test
	public void educationDelete() throws InterruptedException {
		
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.MAIL, registerPageObj.PASSWORD);
		Thread.sleep(1000);
		dashboardPofileObj.scrolldown800();
		Thread.sleep(500);
		dashboardPofileObj.delete(dashboardPofileObj.EDUCATION_DELETE_BUTTON);
		
	}
	
	
	
	

}
