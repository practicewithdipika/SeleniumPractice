package Selenium.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleBrowserWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com/");
		
		String parentWindowId= driver.getWindowHandle();
		System.out.println("Parent window ID:"+ parentWindowId);
		
		//By locator
		WebElement aboutUs= driver.findElement(By.xpath("//div[@class='footer-main']//a[contains(text(),'About')]"));
		WebElement careers= driver.findElement(By.xpath("//div[@class='footer-main']//a[contains(text(),'Careers')]"));
		WebElement productUpdates= driver.findElement(By.xpath("//div[@class='footer-main']//a[contains(text(),'Product')]"));
		WebElement cookieDeclaration= driver.findElement(By.xpath("//div[@class='footer-main']//a[contains(text(),'Cookie')]"));
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.click(aboutUs);
		act.click(careers);
		act.click(productUpdates);
		act.click(cookieDeclaration);
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> windowIds = ids.iterator();
		
		while(windowIds.hasNext()) {
			String id = windowIds.next();
			
			driver.switchTo().window(id);
			Thread.sleep(2000);
			System.out.println("Title is: "+ driver.getTitle());
			Thread.sleep(2000);
			if(!id.equals(parentWindowId)) {
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Title is: "+ driver.getTitle());
		
		
		

	}

}
