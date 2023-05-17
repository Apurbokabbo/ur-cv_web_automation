package testcases;

import org.testng.annotations.Test;

import pages.AboutUsPage;
import utilities.BaseDriver;

public class AboutTestCases extends BaseDriver{
	
	AboutUsPage aboutUsPage = new AboutUsPage();
	
	@Test
	public void headerTittleVerify() throws InterruptedException {
		getDriver().get(aboutUsPage.ABOUTUS_URL);
		Thread.sleep(1000);
		aboutUsPage.assertionHard(aboutUsPage.HEADER_TITTLE_LOCATOR,aboutUsPage.HEADER_TITTLE_TEXT);
		Thread.sleep(1000);
	}
	
	@Test
	public void aboutUsFirstParaVerify() throws InterruptedException {
		getDriver().get(aboutUsPage.ABOUTUS_URL);
		Thread.sleep(1000);
		aboutUsPage.assertionHard(aboutUsPage.FIRST_PARA_LOCATOR, aboutUsPage.FIRST_PARA_TEXT);
		Thread.sleep(1000);
	}
	
	@Test
	public void aboutUsSecondParaVerify() throws InterruptedException {
		getDriver().get(aboutUsPage.ABOUTUS_URL);
		Thread.sleep(1000);
		aboutUsPage.assertionHard(aboutUsPage.SCEOND_PARA_LOCATOR, aboutUsPage.SCEOND_PARA_TEXT);
		Thread.sleep(1000);
	}
	
	@Test
	public void aboutUsUniqueFeatureBodyVerify() throws InterruptedException {
		getDriver().get(aboutUsPage.ABOUTUS_URL);
		Thread.sleep(1000);
		aboutUsPage.scrollingDownTillElementFound(aboutUsPage.UNIQUE_FEATURE_BODY_LOCATOR);
		Thread.sleep(1000);
		//System.out.println(aboutUsPage.getText(aboutUsPage.UNIQUE_FEATURE_BODY_LOCATOR));
		aboutUsPage.assertionHard(aboutUsPage.UNIQUE_FEATURE_BODY_LOCATOR, aboutUsPage.UNIQUE_FEATURE_BODY_TEXT);
		Thread.sleep(1000);
	}
	
	@Test
	public void aboutUsUniqueFeatureTittleVerify() throws InterruptedException {
		getDriver().get(aboutUsPage.ABOUTUS_URL);
		Thread.sleep(1000);
		aboutUsPage.scrollingDownTillElementFound(aboutUsPage.UNIQUE_FEATURE_TITTLE_LOCATOR);
		Thread.sleep(1000);
		aboutUsPage.assertionHard(aboutUsPage.UNIQUE_FEATURE_TITTLE_LOCATOR, aboutUsPage.UNIQUE_FEATURE_TITTLE_TEXT);
		Thread.sleep(1000);
	}
	
	@Test
	public void aboutUsWhyChooseSiteTittleVerify() throws InterruptedException {
		getDriver().get(aboutUsPage.ABOUTUS_URL);
		Thread.sleep(1000);
		aboutUsPage.scrollingDownTillElementFound(aboutUsPage.WHY_CHOOSE_OUR_SITE_TITTLE_LOCATOR);
		Thread.sleep(1000);
		aboutUsPage.assertionHard(aboutUsPage.WHY_CHOOSE_OUR_SITE_TITTLE_LOCATOR, aboutUsPage.WHY_CHOOSE_OUR_SITE_TITTLE_TEXT);
		Thread.sleep(1000);
	}
	
	@Test
	public void aboutUsWhyChooseSiteBodyVerify() throws InterruptedException {
		getDriver().get(aboutUsPage.ABOUTUS_URL);
		Thread.sleep(1000);
		aboutUsPage.scrollingDownTillElementFound(aboutUsPage.WHY_CHOOSE_OUR_SITE_TITTLE_LOCATOR);
		Thread.sleep(1000);
		aboutUsPage.assertionHard(aboutUsPage.WHY_CHOOSE_OUR_SITE_BODY_LOCATOR, aboutUsPage.WHY_CHOOSE_OUR_SITE_BODY_TEXT);
		Thread.sleep(1000);
	}
	
	@Test
	public void aboutUsEasyToCreateResumeTittleVerify() throws InterruptedException {
		getDriver().get(aboutUsPage.ABOUTUS_URL);
		Thread.sleep(1000);
		aboutUsPage.scrollingDownTillElementFound(aboutUsPage.EASY_TO_CREATE_A_RESUME_TITTLE_LOCATOR);
		Thread.sleep(1000);
		aboutUsPage.assertionHard(aboutUsPage.EASY_TO_CREATE_A_RESUME_TITTLE_LOCATOR, aboutUsPage.EASY_TO_CREATE_A_RESUME_TITTLE_TEXT);
		Thread.sleep(1000);
	}
	
	@Test
	public void aboutUsEasyToCreateResumeBody1Verify() throws InterruptedException {
		getDriver().get(aboutUsPage.ABOUTUS_URL);
		Thread.sleep(1000);
		aboutUsPage.scrollingDownTillElementFound(aboutUsPage.EASY_TO_CREATE_A_RESUME_TITTLE_LOCATOR);
		Thread.sleep(1000);
		System.out.println(aboutUsPage.getText(aboutUsPage.EASY_TO_CREATE_A_RESUME_BODY1_LOCATOR));
		aboutUsPage.assertionHard(aboutUsPage.EASY_TO_CREATE_A_RESUME_BODY1_LOCATOR, aboutUsPage.EASY_TO_CREATE_A_RESUME_BODY1_TEXT);
		Thread.sleep(1000);
	}
	
	@Test
	public void aboutUsEasyToCreateResumeBody2Verify() throws InterruptedException {
		getDriver().get(aboutUsPage.ABOUTUS_URL);
		Thread.sleep(1000);
		aboutUsPage.scrollingDownTillElementFound(aboutUsPage.EASY_TO_CREATE_A_RESUME_TITTLE_LOCATOR);
		Thread.sleep(1000);
		aboutUsPage.assertionHard(aboutUsPage.EASY_TO_CREATE_A_RESUME_BODY2_LOCATOR, aboutUsPage.EASY_TO_CREATE_A_RESUME_BODY2_TEXT);
		Thread.sleep(1000);
	}

}
