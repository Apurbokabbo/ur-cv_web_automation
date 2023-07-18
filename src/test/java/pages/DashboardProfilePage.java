package pages;

import org.openqa.selenium.By;

public class DashboardProfilePage extends BasePage{
	
	public String PROFILE_PAGE_URL = "https://ur-cv.com/dashboard/my-profile";
	public String PERSONAL_INFO_DESIGNATION_SEARCH_KEY = "SQA";
	public String PERSONAL_INFO_ADDRESS_INPUT = "Mirpur dohs , Dhaka , Bangladesh";
	public String PROFESSIONAL_CERTIFICATE_SUGGESTION_KEY="AV";
	public String SKILL_LEVEL_VALIDATION_TEXT="The skill level field is required";
	public String SKILL_NAME_VALIDATION_TEXT="The skill name field is required";
	public String SKILL_INPUT_TEXT = "ASD";
	public String COMMON_NAME_VALIDATION_TEXT = "The name field is required";
	public String COMMON_INSTITUTION_VALIDATION_TEXT = "The institution field is required";
	public String COMMON_EMAIL_VALIDATION_TEXT = "The email field is required";
	public String ACHEVEMENT_AUTHORITY_VALIDATION_TEXT = "The organization field is required";
	public String CHEVEMENT_ACHIVED_YEAR_VALIDATION_TEXT ="The year field is required";
	public String LANGUAGE_PROFICIENCY_NAME_VALIDATION_TEXT="The language name field is required";
	public String LANGUAGE_PROFICIENCY_TYPE_VALIDATION_TEXT="The language proficiency field is required";
	public String SOCIAL_MEDIA_VALIDATION_TEXT="The social link field is required";
	public String DESIGNATION_VALIDATION_TEXT="The designation name field is required";
	public String MAILING_ADDRESS_VALIDATION_TEXT="The mailing address field is required";
	public String JOB_TITTLE_VALIDATION_TEXT="The job title field is required";
	public String COMPANY_NAME_VALIDATION_TEXT="The company name field is required";
	public String START_DATE_VALIDATION_TEXT="The start date field is required";
	public String LAST_DATE_VALIDATION_TEXT="The end date field is required";
	public String WORK_EXPERIENCE_VALIDATION_TEXT="The Work experience field is required";
	public String EDUCATION_INSTITUTION_VALIDATION_TEXT="The institution name field is required";
	public String EDUCATION_INSTITUTION_LOCATION_VALIDATION_TEXT="The institution location field is required";
	public String EDUCATION_DEGREE_VALIDATION_TEXT="The degree field is required";
	public String EDUCATION_RESULT_VALIDATION_TEXT="Please enter your result";
	public String EDUCATION_INSTITUTION_NAME_TEXT="IRSCB";
	public String EDUCATION_INSTITUTION_LOCATION_INPUT_NAME_TEXT="Brahmanbaria , Chattagram,Bangladesh.";

	
	
	
	
