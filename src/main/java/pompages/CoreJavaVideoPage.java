package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaVideoPage {
	
	//Declaration
	
	@FindBy(xpath="//h1[text()='Core Java']")
	private WebElement pageHeader;
	
	@FindBy(xpath="")
	private WebElement playButton;
	
	@FindBy(xpath="")
	private WebElement pauseButton;
	
	@FindBy(xpath="")
	private WebElement addToWishlistTab;;
	
	@FindBy(xpath="")
	private WebElement messageArea;
	
	@FindBy(xpath="//button[text()='Send us mail']")
	private WebElement sendMailButton;
	
	@FindBy(xpath="")
	private WebElement closeCookiesIcon;

	private WebElement coreJavaForSeleniumLink;
	
	//initialization
	public CoreJavaVideoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public String getPageHeader()
	{
		return pageHeader.getText();	
	}
	
	public void clickPlayButton()
	{
		playButton.click();
	}
	
	public void clickPauseButton()
	{
		pauseButton.click();
	}

	public void clickCoreJavaForSeleniumLink() {
		coreJavaForSeleniumLink.click();
	    	
	}

	public void clickCloseCookies() {
		closeCookiesIcon.click();
		
	}

	public void clickAddToWishlist() {
		addToWishlistTab.click();
		
	}
}
