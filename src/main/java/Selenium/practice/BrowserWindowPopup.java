package Selenium.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class BrowserWindowPopup {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com/");
		//By locator
		By aboutUs= By.xpath("//div[@class='footer-main']//a[contains(text(),'About')]");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(aboutUs);
		act.click(ele).perform();
		
		Set<String> windowIDs= driver.getWindowHandles();
		Iterator<String> it= windowIDs.iterator();
		
		String parentWindowID= it.next();
		System.out.println(parentWindowID);
		
		String childWindowID= it.next();
		System.out.println(childWindowID);
		
		String parentTitle= driver.getTitle();
		System.out.println(parentTitle);
		
		driver.switchTo().window(childWindowID);
		String childTitle= driver.getTitle();
		System.out.println(childTitle);
		driver.close();//closing the child window
		
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