	public By PERSONAL_INFO_EDIT_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/p[2]/a[1]"); 
	public By PERSONAL_INFO_DEGISNATION_EDIT_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/p[2]/a[1]/span[1]"); 
	public By PERSONAL_INFO_ADDRESS_EDIT_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/p[2]/a[1]/span[1]"); 
	public By PERSONAL_INFO_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]"); 
	public By PERSONAL_INFO_SAVE_BUTTON=By.xpath("//button[contains(text(),'Save')]"); 
	public By PERSONAL_INFO_PROFILE_IMAGE_UPLOAD_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]"); 
	public By PEROSNAL_INFO_IMAGE_LOAD_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"); 
	public By PEROSNAL_INFO_IMAGE_SAVE_BUTTON=By.xpath("//a[contains(text(),'Save')]"); 
	public By PERSONAL_INFO_IMAGE_CANCEL_BUTTON=By.xpath("//a[contains(text(),'Cancel')]"); 
	public By PERSONAL_INFO_DESINATION_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The designation name field is required')]"); 
	public By PERSONAL_INFO_EMAIL_LOCATOR=By.xpath("//p[contains(text(),'@gmail.com')]"); 
	public By PERSONAL_INFO_ADDRESS_LOCATOR=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/p[2]"); 
	public By PERSONAL_INFO_DESIGNATION_LOCATOR=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/p[2]"); 
	public By PERSONAL_INFO_MAILLING_ADDRESS_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The mailing address field is required')]"); 
	public By PERSONAL_INFO_IMAGE_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/i[1]"); 
	public By PERSONAL_INFO_IMAGE_UPLOAD_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/i[1]"); 
	public By PERSONAL_INFO_IMAGE_UPLOIAD_MODAL_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/a[2]"); 	
	public By PERSONAL_INFO_FULLNAME_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]"); 
	public By PERSONAL_INFO_DESIGNATION_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]"); 
	public By PERSONAL_INFO_MAILLING_ADDRESS_LOCATOR_VERIFY=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/p[2]"); 
	public By PERSONAL_INFO_SELECT_DESIGNATION=By.xpath("//p[contains(text(),'SQA Engineer')]"); 
	public By PERSONAL_INFO_MOBILE_INPUT_FIELD =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]"); 
	public By PERSONAL_INFO_MOBILE_PLUS_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/button[1]"); 
	public By PERSONAL_INFO_EMAIL_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/textarea[1]"); 
	public By PERSONAL_INFO_EMAIL_PLUS_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/button[1]"); 
	public By PERSONAL_INFO_MAILLING_ADDRESS_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/textarea[1]"); 
	public By PERSONAL_INFO_MAILLING_ADDRESS_EDIT_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/p[2]/a[1]/span[1]"); 
	public By PERSONAL_SUMMARY_ADDorEDIT_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[2]/a[1]"); 
	public By PERSONAL_SUMMARY_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]"); 
	public By PERSONAL_SUMMARY_GET_SUGGESTION_BUTTON=By.xpath("//button[contains(text(),'suggestion')]"); 
	public By PERSONAL_SUMMARY_SAVE_BUTTON=By.xpath("//button[contains(text(),'Save')]"); 
	public By PERSONAL_SUMMARY_SUGGESTION_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	public By PERSONAL_SUMMARY_SUGGESTION_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]"); 
	public By PERSONAL_SUMMARY_SUGGESTION_SCTROLL_LOCATOR=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]"); 
	public By PERSONAL_SUMMARY_SUGGESTION_SELECT_LOCATOR=By.xpath("//p[contains(text(),'Aiming for a demanding job in a multinational comp')]"); 
	public By PERSONAL_SUMMARY_SUGGESTION_PROFESSION_SELECT_LOCATOR=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/p[1]"); 
	public By WORK_EXPERIENCE_ADD_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/p[2]/a[1]"); 
	public By WORK_EXPERIENCE_EDIT_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]/span[2]"); 
	public By WORK_EXPERIENCE_DELETE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]"); 
	public By WORK_EXPERIENCE_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]"); 
	public By WORK_EXPERIENCE_NEXT_BUTTON=By.xpath("//button[contains(text(),'Next')]"); 
	public By WORK_EXPERIENCE_CURRENT_WORK_CHECKBOX=By.xpath("//input[@id='exampleCheck1']"); 
	public By WORK_EXPERIENCE_BACK_BUTTON_FROM_SECOND_MODAL_EDIT=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/span[1]"); 
	public By WORK_EXPERIENCE_BACK_BUTTON_FROM_SECOND_MODAL_ADD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/span[1]/span[1]"); 
	public By WORK_EXPERIENCE_PROFESSION_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	public By WORK_EXPERIENCE_PROFESSION_EDIT_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	public By WORK_EXPERIENCE_PROFESSION_SELECTION_LOCATOR=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/p[1]"); 
	public By WORK_EXPERIENCE_ORGANIZATION_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"); 
	public By WORK_EXPERIENCE_ORGANIZATION_EDIT_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"); 
	public By WORK_EXPERIENCE_JOIN_DATE_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	public By WORK_EXPERIENCE_END_DATE_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	public By WORK_EXPERIENCE_JOINT_DATE_SELECT=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[15]"); 
	public By WORK_EXPERIENCE_END_DATE_SELECT=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/span[28]"); 
	public By WORK_EXPERIENCE_SELECT_PROFESSION=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[643]"); 
	public By WORK_EXPERIENCE_SUGESSTION_BACK_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/span[1]/span[1]"); 
	public By WORK_EXPERIENCE_RESPONSIBILITIES_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]"); 
	public By WORK_EXPERIENCE_RESPONSIBILITIES_EDIT_INPUT_FIELD=By.xpath("//body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[2]/li[1]"); 
	public By WORK_EXPERIENCE_RESPONSIBILITIES_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]"); 
	public By WORK_EXPERIENCE_RESPONSIBILITIES_SUGGESTION_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/span[3]"); 
	public By WORK_EXPERIENCE_RESPONSIBILITIES_SUGGESTION_SELECT1=By.xpath("//p[contains(text(),'Identifying software application weaknesses and ta')]"); 
	public By WORK_EXPERIENCE_RESPONSIBILITIES_SUGGESTION_SELECT2=By.xpath("//p[contains(text(),'Writing automation scripts and implementing softwa')]"); 
	public By WORK_EXPERIENCE_RESPONSIBILITIES_SUGGESTION_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	public By WORK_EXPERIENCE_JOB_TITTLE_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The job title field is required')]");
	public By WORK_EXPERIENCE_COMPANY_NAME_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The company name field is required')]");
	public By WORK_EXPERIENCE_START_DATE_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The start date field is required')]");
	public By WORK_EXPERIENCE_LAST_DATE_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The end date field is required')]");
	public By WORK_EXPERIENCE_VALIDATION_TEXT_LOCATOR=By.xpath("//span[contains(text(),'The Work experience field is required')]");
	public By WORK_EXPERIENCE_SAVE_BUTTON=By.xpath("//button[contains(text(),'Save')]");
	public By WORK_EXPERIENCE_SUGGESTION_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]");
	public By WORK_EXPERIENCE_GET_SUGGESTION_BUTTON=By.xpath("//button[contains(text(),'suggestion')]");
	public By EDUCATION_ADD_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/p[2]/a[1]"); 
	public By EDUCATION_LOCATOR=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/p[1]"); 
	public By EDUCATION_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/button[1]"); 
	public By EDUCATION_SAVE_BUTTON=By.xpath("//button[contains(text(),'Add')]"); 
	public By EDUCATION_CURRENTLY_STUDY_CHECKBOX=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/input[1]"); 
	public By EDUCATION_CURRENTLY_STUDY_CHECKBOX_UPDATE=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/input[1]"); 
	public By EDUCATION_INSTITUTION_NAME_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	public By EDUCATION_INSTITUTION_NAME_INPUT_FIELD_UPDATE=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	public By EDUCATION_INSTITUTION_LOCATION_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"); 
	public By EDUCATION_INSTITUTION_LOCATION_INPUT_FIELD_UPDATE=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"); 
	public By EDUCATION_DEGREE_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]"); 
	public By EDUCATION_DEGREE_INPUT_FIELD_UPDATE=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]"); 
	public By EDUCATION_FIELD_OF_STUDY_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/input[1]"); 
	public By EDUCATION_FIELD_OF_STUDY_INPUT_FIELD_UPDATE=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/input[1]"); 
	public By EDUCATION_RESULT_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]"); 
	public By EDUCATION_RESULT_INPUT_FIELD_UPDATE=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]"); 
	public By EDUCATION_OUT_OF_INPUT_RESULT=By.xpath("//button[@id='dropdown-1__BV_toggle_']"); 
	public By EDUCATION_START_DATE_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	public By EDUCATION_END_DATE_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	public By EDUCATION_EDIT_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/a[2]/span[2]"); 
	public By EDUCATION_DELETE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]"); 
	public By EDUCATION_INSTITUTION_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The institution name field is required')]"); 
	public By EDUCATION_INSTITUTION_LOCATION_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The institution location field is required')]"); 
	public By EDUCATION_INSTITUTION_DEGREE_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The degree field is required')]"); 
	public By EDUCATION_INSTITUTION_RESULT_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'Please enter your result')]"); 
	public By EDUCATION_START_DATE_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The start date field is required')]"); 
	public By EDUCATION_LAST_DATE_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The end date field is required')]"); 
	public By EDUCATION_START_DATE_SELECT_LOCATOR=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[17]"); 
	public By EDUCATION_LAST_DATE_SELECT_LOCATOR=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/span[21]"); 
	public By EDUCATION_UPDATE_BUTTON=By.xpath("//button[contains(text(),'Update')]"); 
	
	public By PROFESSIONAL_CERTIFICATION_ADD_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/p[2]/a[1]"); 
	public By PROFESSIONAL_CERTIFICATION_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]"); 
	public By PROFESSIONAL_CERTIFICATION_GET_SUGGESTION=By.xpath("//button[contains(text(),'suggestion')]"); 
	public By PROFESSIONAL_CERTIFICATION_SAVE_BUTTON=By.xpath("//button[contains(text(),'Save')]"); 
	public By PROFESSIONAL_CERTIFICATION_SUGGESTION_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	public By PROFESSIONAL_CERTIFICATION_SUGGESTION_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[3]"); 
	public By PROFESSIONAL_CERTIFICATION_SEGGESTION_SCROOLorSELECT_LOCATOR=By.xpath("//p[contains(text(),'Global travel professional Certification [Timefram"); 
	public By PROFESSIONAL_CERTIFICATION_DELETE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]/span[1]"); 
	public By SKILL_ADD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/p[2]/a[1]"); 
	public By SKILL_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/button[1]"); 
	public By SKILL_SAVE_BUTTON=By.xpath("//button[contains(text(),'Save')]"); 
	public By SKILL_LEVEL_BASIC=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"); 
	public By SKILL_LEVEL_NOVICE=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]"); 
	public By SKILL_LEVEL_INTERMEDIATE=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/input[1]"); 
	public By SKILL_LEVEL_ADVANCE=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/input[1]"); 
	public By SKILL_LEVEL_EXPERT=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/input[1]"); 
	public By SKILL_LEVEL_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The skill level field is required')]"); 
	public By SKILL_NAME_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The skill name field is required')]"); 
	public By SKILL_SELECT_FOR_SCROOL=By.xpath("//p[contains(text(),'Attention to detail & aesthetics')]"); 
	public By SKILL_DELETE_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/span[1]");
	public By SKILL_EDIT_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[2]/span[1]");
	public By ACHEVEMENT_ADD_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/p[2]/a[1]");
	public By ACHEVEMENT_CLOSE_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/button[1]");
	public By ACHEVEMENT_SAVE_BUTTON =By.xpath("//button[contains(text(),'Save')]");
	public By ACHEVEMENT_NAME_INPUT_FIELD =By.xpath("//input[@id='name']");
	public By ACHEVEMENT_NAME_VALIDATION_LOCATOR =By.xpath("//span[contains(text(),'The name field is required')]");
	public By ACHEVEMENT_AUTHORITY =By.xpath("//input[@id='organization']");
	public By ACHEVEMENT_AUTHORITY_VALIDATION_LOCATOR =By.xpath("//span[contains(text(),'The organization field is required')]");
	public By ACHEVEMENT_URL_INPUT_FIELD =By.xpath("//input[@id='url']");
	public By ACHEVEMENT_ACHIVED_YEAR_FIELD =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/input[1]");
	public By ACHEVEMENT_ACHIVED_YEAR_VALIDATION_LOCATOR =By.xpath("//span[contains(text(),'The year field is required')]");
	public By ACHEVEMENT_DESCRIPTION_INPUT_FIELD =By.xpath("//textarea[@id='']");
	public By ACHEVEMENT_YEAR_SELECT_LOCATOR =By.xpath("//span[contains(text(),'2021')]");
	public By ACHEVEMENT_DELETE_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]");
	public By ACHEVEMENT_EDIT_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/a[2]/span[1]");
	public By LANGUAGE_PROFICIENCY_ADD_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/p[2]/a[1]");
	public By LANGUAGE_PROFICIENCY_CLOSE_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/button[1]");
	public By LANGUAGE_PROFICIENCY_NAME_INPUT_FIELD =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	public By LANGUAGE_PROFICIENCY_NAME_VALIDATION_LOCATOR =By.xpath("//span[contains(text(),'The language name field is required')]");
	public By LANGUAGE_PROFICIENCY_TYPE_BEGINEER_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
	public By LANGUAGE_PROFICIENCY_TYPE_CONVERSATIONAL_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]");
	public By LANGUAGE_PROFICIENCY_TYPE_FLUENT =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/input[1]");
	public By LANGUAGE_PROFICIENCY_TYPE_NATIVE =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/input[1]");
	public By LANGUAGE_PROFICIENCY_TYPE_VALIDATION_LOCATOR =By.xpath("//span[contains(text(),'The language proficiency field is required')]");
	public By LANGUAGE_PROFICIENCY_NAME_SCROOL_LOCATOR =By.xpath("//p[contains(text(),'Armenian')]");
	public By lANGUAGE_PROFICIENCY_DELETE_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]");
	public By LANGUAGE_PROFICIENCY_EDIT_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]/span[1]");
	public By INTEREST_ADDorEDIT_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/p[2]/a[1]");
	public By INTEREST_CLOSE_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/button[1]");
	public By INTEREST_SAVE_BUTTON = By.xpath("//button[contains(text(),'Save')]");
	public By INTEREST_ADD_CUSTOM_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]");
	public By INTEREST_GARDERING_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]");
	public By INTEREST_SPORTS_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/input[1]");
	public By INTEREST_CUSTOM_INPUT_FIELD = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[2]/div[1]/input[1]");
	public By INTEREST_CUSTOM_DONE_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[2]/div[1]/button[1]");
	public By INTEREST_CUSTOM_CLOSE_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[2]/div[1]/button[2]/*[1]");
	public By REFERENCES_ADD_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[1]/a[1]");
	public By REFERENCES_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[2]/div[1]/button[1]");
	public By REFERENCES_SAVE_BUTTON=By.xpath("//button[contains(text(),'Save')]");
	public By REFERENCES_NAME_INPUT_FIELD=By.xpath("//input[@id='name']");
	public By REFERENCES_NAME_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The name field is required')]");
	public By REFERENCES_INSTITUTION_INPUT_FIELD=By.xpath("//input[@id='institution']");
	public By REFERENCES_INSTITUTION_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The institution field is required')]");
	public By REFERENCES_DESIGNATION_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]");
	public By REFERENCES_DESIGNATION_SCROOLorSELECT=By.xpath("//p[contains(text(),'Deputy Draftsman')]");
	public By REFERENCES_RELATION_INPUT_FIELD=By.xpath("//input[@id='relation']");
	public By REFERENCES_EMAIL_INPUT_FIELD=By.xpath("//input[@id='email']");
	public By REFERENCES_EMAIL_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The email field is required')]");
	public By REFERENCES_PHONE_INPUT_FIELD=By.xpath("//input[@id='phone']");
	public By REFERENCES_LOCATION_INPUT_FIELD=By.xpath("//input[@id='address']");
	public By REFERENCES_DELETE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]");
	public By REFERENCES_EDIT_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[2]/div[1]/div[1]/div[1]/div[1]/a[2]/span[1]");
	public By SOCIAL_MEDIA_ADD_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/a[1]");
	public By SOCIAL_MEDIA_FACEBOOK_BUTTON=By.xpath("//p[contains(text(),'Facebook')]");
	public By SOCIAL_MEDIA_INSTRAGRAM_BUTTON=By.xpath("//p[contains(text(),'Instagram')]");
	public By SOCIAL_MEDIA_LINKEDIN_BUTTON=By.xpath("//p[contains(text(),'Linkedin')]");
	public By SOCIAL_MEDIA_SKYPE=By.xpath("//p[contains(text(),'Skype')]");
	public By SOCIAL_MEDIA_GITHUB=By.xpath("//p[contains(text(),'Github')]");
	public By SOCIAL_MEDIA_INPUT_FIELD=By.xpath("//input[@id='']");
	public By SOCIAL_MEDIA_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[2]/button[1]/span[1]/span[3]");
	public By SOCIAL_MEDIA_SAVE_BUTTON=By.xpath("//button[contains(text(),'Save')]");
	public By SOCIAL_MEDIA_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The social link field is required')]");
	public By SOCIAL_MEDIA_DELETE_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]/span[1]");
	public By DELETE_POP_UP_DELETE = By.xpath("//button[contains(text(),'Delete')]");
	public By DELETE_POP_UP_CANCEL = By.xpath("//button[contains(text(),'No')]");
	
	
	public void delete(By locator) throws InterruptedException {
		try 
		{
			findElement(locator).click();
			Thread.sleep(500);
			findElement(DELETE_POP_UP_CANCEL).click();
			Thread.sleep(500);
			findElement(locator).click();
			Thread.sleep(500);
			findElement(DELETE_POP_UP_DELETE).click();
			
		} 
		catch (Exception e) {
			System.out.println("Element not found !!!!!!");
		}
			
	}
	
	public void workExperienceAdd(By locator) throws InterruptedException {
		findElement(locator).click();
		Thread.sleep(1000);
		findElement(WORK_EXPERIENCE_PROFESSION_INPUT_FIELD).sendKeys(PERSONAL_INFO_DESIGNATION_SEARCH_KEY);
		Thread.sleep(500);
		findElement(WORK_EXPERIENCE_PROFESSION_INPUT_FIELD).sendKeys(" ");
		Thread.sleep(500);
		findElement(WORK_EXPERIENCE_PROFESSION_SELECTION_LOCATOR).click();
		Thread.sleep(1000);
		findElement(WORK_EXPERIENCE_ORGANIZATION_INPUT_FIELD).sendKeys(SKILL_INPUT_TEXT);
		findElement(WORK_EXPERIENCE_JOIN_DATE_INPUT_FIELD).click();
		Thread.sleep(500);
		findElement(WORK_EXPERIENCE_JOINT_DATE_SELECT).click();
		Thread.sleep(500);
		findElement(WORK_EXPERIENCE_END_DATE_INPUT_FIELD).click();
		findElement(WORK_EXPERIENCE_END_DATE_SELECT).click();
		Thread.sleep(500);
		findElement(WORK_EXPERIENCE_NEXT_BUTTON).click();
		Thread.sleep(13000);
		findElement(WORK_EXPERIENCE_RESPONSIBILITIES_SUGGESTION_SELECT1).click();
		findElement(WORK_EXPERIENCE_RESPONSIBILITIES_SUGGESTION_SELECT2).click();
		Thread.sleep(2000);
		findElement(WORK_EXPERIENCE_SAVE_BUTTON).click();
		Thread.sleep(2000);
		
	}
	
	public void addEducationValidData() throws InterruptedException {
		
		findElement(EDUCATION_ADD_BUTTON).click();
		Thread.sleep(500);
		findElement(EDUCATION_INSTITUTION_NAME_INPUT_FIELD).sendKeys(EDUCATION_INSTITUTION_NAME_TEXT);
		findElement(EDUCATION_INSTITUTION_LOCATION_INPUT_FIELD).sendKeys(EDUCATION_INSTITUTION_LOCATION_INPUT_NAME_TEXT);
		findElement(EDUCATION_DEGREE_INPUT_FIELD).sendKeys("Bsc");
		findElement(EDUCATION_FIELD_OF_STUDY_INPUT_FIELD).sendKeys("Cse");
		findElement(EDUCATION_RESULT_INPUT_FIELD).sendKeys("3.50");
		scrolldown();
		Thread.sleep(500);
		findElement(EDUCATION_START_DATE_INPUT_FIELD).click();
		scrolldown();
		Thread.sleep(500);
		findElement(EDUCATION_START_DATE_SELECT_LOCATOR).click();
		findElement(EDUCATION_END_DATE_INPUT_FIELD).click();
		scrolldown();
		Thread.sleep(500);
		findElement(EDUCATION_LAST_DATE_SELECT_LOCATOR).click();
		scrolldown800();
		Thread.sleep(1000);
		findElement(EDUCATION_SAVE_BUTTON).click();
		
		
	}


}
