package one;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\trepakula\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		 driver.findElement(By.id("fromPlaceName")).sendKeys("BEN");
		 driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		 //driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		// System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		int i=0;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		{
			i++;
			 driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			 text=(String) js.executeScript(script);
			 if(i>10)
			 {
				 break;
			 }
			 
		}
		if(i>10) {
			System.out.println("element not found");
		}
		else
		{
			System.out.println("element found");
		}
		System.out.println(text);
		 driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
		 
	}

}
