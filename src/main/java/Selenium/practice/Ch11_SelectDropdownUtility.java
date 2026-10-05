package Selenium.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ch11_SelectDropdownUtility {
	static WebDriver driver;
	public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://orangehrm.com/book-a-free-demo");
        By country = By.id("Form_getForm_Country");

        
        List<String> countries = Arrays.asList("India", "Afghanistan");
        if(getDropdownOptions(country).containsAll(countries)) {
        	System.out.println("Pass");
        }
        else {
        	System.out.println("Fail");
        }
        
	}
	public static List<String> getDropdownOptions(By locator) {
        Select select = new Select(getElement(locator));
        List<WebElement> options = select.getOptions();
        List<String> optionTextList = new ArrayList<String>();
        for(WebElement e : options) {
        	String text =e.getText();
        	optionTextList.add(text);
        }
        return optionTextList;
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
