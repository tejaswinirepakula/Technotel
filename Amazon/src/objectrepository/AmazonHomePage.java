package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	WebDriver driver;
	public AmazonHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="twotabsearchtextbox")
	WebElement Searchbox;
	@FindBy(xpath="//input[@type='submit']")
	WebElement Search;
	@FindBy(xpath="//span[text()='Apple iPhone XR (64GB) - Yellow']")
	WebElement Product;
	public WebElement Searchbox()
	{
		return Searchbox;
	}
	public WebElement Search()
	{
		return Search;
	}
	public WebElement Product()
	{
		return Product;
	}

}
