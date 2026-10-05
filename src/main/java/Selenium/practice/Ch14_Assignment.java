package Selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch14_Assignment {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> info = driver.findElements(By.xpath("//div[@class='form-group required']"));
		for(WebElement e: info) {
			String text = e.getText();
			System.out.println(text);
		}
		
		//if you apply .getText() method on parent, it will give the text from parent and child both.
	}

}
