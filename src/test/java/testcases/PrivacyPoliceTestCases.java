package testcases;

import org.testng.annotations.Test;

import pages.PrivacyPolicePage;
import utilities.BaseDriver;

public class PrivacyPoliceTestCases extends BaseDriver {
	
	PrivacyPolicePage privacyPoliceObj = new PrivacyPolicePage();
	
	@Test
	public void urlVerifyFromHomePage() throws InterruptedException {
		getDriver().get(privacyPoliceObj.BASE_URL);
		Thread.sleep(1000);
		privacyPoliceObj.scrollingDownTillElementFound(privacyPoliceObj.FOOTER_PRIVACY_POLICIES_LOCATOR);
		Thread.sleep(2000);
		privacyPoliceObj.findElement(privacyPoliceObj.FOOTER_PRIVACY_POLICIES_LOCATOR).click();
		Thread.sleep(3000);
		privacyPoliceObj.assertionURL(privacyPoliceObj.PrivacyPolice_URL);
		Thread.sleep(1000);
		privacyPoliceObj.findElement(privacyPoliceObj.BACK_BUTTON_LOCATOR).click();
		Thread.sleep(2000);
		privacyPoliceObj.assertionURL(privacyPoliceObj.BASE_URL);
		
		
	}
	
	@Test
	public void overviewBodyTextPart1Verify() throws InterruptedException{
		getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
		
		privacyPoliceObj.assertionMethod(privacyPoliceObj.OVERVIEW_BUTTON_LOCATOR, privacyPoliceObj.OVERVIEW_TEXT_PART_1_LOCATOR, privacyPoliceObj.OVERVIEW_TEXT_PART_1);
		
	}
	
	@Test
	public void overviewBodyTextPart2Verify() throws InterruptedException{
		getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
		
		privacyPoliceObj.assertionMethod(privacyPoliceObj.OVERVIEW_BUTTON_LOCATOR, privacyPoliceObj.OVERVIEW_TEXT_PART_2_LOCATOR, privacyPoliceObj.OVERVIEW_TEXT_PART_2);
		
	}
	
	@Test
	public void overviewBodyTextPart3Verify() throws InterruptedException{
		getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
		
		privacyPoliceObj.assertionMethod(privacyPoliceObj.OVERVIEW_BUTTON_LOCATOR, privacyPoliceObj.OVERVIEW_TEXT_PART_3_LOCATOR, privacyPoliceObj.OVERVIEW_TEXT_PART_3);
		
	}
	
	@Test
	public void contenttittletextVerify() throws InterruptedException{
		getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
		
		privacyPoliceObj.assertionMethod(privacyPoliceObj.CONSENT_BUTTON_LOCATOR, privacyPoliceObj.CONSENT_TITTLE_LOCATOR, privacyPoliceObj.CONSENT_TITTLE_TEXT);
		
	}
	
	@Test
	public void contentbodytextVerify() throws InterruptedException{
		getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
		
		privacyPoliceObj.assertionMethod(privacyPoliceObj.CONSENT_BUTTON_LOCATOR, privacyPoliceObj.CONTENT_BODY_TEXT_LOCATOR, privacyPoliceObj.CONTENT_BODY_TEXT);
		
	}
	
	@Test
	public void informationTittleVerify() throws InterruptedException{
		getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
		
		privacyPoliceObj.assertionMethod(privacyPoliceObj.INFORMATION_BUTTON_LOCATOR, privacyPoliceObj.INFORMATION_TITTLE_LOCATOR, privacyPoliceObj.INFORMATION_TITTLE_TEXT);
		
	}
	
//	@Test
//	public void informationbodyVerify() throws InterruptedException{
//		getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
//		System.out.println(privacyPoliceObj.getText(privacyPoliceObj.INFORMATION_BODY_TEXT_LOCATOR));
//		privacyPoliceObj.assertionMethod(privacyPoliceObj.INFORMATION_BUTTON_LOCATOR, privacyPoliceObj.INFORMATION_BODY_TEXT_LOCATOR, privacyPoliceObj.INFORMATION_BODY_TEXT);
//		
//	}
	
	@Test
	public void useYourinformationTittleVerify() throws InterruptedException{
		getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
		
		privacyPoliceObj.assertionMethod(privacyPoliceObj.USE_YOUR_INFORMATION_BUTTON_LOCATOR, privacyPoliceObj.USE_INFORMATION_TITTLE_LOCATOR, privacyPoliceObj.USE_INFORMATION_TITTLE_TEXT);
		
	}
	
	@Test
	public void logFilesTittleVerify() throws InterruptedException{
		getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
		
		privacyPoliceObj.assertionMethod(privacyPoliceObj.LOG_FILES_BUTTON_LOCATOR, privacyPoliceObj.LOG_FILE_TITTLE_LOCATOR, privacyPoliceObj.LOG_FILE_TITTLE_TEXT);
		
	}
	
	
	
	

}
