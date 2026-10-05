package Selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch16_BigBasket {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		By shop = By.xpath("//button[@id='headlessui-menu-button-:Ramkj6:']");
		By FruitVeg= By.linkText("//a[text()= 'Fruits & Vegetables']");
		By FreshVeg = By.linkText("Fresh Vegetables");
		By leafyVeg = By.linkText("Leafy Vegetables");
		
		Actions act = new Actions(driver);
		getElement(shop).click();
		//Thread.sleep(1000);
		act.moveToElement(getElement(FruitVeg)).perform();
		//Thread.sleep(1000);
		act.moveToElement(getElement(FreshVeg)).perform();
		//Thread.sleep(1000);
		getElement(leafyVeg).click();		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
