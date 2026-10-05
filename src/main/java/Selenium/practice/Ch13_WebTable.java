package Selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch13_WebTable {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		List<WebElement> info = driver.findElements(By.xpath("//a[text()='Joe.Root']/parent::td/following-sibling::td"));
		
		for(WebElement e : info) {
			String text = e.getText();
			System.out.println(text);
		}
	}

}
