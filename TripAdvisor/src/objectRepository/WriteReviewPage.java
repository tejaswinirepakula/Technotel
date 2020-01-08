package objectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WriteReviewPage {
	WebDriver driver;
	Actions actions;
	public WriteReviewPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="ReviewTitle")
	WebElement TitleReview;
	public WebElement TitleReview()
	{
		return TitleReview;
	}
	@FindBy(id="ReviewText")
	WebElement textReview;
	public WebElement textReview()
	{
		return textReview;
	}
	@FindBy(id="bubble_rating")
	WebElement rating;
	public WebElement rating()
	{
		 new Actions(driver);
		actions.moveToElement(rating).perform();
		return rating;
	}
	@FindBy(id="qid12_bubbles")
	WebElement service_rating;
	public WebElement service_rating()
	{
		 new Actions(driver);
		actions.moveToElement(service_rating).perform();
		return service_rating;
	}
	@FindBy(id="qid11_bubbles")
	WebElement cleanliness;
	public WebElement cleanliness()
	{
		 new Actions(driver);
		actions.moveToElement(cleanliness).perform();
		return cleanliness;
	}
	@FindBy(id="qid47_bubbles")
	WebElement Value_rating;
	public WebElement Value_rating()
	{
		 new Actions(driver);
		actions.moveToElement(Value_rating).perform();
		return Value_rating;
	}
	@FindBy(id="SUBMIT")
	WebElement search;
	public WebElement search()
	{
		return search;
	}
	

}
