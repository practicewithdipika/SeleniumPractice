package Selenium.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch19_JSAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(3000);
		
		//1. JS Alert
		driver.findElement(By.id("alertButton")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(3000);
		alert.accept();
		//alert.dismiss();
		
		//2. JS Confirm PopUp
		driver.findElement(By.id("confirmButton")).click();
		
		Alert alert1 = driver.switchTo().alert();
		String text1 = alert1.getText();
		System.out.println(text1);
		Thread.sleep(3000);
		alert1.accept();
		//alert1.dismiss();		
		
		//3. JS Prompt PopUp
		driver.findElement(By.id("promtButton")).click();
		
		Alert alert2 = driver.switchTo().alert();
		String text2 = alert2.getText();
		System.out.println(text2);
		Thread.sleep(3000);
		alert2.sendKeys("Dipika");
		alert2.accept();
		//alert2.dismiss();		
		
	}

}
