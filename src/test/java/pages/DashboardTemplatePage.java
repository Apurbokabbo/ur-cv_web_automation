package pages;

import org.openqa.selenium.By;

public class DashboardTemplatePage extends BasePage{
	
	
	
	By PRUCHASE_CV_BUTTON=By.xpath("//a[contains(text(),'Purchase CV')]");
	By SELL_ALL_TEMPLATE_BUTTON=By.xpath("//a[contains(text(),'See all templates')]");
	By SUGGESTED_CV_1 =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/div[1]/img[1]");
	By PURCHASED_CV_1=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/div[1]/img[1]");
	By PURCHASED_CV_TAG_LOCATOR=By.xpath("//span[contains(text(),'Purchased')]");


}
