package testcases;

import org.testng.annotations.Test;

import pages.FaqPage;
import pages.LandingPage;
import utilities.BaseDriver;

public class FaqPageTestCases extends BaseDriver {
	
	FaqPage faqPage = new FaqPage();
	LandingPage landingPage = new LandingPage();
	
	@Test
	public void faqPageUrlVerify() throws InterruptedException {
		getDriver().get(faqPage.FAQ_PAGE_URL);
		Thread.sleep(1000);
		faqPage.assertionURL(faqPage.FAQ_PAGE_URL);
				
	}
	
	@Test
	public void faqPageBackButtonTest() throws InterruptedException {
		getDriver().get(landingPage.BASE_URL);
		Thread.sleep(1000);
		landingPage.scrollingDownTillElementFound(landingPage.FOOTER_TEXT_LOCATOR);
		Thread.sleep(1000);
		landingPage.findElement(landingPage.FOOTER_FQA_BUTTON).click();
		Thread.sleep(1000);
		faqPage.assertionURL(faqPage.FAQ_PAGE_URL);
		Thread.sleep(1000);
		faqPage.findElement(faqPage.FAQ_PAGE_BACK_BUTTON).click();
		Thread.sleep(1000);
		landingPage.assertionURL(landingPage.BASE_URL);
		
	}
	
	@Test
	public void faqPageQuest1QuestAnswerVerify() throws InterruptedException {
		getDriver().get(faqPage.FAQ_PAGE_URL);
		Thread.sleep(1000);
		faqPage.assertionHard(faqPage.FAQ_PAGE_QUEST_1_LOCATOR,faqPage.FAQ_PAGE_QUEST_1_TEXT);
		Thread.sleep(1000);
		faqPage.assertionHard(faqPage.FAQ_PAGE_ANSWER_1_LOCATOR,faqPage.FAQ_PAGE_ANSWER_1_TEXT);
	}
	
	@Test
	public void faqPageQuest2QuestAnswerVerify() throws InterruptedException {
		getDriver().get(faqPage.FAQ_PAGE_URL);
		Thread.sleep(1000);
		faqPage.faqQuestionAnswerVerifer(faqPage.FAQ_PAGE_ANSWER_1_LOCATOR, faqPage.FAQ_PAGE_QUEST_2_LOCATOR, faqPage.FAQ_PAGE_QUEST_2_TEXT, faqPage.FAQ_PAGE_ANSWER_2_LOCATOR, faqPage.FAQ_PAGE_ANSWER_2_TEXT);
	}
	

}
