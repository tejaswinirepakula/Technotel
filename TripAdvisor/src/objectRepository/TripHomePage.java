package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TripHomePage {
	WebDriver driver;
	
	public TripHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Search']")
	WebElement Search;
	public WebElement Search()
	{
		return Search;
	}
	@FindBy(id="mainSearch")
	WebElement searchBox;
	public WebElement searchBox()
	{
		return searchBox;
	}
	@FindBy(xpath="//span[text()='Club Mahindra Madikeri, Coorg']")
	WebElement Firstlink;
	public WebElement FirstLink()
	{
		return Firstlink;
	}

}
