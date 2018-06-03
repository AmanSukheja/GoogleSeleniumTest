package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class SearchPO extends BasePage
{
	
	public SearchPO(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//a[text()='Facebook - Log In or Sign Up']")
	private WebElement facebookLink;
	public WebElement facebookLink()
	{
		return facebookLink;
	}
	@FindBy(xpath="//a[text()='Instagram']")
	private WebElement instaLink;
	public WebElement instaLink()
	{
		return instaLink;
	}
	@FindBy(xpath="//a[text()='Login on Twitter']")
	private WebElement twitterLink;
	public WebElement twitterLink()
	{
		return twitterLink;
	}
	@FindBy(xpath="//a[text()='Sign Up | LinkedIn']")
	private WebElement linkedInLink;
	public WebElement linkedInLink()
	{
		return linkedInLink;
	}
	
}
