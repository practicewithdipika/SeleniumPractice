package Selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch11_DropdownWithoutSelect {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/book-a-free-demo");
		//with xpath
		List<WebElement> optionList = driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
		
		//with css selector: By.cssSelector("#Form_getForm_Country > option")
		
		for(WebElement e: optionList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("India")) {
				e.click();
				break;
			}
		}
	}

}
