package testScript;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GoogleHomePO;
import pom.SearchPO;

public class test3 extends BaseTest
{
	@Test
	public void testTwitter()
	{
	    try 
	    {
	    	wait=new WebDriverWait(driver, 20);
			driver.get("https://www.google.com/");
			GoogleHomePO googlePO=new GoogleHomePO(driver);
			googlePO.searchTxtBx().sendKeys("twitter" +Keys.ENTER);
			SearchPO searchPO=new SearchPO(driver);
			searchPO.verifyElement(searchPO.twitterLink());
			searchPO.twitterLink().click();
			System.out.println(driver.getTitle());
			String eTitle="Login on Twitter";
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
