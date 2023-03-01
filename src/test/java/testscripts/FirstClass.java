package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FirstClass extends BaseClass {
	
	@Test
	public void FirstTest() {
		SoftAssert soft=new SoftAssert();
		home.clickGears();
		home.clickSkillraryDemoApp();
		web.switchToChildBrowser();
		
		soft.assertEquals(demoApp.getPageHeader(), "Skillrary_ECommerce");
		demoApp.mouseHourToCourse(web);
		demoApp.clickSeleniumTraining();
		
		soft.assertEquals(selenium.getPageHeader(), "Selenium Training");
		selenium.doubleClickPlusButton(web);
		selenium.clickAdToCart();
		web.handleAlert();
		
		soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
		soft.assertAll();
	}

}
