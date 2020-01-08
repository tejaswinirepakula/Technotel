package one;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\trepakula\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://smallpdf.com/pdf-converter");
		 driver.findElement(By.cssSelector("[class*='l0v3m7-6 hIetmX']")).click();
Thread.sleep(3000);
Runtime.getRuntime().exec("C:\\Users\\trepakula\\Documents\\autoIt\\fileupload.exe");
	}

}
