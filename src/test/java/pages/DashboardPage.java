package pages;

import org.openqa.selenium.By;

public class DashboardPage extends BasePage {
	
	
	String DASHBOARD_URL="https://ur-cv.com/dashboard/my-profile";
	
	By LOGIN_USER_MENU_LOCATOR =By.xpath("//body/div[@id='app']/div[1]/div[2]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
	By FROM_MENU_DASHBOARD_MENU=By.xpath("//body/div[@id='app']/div[1]/div[2]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
	By lOGOUT_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[2]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]");
	By USER_PROFILE_BUTTON=By.xpath("//a[contains(text(),'My Profile')]");
	By USER_CV_TEMPLATE_BUTTON=By.xpath("//a[contains(text(),'My CV template')]");
	By USER_PAYMENT_HISTORY_BUTTON=By.xpath("//a[contains(text(),'Payment history')]");
	By EDIT_STEP_BY_STEP_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/a[1]");
	By CHOOSE_TEMPLATE_BUTTON=By.xpath("//a[contains(text(),'Choose template')]");
	

}
