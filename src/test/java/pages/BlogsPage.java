package pages;

import org.openqa.selenium.By;

public class BlogsPage extends BasePage{
	
	public String BLOGS_PAGE_URL = "https://ur-cv.com/blogs";
	public String BLOGS_1_URL = "https://ur-cv.com/blogs/create-a-professional-cv-online-in-minutes-using-wwwur-cvcom";
	public String BLOGS_2_URL = "https://ur-cv.com/blogs/how-to-tailor-your-cv-to-the-job-description";
	public String BLOGS_3_URL = "https://ur-cv.com/blogs/hobbies-and-interests-on-your-cv-a-guide";
	public String BLOGS_4_URL = "https://ur-cv.com/blogs/how-many-pages-should-a-cv-be-a-cv-format-generator";
	public String BLOGS_5_URL = "https://ur-cv.com/blogs/how-to-write-a-cv-a-comprehensive-guide";
	public String BLOGS_6_URL = "https://ur-cv.com/blogs/creative-cvs-how-to-make-your-cv-stand-out";
	public String BLOGS_7_URL = "https://ur-cv.com/blogs/the-different-types-of-cv";
	public String BLOGS_8_URL = "https://ur-cv.com/blogs/how-to-write-a-cv-with-no-experience";
	public String BLOGS_9_URL = "https://ur-cv.com/blogs/how-to-update-your-resume-in-2022";
	public String BLOGS_10_URL = "https://ur-cv.com/blogs/how-to-build-a-strong-resume";
	public String BLOGS_11_URL = "https://ur-cv.com/blogs/12-common-resume-mistakes-and-how-to-avoid-them";
	public String BLOGS_1_TITTLE_TEXT = "Create a Professional CV Online in Minutes Using www.ur-cv.com";
	public String BLOGS_2_TITTLE_TEXT = "How To Tailor Your CV To The Job Description";
	public String BLOGS_3_TITTLE_TEXT = "Hobbies And Interests On Your CV : A Guide";
	public String BLOGS_4_TITTLE_TEXT = "How many pages should a CV be? - A CV format generator";
	public String BLOGS_5_TITTLE_TEXT = "How to write a CV: A comprehensive guide";
	public String BLOGS_6_TITTLE_TEXT = "Creative CVs: How to make your CV stand out";
	public String BLOGS_7_TITTLE_TEXT = "The different types Of CV";
	public String BLOGS_8_TITTLE_TEXT = "How to write a CV with no experience";
	public String BLOGS_9_TITTLE_TEXT = "How to update your resume in 2022";
	public String BLOGS_10_TITTLE_TEXT = "How to build a strong resume";
	public String BLOGS_11_TITTLE_TEXT = "12 Common resume mistakes and how to avoid them";
	
	
	public By BLOG_1_LOCATOR = By.xpath("//p[contains(text(),'Create a Professional CV Online in Minutes Using w')]");
	public By BLOG_2_LOCATOR = By.xpath("//p[contains(text(),'How To Tailor Your CV To The Job Description')]");
	public By BLOG_3_LOCATOR = By.xpath("//p[contains(text(),'Hobbies And Interests On Your CV : A Guide')]");
	public By BLOG_4_LOCATOR = By.xpath("//p[contains(text(),'How many pages should a CV be? - A CV format gener')]");
	public By BLOG_5_LOCATOR = By.xpath("//p[contains(text(),'How to write a CV: A comprehensive guide')]");
	public By BLOG_6_LOCATOR = By.xpath("//p[contains(text(),'Creative CVs: How to make your CV stand out')]");
	public By BLOG_7_LOCATOR = By.xpath("//p[contains(text(),'The different types Of CV')]");
	public By BLOG_8_LOCATOR = By.xpath("//p[contains(text(),'How to write a CV with no experience')]");
	public By BLOG_9_LOCATOR = By.xpath("//p[contains(text(),'How to update your resume in 2022')]");
	public By BLOG_10_LOCATOR = By.xpath("//p[contains(text(),'How to build a strong resume')]");
	public By BLOG_11_LOCATOR = By.xpath("//p[contains(text(),'12 Common resume mistakes and how to avoid them')]");
	public By BLOG_BACK_BUTTON =By.xpath("//body/div[@id='app']/div[@id='laravel-block']/div[2]/div[1]/a[1]");
	public By BLOG_1_TITTLE_LOCATOR =By.xpath("//h1[contains(text(),'Create a Professional CV Online in Minutes Using w')]");
	public By BLOG_2_TITTLE_LOCATOR =By.xpath("//h1[contains(text(),'How To Tailor Your CV To The Job Description')]");
	public By BLOG_3_TITTLE_LOCATOR =By.xpath("//h1[contains(text(),'Hobbies And Interests On Your CV : A Guide')]");
	public By BLOG_4_TITTLE_LOCATOR =By.xpath("//h1[contains(text(),'How many pages should a CV be? - A CV format gener')]");
	public By BLOG_5_TITTLE_LOCATOR =By.xpath("//h1[contains(text(),'How to write a CV: A comprehensive guide')]");
	public By BLOG_6_TITTLE_LOCATOR =By.xpath("//h1[contains(text(),'Creative CVs: How to make your CV stand out')]");
	public By BLOG_7_TITTLE_LOCATOR =By.xpath("//h1[contains(text(),'The different types Of CV')]");
	public By BLOG_8_TITTLE_LOCATOR =By.xpath("//h1[contains(text(),'How to write a CV with no experience')]");
	public By BLOG_9_TITTLE_LOCATOR =By.xpath("//h1[contains(text(),'How to update your resume in 2022')]");
	public By BLOG_10_TITTLE_LOCATOR =By.xpath("//h1[contains(text(),'How to build a strong resume')]");
	public By BLOG_11_TITTLE_LOCATOR =By.xpath("//h1[contains(text(),'12 Common resume mistakes and how to avoid them')]");
	
	public void blogTittleUrlVerify(By bloglocator,String expectedUrl,By Tittlelocator, String expectedTittle ) throws InterruptedException{

		try {
			 hover(bloglocator);
			 
			 Thread.sleep(1000);
			 findElement(bloglocator).click();
			 Thread.sleep(1000);
			 assertionURL(expectedUrl);
			 Thread.sleep(1000);
			 assertionHard(Tittlelocator, expectedTittle);
			 Thread.sleep(1000);
			 findElement(BLOG_BACK_BUTTON).click();
			 Thread.sleep(1000);
			assertionURL(BLOGS_PAGE_URL);
			 Thread.sleep(1000);
			
		} 
		catch (Exception e) {
			
			scrollingDownTillElementFound(bloglocator);
			Thread.sleep(1000);
			scrollUp();
			Thread.sleep(1000);
			hover(bloglocator);
			
			Thread.sleep(1000);
			findElement(bloglocator).click();
			Thread.sleep(1000);
			assertionURL(expectedUrl);
			Thread.sleep(1000);
			assertionHard(Tittlelocator, expectedTittle);
			Thread.sleep(1000);
			findElement(BLOG_BACK_BUTTON).click();
			Thread.sleep(1000);
			assertionURL(BLOGS_PAGE_URL);
			Thread.sleep(1000);
		}
    }
	
	

}
