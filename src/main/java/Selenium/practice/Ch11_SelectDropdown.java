package Selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ch11_SelectDropdown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://orangehrm.com/book-a-free-demo");
        By country = By.id("Form_getForm_Country");
        Select select = new Select(driver.findElement(country));
        List<WebElement> options = select.getOptions();
        
        for(WebElement e : options) {
        	String text =e.getText();
        	System.out.println(text);
        }
        


    }
}
