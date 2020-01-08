package testcases;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectRepository.HotelhomePage;
import objectRepository.TripHomePage;
import objectRepository.WriteReviewPage;

public class ReviewPage {
	 WebDriver driver;
	
		@BeforeTest
		public void intialize(){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\trepakula\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://www.tripadvisor.in/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		}
		
	
		@Test
		public void tripAdvisor() 
{
	TripHomePage thp=new TripHomePage(driver);
	thp.Search().click();;
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	thp.searchBox().sendKeys("Club Mahindra");
	thp.searchBox().sendKeys(Keys.ENTER);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	thp.FirstLink().click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
	 driver.switchTo().window(tabs3.get(1));  
	 HotelhomePage hhp= new HotelhomePage(driver);
	 hhp.writeReview().click();
	ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	 driver.switchTo().window(tabs2.get(2));  
	 WriteReviewPage wrp= new WriteReviewPage(driver);
	 wrp.TitleReview().sendKeys("hdsidjhiowdhis");;
	wrp.textReview().sendKeys("jijsj123434e45dxioksjxkj");
	wrp.rating().click();;
	wrp.service_rating().click();;
	wrp.cleanliness().click();;
	wrp.Value_rating().click();;
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	wrp.search().click();
		}
		
		@AfterTest
		 public void teardown() {
			driver.close(); 
		 }
	
}
