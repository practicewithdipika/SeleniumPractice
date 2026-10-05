package Selenium.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ch20_practice_BW {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com");
		Thread.sleep(2000);
		WebElement ourOffices = driver.findElement(By.xpath("//footer//a[contains(text(), 'Offices')]"));
		String parentWindowID = driver.getWindowHandle();
		//ourOffices.click();-->normal click is not working
		Actions act = new Actions(driver);
		act.click(ourOffices).perform();
		
		Set<String> handle = driver.getWindowHandles();
		
		Iterator<String> it = handle.iterator();
		
		while(it.hasNext()) {
			String windowID = it.next();
			if(!windowID.equals(parentWindowID)) {
				driver.switchTo().window(windowID);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
			//driver is lost
			driver.switchTo().window(parentWindowID);
			System.out.println(driver.getTitle());
			
		
		

	}

}
