package Selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch19_UploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		WebElement ele = driver.findElement(By.id("uploadFile"));
		
		ele.sendKeys("C:\\Users\\d.nimje\\Downloads\\SQL_Notes.pdf");
		
		
		Thread.sleep(3000);
	}

}
