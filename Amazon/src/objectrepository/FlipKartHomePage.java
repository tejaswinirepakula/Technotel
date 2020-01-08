package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKartHomePage {

	WebDriver driver;
	public FlipKartHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="q")
	WebElement Searchbox;
	public WebElement Searchbox()
	{
		return Searchbox;
	}
	@FindBy(xpath="//*[text()='Apple iPhone XR (Yellow, 64 GB)']")
	WebElement Product;
	public WebElement Product()
	{
		return Product;
	}
}
