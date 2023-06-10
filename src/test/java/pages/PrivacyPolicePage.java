package pages;

import org.openqa.selenium.By;

public class PrivacyPolicePage extends BasePage {
	
	public String PrivacyPolice_URL="https://ur-cv.com/privacy-policy";
	public String OVERVIEW_TEXT_PART_1 = "At Ur-CV, accessible from ur-cv.com, one of our main priorities is the privacy of our visitors. This Privacy Policy document contains types of information that is collected and recorded by Ur-CV and how we use it";
	public String OVERVIEW_TEXT_PART_2 = "If you have additional questions or require more information about our Privacy Policy, do not hesitate to contact us.";
	public String OVERVIEW_TEXT_PART_3 = "This Privacy Policy applies only to our online activities and is valid for visitors to our website with regards to the information that they shared and/or collect in Ur-CV. This policy is not applicable to any information collected offline or via channels other than this website.";
	public String CONSENT_TITTLE_TEXT = "Consent";
	public String CONTENT_BODY_TEXT = "By using our website, you hereby consent to our Privacy Policy and agree to its terms.";
	public String INFORMATION_BODY_TEXT ="You may consult this list to find the Privacy Policy for each of the advertising partners of Ur-CV.\r\n"+"Third-party ad servers or ad networks uses technologies like cookies, JavaScript, or Web Beacons that are used in their respective advertisements and links that appear on Ur-CV, which are sent directly to users' browser. They automatically receive your IP address when this occurs. These technologies are used to measure the effectiveness of their advertising campaigns and/or to personalize the advertising content that you see on websites that you visit.\r\n"+"Note that Ur-CV has no access to or control over these cookies that are used by third-party advertisers.";
	public String INFORMATION_TITTLE_TEXT ="Information we collect";
	public String USE_INFORMATION_TITTLE_TEXT = "How we use your information";
	public String LOG_FILE_TITTLE_TEXT ="Log files";
	public String LOG_FILE_BODY_TEXT ="Ur-CV follows a standard procedure of using log files. These files log visitors when they visit websites. All hosting companies do this and a part of hosting services' analytics. The information collected by log files include internet protocol (IP) addresses, browser type, Internet Service Provider (ISP), date and time stamp, referring/exit pages, and possibly the number of clicks. These are not linked to any information that is personally identifiable. The purpose of the information is for analyzing trends, administering the site, tracking users' movement on the website, and gathering demographic information.";
	public String ADVERTISING_TITTLE_TEXT ="Advertising Partners Privacy Policies";
	public String ADVERTISING_BODY_TEXT = "You may consult this list to find the Privacy Policy for each of the advertising partners of Ur-CV.\r\n"+ "Third-party ad servers or ad networks uses technologies like cookies, JavaScript, or Web Beacons that are used in their respective advertisements and links that appear on Ur-CV, which are sent directly to users' browser. They automatically receive your IP address when this occurs. These technologies are used to measure the effectiveness of their advertising campaigns and/or to personalize the advertising content that you see on websites that you visit.\r\n"+ "Note that Ur-CV has no access to or control over these cookies that are used by third-party advertisers.";
	public String THIRTH_PARTY_TITTLE_TEXT="Third-Party Privacy Policies";
	public String THIRTH_PARTY_BODY_TEXT ="Ur-CV's Privacy Policy does not apply to other advertisers or websites. Thus, we are advising you to consult the respective Privacy Policies of these third-party ad servers for more detailed information. It may include their practices and instructions about how to opt-out of certain options.\r\n"			+ "You can choose to disable cookies through your individual browser options. To know more detailed information about cookie management with specific web browsers, it can be found at the browsers' respective websites.";
	public String CCPA_TITTLE_TEXT = "CCPA Privacy Rights (Do Not Sell My Personal Information)";
	public String CCPA_BODY_TEXT ="Under the CCPA, among other rights, California consumers have the right to: Request that a business that collects a consumer's personal data disclose the categories and specific pieces of personal data that a business has collected about consumers.\r\n"+ "Request that a business delete any personal data about the consumer that a business has collected.\r\n"			+ "Request that a business that sells a consumer's personal data, not sell the consumer's personal data.\r\n"+ "If you make a request, we have one month to respond to you. If you would like to exercise any of these rights, please contact us.";
	public String GPDR_TITTLE_TEXT="GDPR Data Protection Rights";
	public String GPDR_BODY_TEXT = "We would like to make sure you are fully aware of all of your data protection rights. Every user is entitled to the following:\r\n"+ "The right to access – You have the right to request copies of your personal data. We may charge you a small fee for this service.\r\n"+ "The right to rectification – You have the right to request that we correct any information you believe is inaccurate. You also have the right to request that we complete the information you believe is incomplete.\r\n"+ "The right to erasure – You have the right to request that we erase your personal data, under certain conditions.\r\n"+ "The right to restrict processing – You have the right to request that we restrict the processing of your personal data, under certain conditions.";
	
	
	
