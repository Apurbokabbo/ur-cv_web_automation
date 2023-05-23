package testcases;

import org.testng.annotations.Test;
import pages.BlogsPage;
import utilities.BaseDriver;

public class BlogPageTestCase extends BaseDriver {
	
	BlogsPage blogsPage = new BlogsPage();

	@Test
	public void blogPageURLVerify() throws InterruptedException{
		getDriver().get(blogsPage.BLOGS_PAGE_URL);
		Thread.sleep(1000);
		blogsPage.assertionURL(blogsPage.BLOGS_PAGE_URL);

	}
	
	@Test
	public void vlog1TittleUrlVerify() throws InterruptedException {
		 getDriver().get(blogsPage.BLOGS_PAGE_URL);
		 blogsPage.blogTittleUrlVerify( blogsPage.BLOG_1_LOCATOR,blogsPage.BLOGS_1_URL, blogsPage.BLOG_1_TITTLE_LOCATOR, blogsPage.BLOGS_1_TITTLE_TEXT);
		 	
	}
	
	@Test
	public void vlog2TittleUrlVerify() throws InterruptedException {
		 getDriver().get(blogsPage.BLOGS_PAGE_URL);
		 blogsPage.blogTittleUrlVerify( blogsPage.BLOG_2_LOCATOR,blogsPage.BLOGS_2_URL, blogsPage.BLOG_2_TITTLE_LOCATOR, blogsPage.BLOGS_2_TITTLE_TEXT);
		 	
	}
	
	@Test
	public void vlog3TittleUrlVerify() throws InterruptedException {
		 getDriver().get(blogsPage.BLOGS_PAGE_URL);
		 blogsPage.blogTittleUrlVerify( blogsPage.BLOG_3_LOCATOR,blogsPage.BLOGS_3_URL, blogsPage.BLOG_3_TITTLE_LOCATOR, blogsPage.BLOGS_3_TITTLE_TEXT);
		 	
	}
	
	@Test
	public void vlog4TittleUrlVerify() throws InterruptedException {
		 getDriver().get(blogsPage.BLOGS_PAGE_URL);
		 blogsPage.blogTittleUrlVerify( blogsPage.BLOG_4_LOCATOR,blogsPage.BLOGS_4_URL, blogsPage.BLOG_4_TITTLE_LOCATOR, blogsPage.BLOGS_4_TITTLE_TEXT);
		 	
	}
	
	@Test
	public void vlog5TittleUrlVerify() throws InterruptedException {
		 getDriver().get(blogsPage.BLOGS_PAGE_URL);
		 blogsPage.blogTittleUrlVerify( blogsPage.BLOG_5_LOCATOR,blogsPage.BLOGS_5_URL, blogsPage.BLOG_5_TITTLE_LOCATOR, blogsPage.BLOGS_5_TITTLE_TEXT);
		 	
	}
	
	@Test
	public void vlog6TittleUrlVerify() throws InterruptedException {
		getDriver().get(blogsPage.BLOGS_PAGE_URL);
		blogsPage.blogTittleUrlVerify( blogsPage.BLOG_6_LOCATOR,blogsPage.BLOGS_6_URL, blogsPage.BLOG_6_TITTLE_LOCATOR, blogsPage.BLOGS_6_TITTLE_TEXT);
		
	}
	

	@Test
	public void vlog7TittleUrlVerify() throws InterruptedException {
		getDriver().get(blogsPage.BLOGS_PAGE_URL);
		blogsPage.blogTittleUrlVerify( blogsPage.BLOG_7_LOCATOR,blogsPage.BLOGS_7_URL, blogsPage.BLOG_7_TITTLE_LOCATOR, blogsPage.BLOGS_7_TITTLE_TEXT);
		
	}
	

	@Test
	public void vlog8TittleUrlVerify() throws InterruptedException {
		getDriver().get(blogsPage.BLOGS_PAGE_URL);
		blogsPage.blogTittleUrlVerify( blogsPage.BLOG_8_LOCATOR,blogsPage.BLOGS_8_URL, blogsPage.BLOG_8_TITTLE_LOCATOR, blogsPage.BLOGS_8_TITTLE_TEXT);
		
	}
	

	@Test
	public void vlog9TittleUrlVerify() throws InterruptedException {
		getDriver().get(blogsPage.BLOGS_PAGE_URL);
		blogsPage.blogTittleUrlVerify( blogsPage.BLOG_9_LOCATOR,blogsPage.BLOGS_9_URL, blogsPage.BLOG_9_TITTLE_LOCATOR, blogsPage.BLOGS_9_TITTLE_TEXT);
		
	}
	

	@Test
	public void vlog10TittleUrlVerify() throws InterruptedException {
		getDriver().get(blogsPage.BLOGS_PAGE_URL);
		blogsPage.blogTittleUrlVerify( blogsPage.BLOG_10_LOCATOR,blogsPage.BLOGS_10_URL, blogsPage.BLOG_10_TITTLE_LOCATOR, blogsPage.BLOGS_10_TITTLE_TEXT);
		
	}
	

	@Test
	public void vlog11TittleUrlVerify() throws InterruptedException {
		getDriver().get(blogsPage.BLOGS_PAGE_URL);
		blogsPage.blogTittleUrlVerify( blogsPage.BLOG_11_LOCATOR,blogsPage.BLOGS_11_URL, blogsPage.BLOG_11_TITTLE_LOCATOR, blogsPage.BLOGS_11_TITTLE_TEXT);
		
	}






}
