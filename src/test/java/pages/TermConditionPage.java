package pages;

import org.openqa.selenium.By;

public class TermConditionPage extends BasePage {
	
	public String TERMSCONDITIONPAGE_URL= "https://ur-cv.com/terms-and-condition";
	public String AGREEMENT_TITTLE_TEXT= "Agreement to terms";
	public String INTRLLECTUAL_PROPERTY_TITTLE_TEXT = "Intellectual property rights";
	public String USER_REPRESENTATIOM_TEXT= "User representations";
	public String USER_REGISTRATION_TITTLE_TEXT= "User registration";
	public String DIGITAL_PAYMENT_TITTLE_TEXT= "Digital payment & refund policy";
	public String PROHIBITED_ACTIVITIES_TITTLE_TEXT= "Prohibited activities";
	public String USER_GENERATED_TITTLE_TEXT= "User-generated contributions";
	public String CONTRIBUTION_LICENSE_TITTLE_TEXT= "Contribution license";
	public String SUBMISSION_TITTLE_TEXT= "Submission";
	public String SITE_MANAGEMENT_TITTLE_TEXT= "Site manangement";
	public String PRIVACY_POLICY_TITTLE_TEXT= "Privacy policy";
	public String COPYRIGHT_INFRIGMENTS_TITTLE_TEXT= "Copyright infringments";
	public String TERM_TERMINATION_TITTLE_TEXT= "Term & termination";
	public String MODIFICATIONS_INTERUPTIONS_TITTLE_TEXT= "Modifications & interuptions";
	public String GOVERNING_LAW_TIITLE_TEXT= "Governing law";
	public String DISPUTE_RESOLUTION_TITTLE_TEXT= "Dispute resolution";
	public String CORRESTIONS_TITTLE_TEXT= "Corrections";
	public String DISCLAIMER_TITTLE_TEXT= "Disclaimer";
	public String LIMITATION_TITTLE_TEXT= "Limitation of liability";
	public String INDEMINIFICATION_TITTLE_TEXT= "Indeminification";
	public String USER_DATA_TITTLE_TEXT= "User data";
	public String ELECTRONIC_TITTLE_TEXT= "Electronic communications, transactions, & signatures";
	public String MISCELLANEOUS_TITTLE_TEXT= "Miscellaneous";
	public String CONTACT_US_TITTLE_TEXT= "Contact us";

	
	
	
	public By BACK_BUTTON_LOCATOR = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/a[1]");
	public By FOOTER_TERMS_LOCATOR = By.xpath("//a[contains(text(),'Terms & conditions')]");
	public By TOP_BUTTON_LOCATOR= By.xpath("//div[@id='pagetop']");
	public By AGREEMENT_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Agreement to terms')]");
	public By AGREEMENT_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Agreement to terms')]");
	public By INTRLLECTUAL_PROPERTY_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Intellectual property rights')]");
	public By INTRLLECTUAL_PROPERTY_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Intellectual property rights')]");
	public By USER_REPRESENTATION_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'User representations')]");
	public By USER_REPRESENTATION_TEXT_LOCATOR= By.xpath("//h4[contains(text(),'User representations')]");
	public By USER_REGISTRATION_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'User registration')]");
	public By USER_REGISTRATION_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'User registration')]");
	public By DIGITAL_PAYMENT_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Digital payment & refund policy')]");
	public By DIGITAL_PAYMENT_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Digital payment & refund policy')]");
	public By PROHIBITED_ACTIVITIES_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Prohibited activities')]");
	public By PROHIBITED_ACTIVITIES_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Prohibited activities')]");
	public By USER_GENERATED_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'User-generated contributions')]");
	public By USER_GENERATED_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'User-generated contributions')]");
	public By CONTRIBUTION_LICENSE_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Contribution license')]");
	public By CONTRIBUTION_LICENSE_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Contribution license')]");
	public By SUBMISSION_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Submission')]");
	public By SUBMISSION_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Submission')]");
	public By SITE_MANAGEMENT_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Site manangement')]");
	public By SITE_MANAGEMENT_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Site manangement')]");
	public By PRIVACY_POLICY_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Privacy policy')]");
	public By PRIVACY_POLICY_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Privacy policy')]");
	public By COPYRIGHT_INFRIGMENTS_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Copyright infringments')]");
	public By COPYRIGHT_INFRIGMENTS_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Copyright infringments')]");
	public By TERM_TERMINATION_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Term & termination')]");
	public By TERM_TERMINATION_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Term & termination')]");
	public By MODIFICATIONS_INTERUPTIONS_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Modifications & interuptions')]");
	public By MODIFICATIONS_INTERUPTIONS_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Modifications & interuptions')]");
	public By GOVERNING_LAW_TIITLE_LOCATOR= By.xpath("//h4[contains(text(),'Governing law')]");
	public By GOVERNING_LAW_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Governing law')]");
	public By DISPUTE_RESOLUTION_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Dispute resolution')]");
	public By DISPUTE_RESOLUTION_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Dispute resolution')]");
	public By CORRESTIONS_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Corrections')]");
	public By CORRESTIONS_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Corrections')]");
	public By DISCLAIMER_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Disclaimer')]");
	public By DISCLAIMER_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Disclaimer')]");
	public By LIMITATION_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Limitation of liability')]");
	public By LIMITATION_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Limitation Liability')]");
	public By INDEMINIFICATION_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Indeminification')]");
	public By INDEMINIFICATION_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Indeminification')]");
	public By USER_DATA_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'User data')]");
	public By USER_DATA_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'User data')]");
	public By ELECTRONIC_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Electronic communications, transactions, & signatu')]");
	public By ELECTRONIC_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Electronic communications, transactions, & signatu')]");
	public By MISCELLANEOUS_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Miscellaneous')]");
	public By MISCELLANEOUS_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Miscellaneous')]");
	public By CONTACT_US_TITTLE_LOCATOR= By.xpath("//h4[contains(text(),'Contact us')]");
	public By CONTACT_US_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Contact us')]");
	
	
	public void assertionMethod(By buttoName , By textLocator, String text) throws InterruptedException {
		
		try
		{
			findElement(buttoName).click();
			Thread.sleep(2000);
			assertionHard(textLocator, text);
			
		} 
		
		catch (Exception e) 
		{
			scrollingDownTillElementFound(buttoName);
			Thread.sleep(2000);
			findElement(buttoName).click();
			Thread.sleep(2000);
			assertionHard(textLocator, text);
		}
		
		
		
	}


}
