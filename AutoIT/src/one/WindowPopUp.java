package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\trepakula\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/");
		 //driver.get("https://admin:admin@the-internet.herokuapp.com/");
		 driver.findElement(By.linkText("Basic Auth")).click();
		

	}

}
