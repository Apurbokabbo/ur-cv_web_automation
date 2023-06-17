package testcases;

import org.testng.annotations.Test;

import pages.TermConditionPage;
import utilities.BaseDriver;

public class TermConditionTestCases extends BaseDriver {
	
	
	TermConditionPage termConditionObj = new TermConditionPage();
	
	@Test
	public void backButtonTest() throws InterruptedException {
		getDriver().get(termConditionObj.BASE_URL);
		termConditionObj.assertionURL(termConditionObj.BASE_URL);
		termConditionObj.scrollingDownTillElementFound(termConditionObj.FOOTER_TERMS_LOCATOR);
		Thread.sleep(1000);
		termConditionObj.findElement(termConditionObj.FOOTER_TERMS_LOCATOR).click();
		Thread.sleep(2000);
		termConditionObj.assertionURL(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.findElement(termConditionObj.BACK_BUTTON_LOCATOR).click();
		Thread.sleep(2000);
		termConditionObj.assertionURL(termConditionObj.BASE_URL);
		Thread.sleep(1000);
		
		
	}
	
	
	@Test
	public void topButtonTest() throws InterruptedException {
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.scrollingDownTillElementFound(termConditionObj.DISCLAIMER_BUTTON_LOCATOR);
		Thread.sleep(2000);
		termConditionObj.findElement(termConditionObj.DISCLAIMER_BUTTON_LOCATOR).click();
		Thread.sleep(1000);
		termConditionObj.assertionHard(termConditionObj.DISCLAIMER_TITTLE_LOCATOR, termConditionObj.DISCLAIMER_TITTLE_TEXT);
		termConditionObj.findElement(termConditionObj.TOP_BUTTON_LOCATOR).click();
		Thread.sleep(1000);
		termConditionObj.assertionHard(termConditionObj.AGREEMENT_TITTLE_LOCATOR, termConditionObj.AGREEMENT_TITTLE_TEXT);
		
		
	}
	
	@Test
	public void agreementTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.AGREEMENT_BUTTON_LOCATOR, termConditionObj.AGREEMENT_TITTLE_LOCATOR,termConditionObj.AGREEMENT_TITTLE_TEXT);
		
				
	}
	
	@Test
	public void intellectualPropertyTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.INTRLLECTUAL_PROPERTY_BUTTON_LOCATOR, termConditionObj.INTRLLECTUAL_PROPERTY_TITTLE_LOCATOR,termConditionObj.INTRLLECTUAL_PROPERTY_TITTLE_TEXT);
		
				
	}
	
	@Test
	public void userRepresentationsTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.USER_REPRESENTATION_BUTTON_LOCATOR, termConditionObj.USER_REGISTRATION_TITTLE_LOCATOR,termConditionObj.USER_REGISTRATION_TITTLE_TEXT);
		
				
	}
	
	
	@Test
	public void userRegistrationTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.USER_REPRESENTATION_BUTTON_LOCATOR, termConditionObj.INTRLLECTUAL_PROPERTY_TITTLE_LOCATOR,termConditionObj.INTRLLECTUAL_PROPERTY_TITTLE_TEXT);
		
		
	}
	
	@Test
	public void digitalPaymentTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.DIGITAL_PAYMENT_BUTTON_LOCATOR, termConditionObj.DIGITAL_PAYMENT_TITTLE_LOCATOR,termConditionObj.DIGITAL_PAYMENT_TITTLE_TEXT);
		
				
	}
	
	@Test
	public void prohibitedActivitiesTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.PROHIBITED_ACTIVITIES_BUTTON_LOCATOR, termConditionObj.PROHIBITED_ACTIVITIES_TITTLE_LOCATOR,termConditionObj.PROHIBITED_ACTIVITIES_TITTLE_TEXT);
		
				
	}
	
	@Test
	public void userGeneratedTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.USER_GENERATED_BUTTON_LOCATOR, termConditionObj.USER_GENERATED_TITTLE_LOCATOR,termConditionObj.USER_GENERATED_TITTLE_TEXT);
		
				
	}
	
	@Test
	public void contributionLicenseTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.CONTRIBUTION_LICENSE_BUTTON_LOCATOR, termConditionObj.CONTRIBUTION_LICENSE_TITTLE_LOCATOR,termConditionObj.CONTRIBUTION_LICENSE_TITTLE_TEXT);
		
				
	}
	
	@Test
	public void submissionTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.SUBMISSION_BUTTON_LOCATOR, termConditionObj.SUBMISSION_TITTLE_LOCATOR,termConditionObj.SUBMISSION_TITTLE_TEXT);
		
				
	}
	
	@Test
	public void siteManangementTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.SITE_MANAGEMENT_BUTTON_LOCATOR, termConditionObj.SITE_MANAGEMENT_TITTLE_LOCATOR,termConditionObj.SITE_MANAGEMENT_TITTLE_TEXT);
		
				
	}
	
	@Test
	public void privacyPolicyTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.PRIVACY_POLICY_BUTTON_LOCATOR, termConditionObj.PRIVACY_POLICY_TITTLE_LOCATOR,termConditionObj.PRIVACY_POLICY_TITTLE_TEXT);
		
				
	}
	
	
	@Test
	public void copyrightInfringmentsTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.COPYRIGHT_INFRIGMENTS_BUTTON_LOCATOR, termConditionObj.COPYRIGHT_INFRIGMENTS_TITTLE_LOCATOR,termConditionObj.COPYRIGHT_INFRIGMENTS_TITTLE_TEXT);
		
				
	}
	

	@Test
	public void termTerminationTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.TERM_TERMINATION_BUTTON_LOCATOR, termConditionObj.TERM_TERMINATION_TITTLE_LOCATOR,termConditionObj.TERM_TERMINATION_TITTLE_TEXT);
		
				
	}
	
	@Test
	public void modificationsInteruptionsTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.MODIFICATIONS_INTERUPTIONS_BUTTON_LOCATOR, termConditionObj.MODIFICATIONS_INTERUPTIONS_TITTLE_LOCATOR,termConditionObj.MODIFICATIONS_INTERUPTIONS_TITTLE_TEXT);
		
				
	}
	
	@Test
	public void governingLawTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.GOVERNING_LAW_BUTTON_LOCATOR, termConditionObj.GOVERNING_LAW_TIITLE_LOCATOR,termConditionObj.GOVERNING_LAW_TIITLE_TEXT);
		
				
	}
	
	@Test
	public void disputeResolutionTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.DISPUTE_RESOLUTION_BUTTON_LOCATOR, termConditionObj.DISCLAIMER_TITTLE_LOCATOR,termConditionObj.DISCLAIMER_TITTLE_TEXT);
		
				
	}
	
	@Test
	public void CorrectionsTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.CORRESTIONS_BUTTON_LOCATOR, termConditionObj.CORRESTIONS_TITTLE_LOCATOR,termConditionObj.CORRESTIONS_TITTLE_TEXT);
		
				
	}
	
	@Test
	public void disclaimerTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.DISCLAIMER_BUTTON_LOCATOR, termConditionObj.DISCLAIMER_TITTLE_LOCATOR,termConditionObj.DISCLAIMER_TITTLE_TEXT);
		
				
	}
	
	@Test
	public void limitationofLiabilityTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.LIMITATION_BUTTON_LOCATOR, termConditionObj.LIMITATION_TITTLE_LOCATOR,termConditionObj.LIMITATION_TITTLE_TEXT);
		
				
	}
	
	@Test
	public void indeminificationTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.INDEMINIFICATION_BUTTON_LOCATOR, termConditionObj.INDEMINIFICATION_TITTLE_LOCATOR,termConditionObj.INDEMINIFICATION_TITTLE_TEXT);
		
				
	}
	
	@Test
	public void userDataTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.USER_DATA_BUTTON_LOCATOR, termConditionObj.USER_DATA_TITTLE_LOCATOR,termConditionObj.USER_DATA_TITTLE_TEXT);
		
				
	}
	
	@Test
	public void electronicCommunicationsTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.ELECTRONIC_BUTTON_LOCATOR, termConditionObj.ELECTRONIC_TITTLE_LOCATOR,termConditionObj.ELECTRONIC_TITTLE_TEXT);
		
				
	}
	
	
	@Test
	public void miscellaneousTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.MISCELLANEOUS_BUTTON_LOCATOR, termConditionObj.MISCELLANEOUS_TITTLE_LOCATOR,termConditionObj.MISCELLANEOUS_TITTLE_TEXT);
		
				
	}
	
	@Test
	public void contactUsTittleVerify() throws InterruptedException {
		
		getDriver().get(termConditionObj.TERMSCONDITIONPAGE_URL);
		Thread.sleep(1000);
		termConditionObj.assertionMethod(termConditionObj.CONTACT_US_BUTTON_LOCATOR, termConditionObj.CONTACT_US_TITTLE_LOCATOR,termConditionObj.CONTACT_US_TITTLE_TEXT);
		
				
	}
	
	
	
	
	


}
