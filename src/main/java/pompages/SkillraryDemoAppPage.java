package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoAppPage {
	
	//declaration
	@FindBy(xpath="//div[@class='navbar-header']")
	private WebElement pageHeader;
	@FindBy(id="course")
	private WebElement courseTab;
	@FindBy(xpath="//span[@class='wrappers']//a[.='Selenium Training']")
	private WebElement seleniumTrainingLink;
	private WebElement categoryDropdown;
	private WebElement contactUsLink;
	
	

    public SkillraryDemoAppPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	//utilization
    public String getPageHeader() {
	return pageHeader.getText();
    }
	
	public void mouseHourToCourse(WebDriverUtility web) {
		web.mouseHover(courseTab);
	}
	
	public void clickSeleniumTraining() {
		seleniumTrainingLink.click();
	}
	
	public void selectCategory(WebDriverUtility web, int index) {
		web.dropdown(categoryDropdown,index);
	}
	
	public WebElement getContactUs() {
		return contactUsLink;
	}
	
	public void clickContactUs() {
		contactUsLink.click();
	}



}
