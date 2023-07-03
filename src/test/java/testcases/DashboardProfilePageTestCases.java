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
		loginObj.loginWithValidData("ki@gmail.com","123456");
		Thread.sleep(2000);
		dashboardPofileObj.assertionURL(dashboardPofileObj.PROFILE_PAGE_URL);
		
	}
	
	@Test
	public void profilePictureCloseButtonTest() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		loginObj.loginWithValidData("ki@gmail.com","123456");
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
	
//	@Test // This test case is incomplete for image upload issue 
//	public void uploadProfileImage() throws InterruptedException {
//		getDriver().get(loginObj.LOGIN_URL);
//		String projectPath = System.getProperty("user.dir");
//		loginObj.loginWithValidData("ki@gmail.com","123456");
//		Thread.sleep(2000);
//		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_PROFILE_IMAGE_UPLOAD_BUTTON).click();
//		Thread.sleep(5000);
//		dashboardPofileObj.findElement(dashboardPofileObj.PEROSNAL_INFO_IMAGE_LOAD_BUTTON).sendKeys(projectPath+"\\files\\image1.jpg");
//		String imagePath = "C:\\Users\\Apurbo Kabbo\\Downloads\\image1.jpg";
//		((JavascriptExecutor) getDriver()).executeScript("arguments[0].value = arguments[1];", dashboardPofileObj.PEROSNAL_INFO_IMAGE_LOAD_BUTTON, imagePath);	
//		Thread.sleep(5000);
//		dashboardPofileObj.findElement(dashboardPofileObj.PEROSNAL_INFO_IMAGE_SAVE_BUTTON).click();
//	    Thread.sleep(1000);
//	    dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_IMAGE_UPLOIAD_MODAL_CLOSE_BUTTON).click();
//	    Thread.sleep(1000);
//			
//		
//	}
	
	@Test
	public void personalInfoValidationTest() throws InterruptedException {
		
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.Mail,registerPageObj.Password);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_EDIT_BUTTON).click();
		dashboardPofileObj.scrolldown();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_SAVE_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.assertionHard(dashboardPofileObj.PERSONAL_INFO_DESINATION_VALIDATION_LOCATOR, dashboardPofileObj.DESIGNATION_VALIDATION_TEXT);
		dashboardPofileObj.assertionHard(dashboardPofileObj.PERSONAL_INFO_MAILLING_ADDRESS_VALIDATION_LOCATOR, dashboardPofileObj.MAILING_ADDRESS_VALIDATION_TEXT);
		Thread.sleep(1000);
	}
	
	@Test
	public void personalInfoDesignationEditButtonVerify() throws InterruptedException {
		
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.Mail,registerPageObj.Password);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_ADDRESS_EDIT_BUTTON).click();
		Thread.sleep(1000);
		try {
			dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_MAILLING_ADDRESS_EDIT_BUTTON).click();
			System.out.println("Test Case Failed !!!");
			
		} 
		catch (Exception e) {
			dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_CLOSE_BUTTON).click();
			Thread.sleep(1000);
			
		}
	}
	
	@Test
	public void personalInfoMaillingAdressnEditButtonVerify() throws InterruptedException {
		
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.Mail,registerPageObj.Password);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_MAILLING_ADDRESS_EDIT_BUTTON).click();
		Thread.sleep(1000);
		try {
			dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_ADDRESS_EDIT_BUTTON).click();
			System.out.println("Test Case Failed !!!");
			
		} 
		catch (Exception e) {
			dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_CLOSE_BUTTON).click();
			Thread.sleep(1000);
			
		}
	}
	
	
	@Test
	public void personalInfodesignationandmailingaddressAdd() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.Mail,registerPageObj.Password);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_EDIT_BUTTON).click();
		dashboardPofileObj.scrolldown();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_DESIGNATION_INPUT_FIELD).sendKeys(dashboardPofileObj.PERSONAL_INFO_DESIGNATION_SEARCH_KEY);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_SELECT_DESIGNATION).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_EMAIL_INPUT_FIELD).sendKeys(dashboardPofileObj.PERSONAL_INFO_ADDRESS_INPUT);
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_SAVE_BUTTON).click();
		Thread.sleep(1000);
		
	}
	
	
	@Test
	public void personalInfoDesignationandMaillingAddressVeridy() throws InterruptedException {
		
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.Mail,registerPageObj.Password);
		Thread.sleep(2000);
		dashboardPofileObj.assertionHard(dashboardPofileObj.PERSONAL_INFO_SELECT_DESIGNATION,"SQA Engineer");
		dashboardPofileObj.assertionHard(dashboardPofileObj.PERSONAL_INFO_MAILLING_ADDRESS_LOCATOR_VERIFY,dashboardPofileObj.PERSONAL_INFO_ADDRESS_INPUT);
		Thread.sleep(1000);
		
	}
	
	
	@Test
	public void personalInfoMultiMailandNumbertest() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		Thread.sleep(1000);
		loginObj.loginWithValidData(registerPageObj.Mail,registerPageObj.Password);
		Thread.sleep(2000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_EDIT_BUTTON).click();
		dashboardPofileObj.scrolldown();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_EMAIL_PLUS_BUTTON).click();
		
			
	}
	
	
	
	

}
