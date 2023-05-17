package pages;

import org.openqa.selenium.By;

public class DashboardPaymentHistoryPage extends BasePage{
	
	String PAYMENT_HISTORY_URL = "https://ur-cv.com/dashboard/payment-history";
	String TANSACTION_TEXT="TXN-435768";
	
	
	By EXPAND_HISTORY_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/button[1]/span[1]");
	By TRANSACTION_LOCATOR =By.xpath("//p[contains(text(),'TXN-435768')]");
}
