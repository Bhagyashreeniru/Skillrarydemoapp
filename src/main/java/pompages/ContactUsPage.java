package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	
	    @FindBy(xpath="//img[contains(@src,'contactus')]")
	    private WebElement pageHeader;
	    
	    @FindBy(name="name")
	    private WebElement fullNameTF;
	    
	    @FindBy(name="name")
	    private WebElement emailTF;
	    
	    @FindBy(name="name")
	    private WebElement subjectTF;
	    
	    @FindBy(name="name")
	    private WebElement messageArea;
	    
	    @FindBy(xpath="//button[text()='Send us mail']")
	    private WebElement sendUsMailButton;
	
	
	    //initialization
		public ContactUsPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//utilization
		public WebElement getPageHeader()
		{
			return pageHeader;
		}
		
		public void sendContactDetails(String name,String email,String subject, String string)
		{
			fullNameTF.sendKeys(name);
			emailTF.sendKeys(email);
			subjectTF.sendKeys(subject);
		}
		

}
