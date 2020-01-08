package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProductPage {
	WebDriver driver;
	public AmazonProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="priceblock_ourprice")
	WebElement Price;
	public WebElement Price()
	{
		return Price;
	}
	
	
	
}
