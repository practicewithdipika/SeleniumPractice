package Selenium.practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String pgSrc= driver.getPageSource();
		System.out.println(pgSrc);
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('hello!! Welcome')");
	}

}
