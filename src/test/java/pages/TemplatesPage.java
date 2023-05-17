package pages;

import org.openqa.selenium.By;

public class TemplatesPage extends BasePage{
	
	
	public String TEMPLATES_URL = "https://ur-cv.com/all-templates";
	public String MODERN_CV_102_URL = "https://ur-cv.com/preview/modern-102";
	public String FUNDAMENTAL_CV_101_URL = "https://ur-cv.com/preview/fundamental-101";
	public String SEARCH_EMPTY = "     ";
	public String SEARCH_LARGE_NAME = "afqwefewqfewfewfwefwefwefewfwefwefwefwefwefwefwefewfewfwefewfwefwefwefwefwefwfwefwef";
	public String SEARCH_ELEMENT = "modern";
	public String SEARCH_NOT_FOUND = "Sorry, we couldn’t find any results for this search. Please try a different word.";
	
	
	
	public By SEARCH_NOT_FOUND_LOCATOR =By.xpath("//p[contains(text(),'couldn’t find any results for ')]");
	public By SEARCH_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]");
	public By SEARCH_BUTTON=By.xpath("//button[contains(text(),'Search')]");
	public By CEROSOL_LEFT_BUTTON =By.xpath("//button[@id='left-button']");
	public By CEROSOL_RIGHT_BUTTON=By.xpath("//button[@id='right-button']");
	public By FIRST_TEMPLATE=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[2]/a[1]/div[1]/div[1]/div[1]/img[1]");
	public By LAST_TEMPLATE=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[2]/a[12]/div[1]/div[1]/div[1]/img[1]");
	public By FILTER_BY_LOGISTICS=By.xpath("//a[contains(text(),'Logistics')]");
	public By FILTER_BY_DESIGN=By.xpath("//a[contains(text(),'Design')]");
	public By FILTER_BY_ALL=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]");
	public By FILTER_BY_LOGISTICS_ELEMENT_SELECT=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[2]/a[3]/div[1]/div[1]/div[1]/img[1]");
	public By SEARCH_DROPDOWN_SELECT_ONE =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/a[3]/div[2]/p[1]");
	public By SEARCH_DROPDOWN_SELECT_GIVING_NAME =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/a[2]/div[2]/p[1]");
	public By FILTER_BY_LAST_ELEMENT_OTHER=By.xpath("//a[contains(text(),'Others')]");
	public By ADD_TO_CART_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]");
	public By CHECK_OUT_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]");
}
