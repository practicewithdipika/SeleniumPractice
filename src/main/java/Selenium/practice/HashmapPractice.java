package Selenium.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashmapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/product&product_id=45&search=macbook");
		By info= By.xpath("(//div[@id='content']//ul[@class='list-unstyled'])[1]");
		List<WebElement> infoList = driver.findElements(info);
//		Brand: Apple
//		Product Code: Product 18
//		Reward Points: 800
//		Availability: Out Of Stock
		
		Map<String, String> dataMap= new HashMap<String, String>();
		
		for(WebElement e: infoList) {
			String text = e.getText();
			System.out.println(text);
			String infodata[] = text.split(":");// {Brand, Apple}
			String key = infodata[0].trim();
			String value = infodata[1].trim();
			dataMap.put(key, value);
			
		}
		
		
	}

}
