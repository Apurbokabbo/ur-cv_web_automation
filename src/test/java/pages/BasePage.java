package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import io.qameta.allure.Allure;

import static org.testng.Assert.assertEquals;
import static utilities.BaseDriver.getDriver;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class BasePage {
	
	public String BASE_URL="https://ur-cv.com/";
	public By NAV_LOGO_HOME_BUTTON= By.xpath("//body/div[@id='app']/div[1]/div[2]/nav[1]/div[1]/a[1]/img[1]");
	public By NAV_HOME_BUTTON= By.xpath("//a[@id='nave_home']");
	public By NAV_TEMPALTE_BUTTON= By.xpath("//a[@id='nav_cv_template']");
	public By NAV_ABOUTUS_BUTTON= By.xpath("//a[@id='nav_about_us']");
	public By NAV_CART_BUTTON= By.xpath("//body/div[@id='app']/div[1]/div[2]/nav[1]/div[1]/div[2]/a[1]");
	public By NAV_LOGIN_BUTTON= By.xpath("//body/div[@id='app']/div[1]/div[2]/nav[1]/div[1]/div[2]/a[2]");
	
	public WebElement findElement(By locator)
	{
		return getDriver().findElement(locator);	
	}
	
	public void clickOn(By locator) 
	{
		findElement(locator).click();	
	}
	
	public void writeText(By locator , String text)
	{
		findElement(locator).sendKeys(text);	
	}
	
	public String getText(By locator) 
	{
		return findElement(locator).getText();
	}
	
	public String getUrl() 
	{
		return getDriver().getCurrentUrl();
	}
	
	public void hover(By locator) 
	{
		Actions action =  new Actions(getDriver());
		action.moveToElement(findElement(locator)).perform();
	}
	
	public void assertionHard(By locator, String expected) 
	{
		assertEquals(getText(locator), expected);
	}
	
	public void assertionURL(String expected) 
	{
		assertEquals(getUrl(), expected);
	}
	
	public void assertionSoft(By locator, String expected) 
	{
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(getText(locator), expected);
		softAssert.assertAll();
	}
	
	public void alertAccept(By locator) 
	{
		clickOn(locator);
		getDriver().switchTo().alert().accept();
	}
	
	public void alertCancel(By locator)
	{
		clickOn(locator);
		getDriver().switchTo().alert().dismiss();
	}
	
	public void alertInput(By locator, String text) 
	{
		clickOn(locator);
		getDriver().switchTo().alert().sendKeys(text);
		
	}
	
	public void dropDownSelectByVisibleText(By locator, String text) 
	{
		Select select = new Select(findElement(locator));
		select.selectByVisibleText(text);
	}
	
	public void dropDownSelectByValue(By locator, String text) 
	{
		Select select = new Select(findElement(locator));
		select.selectByValue(text);
	}
	
	public void dropDownSelectByIndex(By locator, int index) 
	{
		Select select = new Select(findElement(locator));
		select.selectByIndex(index);
		
	}
	
	public void dropDownDeselectByVisibleText(By locator, String text) 
	{
		Select select = new Select(findElement(locator));
		select.deselectByVisibleText(text);
	}
	
	public void dropDownDeselectByValue(By locator, String text) 
	{
		Select select = new Select(findElement(locator));
		select.deselectByValue(text);
	}
	
	public void dropDownDeselectByIndex(By locator, int index) 
	{
		Select select = new Select(findElement(locator));
		select.deselectByIndex(index);
		
	}
	
	public void newTab() 
	{
		getDriver().switchTo().newWindow(WindowType.TAB);	
	}
	
	public void newWindow() 
	{
		getDriver().switchTo().newWindow(WindowType.WINDOW);
	}
	
	public List<String> windowHandling()
	{
		Set<String> windowHandles = getDriver().getWindowHandles();
		ArrayList<String> windowHandlesList = new ArrayList<String>(windowHandles);
		int size = windowHandlesList.size();
		System.out.println("Window/Tab numbers: "+size);
		return windowHandlesList;
	}
	
	public void windowSwitch(int tabnumber) 
	{
		try 
		{
			getDriver().switchTo().window(windowHandling().get(tabnumber));
		} 
		catch (Exception e) 
		{
			System.out.println("Window tab number not exist!!!" +"Tab number is given :"+ tabnumber);
		}

	}
	
	public void navigaterForward() 
	{
		getDriver().navigate().forward();
	}
	
	public void navigaterBack() 
	{
		getDriver().navigate().back();
	}
	
	public void navigaterRefresh() 
	{
		getDriver().navigate().refresh();
	}
	
	public void navigaterTo(String url) 
	{
		getDriver().navigate().to(url);
	}
	
	
	public void closeBanner(By locator) 
	{
		try 
		{
			clickOn(locator);
		} 
		catch (Exception e) 
		{
			System.out.println("Banner not found!");
		}

	}
	
	
	public void visibilityTest(By locator) 
	{
		try 
		{
			if(findElement(locator).isDisplayed()) 
			{
				
				Thread.sleep(3000);	
			}
		} 
		catch (Exception e) 
		{
			System.out.println("The locator is not visible!!!!!!");
		}
		
	}
	
	public void findlTotalElement(String tagName) 
	{
		List<WebElement> elements = getDriver().findElements(By.tagName(tagName));
		System.out.println(elements.size());	
	}
	
	public void keyboardTab() 
	{
		Actions action =  new Actions(getDriver());
		action.sendKeys(Keys.TAB);
		action.build().perform();	
	}
	
	public void tabOnEnterOnKeyboard() 
	{
		Actions action =  new Actions(getDriver());
		action.sendKeys(Keys.ENTER);
		action.build().perform();
	}
	
	public void keyboardSelectAll(By locator) 
	{
		Actions action =  new Actions(getDriver());
		findElement(locator);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
	}
	
	public void keyboardCopy(By locator) 
	{
		Actions action =  new Actions(getDriver());
		keyboardSelectAll(locator);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
	}
	
	public void keyboardPaste(By locator) 
	{
		Actions action =  new Actions(getDriver());
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
	}
	
	public void scrollingDownTillElementFound(By locator) 
	{

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", findElement(locator));

	}
	
	public void scrollHorizontally(By locator) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();", findElement(locator));
	
	}	
	
	public void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,-350)", "");	
	}
	
	public void scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,350)", "");	
	}
	
	public void takeScreenShotAllureAttach(String screenshotname) {
		Allure.addAttachment(screenshotname, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
		
	}
	
	
	
}
