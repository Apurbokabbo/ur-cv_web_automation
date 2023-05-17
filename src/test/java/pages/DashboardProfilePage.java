package pages;

import org.openqa.selenium.By;

public class DashboardProfilePage extends BasePage{
	
	
	String PROFESSIONAL_CERTIFICATE_SUGGESTION_KEY="AV";
	String SKILL_LEVEL_VALIDATION_TEXT="The skill level field is required";
	String SKILL_NAME_VALIDATION_TEXT="The skill name field is required";
	String SKILL_INPUT_TEXT = "ASD";
	String COMMON_NAME_VALIDATION_TEXT = "The name field is required";
	String COMMON_INSTITUTION_VALIDATION_TEXT = "The institution field is required";
	String COMMON_EMAIL_VALIDATION_TEXT = "The email field is required";
	String ACHEVEMENT_AUTHORITY_VALIDATION_TEXT = "The organization field is required";
	String CHEVEMENT_ACHIVED_YEAR_VALIDATION_TEXT ="The year field is required";
	String LANGUAGE_PROFICIENCY_NAME_VALIDATION_TEXT="The language name field is required";
	String LANGUAGE_PROFICIENCY_TYPE_VALIDATION_TEXT="The language proficiency field is required";
	String SOCIAL_MEDIA_VALIDATION_TEXT="The social link field is required";
	
	
	
