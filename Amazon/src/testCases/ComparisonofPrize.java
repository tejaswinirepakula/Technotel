package testCases;

import java.util.ArrayList;
import java.util.Currency;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectrepository.AmazonHomePage;
import objectrepository.AmazonProductPage;
import objectrepository.FlipKartHomePage;
import objectrepository.FlipKartProductPage;

public class ComparisonofPrize {

	
		WebDriver driver;
		@BeforeTest
		public void intialize(){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\trepakula\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
			 	
		@Test
		public void amazon() {
		 driver.get("https://www.amazon.in./");
		 AmazonHomePage ahp = new AmazonHomePage(driver);
		 ahp.Searchbox().sendKeys("iPhone XR (64GB) - Yellow");
		 ahp.Search().click();
		 ahp.Product().click();
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs2.get(1));  
		 AmazonProductPage app= new AmazonProductPage(driver);
		 String amazonPrice= app.Price().getText();
		System.out.println(amazonPrice);
		}
		@Test
		public void flipkart() {
		 driver.get("https://www.flipkart.com/");
		 FlipKartHomePage fhp= new FlipKartHomePage(driver);
		 
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		 fhp.Searchbox().sendKeys("iPhone XR (64GB) - Yellow");
		 fhp.Searchbox().sendKeys(Keys.ENTER);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//*[text()='Apple iPhone XR (Yellow, 64 GB)']")).click();
		
		 ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs3.get(2));  
		FlipKartProductPage fpp= new FlipKartProductPage(driver);
		 String FlipkartPrice = fpp.Price().getText();
		 System.out.println(FlipkartPrice);
		}
		@AfterTest
		 public void teardown() {
			driver.close(); 
		 }
		 
	}


