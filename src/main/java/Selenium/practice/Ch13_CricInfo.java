package Selenium.practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch13_CricInfo {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/the-hundred-men-s-competition-2024-1417778/manchester-originals-men-vs-oval-invincibles-men-18th-match-1417807/full-scorecard");
		System.out.println(getWicketTaker("Dawid Malan"));
		System.out.println(getWicketTaker("Donovan Ferreira"));
		
		
		System.out.println(info("Dawid Malan"));
		System.out.println(info("Donovan Ferreira"));


	}
	
	public static String getWicketTaker(String Batsmen) {
		
		return driver.findElement(By.xpath("//span[text()='"+Batsmen+"']/ancestor::td/following-sibling::td/span")).getText();
		
	}
	
	public static List<String> info(String Batsmen) {
		List <WebElement> BatsmenInfo= driver.findElements(By.xpath("//span[text()='"+Batsmen+"']/ancestor::td/following-sibling::td[contains(@class, 'ds-min-w-max')]"));
		List<String> scoreCard = new ArrayList<String>();
		for(WebElement e: BatsmenInfo) {
			String text = e.getText();
			scoreCard.add(text);
		}
		return scoreCard;
	}

}
