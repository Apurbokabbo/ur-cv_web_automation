package pages;

import org.openqa.selenium.By;

public class AboutUsPage extends BasePage{
	
	public String ABOUTUS_URL = "https://ur-cv.com/about-us";
	public String HEADER_TITTLE_TEXT = "UR-CV was founded to assist job seekers in increasing job success through the creation of professional & well-designed CVs.";
	public String FIRST_PARA_TEXT = "Unprofessional CVs/resumes are a major reason for being rejected during the initial stage. UR-CV was founded to assist job seekers in increasing job success through the creation of professional & well-designed CVs. We create professional CVs that meet international standards. Providing industry-specific CVs that can replicate your job position in a professional & elegant manner. At each step of CV creation process, our advanced algorithm suggests appropriate content & structure for your job role.";
	public String SCEOND_PARA_TEXT = "All UR-CV resumes are professionally designed & approved by HR professionals. Thousands of users create resumes from UR-CV in order to apply for their preferred jobs. We strongly advise you to use our template to get ahead of the competition.";
	public String SCTROOL_P_TEXT="Yes, it is very easy to create a resume through our site. Simply select a template, that you like. Try to choose the template according to your job. The best selection always wins the best opportunity. Just select the template, write your skills, background, education, etc that you like to highlight in your resume. Generate the resume. Download it. So, it is very simple to create a resume through us.";
	public String UNIQUE_FEATURE_BODY_TEXT ="Professionally designed CV\n"+ "Content suggestions\n"+ "Skills suggestions\n"+ "Get multiple sizes and designs templates\n"+ "Awesome design and background\n"+ "Free templates\n"+ "Thousand of High standard CV templates\n"+ "24/7 customer support";
	public String UNIQUE_FEATURE_TITTLE_TEXT ="What Unique Features Do UR-CV Provide?";
	public String EASY_TO_CREATE_A_RESUME_TITTLE_TEXT ="Is It Easy To Create A Resume Through UR-CV?";
	public String EASY_TO_CREATE_A_RESUME_BODY1_TEXT ="Yes, it is very easy to create a resume through our site. Simply select a template, that you like. Try to choose the template according to your job. The best selection always wins the best opportunity. Just select the template, write your skills, background, education, etc that you like to highlight in your resume. Generate the resume. Download it. So, it is very simple to create a resume through us.";
	public String EASY_TO_CREATE_A_RESUME_BODY2_TEXT ="The aim of UR-CV is to help the job seeker in terms of creating a world-class resume witch is affordable and creates a lasting impression on the recruiters mind.";
	public String WHY_CHOOSE_OUR_SITE_TITTLE_TEXT ="Why Choose Our Site Instead Of Other?";
	public String WHY_CHOOSE_OUR_SITE_BODY_TEXT ="There are so many CV-building sites online. But most of them are paid. They only provide very high-quality resumes in the paid version. Moreover, they don’t have as many templates as we do. We got more than a thousand free templates. All of them are designed in a good manner. They are outstanding in qualities and unique. So, don’t have to worry about any copyright materials. All of them were designed in a professional manner. Thus, we are providing the best quality of the piece to all the clients we have.";
		
	
	public By WHY_CHOOSE_OUR_SITE_TITTLE_LOCATOR =By.xpath("//p[contains(text(),'Why Choose Our Site Instead Of Other?')]");
	public By WHY_CHOOSE_OUR_SITE_BODY_LOCATOR =By.xpath("//p[contains(text(),'There are so many CV-building sites online. But mo')]");
	public By SCTROLL_LOCATION=By.xpath("//p[contains(text(),'Is It Easy To Create A Resume Through UR-CV?')]");
	public By SCTROLL_TEXT_LOCATOR=By.xpath("//p[contains(text(),'Yes, it is very easy to create a resume through ou')]") ;
	public By HEADER_TITTLE_LOCATOR = By.xpath("//i[contains(text(),'UR-CV was founded to assist job seekers in increas')]");
	public By FIRST_PARA_LOCATOR = By.xpath("//p[contains(text(),'Unprofessional CVs/resumes are a major reason for ')]");
	public By SCEOND_PARA_LOCATOR = By.xpath("//p[contains(text(),'All UR-CV resumes are professionally designed & ap')]");
	public By UNIQUE_FEATURE_TITTLE_LOCATOR =By.xpath("//p[contains(text(),'What Unique Features Do UR-CV Provide?')]");
	public By UNIQUE_FEATURE_BODY_LOCATOR = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]");
	public By EASY_TO_CREATE_A_RESUME_TITTLE_LOCATOR =By.xpath("//p[contains(text(),'Is It Easy To Create A Resume Through UR-CV?')]");
	public By EASY_TO_CREATE_A_RESUME_BODY1_LOCATOR =By.xpath("//p[contains(text(),'Yes, it is very easy to create a resume through ou')]");
	public By EASY_TO_CREATE_A_RESUME_BODY2_LOCATOR =By.xpath("//p[contains(text(),'The aim of UR-CV is to help the job seeker in term')]");
}