	public By BACK_BUTTON_LOCATOR = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/a[1]");
	public By OVERVIEW_BUTTON_LOCATOR = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[2]/div[1]/a[1]");
	public By CONSENT_BUTTON_LOCATOR = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[2]/div[1]/a[2]");
	public By INFORMATION_BUTTON_LOCATOR = By.xpath("//span[contains(text(),'Information we collect')]");
	public By USE_YOUR_INFORMATION_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'How we use your information')]");
	public By LOG_FILES_BUTTON_LOCATOR= By.xpath("//span[contains(text(),'Log files')]");
	public By ADVERTISING_PARTNER_BUTTON_LOCATOR=By.xpath("//span[contains(text(),'Advertising Partners Privacy Policies')]");
	public By THIRTH_PARTY_BUTTON_LOCATOR=By.xpath("//span[contains(text(),'Third-Party Privacy Policies')]");
	public By CCPA_BUTTON_LOCATOR=By.xpath("//span[contains(text(),'CCPA Privacy Rights (Do Not Sell My Personal Infor')]");
	public By GPDR_BUTTON_LOCATOR=By.xpath("//span[contains(text(),'GDPR Data Protection Rights')]");
	public By OVERVIEW_TEXT_PART_1_LOCATOR=By.xpath("//p[contains(text(),'At Ur-CV, accessible from ur-cv.com, one of our ma')]");
	public By OVERVIEW_TEXT_PART_2_LOCATOR=By.xpath("//p[contains(text(),'If you have additional questions or require more i')]");
	public By OVERVIEW_TEXT_PART_3_LOCATOR=By.xpath("//p[contains(text(),'This Privacy Policy applies only to our online act')]");
	public By CONSENT_TITTLE_LOCATOR=By.xpath("//h4[contains(text(),'Consent')]");
	public By CONTENT_BODY_TEXT_LOCATOR=By.xpath("//p[contains(text(),'By using our website, you hereby consent to our Pr')]");
	public By INFORMATION_TITTLE_LOCATOR =By.xpath("//h4[contains(text(),'Information we collect')]");
	public By INFORMATION_BODY_TEXT_LOCATOR=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[2]/div[2]/div[3]/div[1]");
	public By USE_INFORMATION_TITTLE_LOCATOR=By.xpath("//h4[contains(text(),'How we use your information')]");
	public By LOG_FILE_TITTLE_LOCATOR=By.xpath("//h4[contains(text(),'Log files')]");
	public By LOG_FILE_BODY_LOCATOR=By.xpath("//p[contains(text(),'Ur-CV follows a standard procedure of using log fi')]");
	public By ADVERTISING_TITTLE_LOCATOR=By.xpath("//h4[contains(text(),'Advertising Partners Privacy Policies')]");
	public By ADVERTISING_BODY_LOCATOR=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[2]/div[2]/div[6]/div[1]");
	public By THIRTH_PARTY_TITTLE_LOCATOR=By.xpath("//h4[contains(text(),'Third-Party Privacy Policies')]");
	public By THIRTH_PARTY_BODY_LOCATOR=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[2]/div[2]/div[7]/div[1]");
	public By CCPA_TITTLE_LOCATOR=By.xpath("//h4[contains(text(),'CCPA Privacy Rights (Do Not Sell My Personal Infor')]");
	public By CCPA_BODY_LOCATOR=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[2]/div[2]/div[8]/div[1]");
	public By GPDR_TITTLE_LOCATOR=By.xpath("//h4[contains(text(),'GDPR Data Protection Rights')]");
	public By GPDR_BODY_LOCATOR=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[2]/div[2]/div[9]/div[1]");
	public By FOOTER_PRIVACY_POLICIES_LOCATOR=By.xpath("//a[contains(text(),'Privacy & policies')]");
	public By TOP_BUTTON_LOCATOR=By.xpath("//div[@id='pagetop']");
	
	public void assertionMethod(By buttoName , By textLocator, String text) throws InterruptedException {
		
		findElement(buttoName).click();
		Thread.sleep(1000);
		assertionHard(textLocator, text);
		
	}
	
}
