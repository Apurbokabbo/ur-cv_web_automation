package testcases;

import org.testng.annotations.Test;

import pages.AboutUsPage;
import pages.CartPage;
import pages.LandingPage;
import pages.LoginPage;
import pages.TemplatesPage;
import utilities.BaseDriver;

public class LandingTestCases extends BaseDriver {
	
	LandingPage landingPage = new LandingPage();
	TemplatesPage templatePage= new TemplatesPage();
	AboutUsPage aboutUsPage = new AboutUsPage();
	CartPage cartPage = new CartPage();
	LoginPage loginPage = new LoginPage();
	
	@Test
	public void landingPageTittleSentence() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.assertionHard(landingPage.LANDING_PAGE_TITTLE_SENTENCE_LOCATOR, landingPage.LANDING_PAGE_TITTLE_SENTENCE);
		Thread.sleep(1000);
	}
	
	@Test
	public void landingPageNavLogoButtonTest() throws InterruptedException {
		
		getDriver().get(templatePage.TEMPLATES_URL);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.NAV_LOGO_HOME_BUTTON).click();
		Thread.sleep(1000);
		landingPage.assertionURL(landingPage.BASE_URL);
	}
	
	@Test
	public void landingPageNavHomeButtonTest() throws InterruptedException {
		
		getDriver().get(templatePage.TEMPLATES_URL);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.NAV_HOME_BUTTON).click();
		Thread.sleep(1000);
		landingPage.assertionURL(landingPage.BASE_URL);
	}
	
	@Test
	public void landingPageNavTemplateButtonTest() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.NAV_TEMPALTE_BUTTON).click();
		Thread.sleep(1000);
		landingPage.assertionURL(templatePage.TEMPLATES_URL);
	}
	
	@Test
	public void landingPageNavAboutUsButtonTest() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.NAV_ABOUT_US_BUTTON).click();
		Thread.sleep(1000);
		landingPage.assertionURL(aboutUsPage.ABOUTUS_URL);
	}
	
	@Test
	public void landingPageNavCartButtonTest() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.NAV_CART_BUTTON).click();
		Thread.sleep(1000);
		landingPage.assertionURL(cartPage.CART_URL);
	}
	
	@Test
	public void landingPageNavLoginButtonTest() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.NAV_LOGIN_BUTTON).click();
		Thread.sleep(1000);
		landingPage.assertionURL(loginPage.LOGIN_URL);
	}
	
	@Test
	public void logoutUserTopCreateFreeCv() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.CREATE_FREE_CV_BUTTON).click();
		Thread.sleep(1000);
	}
	
	@Test
	public void landingPageTemplateCvTittleVerify() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.BEST_INDUSTY_READY_CV_LOCATOR);
		Thread.sleep(1000);
		landingPage.assertionHard(landingPage.BEST_INDUSTY_READY_CV_LOCATOR, landingPage.BEST_INDUSTY_READY_CV_TEXT);
		Thread.sleep(1000);
	}
	
	@Test
	public void landingPageTemplateSelect() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.BEST_INDUSTY_READY_CV_LOCATOR);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.LANDING_PAGE_TEMPLATE_FOR_SELECT_LOCATOR).click();
		Thread.sleep(1000);
		landingPage.assertionURL(landingPage.PROFESSIONAL_104_PREVIEW_URL);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageSeeAllTemplateButtonTest() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.SELL_ALL_TEMPLATE_BUTTON);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.SELL_ALL_TEMPLATE_BUTTON).click();
		Thread.sleep(1000);
		landingPage.assertionURL(templatePage.TEMPLATES_URL);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageSimpleCvTittleTextVerify() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.SIMPLE_3_STEPS_LOCATOR);
		Thread.sleep(1000);
		landingPage.assertionHard(landingPage.SIMPLE_3_STEPS_LOCATOR, landingPage.SIMPLE_3_STEPS_TEXT);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageSimpleCvBodyTextVerify() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.SIMPLE_3_STEPS_LOCATOR);
		Thread.sleep(1000);
		landingPage.assertionHard(landingPage.SIMPLE_3_STEPS_TEXT_LOCATOR, landingPage.SIMPLE_3_STEPS_BODY_TEXT);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageSimpleCvAddinfoTextVerify() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.SIMPLE_3_STEPS_LOCATOR);
		Thread.sleep(1000);
		landingPage.scrollUp();
		Thread.sleep(1000);
		landingPage.assertionHard(landingPage.ADD_YOUR_INFO_LOCATOR, landingPage.ADD_YOUR_INFO_TEXT);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageSimpleCvSelectTemplateTextVerify() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.SIMPLE_3_STEPS_LOCATOR);
		Thread.sleep(1000);
		landingPage.assertionHard(landingPage.SELECT_TEMPLATE_LOCATOR, landingPage.SELECT_TEMPLATE_TEXT);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageSimpleCvDownloadCvTextVerify() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.SIMPLE_3_STEPS_LOCATOR);
		Thread.sleep(2000);
		landingPage.assertionHard(landingPage.DOWNLOAD_CV_LOCATOR, landingPage.DOWNLOAD_CV_TEXT);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void logoutCreateButtonTest() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.SIMPLE_3_STEPS_LOCATOR);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.CREATE_FREE_CV_MIDDLE_BUTTON).click();
		Thread.sleep(1000);
		landingPage.assertionURL(loginPage.LOGIN_URL);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageHiringManagerTittleVerify() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.HIRING_MANAGER_LOCATOR);
		Thread.sleep(1000);
		landingPage.assertionHard(landingPage.HIRING_MANAGER_LOCATOR, landingPage.HIRING_MANAGER_TEXT);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageTopButtonTest() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.HIRING_MANAGER_LOCATOR);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.TOP_BUTTON).click();
		Thread.sleep(1000);
		landingPage.assertionHard(landingPage.LANDING_PAGE_TITTLE_SENTENCE_LOCATOR, landingPage.LANDING_PAGE_TITTLE_SENTENCE);
		Thread.sleep(1000);
	}
	
	@Test
	public void landingPageContentSuggestionTittleVerify() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.CONTENT_SUGGESTION_TITTLE_LOCATOR);
		Thread.sleep(1000);
		landingPage.assertionHard(landingPage.CONTENT_SUGGESTION_TITTLE_LOCATOR,landingPage.CONTENT_SUGGESTION_TITTLE_TEXT);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageContentSuggestionBodyVerify() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.CONTENT_SUGGESTION_BODY_LOCATOR);
		Thread.sleep(1000);
		landingPage.assertionHard(landingPage.CONTENT_SUGGESTION_BODY_LOCATOR,landingPage.CONTENT_SUGGESTION_BODY_TEXT);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageExploreAllTemplateButtonTest() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.CONTENT_SUGGESTION_TITTLE_LOCATOR);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.EXPLORE_ALL_TEMPLATE_BUTTON).click();
		Thread.sleep(2000);
		landingPage.assertionURL(templatePage.TEMPLATES_URL);
		Thread.sleep(1000);
		
		
	}
	
	@Test
	public void landingPageRecruiterPreferTittleVerify() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.RECRUITER_PREFER_TITTLE_LOCATOR);
		Thread.sleep(2000);
		landingPage.assertionHard(landingPage.RECRUITER_PREFER_TITTLE_LOCATOR,landingPage.RECRUITER_PREFER_TITTLE_TEXT);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageRecruiterPreferBodyVerify() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.RECRUITER_PREFER_TITTLE_LOCATOR);
		Thread.sleep(2000);
		landingPage.assertionHard(landingPage.RECRUITER_PREFER_BODY_LOCATOR,landingPage.RECRUITER_PREFER_BODY_TEXT);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageRecruiterPreferSkillSetVerify() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.RECRUITER_PREFER_TITTLE_LOCATOR);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.RECRUITER_SKILL_SET_BUTTON).click();
		Thread.sleep(2000);
		landingPage.assertionHard(landingPage.RECRUITER_COMMON_BODY_TEXT_CONTAINER_LOCATOR,landingPage.RECRUITER_SKILL_SET_TEXT);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageRecruiterPreferCareerSummaryVerify() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.RECRUITER_PREFER_TITTLE_LOCATOR);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.RECRUITER_SKILL_SET_BUTTON).click();
		Thread.sleep(1000);
		landingPage.findElement(landingPage.RECRUITER_CAREER_SUMMARY_BUTTON).click();
		Thread.sleep(2000);
		landingPage.assertionHard(landingPage.RECRUITER_COMMON_BODY_TEXT_CONTAINER_LOCATOR,landingPage.RECRUITER_CAREER_SUMMARY_TEXT);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageRecruiterPreferProfessionalCertificatesVerify() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.RECRUITER_PREFER_TITTLE_LOCATOR);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.RECRUITER_PROFESSIONAL_CERTIFICATE).click();
		Thread.sleep(2000);
		landingPage.assertionHard(landingPage.RECRUITER_COMMON_BODY_TEXT_CONTAINER_LOCATOR,landingPage.RECRUITER_PROFESSIONAL_CERTIFICATE_TEXT);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageRecruiterPreferCvStructureVerify() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.RECRUITER_PREFER_TITTLE_LOCATOR);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.RECRUITER_CV_STRUCTURE_BUTTON).click();
		Thread.sleep(2000);
		landingPage.assertionHard(landingPage.RECRUITER_COMMON_BODY_TEXT_CONTAINER_LOCATOR,landingPage.RECRUITER_CV_STRUCTURE);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageRecruiterPreferCvTemplateVerify() throws InterruptedException {
		
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.RECRUITER_PREFER_TITTLE_LOCATOR);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.RECRUITER_CV_TEMPLATE_BUTTON).click();
		Thread.sleep(2000);
		landingPage.assertionHard(landingPage.RECRUITER_COMMON_BODY_TEXT_CONTAINER_LOCATOR,landingPage.RECRUITER_CV_TEMPLATE);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageFAQTittleVerify() throws InterruptedException {
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.FAQ_TITTLE_LOCATOR);
		Thread.sleep(2000);
		landingPage.assertionHard(landingPage.FAQ_TITTLE_LOCATOR, landingPage.FQA_TITTLE_TEXT);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageFAQVerify() throws InterruptedException {
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.FAQ_TITTLE_LOCATOR);
		Thread.sleep(2000);
		landingPage.assertionHard(landingPage.FAQ_TITTLE_LOCATOR, landingPage.FQA_TITTLE_TEXT);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageFAQFirstQuestionTittleVerify() throws InterruptedException {
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.FAQ_TITTLE_LOCATOR);
		Thread.sleep(2000);
		landingPage.assertionHard(landingPage.FAQ_QUESTION_TITLE_1_LOCATOR, landingPage.FAQ_QUESTION_1_TITLE);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageFAQSecondQuestionTittleVerify() throws InterruptedException {
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.FAQ_TITTLE_LOCATOR);
		Thread.sleep(2000);
		landingPage.assertionHard(landingPage.FAQ_QUESTION_TITLE_2_LOCATOR, landingPage.FAQ_QUESTION_2_TITLE);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageFAQThirdQuestionTittleVerify() throws InterruptedException {
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.FAQ_TITTLE_LOCATOR);
		Thread.sleep(2000);
		landingPage.assertionHard(landingPage.FAQ_QUESTION_TITLE_3_LOCATOR, landingPage.FAQ_QUESTION_3_TITLE);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageFAQFourQuestionTittleVerify() throws InterruptedException {
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.FAQ_TITTLE_LOCATOR);
		Thread.sleep(2000);
		landingPage.assertionHard(landingPage.FAQ_QUESTION_TITLE_4_LOCATOR, landingPage.FAQ_QUESTION_4_TITLE);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageFAQFiveQuestionTittleVerify() throws InterruptedException {
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.FAQ_TITTLE_LOCATOR);
		Thread.sleep(2000);
		landingPage.assertionHard(landingPage.FAQ_QUESTION_TITLE_5_LOCATOR, landingPage.FAQ_QUESTION_5_TITLE);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageFAQFirstQuestionAnswerVerify() throws InterruptedException {
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.FAQ_TITTLE_LOCATOR);
		Thread.sleep(2000);
		landingPage.findElement(landingPage.FAQ_QUESTION_TITLE_1_LOCATOR).click();
		Thread.sleep(1000);
		landingPage.assertionHard(landingPage.FAQ_QUESTION_ANSWER_1_LOCATOR, landingPage.FAQ_QUESTION_1_ANSWER);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void landingPageFAQSecondQuestionAnswerVerify() throws InterruptedException {
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.FAQ_TITTLE_LOCATOR);
		Thread.sleep(2000);
		landingPage.findElement(landingPage.FAQ_QUESTION_TITLE_1_LOCATOR).click();
		Thread.sleep(1000);
		landingPage.findElement(landingPage.FAQ_QUESTION_TITLE_2_LOCATOR).click();
		Thread.sleep(1000);
		landingPage.assertionHard(landingPage.FAQ_QUESTION_ANSWER_2_LOCATOR, landingPage.FAQ_QUESTION_2_ANSWER);
		Thread.sleep(1000);
		try {
			
			landingPage.findElement(landingPage.FAQ_QUESTION_ANSWER_1_LOCATOR).click();					
		} 
		catch (Exception e) {
			
			System.out.println("first question's answer closed!!!");
			
		}	
		
	}
	
	@Test
	public void landingPageFAQThirdQuestionAnswerVerify() throws InterruptedException {
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.FAQ_TITTLE_LOCATOR);
		Thread.sleep(2000);
		landingPage.findElement(landingPage.FAQ_QUESTION_TITLE_2_LOCATOR).click();
		landingPage.findElement(landingPage.FAQ_QUESTION_TITLE_3_LOCATOR).click();
		Thread.sleep(1000);
		landingPage.assertionHard(landingPage.FAQ_QUESTION_ANSWER_3_LOCATOR, landingPage.FAQ_QUESTION_3_ANSWER);
		Thread.sleep(1000);
		try {
			
			landingPage.findElement(landingPage.FAQ_QUESTION_ANSWER_2_LOCATOR).click();					
		} 
		catch (Exception e) {
			
			System.out.println("first question's answer closed!!!");
			
		}	
		
	}
	
	@Test
	public void landingPageFAQFourQuestionAnswerVerify() throws InterruptedException {
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.FAQ_TITTLE_LOCATOR);
		Thread.sleep(2000);
		landingPage.findElement(landingPage.FAQ_QUESTION_TITLE_3_LOCATOR).click();
		landingPage.findElement(landingPage.FAQ_QUESTION_TITLE_4_LOCATOR).click();
		Thread.sleep(1000);
		landingPage.assertionHard(landingPage.FAQ_QUESTION_ANSWER_4_LOCATOR, landingPage.FAQ_QUESTION_4_ANSWER);
		Thread.sleep(1000);
		try {
			
			landingPage.findElement(landingPage.FAQ_QUESTION_ANSWER_3_LOCATOR).click();					
		} 
		catch (Exception e) {
			
			System.out.println("first question's answer closed!!!");
			
		}	
		
	}
	
	@Test
	public void landingPageFAQFiveQuestionAnswerVerify() throws InterruptedException {
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.FAQ_TITTLE_LOCATOR);
		Thread.sleep(2000);
		landingPage.findElement(landingPage.FAQ_QUESTION_TITLE_4_LOCATOR).click();
		landingPage.findElement(landingPage.FAQ_QUESTION_TITLE_5_LOCATOR).click();
		Thread.sleep(1000);
		landingPage.assertionHard(landingPage.FAQ_QUESTION_ANSWER_5_LOCATOR, landingPage.FAQ_QUESTION_5_ANSWER);
		Thread.sleep(1000);
		try {
			
			landingPage.findElement(landingPage.FAQ_QUESTION_ANSWER_4_LOCATOR).click();					
		} 
		catch (Exception e) {
			
			System.out.println("first question's answer closed!!!");
			
		}	
		
	}
	
	
	@Test
	public void faqSeeMoreButtonTest() throws InterruptedException {
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.FAQ_TITTLE_LOCATOR);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.FIND_MORE_FAQ_BUTTON).click();
		Thread.sleep(1000);
		landingPage.assertionURL("https://ur-cv.com/frequently-ask-question");
		Thread.sleep(1000);
		
	}
	
	@Test
	public void blogsTittleVerify() throws InterruptedException{
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.BLOG_TITTLE_LOCATOR);
		Thread.sleep(1000);
		landingPage.assertionHard(landingPage.BLOG_TITTLE_LOCATOR, landingPage.BLOG_TITTLE_TEXT);
		Thread.sleep(1000);
	}
	
	@Test
	public void allBlogsButtonTest() throws InterruptedException{
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.BLOG_TITTLE_LOCATOR);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.ALL_BLOGS_BUTTON).click();
		Thread.sleep(1000);		
		landingPage.assertionURL("https://ur-cv.com/blogs");
		Thread.sleep(1000);
	}
	
	@Test
	public void selectOneBlogDetails() throws InterruptedException{
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.BLOG_TITTLE_LOCATOR);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.BLOG_3_LOCATOR).click();
		Thread.sleep(1000);		
		landingPage.assertionURL(landingPage.BLOG_3_URL);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.BLOG_COMMON_BACK_BUTTON).click();
		Thread.sleep(1000);	
		landingPage.assertionURL(landingPage.BASE_URL);
	}
	
	
	


}