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
	
	@Test
	public void logFilesBodyVerify() throws InterruptedException{
		getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
		
		privacyPoliceObj.assertionMethod(privacyPoliceObj.LOG_FILES_BUTTON_LOCATOR, privacyPoliceObj.LOG_FILE_BODY_LOCATOR, privacyPoliceObj.LOG_FILE_BODY_TEXT);
		
		
	}
	
	@Test
	public void advertisingPartnerTittleVerify() throws InterruptedException{
		getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
		
		privacyPoliceObj.assertionMethod(privacyPoliceObj.ADVERTISING_PARTNER_BUTTON_LOCATOR, privacyPoliceObj.ADVERTISING_TITTLE_LOCATOR, privacyPoliceObj.ADVERTISING_TITTLE_TEXT);
		
		
	}
	
//	@Test
//	public void advertisingPartnerBodyVerify() throws InterruptedException{
//		getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
//		
//		privacyPoliceObj.assertionMethod(privacyPoliceObj.ADVERTISING_PARTNER_BUTTON_LOCATOR, privacyPoliceObj.ADVERTISING_BODY_LOCATOR, privacyPoliceObj.ADVERTISING_BODY_TEXT);
//		
//		
//	}
	
	@Test
	public void thirthPartyTittleVerify() throws InterruptedException{
		getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
		
		privacyPoliceObj.assertionMethod(privacyPoliceObj.THIRTH_PARTY_BUTTON_LOCATOR, privacyPoliceObj.THIRTH_PARTY_TITTLE_LOCATOR, privacyPoliceObj.THIRTH_PARTY_TITTLE_TEXT);
		
		
	}
	
//	@Test
//	public void thirthPartyBodyVerify() throws InterruptedException{
//		getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
//		
//		privacyPoliceObj.assertionMethod(privacyPoliceObj.THIRTH_PARTY_BUTTON_LOCATOR, privacyPoliceObj.THIRTH_PARTY_BODY_LOCATOR, privacyPoliceObj.THIRTH_PARTY_BODY_TEXT);
//		
//		
//	}
	
	@Test
	public void ccpaPrivacyTittleVerify() throws InterruptedException{
		getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
		
		privacyPoliceObj.assertionMethod(privacyPoliceObj.CCPA_BUTTON_LOCATOR, privacyPoliceObj.CCPA_TITTLE_LOCATOR, privacyPoliceObj.CCPA_TITTLE_TEXT);
		
		
	}
	
//	@Test
//	public void ccpaPrivacyBodyVerify() throws InterruptedException{
//		getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
//		
//		privacyPoliceObj.assertionMethod(privacyPoliceObj.CCPA_BUTTON_LOCATOR, privacyPoliceObj.CCPA_BODY_LOCATOR, privacyPoliceObj.CCPA_BODY_TEXT);
//		
//		
//	}
	
	
	@Test
	public void GPDRTittleVerify() throws InterruptedException{
		getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
		
		privacyPoliceObj.assertionMethod(privacyPoliceObj.GPDR_BUTTON_LOCATOR, privacyPoliceObj.GPDR_TITTLE_LOCATOR, privacyPoliceObj.GPDR_TITTLE_TEXT);
		
		
	}
	
	
	@Test
	public void GPDRBodyVerify() throws InterruptedException{
	getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
		
		privacyPoliceObj.assertionMethod(privacyPoliceObj.GPDR_BUTTON_LOCATOR, privacyPoliceObj.GPDR_BODY_LOCATOR,privacyPoliceObj.GPDR_BODY_TEXT);
		
		
	}
	
	@Test
	public void topButtonVerify() throws InterruptedException {
		getDriver().get(privacyPoliceObj.PrivacyPolice_URL);
		privacyPoliceObj.findElement(privacyPoliceObj.GPDR_BUTTON_LOCATOR).click();
		Thread.sleep(1000);
		privacyPoliceObj.assertionHard(privacyPoliceObj.GPDR_TITTLE_LOCATOR, privacyPoliceObj.GPDR_TITTLE_TEXT);
		privacyPoliceObj.findElement(privacyPoliceObj.TOP_BUTTON_LOCATOR).click();
		Thread.sleep(1000);
		privacyPoliceObj.assertionHard(privacyPoliceObj.CONSENT_TITTLE_LOCATOR, privacyPoliceObj.CONSENT_TITTLE_TEXT);
		
	}
	
	

}
