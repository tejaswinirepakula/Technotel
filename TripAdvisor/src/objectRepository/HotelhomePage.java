package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelhomePage {

	WebDriver driver;
	public HotelhomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"component_12\"]/div/div[2]/div/div[2]/div/div[1]/a")
	WebElement writeReview;
	public WebElement writeReview()
	{
		return writeReview;
	}
	

}
