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
	
	@Test
	public void faqPageQuest3QuestAnswerVerify() throws InterruptedException {
		getDriver().get(faqPage.FAQ_PAGE_URL);
		Thread.sleep(1000);
		faqPage.faqQuestionAnswerVerifer(faqPage.FAQ_PAGE_ANSWER_2_LOCATOR, faqPage.FAQ_PAGE_QUEST_3_LOCATOR, faqPage.FAQ_PAGE_QUEST_3_TEXT, faqPage.FAQ_PAGE_ANSWER_3_LOCATOR, faqPage.FAQ_PAGE_ANSWER_3_TEXT);
	}
	
	@Test
	public void faqPageQuest4QuestAnswerVerify() throws InterruptedException {
		getDriver().get(faqPage.FAQ_PAGE_URL);
		Thread.sleep(1000);
		faqPage.faqQuestionAnswerVerifer(faqPage.FAQ_PAGE_ANSWER_3_LOCATOR, faqPage.FAQ_PAGE_QUEST_4_LOCATOR, faqPage.FAQ_PAGE_QUEST_4_TEXT, faqPage.FAQ_PAGE_ANSWER_4_LOCATOR, faqPage.FAQ_PAGE_ANSWER_4_TEXT);
	}
	
	@Test
	public void faqPageQuest5QuestAnswerVerify() throws InterruptedException {
		getDriver().get(faqPage.FAQ_PAGE_URL);
		Thread.sleep(1000);
		faqPage.faqQuestionAnswerVerifer(faqPage.FAQ_PAGE_ANSWER_4_LOCATOR, faqPage.FAQ_PAGE_QUEST_5_LOCATOR, faqPage.FAQ_PAGE_QUEST_5_TEXT, faqPage.FAQ_PAGE_ANSWER_5_LOCATOR, faqPage.FAQ_PAGE_ANSWER_5_TEXT);
	}
	
	@Test
	public void faqPageQuest6QuestAnswerVerify() throws InterruptedException {
		getDriver().get(faqPage.FAQ_PAGE_URL);
		Thread.sleep(1000);
		faqPage.faqQuestionAnswerVerifer(faqPage.FAQ_PAGE_ANSWER_5_LOCATOR, faqPage.FAQ_PAGE_QUEST_6_LOCATOR, faqPage.FAQ_PAGE_QUEST_6_TEXT, faqPage.FAQ_PAGE_ANSWER_6_LOCATOR, faqPage.FAQ_PAGE_ANSWER_6_TEXT);
	}
	
	@Test
	public void faqPageQuest7QuestAnswerVerify() throws InterruptedException {
		getDriver().get(faqPage.FAQ_PAGE_URL);
		faqPage.scrolldown();
		Thread.sleep(5000);
		faqPage.faqQuestionAnswerVerifer(faqPage.FAQ_PAGE_ANSWER_6_LOCATOR, faqPage.FAQ_PAGE_QUEST_7_LOCATOR, faqPage.FAQ_PAGE_QUEST_7_TEXT, faqPage.FAQ_PAGE_ANSWER_7_LOCATOR, faqPage.FAQ_PAGE_ANSWER_7_TEXT);
	}
	
	@Test
	public void faqPageQuest8QuestAnswerVerify() throws InterruptedException {
		getDriver().get(faqPage.FAQ_PAGE_URL);
		faqPage.scrolldown();
		Thread.sleep(5000);
		faqPage.faqQuestionAnswerVerifer(faqPage.FAQ_PAGE_ANSWER_7_LOCATOR, faqPage.FAQ_PAGE_QUEST_8_LOCATOR, faqPage.FAQ_PAGE_QUEST_8_TEXT, faqPage.FAQ_PAGE_ANSWER_8_LOCATOR, faqPage.FAQ_PAGE_ANSWER_8_TEXT);
	}
	
	@Test
	public void faqPageQuest9QuestAnswerVerify() throws InterruptedException {
		getDriver().get(faqPage.FAQ_PAGE_URL);
		faqPage.scrolldown();
		Thread.sleep(5000);
		faqPage.faqQuestionAnswerVerifer(faqPage.FAQ_PAGE_ANSWER_8_LOCATOR, faqPage.FAQ_PAGE_QUEST_9_LOCATOR, faqPage.FAQ_PAGE_QUEST_9_TEXT, faqPage.FAQ_PAGE_ANSWER_9_LOCATOR, faqPage.FAQ_PAGE_ANSWER_9_TEXT);
	}
	
	@Test
	public void faqPageQuest10QuestAnswerVerify() throws InterruptedException {
		getDriver().get(faqPage.FAQ_PAGE_URL);
		faqPage.scrolldown();
		Thread.sleep(5000);
		faqPage.faqQuestionAnswerVerifer(faqPage.FAQ_PAGE_ANSWER_9_LOCATOR, faqPage.FAQ_PAGE_QUEST_10_LOCATOR, faqPage.FAQ_PAGE_QUEST_10_TEXT, faqPage.FAQ_PAGE_ANSWER_10_LOCATOR, faqPage.FAQ_PAGE_ANSWER_10_TEXT);
	}
	

}
