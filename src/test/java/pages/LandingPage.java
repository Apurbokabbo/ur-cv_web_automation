package pages;

import org.openqa.selenium.By;

public class LandingPage extends BasePage {
	
	
	public String FOOTER_TEXT="UR-CV is a CV generator for unique CVs & resumes for any job positions";
	public String FOOTER_ADDRESS_TEXT="House: 941, Road: 14, Avenue: 2, Mirpur DOHS, Dhaka 1216";
	public String FOOTER_MAIL_TEXT="contact@augnitive.com";
	public String FOOTER_CONCACT_TEXT="+880-188-661-4533";
	public String FOOTER_NEWSLETTER_TEXT="Subscribe now to get the latest tips and new template";
	public String RECRUITER_CAREER_SUMMARY_TEXT="In a phrase or two, an excellent resume summary emphasizes some of your most significant achievements to date, acknowledges your occupation, and contains 1-2 of your top skill sets. UR-CV will suggest you the perfect career summary depending on your job position. The suggested career summary is written and checked by professional content writers and HR professionals. If you change your job position the career summary will be suggested according to your selected position";
	public String RECRUITER_SKILL_SET_TEXT="Skills are one of the most important proportions of a CV that influences the recruiters. When you are applying for any specific position your CV should reflect the skills that are required for the position. Our state-of-the-art algorithm will suggest to you the skills that will help you to create a strong CV.";
	public String RECRUITER_PROFESSIONAL_CERTIFICATE_TEXT="A professional certificate adds a huge value to your CV. UR-CV will suggest to you what professional certifications are available for any job role. If you have the certificate you can add it with one click. If you do not have that certification now you know what is accepted of you.";
	public String RECRUITER_CV_STRUCTURE="CV structuring is one of the most important yet boring parts of making a CV. Different industries and job positions require different CV structures. UR-CV can be a lifesaver when you are dealing with CV structures. You no longer have to manually structure your CV as it will be done automatically.";
	public String RECRUITER_CV_TEMPLATE="The best part of UR-CV is the huge library of both free and paid CV templates. After you add your information your CV will be created automatically. UR-CV offers thousands of templates across multiple industries that are created and reviewed by professionals.";
	public String LANDING_PAGE_URL ="https://ur-cv.com/";
	public String LANDING_PAGE_TITTLE_SENTENCE ="A perfect CV can bring you ahead from immense applicants to achieve your dream job. Recruiters look at a cv for an average of 5-7 seconds. UR-CV is here to assist you in creating a CV that helps to catch recruiters’ instant attention.";
	public String BEST_INDUSTY_READY_CV_TEXT = "Best industry ready CV templates free";
	public String PROFESSIONAL_104_PREVIEW_URL="https://ur-cv.com/preview/professional-104";
	public String SIMPLE_3_STEPS_TEXT="Make your CV in simple 3 steps";
	public String SIMPLE_3_STEPS_BODY_TEXT="Our automatic bot can help you to match best resume. So lets start now";
	public String ADD_YOUR_INFO_TEXT="Add your information"+ "\n"+ "First, you add your personal and professional information using a simple editor";
	public String SELECT_TEMPLATE_TEXT="Select template"+ "\n"+ "Based on your profession select any template from our thousands of professionally designed templates";
	public String DOWNLOAD_CV_TEXT="Download CV"+ "\n"+ "Our advanced algorithm will automatically generate your CV. Now just download and apply";
	public String HIRING_MANAGER_TEXT="What hiring managers are actually looking for in your CV";
	public String CONTENT_SUGGESTION_TITTLE_TEXT ="Get professional content suggestions & structure for your job role";
	public String CONTENT_SUGGESTION_BODY_TEXT = "Our automated app will suggest appropriate content & structure for creating a professional CV. You don't need to think about how to write perfect CV content. Just try UR-CV today.";
	public String RECRUITER_PREFER_TITTLE_TEXT ="60% of recruiters prefer CVs that are focused on position’s needs.";
	public String RECRUITER_PREFER_BODY_TEXT ="Most job seekers apply for jobs with immature CVs & it's one of the biggest reasons for rejection. In this competitive age, it's really hard to create a professional CV that is exactly what recruiters are looking for. Try UR-CV & get appointed to your dream job.";
	public String FQA_TITTLE_TEXT="Frequently asking questions";
	public String FAQ_QUESTION_1_TITLE = "Is UR-CV free to use?";
	public String FAQ_QUESTION_2_TITLE = "Which is the right template for my job position?";
	public String FAQ_QUESTION_3_TITLE = "How can I write resume content professionally?";
	public String FAQ_QUESTION_4_TITLE = "In which format I can download my CV?";
	public String FAQ_QUESTION_5_TITLE = "Will my resume be publicly accessible?";
	public String FAQ_QUESTION_1_ANSWER = "Yes your UR-CV is free to use if you are using the free templates. There are multiple free templates that can be used to create CVs for free.";
	public String FAQ_QUESTION_2_ANSWER = "Ur-CV is home to thousands of professionally created templates. By simply searching your current job position we will suggest a bunch of templates that will match your position and expectations. All the templates are designed in such a way that best represents the position intended and increases the chance of landing the desired job.";
	public String FAQ_QUESTION_3_ANSWER = "You no longer need to do the hard work of writing content. UR-CV will suggest your career objectives, Skills and also suggestions of responsibilities, and many more. All the contents are bespoke and generated automatically by advanced algorithms.";
	public String FAQ_QUESTION_4_ANSWER = "Currently, you can download PDF only but soon we will introduce Word format download as well.";
	public String FAQ_QUESTION_5_ANSWER = "NO, only you will be able to view, edit and download the CV created using UR-CV. All your data is safe and it will not be shared publicly.";
	public String BLOG_TITTLE_TEXT = "Read blogs to improve your required skills";
	public String BLOG_3_URL = "https://ur-cv.com/blogs/hobbies-and-interests-on-your-cv-a-guide";
	
	
	public By ICON_HOME_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[2]/nav[1]/div[1]/a[1]/img[1]");
	public By NAV_TEMPLATE =By.xpath("//a[@id='nav_cv_template']");
	public By NAV_HOME_BUTTON =By.xpath("//a[@id='nave_home']");
	public By NAV_ABOUT_US_BUTTON =By.xpath("//a[@id='nav_about_us']");
	public By NAV_CART_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[2]/nav[1]/div[1]/div[2]/a[1]");
	public By TOP_BUTTON =By.xpath("//div[@id='pagetop']");
	public By FOOTER_TEXT_LOCATOR =By.xpath("//p[contains(text(),'UR-CV is a CV generator for unique CVs & resumes f')]");
	public By FOOTER_ADDRESS_LOCATOR =By.xpath("//address[contains(text(),'Mirpu')]");
	public By FOOTER_MAIL_LOCATOR =By.xpath("//a[contains(text(),'contact@augnitive.com')]");
	public By FOOTER_CONTACT_LOCATOR =By.xpath("//a[contains(text(),'+880-188-661-4533')]");
	public By FOOTER_ABOUTUS_BUTTON =By.xpath("//a[contains(text(),'About UR-CV')]");
	public By FOOTER_TERMS_CONDITION_BUTTON =By.xpath("//a[contains(text(),'Terms & conditions')]");
	public By FOOTER_PRIVACY_POLICIES_BUTTON =By.xpath("//a[contains(text(),'Privacy & policies')]");
	public By FOOTER_FQA_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[4]");
	public By FOOTER_CREATE_RESUME_BUTTON =By.xpath("//a[contains(text(),'Create resume')]");
	public By FOOTER_ALL_TEMPLATE_BUTTON =By.xpath("//a[contains(text(),'All templates')]");
	public By FOOTER_BLOGS_BUTTON =By.xpath("//a[contains(text(),'Blogs')]");
	public By FOOTER_LOGIN_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[4]");
	public By FOOTER_CREATE_ACCOUNT_BUTTON =By.xpath("//a[contains(text(),'Create account')]");
	public By FOOTER_NEWSLETTER_TEXT_LOCATOR =By.xpath("//p[contains(text(),'Subscribe now to get the latest tips and new templ')]");
	public By FOOTER_NEWSLETTER_INPUT_FIELD =By.xpath("//body/div[@id='app']/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/input[1]");
	public By FOOTER_NEWSLETTER_SUBSCRIBE_BUTTON =By.xpath("//a[contains(text(),'Subscribe')]");
	public By CREATE_FREE_CV_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]");
	public By TEMPLATE_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[3]/div[1]/div[1]/a[2]/div[1]/div[1]/div[1]/img[1]");
	public By SELL_ALL_TEMPLATE_BUTTON =By.xpath("//a[contains(text(),'See all templates')]");
	public By CREATE_FREE_CV_MIDDLE_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]");
	public By EXPLORE_ALL_TEMPLATE_BUTTON =By.xpath("//a[contains(text(),'Explore all templates')]");
	public By RECRUITER_CAREER_SUMMARY_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/button[1]");
	public By RECRUITER_COMMON_BODY_TEXT_CONTAINER_LOCATOR =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/p[1]");
	public By RECRUITER_SKILL_SET_BUTTON =By.xpath("//span[contains(text(),'Skills set')]");
	public By RECRUITER_PROFESSIONAL_CERTIFICATE =By.xpath("//body[1]/div[1]/div[1]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/button[3]");
	public By RECRUITER_CV_STRUCTURE_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/button[4]");
	public By RECRUITER_CV_TEMPLATE_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[7]/div[1]/div[1]/div[1]/div[1]/button[5]");
	public By FIND_MORE_FAQ_BUTTON =By.xpath("//a[contains(text(),'Find more FAQ')]");
	public By ALL_BLOGS_BUTTON =By.xpath("//a[contains(text(),'All blogs')]");
	public By BLOGS_READ_MORE_BUTTON_FOR_FIRST =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[9]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]/div[2]/span[1]");
	public By FAQ_TITTLE_LOCATOR =By.xpath("//h2[contains(text(),'Frequently asking questions')]");
	public By FAQ_FIRST_EXPAND_BUTTON =By.xpath("//body[1]/div[1]/div[1]/div[3]/div[8]/div[1]/div[1]/div[1]/div[1]/header[1]/button[1]/span[2]");
	public By LANDING_PAGE_TITTLE_SENTENCE_LOCATOR=By.xpath("//p[contains(text(),'A perfect CV can bring you ahead from immense appl')]");
	public By BEST_INDUSTY_READY_CV_LOCATOR = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[3]/div[1]/h2[1]");
	public By SIMPLE_3_STEPS_LOCATOR = By.xpath("//h2[contains(text(),'Make your CV in simple 3 steps')]");
	public By SIMPLE_3_STEPS_TEXT_LOCATOR = By.xpath("//p[contains(text(),'Our automatic bot can help you to match best resum')]");
	public By ADD_YOUR_INFO_LOCATOR = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]");
	public By SELECT_TEMPLATE_LOCATOR = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]");
	public By DOWNLOAD_CV_LOCATOR = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]");
	public By LANDING_PAGE_TEMPLATE_FOR_SELECT_LOCATOR = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[3]/div[1]/div[1]/a[6]/div[1]/div[1]/div[1]/img[1]");
	public By HIRING_MANAGER_LOCATOR =By.xpath("//h2[contains(text(),'look')]");
	public By CONTENT_SUGGESTION_TITTLE_LOCATOR =By.xpath("//h2[contains(text(),'Get professional content suggestions & structure f')]");
	public By CONTENT_SUGGESTION_BODY_LOCATOR =By.xpath("//p[contains(text(),'Our automated app will suggest appropriate content')]");
	public By RECRUITER_PREFER_TITTLE_LOCATOR =By.xpath("//h1[contains(text(),'60% of recruiters prefer CVs that are focused on p')]");
	public By RECRUITER_PREFER_BODY_LOCATOR =By.xpath("//p[contains(text(),'Most job seekers apply for jobs with immature CVs ')]");
	public By FAQ_QUESTION_TITLE_1_LOCATOR = By.xpath("//p[contains(text(),'Is UR-CV free to use?')]");
	public By FAQ_QUESTION_TITLE_2_LOCATOR = By.xpath("//p[contains(text(),'Which is the right template for my job position?')]");
	public By FAQ_QUESTION_TITLE_3_LOCATOR = By.xpath("//p[contains(text(),'How can I write resume content professionally?')]");
	public By FAQ_QUESTION_TITLE_4_LOCATOR = By.xpath("//p[contains(text(),'In which format I can download my CV?')]");
	public By FAQ_QUESTION_TITLE_5_LOCATOR = By.xpath("//p[contains(text(),'Will my resume be publicly accessible?')]");
	public By FAQ_QUESTION_ANSWER_1_LOCATOR = By.xpath("//p[contains(text(),'Yes your UR-CV is free to use if you are using the')]");
	public By FAQ_QUESTION_ANSWER_2_LOCATOR = By.xpath("//p[contains(text(),'Ur-CV is home to thousands of professionally creat')]");
	public By FAQ_QUESTION_ANSWER_3_LOCATOR = By.xpath("//p[contains(text(),'You no longer need to do the hard work of writing ')]");
	public By FAQ_QUESTION_ANSWER_4_LOCATOR = By.xpath("//p[contains(text(),'Currently, you can download PDF only but soon we w')]");
	public By FAQ_QUESTION_ANSWER_5_LOCATOR = By.xpath("//p[contains(text(),'NO, only you will be able to view, edit and downlo')]");
	public By FAQ_QUESTION_FIND_MORE_BUTTON = By.xpath("//a[contains(text(),'Find more FAQ')]");
	public By BLOG_TITTLE_LOCATOR=By.xpath("//h2[contains(text(),'required sk')]");
	public By BLOG_3_LOCATOR=By.xpath("//p[contains(text(),'Hobbies And Interests On Your CV : A Guide')]");
	public By BLOG_1_LOCATOR=By.xpath("//p[contains(text(),'Create a Professional CV Online in Minutes Using w')]");
	public By BLOG_2_LOCATOR=By.xpath("//p[contains(text(),'How To Tailor Your CV To The Job Description')]");
	public By BLOG_4_LOCATOR=By.xpath("//p[contains(text(),'How many pages should a CV be? - A CV format gener')]");
	public By BLOG_COMMON_BACK_BUTTON=By.xpath("//body/div[@id='app']/div[@id='laravel-block']/div[2]/div[1]/a[1]");
	
	
}
