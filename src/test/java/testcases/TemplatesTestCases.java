package testcases;

import org.testng.annotations.Test;
import pages.TemplatesPage;
import utilities.BaseDriver;

public class TemplatesTestCases extends BaseDriver {
	
	TemplatesPage templatesPage = new TemplatesPage();
	
	
	@Test
	public void filterRightButtonTest() throws InterruptedException {
		getDriver().get(templatesPage.TEMPLATES_URL);
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.CEROSOL_RIGHT_BUTTON).click();
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.CEROSOL_RIGHT_BUTTON).click();
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.FILTER_BY_DESIGN).click();
		Thread.sleep(1000);
	}
	
	@Test
	public void filterLeftButtonTest() throws InterruptedException {
		getDriver().get(templatesPage.TEMPLATES_URL);
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.CEROSOL_RIGHT_BUTTON).click();
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.CEROSOL_LEFT_BUTTON).click();
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.CEROSOL_LEFT_BUTTON).click();
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.FILTER_BY_ALL).click();
		Thread.sleep(1000);
	}
	
	@Test
	public void filterByElement() throws InterruptedException {
		getDriver().get(templatesPage.TEMPLATES_URL);
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.FILTER_BY_LOGISTICS).click();
		Thread.sleep(2000);
		templatesPage.findElement(templatesPage.FILTER_BY_LOGISTICS_ELEMENT_SELECT).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void filterByElementDeselect() throws InterruptedException {
		getDriver().get(templatesPage.TEMPLATES_URL);
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.FILTER_BY_LOGISTICS).click();
		Thread.sleep(1000);	
		templatesPage.findElement(templatesPage.FILTER_BY_LOGISTICS).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void filterScrollLastElement() throws InterruptedException {
		getDriver().get(templatesPage.TEMPLATES_URL);
		templatesPage.findElement(templatesPage.CEROSOL_RIGHT_BUTTON).click();
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.CEROSOL_RIGHT_BUTTON).click();
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.CEROSOL_RIGHT_BUTTON).click();
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.CEROSOL_RIGHT_BUTTON).click();
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.CEROSOL_RIGHT_BUTTON).click();
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.CEROSOL_RIGHT_BUTTON).click();
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.FILTER_BY_LAST_ELEMENT_OTHER).click();
		Thread.sleep(1000);
		
	}
	
	@Test
	public void searchUsingWhiteSpace() throws InterruptedException {
		getDriver().get(templatesPage.TEMPLATES_URL);
		templatesPage.findElement(templatesPage.SEARCH_INPUT_FIELD).sendKeys(templatesPage.SEARCH_EMPTY);;
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.SEARCH_BUTTON).click();
		Thread.sleep(1000);
		
	}
	
	@Test
	public void searchValidName() throws InterruptedException {
		getDriver().get(templatesPage.TEMPLATES_URL);
		templatesPage.findElement(templatesPage.SEARCH_INPUT_FIELD).sendKeys(templatesPage.SEARCH_ELEMENT);;
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.SEARCH_BUTTON).click();
		Thread.sleep(2000);
		
	}
	
	
	@Test
	public void searchValidNameSelect() throws InterruptedException {
		getDriver().get(templatesPage.TEMPLATES_URL);
		templatesPage.findElement(templatesPage.SEARCH_INPUT_FIELD).sendKeys(templatesPage.SEARCH_ELEMENT);;
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.SEARCH_DROPDOWN_SELECT_GIVING_NAME).click();
		Thread.sleep(2000);
		templatesPage.assertionURL(templatesPage.MODERN_CV_102_URL);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void searchByLargeName()  throws InterruptedException{
		getDriver().get(templatesPage.TEMPLATES_URL);
		templatesPage.findElement(templatesPage.SEARCH_INPUT_FIELD).sendKeys(templatesPage.SEARCH_LARGE_NAME);;
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.SEARCH_BUTTON).click();
		Thread.sleep(2000);
		templatesPage.assertionHard(templatesPage.SEARCH_NOT_FOUND_LOCATOR, templatesPage.SEARCH_NOT_FOUND);
		Thread.sleep(1000);
		
	}
	
	@Test
	public void templatePageScroll() throws InterruptedException {
		getDriver().get(templatesPage.TEMPLATES_URL);
		Thread.sleep(1000);
		templatesPage.scrollingDownTillElementFound(templatesPage.LAST_TEMPLATE);
		Thread.sleep(1000);
		templatesPage.scrollUp();
		Thread.sleep(1000);
		templatesPage.findElement(templatesPage.LAST_TEMPLATE).click();
		Thread.sleep(1000);
		templatesPage.assertionURL(templatesPage.FUNDAMENTAL_CV_101_URL);
		Thread.sleep(1000);
	}
	

}
