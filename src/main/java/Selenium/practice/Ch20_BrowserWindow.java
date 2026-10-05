package Selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch20_BrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com/book-a-free-demo");
		
		String parentWindowID = driver.getWindowHandle();
		
		WebElement contactUs = driver.findElement(By.xpath("//footer//a[contains(text(), 'Contact Us')]"));
		WebElement careers = driver.findElement(By.xpath("//footer//a[contains(text(), 'Careers')]"));
		WebElement productUpdates = driver.findElement(By.xpath("//footer//a[contains(text(), 'Product Updates')]"));
		WebElement newsArticles = driver.findElement(By.xpath("//footer//a[contains(text(), 'News Articles')]"));
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		act.click(contactUs).perform();
		String contactUsWindowID = driver.getWindowHandle();
		System.out.println(contactUsWindowID);
		driver.switchTo().window(contactUsWindowID);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
		
		
		
		
		/*
		act.click(careers).perform();
		String careersWindowID = driver.getWindowHandle();
		driver.switchTo().window(careersWindowID);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowID);
		
		act.click(productUpdates).perform();
		String productUpdatesWindowID = driver.getWindowHandle();
		driver.switchTo().window(productUpdatesWindowID);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowID);
	
		*/
	}

}
