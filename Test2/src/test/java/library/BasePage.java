package library;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, 20);
	}
	public void verifyTitle(String title)
	{
		try
		{
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("Title Displayed", true);
		}
		catch(TimeoutException e)
		{
			Reporter.log("Title not displayed", true);
		}
	}
	public void verifyElement(WebElement ele)
	{
		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log("Element found", true);
		} catch (Exception e) 
		{
			Reporter.log("Element not found", true);
		}
	}
}
