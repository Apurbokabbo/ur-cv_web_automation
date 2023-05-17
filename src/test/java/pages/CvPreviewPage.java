package pages;

import org.openqa.selenium.By;

public class CvPreviewPage extends BasePage {
	
	
	String SAMPLE_CV_TEXT = "Take a look at the sample CV along with all information";
	String OWN_CV_TEXT="To preview the CV along with your information";
	
	By CLICK_HERE_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/p[1]/a[1]");
	By SELECT_COLOR_2=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]");
	By EDIT_PROFILE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/a[1]");
	By ADD_TO_CART_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]");
	By COLLAPSE_TEMPLATE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[3]/div[1]/button[1]/span[2]");
	By SCRTOLL_RIGHT_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[3]/div[2]/div[1]/div[1]/span[2]/div[1]/button[1]");
	By SCRTOLL_LEFT_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[3]/div[2]/div[1]/div[1]/span[1]/div[1]/button[1]");
	By TEMPLATE_GALLARY_LOCATOR=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/img[1]");
	By CHECK_OUT_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/a[2]");
	By INFO_TEXT_LOCATOR=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/p[1]");
	By CV_DOWNLAOD_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/button[1]");

}
