package Selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ch10_SelectClass {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/book-a-free-demo");
//		//Explicitly Wait of 10sec
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement country= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Form_getForm_Country")));
//		
//		Select select = new Select(country);
//		//select.selectByVisibleText("Angola"); //it will select Angola from the dropdown based on text
//		//select.selectByIndex(3);//it will select Algeria which is at index 3 from the dropdown
//		select.selectByValue("Belgium");//it is selected based on value attribute
		Thread.sleep(1000);
	    By country = By.id("Form_getForm_Country");
	    
	    SelectUsingText(country, "Albania");
	    List<WebElement> option = selectObject(country).getOptions();
	    
	    for(WebElement e: option) {
	    	String optionname = e.getText();
	    	System.out.println(optionname);
	    }
	}

	
	public static Select selectObject(By locator) {
		return new Select(getElement(locator));
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);	
	}
	
	public static void SelectUsingText(By locator, String text) {
		selectObject(locator).selectByVisibleText(text);
	}
}
