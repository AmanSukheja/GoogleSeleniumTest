package testScript;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GoogleHomePO;
import pom.SearchPO;

public class test1 extends BaseTest
{

	@Test
	public void testFacebook()
	{
	    try 
	    {
	    	wait=new WebDriverWait(driver, 20);
			driver.get("https://www.google.com/");
			GoogleHomePO googlePO=new GoogleHomePO(driver);
			googlePO.searchTxtBx().sendKeys("facebook" +Keys.ENTER);
			SearchPO searchPO=new SearchPO(driver);
			searchPO.verifyElement(searchPO.facebookLink());
			searchPO.facebookLink().click();
			System.out.println(driver.getTitle());
			String eTitle="Facebook - log in or sign up1";
			//wait.until(ExpectedConditions.titleContains(eTitle));
			String aTitle=driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
			Reporter.log("Title displayed", true);
			
	   } 
	    catch (Exception e) 
	    {
	    	Reporter.log("Exception Generated", true);
		  Assert.fail();
	    }
	}
}
