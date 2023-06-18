package testcases;

import org.testng.annotations.Test;

import pages.DashboardProfilePage;
import pages.LoginPage;
import utilities.BaseDriver;

public class DashboardProfilePageTestCases extends BaseDriver {
	
	DashboardProfilePage dashboardPofileObj = new DashboardProfilePage();
	LoginPage loginObj = new LoginPage();
	
	
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
	
	@Test
	public void uploadProfileImage() throws InterruptedException {
		getDriver().get(loginObj.LOGIN_URL);
		loginObj.loginWithValidData("ki@gmail.com","123456");
		Thread.sleep(2000);
		dashboardPofileObj.findElement(dashboardPofileObj.PERSONAL_INFO_PROFILE_IMAGE_UPLOAD_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PEROSNAL_INFO_IMAGE_LOAD_BUTTON).click();
		Thread.sleep(1000);
		dashboardPofileObj.findElement(dashboardPofileObj.PEROSNAL_INFO_IMAGE_LOAD_BUTTON).sendKeys("C:\\Users\\Apurbo Kabbo\\Documents\\workspace-spring-tool-suite-4-4.8.0.RELEASE\\Ur_Cv\\profile_Image.jpg");
		Thread.sleep(1000);
		
		
		
	}
	

}
