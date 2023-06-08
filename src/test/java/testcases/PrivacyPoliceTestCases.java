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

}
