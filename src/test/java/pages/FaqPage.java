package pages;

import org.openqa.selenium.By;

public class FaqPage extends BasePage {
	
	public String FAQ_PAGE_URL = "https://ur-cv.com/frequently-ask-question";
	public String FAQ_PAGE_QUEST_1_TEXT = "Is UR-CV free to use?";
	public String FAQ_PAGE_QUEST_2_TEXT = "Which is the right template for my job position?";
	public String FAQ_PAGE_QUEST_3_TEXT = "How can I write resume content professionally?";
	public String FAQ_PAGE_QUEST_4_TEXT = "In which format I can download my CV?";
	public String FAQ_PAGE_QUEST_5_TEXT = "Will my resume be publicly accessible?";
	public String FAQ_PAGE_QUEST_6_TEXT = "What is the payment method for purchasing templates?";
	public String FAQ_PAGE_QUEST_7_TEXT = "Can I edit the template I bought once and use it for the rest of my life?";
	public String FAQ_PAGE_QUEST_8_TEXT = "How many templates do UR-CV have?";
	public String FAQ_PAGE_QUEST_9_TEXT = "Can a resume be more than one page ?";
	public String FAQ_PAGE_QUEST_10_TEXT = "What's the deifference between a resume and a carriculum vitae?";
	public String FAQ_PAGE_ANSWER_1_TEXT = "Yes your UR-CV is free to use if you are using the free templates. There are multiple free templates that can be used to create CVs for free.";
	public String FAQ_PAGE_ANSWER_2_TEXT = "Ur-CV is home to thousands of professionally created templates. By simply searching your current job position we will suggest a bunch of templates that will match your position and expectations. All the templates are designed in such a way that best represents the position intended and increases the chance of landing the desired job.";
	public String FAQ_PAGE_ANSWER_3_TEXT = "You no longer need to do the hard work of writing content. UR-CV will suggest your career objectives, Skills and also suggestions of responsibilities, and many more. All the contents are bespoke and generated automatically by advanced algorithms.";
	public String FAQ_PAGE_ANSWER_4_TEXT = "Currently, you can download PDF only but soon we will introduce Word format download as well.";
	public String FAQ_PAGE_ANSWER_5_TEXT = "NO, only you will be able to view, edit and download the CV created using UR-CV. All your data is safe and it will not be shared publicly.";
	public String FAQ_PAGE_ANSWER_6_TEXT = "You can use a free template absolutely free of cost. However, for a premium template, you need to purchase it. As of now, you can pay your bill via Bkash.";
	public String FAQ_PAGE_ANSWER_7_TEXT = "No, you cannot edit and download your premium template after a 6-months time period. Every premium template has a 6-month lifespan policy. Within these 6 months, you can edit and download your CV as many times as you want. However, after 6 months, you have to renew your purchase if you want to use your premium template again.";
	public String FAQ_PAGE_ANSWER_8_TEXT = "At the moment, our site features a total of 12 templates. Within these 12 templates, you'll discover both free and premium templates. We're still working on expanding the template library.";
	public String FAQ_PAGE_ANSWER_9_TEXT = "Yes, a resume can be more than one page long, but it shouldn't be unless you have considerable experience in your field. Most resumes for college students and recent graduates should fit on one page, provided you convey your expertise clearly and simply.";
	public String FAQ_PAGE_ANSWER_10_TEXT = "A curriculum vitae (CV) is an academic resume used for careers in research and college/university teaching. A resume is typically one page in length and focuses on the job experience. A CV can be as extensive as necessary to list one's skills, publications, papers delivered, etc. When people ask for a CV, they really mean a resume. Check with the individual who requested it to ensure you are using the correct version for that position.";
	
	
	
	public By FAQ_PAGE_BACK_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[1]/a[1]");
	public By FAQ_PAGE_QUEST_1_LOCATOR = By.xpath("//p[contains(text(),'Is UR-CV free to use?')]");
	public By FAQ_PAGE_QUEST_2_LOCATOR = By.xpath("//p[contains(text(),'Which is the right template for my job position?')]");
	public By FAQ_PAGE_QUEST_3_LOCATOR = By.xpath("//p[contains(text(),'How can I write resume content professionally?')]");
	public By FAQ_PAGE_QUEST_4_LOCATOR = By.xpath("//p[contains(text(),'In which format I can download my CV?')]");
	public By FAQ_PAGE_QUEST_5_LOCATOR = By.xpath("//p[contains(text(),'Will my resume be publicly accessible?')]");
	public By FAQ_PAGE_QUEST_6_LOCATOR = By.xpath("//p[contains(text(),'What is the payment method for purchasing template')]");
	public By FAQ_PAGE_QUEST_7_LOCATOR = By.xpath("//p[contains(text(),'Can I edit the template I bought once and use it f')]");
	public By FAQ_PAGE_QUEST_8_LOCATOR = By.xpath("//p[contains(text(),'How many templates do UR-CV have?')]");
	public By FAQ_PAGE_QUEST_9_LOCATOR = By.xpath("//p[contains(text(),'Can a resume be more than one page?')]");
	public By FAQ_PAGE_QUEST_10_LOCATOR = By.xpath("//p[contains(text(),\"What's the difference between a resume and a curri\")]");
	public By FAQ_PAGE_ANSWER_1_LOCATOR = By.xpath("//p[contains(text(),'Yes your UR-CV is free to use if you are using the')]");
	public By FAQ_PAGE_ANSWER_2_LOCATOR = By.xpath("//p[contains(text(),'Ur-CV is home to thousands of professionally creat')]");
	public By FAQ_PAGE_ANSWER_3_LOCATOR = By.xpath("//p[contains(text(),'You no longer need to do the hard work of writing ')]");
	public By FAQ_PAGE_ANSWER_4_LOCATOR = By.xpath("//p[contains(text(),'Currently, you can download PDF only but soon we w')]");
	public By FAQ_PAGE_ANSWER_5_LOCATOR = By.xpath("//p[contains(text(),'NO, only you will be able to view, edit and downlo')]");
	public By FAQ_PAGE_ANSWER_6_LOCATOR = By.xpath("//p[contains(text(),'You can use a free template absolutely free of cos')]");
	public By FAQ_PAGE_ANSWER_7_LOCATOR = By.xpath("//p[contains(text(),'No, you cannot edit and download your premium temp')]");
	public By FAQ_PAGE_ANSWER_8_LOCATOR = By.xpath("//p[contains(text(),'At the moment, our site features a total of 12 tem')]");
	public By FAQ_PAGE_ANSWER_9_LOCATOR = By.xpath("//p[contains(text(),'Yes, a resume can be more than one page long, but ')]");
	public By FAQ_PAGE_ANSWER_10_LOCATOR = By.xpath("//p[contains(text(),'A curriculum vitae (CV) is an academic resume used')]");
	
	public void faqQuestionAnswerVerifer(By previousQuestionLocator,By questionLoator , String questionText, By answerLocator,String answerText) throws InterruptedException {
		
		 
		assertionHard(questionLoator,questionText);
		Thread.sleep(1000);
		findElement(questionLoator).click();
		Thread.sleep(1000);
		assertionHard(answerLocator, answerText);
		Thread.sleep(1000);
		
		try {
			
			findElement(previousQuestionLocator).click();
					
		}
		catch (Exception e) {
			System.out.println("Previous Question's answer also closed!!!");
			
		}
		
		
		
	}

}
