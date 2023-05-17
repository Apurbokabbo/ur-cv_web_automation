package pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage{
	
	
	
	public String CART_URL ="https://ur-cv.com/cart";
	
	
	public By BACK_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]");
	public By TOTAL_CART_NUMBER_SHOWN = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]");
	public By EXPIRE_NOTIFY = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/p[1]");
	public By CV_SELECT_CHECKBOX = By.xpath("//input[@id='cv0']");
	public By REMOVE_BUTTON = By.xpath("//span[contains(text(),'Remove')]");
	public By CHECKOUT_BUTTON = By.xpath("//button[contains(text(),'Proceed to checkout')]");
	public By COUPON_INPUT_FIELD = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]");
	public By COUPON_APPLY_BUTTON = By.xpath("//button[contains(text(),'Apply')]");
	public By TOTAL_AMOUNT_LOCATOR = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/p[2]");
	public By DISCOUNT_AMOUNT_LOCATOR = By.xpath("//p[contains(text(),'0 BDT')]");
	public By GRAND_TOTAL_AMOUNT_LOCATOR = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/p[2]");
	public By REMOVE_BUTTON_POP_UP = By.xpath("//button[contains(text(),'Remove from cart')]");



}
