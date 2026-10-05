package Selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		Thread.sleep(2000);
		//1. using frame index
		//driver.switchTo().frame(2);
//		driver.switchTo().frame(2);
//		String title = driver.findElement(By.xpath("//h2[contains(text(),'Title')]")).getText();
//		System.out.println(title);
		
		//2. using id or name
//		driver.switchTo().frame("main");
//		String title = driver.findElement(By.xpath("//h2[contains(text(),'Title')]")).getText();
//		System.out.println(title);
		
		//3. using webElement
		driver.switchTo().frame(driver.findElement(By.name("main")));
		String title = driver.findElement(By.xpath("//h2[contains(text(),'Title')]")).getText();
		System.out.println(title);
		
//		WebElement ele = driver.findElement(By.xpath("//h2[contains(text(),'Title')]"));
//		driver.switchTo().frame(ele);
//		String title= ele.getText();
//		System.out.println(title);

	}

}
