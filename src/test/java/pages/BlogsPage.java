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
	
	
	
	
	By BLOG_1_LOCATOR = By.xpath("//p[contains(text(),'Create a Professional CV Online in Minutes Using w')]");
	By BLOG_2_LOCATOR = By.xpath("//p[contains(text(),'How To Tailor Your CV To The Job Description')]");
	By BLOG_3_LOCATOR = By.xpath("//p[contains(text(),'Hobbies And Interests On Your CV : A Guide')]");
	By BLOG_4_LOCATOR = By.xpath("//p[contains(text(),'How many pages should a CV be? - A CV format gener')]");
	By BLOG_5_LOCATOR = By.xpath("//p[contains(text(),'How to write a CV: A comprehensive guide')]");
	By BLOG_6_LOCATOR = By.xpath("//p[contains(text(),'Creative CVs: How to make your CV stand out')]");
	By BLOG_7_LOCATOR = By.xpath("//p[contains(text(),'The different types Of CV')]");
	By BLOG_8_LOCATOR = By.xpath("//p[contains(text(),'How to write a CV with no experience')]");
	By BLOG_9_LOCATOR = By.xpath("//p[contains(text(),'How to update your resume in 2022')]");
	By BLOG_10_LOCATOR = By.xpath("//p[contains(text(),'How to build a strong resume')]");
	By BLOG_11_LOCATOR = By.xpath("//p[contains(text(),'12 Common resume mistakes and how to avoid them')]");
	By BLOG_BACK_BUTTON =By.xpath("//body/div[@id='app']/div[@id='laravel-block']/div[2]/div[1]/a[1]");
	
	

}