	By PERSONAL_INFO_EDIT_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/p[2]/a[1]"); 
	By PERSONAL_INFO_DEGISNATION_EDIT_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/p[2]/a[1]/span[1]"); 
	By PERSONAL_INFO_ADDRESS_EDIT_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/p[2]/a[1]/span[1]"); 
	By PERSONAL_INFO_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]"); 
	By PERSONAL_INFO_SAVE_BUTTON=By.xpath("//button[contains(text(),'Save')]"); 
	By PERSONAL_INFO_PROFILE_IMAGE_UPLOAD_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]"); 
	By PEROSNAL_INFO_IMAGE_LOAD_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]"); 
	By PERSONAL_INFO_IMAGE_CANCEL_BUTTON=By.xpath("//a[contains(text(),'Cancel')]"); 
	By PERSONAL_INFO_IMAGE_UPLOAD_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/i[1]"); 
	By PERSONAL_INFO_FULLNAME_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]"); 
	By PERSONAL_INFO_DESIGNATION_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]"); 
	By PERSONAL_INFO_MOBILE_INPUT_FIELD =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]"); 
	By PERSONAL_INFO_MOBILE_PLUS_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/button[1]"); 
	By PERSONAL_INFO_EMAIL_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/input[1]"); 
	By PERSONAL_INFO_EMAIL_PLUS_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/button[1]"); 
	By PERSONAL_INFO_MAILLING_ADDRESS_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/textarea[1]"); 
	By PERSONAL_SUMMARY_ADDorEDIT_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[2]/a[1]"); 
	By PERSONAL_SUMMARY_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]"); 
	By PERSONAL_SUMMARY_GET_SUGGESTION_BUTTON=By.xpath("//button[contains(text(),'suggestion')]"); 
	By PERSONAL_SUMMARY_SAVE_BUTTON=By.xpath("//button[contains(text(),'Save')]"); 
	By PERSONAL_SUMMARY_SUGGESTION_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	By PERSONAL_SUMMARY_SUGGESTION_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/span[3]"); 
	By PERSONAL_SUMMARY_SUGGESTION_SCTROLL_LOCATOR=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]"); 
	By PERSONAL_SUMMARY_SUGGESTION_SELECT_LOCATOR=By.xpath("//p[contains(text(),'years of experience working in ')]"); 
	By WORK_EXPERENCE_ADDor_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/p[2]/a[1]"); 
	By WORK_EXPERENCE_ADD_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]"); 
	By WORK_EXPERENCE_DELETE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]/span[2]"); 
	By WORK_EXPERENCE_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]"); 
	By WORK_EXPERENCE_NEXT_BUTTON=By.xpath("//button[contains(text(),'Next')]"); 
	By WORK_EXPERENCE_CURRENT_WORK_CHECKBOX=By.xpath("//input[@id='exampleCheck1']"); 
	By WORK_EXPERENCE_SELECT_PROFESSION_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	By WORK_EXPERENCE_ORGANIZATION_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"); 
	By WORK_EXPERENCE_JOIN_DATE_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	By WORK_EXPERENCE_END_DATE_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	By WORK_EXPERENCE_JOINT_DATE_SELECT=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[11]"); 
	By WORK_EXPERENCE_END_DATE_SELCT=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/span[18]"); 
	By WORK_EXPERENCE_SELECT_PROFESSION=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[643]"); 
	By WORK_EXPERENCE_SUGESSTION_BACK_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/span[1]/span[1]"); 
	By WORK_EXPERENCE_RESPONSIBILITIES_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]"); 
	By WORK_EXPERENCE_RESPONSIBILITIES_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]"); 
	By WORK_EXPERENCE_RESPONSIBILITIES_SUGGESTION_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/span[3]"); 
	By WORK_EXPERENCE_RESPONSIBILITIES_SUGGESTION_SELECT1=By.xpath("//p[contains(text(),'Advising senior managers on risk assessments inclu')]"); 
	By WORK_EXPERENCE_RESPONSIBILITIES_SUGGESTION_SELECT2=By.xpath("//p[contains(text(),'Maintaining the financial systems and policies con')]"); 
	By WORK_EXPERENCE_RESPONSIBILITIES_SUGGESTION_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	By EDUCATION_ADD_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/p[2]/a[1]"); 
	By EDUCATION_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/button[1]"); 
	By EDUCATION_SAVE_BUTTON=By.xpath("//button[contains(text(),'Add')]"); 
	By EDUCATION_CURRENTLY_STUDY_CHECKBOX=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/input[1]"); 
	By EDUCATION_INSTITUTION_NAME_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	By EDUCATION_INSTITUTION_LOCATION_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"); 
	By EDUCATION_DEGREE_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]"); 
	By EDUCATION_FIELD_OF_STUDY_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/input[1]"); 
	By EDUCATION_RESULT_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]"); 
	By EDUCATION_OUT_OF_INPUT_RESULT=By.xpath("//button[@id='dropdown-1__BV_toggle_']"); 
	By EDUCATION_START_DATE_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	By EDUCATION_END_DATE_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	By EDUCATION_EDIT_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/a[2]/span[2]"); 
	By EDUCATION_DELETE=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]"); 
	By PROFESSIONAL_CERTIFICATION_ADD_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/p[2]/a[1]"); 
	By PROFESSIONAL_CERTIFICATION_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]"); 
	By PROFESSIONAL_CERTIFICATION_GET_SUGGESTION=By.xpath("//button[contains(text(),'suggestion')]"); 
	By PROFESSIONAL_CERTIFICATION_SAVE_BUTTON=By.xpath("//button[contains(text(),'Save')]"); 
	By PROFESSIONAL_CERTIFICATION_SUGGESTION_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"); 
	By PROFESSIONAL_CERTIFICATION_SUGGESTION_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[3]"); 
	By PROFESSIONAL_CERTIFICATION_SEGGESTION_SCROOLorSELECT_LOCATOR=By.xpath("//p[contains(text(),'Global travel professional Certification [Timefram"); 
	By PROFESSIONAL_CERTIFICATION_DELETE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]/span[1]"); 
	By DELETE =By.xpath("//button[contains(text(),'Delete')]"); 
	By DELETE_CANCEL=By.xpath("//button[contains(text(),'No')]"); 
	By SKILL_ADD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/p[2]/a[1]"); 
	By SKILL_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/button[1]"); 
	By SKILL_SAVE_BUTTON=By.xpath("//button[contains(text(),'Save')]"); 
	By SKILL_LEVEL_BASIC=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"); 
	By SKILL_LEVEL_NOVICE=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]"); 
	By SKILL_LEVEL_INTERMEDIATE=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/input[1]"); 
	By SKILL_LEVEL_ADVANCE=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/input[1]"); 
	By SKILL_LEVEL_EXPERT=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/input[1]"); 
	By SKILL_LEVEL_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The skill level field is required')]"); 
	By SKILL_NAME_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The skill name field is required')]"); 
	By SKILL_SELECT_FOR_SCROOL=By.xpath("//p[contains(text(),'Attention to detail & aesthetics')]"); 
	By SKILL_DELETE_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/span[1]");
	By SKILL_EDIT_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[2]/span[1]");
	By ACHEVEMENT_ADD_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/p[2]/a[1]");
	By ACHEVEMENT_CLOSE_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/button[1]");
	By ACHEVEMENT_SAVE_BUTTON =By.xpath("//button[contains(text(),'Save')]");
	By ACHEVEMENT_NAME_INPUT_FIELD =By.xpath("//input[@id='name']");
	By ACHEVEMENT_NAME_VALIDATION_LOCATOR =By.xpath("//span[contains(text(),'The name field is required')]");
	By ACHEVEMENT_AUTHORITY =By.xpath("//input[@id='organization']");
	By ACHEVEMENT_AUTHORITY_VALIDATION_LOCATOR =By.xpath("//span[contains(text(),'The organization field is required')]");
	By ACHEVEMENT_URL_INPUT_FIELD =By.xpath("//input[@id='url']");
	By ACHEVEMENT_ACHIVED_YEAR_FIELD =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/input[1]");
	By ACHEVEMENT_ACHIVED_YEAR_VALIDATION_LOCATOR =By.xpath("//span[contains(text(),'The year field is required')]");
	By ACHEVEMENT_DESCRIPTION_INPUT_FIELD =By.xpath("//textarea[@id='']");
	By ACHEVEMENT_YEAR_SELECT_LOCATOR =By.xpath("//span[contains(text(),'2021')]");
	By ACHEVEMENT_DELETE_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]");
	By ACHEVEMENT_EDIT_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/a[2]/span[1]");
	By LANGUAGE_PROFICIENCY_ADD_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/p[2]/a[1]");
	By LANGUAGE_PROFICIENCY_CLOSE_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/button[1]");
	By LANGUAGE_PROFICIENCY_NAME_INPUT_FIELD =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	By LANGUAGE_PROFICIENCY_NAME_VALIDATION_LOCATOR =By.xpath("//span[contains(text(),'The language name field is required')]");
	By LANGUAGE_PROFICIENCY_TYPE_BEGINEER_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
	By LANGUAGE_PROFICIENCY_TYPE_CONVERSATIONAL_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]");
	By LANGUAGE_PROFICIENCY_TYPE_FLUENT =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/input[1]");
	By LANGUAGE_PROFICIENCY_TYPE_NATIVE =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/input[1]");
	By LANGUAGE_PROFICIENCY_TYPE_VALIDATION_LOCATOR =By.xpath("//span[contains(text(),'The language proficiency field is required')]");
	By LANGUAGE_PROFICIENCY_NAME_SCROOL_LOCATOR =By.xpath("//p[contains(text(),'Armenian')]");
	By lANGUAGE_PROFICIENCY_DELETE_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]");
	By LANGUAGE_PROFICIENCY_EDIT_BUTTON =By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]/span[1]");
	By INTEREST_ADDorEDIT_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/p[2]/a[1]");
	By INTEREST_CLOSE_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/button[1]");
	By INTEREST_SAVE_BUTTON = By.xpath("//button[contains(text(),'Save')]");
	By INTEREST_ADD_CUSTOM_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]");
	By INTEREST_GARDERING_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]");
	By INTEREST_SPORTS_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[1]/div[9]/div[1]/input[1]");
	By INTEREST_CUSTOM_INPUT_FIELD = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[2]/div[1]/input[1]");
	By INTEREST_CUSTOM_DONE_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[2]/div[1]/button[1]");
	By INTEREST_CUSTOM_CLOSE_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[2]/div[1]/button[2]/*[1]");
	By REFERENCES_ADD_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[1]/a[1]");
	By REFERENCES_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[2]/div[1]/button[1]");
	By REFERENCES_SAVE_BUTTON=By.xpath("//button[contains(text(),'Save')]");
	By REFERENCES_NAME_INPUT_FIELD=By.xpath("//input[@id='name']");
	By REFERENCES_NAME_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The name field is required')]");
	By REFERENCES_INSTITUTION_INPUT_FIELD=By.xpath("//input[@id='institution']");
	By REFERENCES_INSTITUTION_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The institution field is required')]");
	By REFERENCES_DESIGNATION_INPUT_FIELD=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]");
	By REFERENCES_DESIGNATION_SCROOLorSELECT=By.xpath("//p[contains(text(),'Deputy Draftsman')]");
	By REFERENCES_RELATION_INPUT_FIELD=By.xpath("//input[@id='relation']");
	By REFERENCES_EMAIL_INPUT_FIELD=By.xpath("//input[@id='email']");
	By REFERENCES_EMAIL_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The email field is required')]");
	By REFERENCES_PHONE_INPUT_FIELD=By.xpath("//input[@id='phone']");
	By REFERENCES_LOCATION_INPUT_FIELD=By.xpath("//input[@id='address']");
	By REFERENCES_DELETE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]");
	By REFERENCES_EDIT_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[2]/div[1]/div[1]/div[1]/div[1]/a[2]/span[1]");
	By SOCIAL_MEDIA_ADD_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/a[1]");
	By SOCIAL_MEDIA_FACEBOOK_BUTTON=By.xpath("//p[contains(text(),'Facebook')]");
	By SOCIAL_MEDIA_INSTRAGRAM_BUTTON=By.xpath("//p[contains(text(),'Instagram')]");
	By SOCIAL_MEDIA_LINKEDIN_BUTTON=By.xpath("//p[contains(text(),'Linkedin')]");
	By SOCIAL_MEDIA_SKYPE=By.xpath("//p[contains(text(),'Skype')]");
	By SOCIAL_MEDIA_GITHUB=By.xpath("//p[contains(text(),'Github')]");
	By SOCIAL_MEDIA_INPUT_FIELD=By.xpath("//input[@id='']");
	By SOCIAL_MEDIA_CLOSE_BUTTON=By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[2]/button[1]/span[1]/span[3]");
	By SOCIAL_MEDIA_SAVE_BUTTON=By.xpath("//button[contains(text(),'Save')]");
	By SOCIAL_MEDIA_VALIDATION_LOCATOR=By.xpath("//span[contains(text(),'The social link field is required')]");
	By SOCIAL_MEDIA_DELETE_BUTTON = By.xpath("//body/div[@id='app']/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]/span[1]");
}
