package one;






import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class TableSort {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\trepakula\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		 driver.findElement(By.cssSelector("tr td:nth-child(2)")).click();
		List<WebElement> firstColList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
	ArrayList<String> originalList= new ArrayList<String>();
	for (int i=0;i<firstColList.size();i++) {
		originalList.add(firstColList.get(i).getText());
		
	}
	ArrayList<String> CopiedList= new ArrayList<String>();
	for (int i=0;i<originalList.size();i++) {
		CopiedList.add(originalList.get(i));
		
	}
	Collections.sort(CopiedList);
	for(String s:originalList)
{
System.out.println(s);	
}
Assert.assertTrue(originalList.equals(CopiedList));

	
	}

}
