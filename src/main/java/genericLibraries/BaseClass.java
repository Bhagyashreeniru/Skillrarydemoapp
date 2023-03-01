package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.ContactUsPage;
import pompages.CoreJavaVideoPage;
import pompages.Homepage;
import pompages.SeleniumTrainingPage;
import pompages.SkillraryDemoAppPage;
import pompages.TestingPage;

public class BaseClass {
	
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected Homepage home;
	protected SkillraryDemoAppPage demoApp;
	protected SeleniumTrainingPage selenium;
	protected TestingPage testing;
	protected CoreJavaVideoPage coreJava;
	protected ContactUsPage contact;

	//@BeforeSuite
	//@BeforeTest
	
	@BeforeClass
	public void classConfiguration() {
		property=new PropertiesUtility();
		excel=new ExcelUtility();
		web=new WebDriverUtility();
		
		property.propertiesInitialization(IConstantPath.PROPERTIES_FILE_PATH);
		excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
	}
	
	@BeforeMethod
	public void methodConfiguration() {
		long time=Long.parseLong(property.fetchProperty("timeouts"));
		driver=web.openApplication(property.fetchProperty("Browser"),property.fetchProperty("url"),time);
		
		home=new Homepage(driver);
		Assert.assertTrue(home.getLogo().isDisplayed());
		demoApp=new SkillraryDemoAppPage(driver);
		selenium=new SeleniumTrainingPage(driver);
		testing=new TestingPage(driver);
		coreJava=new CoreJavaVideoPage(driver);
		contact=new ContactUsPage(driver);
	}
	
	@AfterMethod
	public void classTeardown()
	{
		excel.closeExcel();
	}
	
	//@AfterTest
	//@AfterSuite

}
