package Selenium.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ch19_JSAlerts {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--incognito");
		driver = new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		By jsAlert= By.xpath("//button[contains(text(),'JS Alert')]");
//		By jsConfirm= By.xpath("//button[contains(text(),'JS Confirm')]");
//		By jsPrompt = By.xpath("//button[contains(text(),'JS Prompt')]");
//		
//		driver.findElement(jsAlert).click();
//		JSPopUpText(driver);
//		JSPopUpAccept(driver);
//		
//		driver.findElement(jsConfirm).click();
//		JSPopUpText(driver);
//		JSPopUpDismiss(driver);
//		
//		driver.findElement(jsPrompt).click();
//		Switch(driver).sendKeys("Dipika Nimje");
//		Thread.sleep(3000);
//		JSPopUpText(driver);
//		JSPopUpDismiss(driver);
		
		//Basic Authentication pop up
//		String username= "admin";
//		String password="admin";
		//driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
	
		//File upload pop up (type='file')
//		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
//		WebElement pop = driver.findElement(By.xpath("//input[@type='file']"));
//		pop.sendKeys("C:/Users/d.nimje/Downloads/ltb failed.jpg");

		//HasAuthentication 
		
		String username= "admin";
		String password="admin";
//		((HasAuthentication)driver).register(UsernameAndPassword.of(username, password));
		((HasAuthentication)driver).register(()-> new UsernameAndPassword(username, password));
		 driver.get("https://the-internet.herokuapp.com/basic_auth");
//	}
//	public static Alert Switch(WebDriver driver) {
//		return driver.switchTo().alert();
//	}
//	public static void JSPopUpAccept(WebDriver driver) {
//		Switch(driver).accept();
//	}
//	public static void JSPopUpDismiss(WebDriver driver) {
//		Switch(driver).dismiss();
//	}
//	public static void JSPopUpText(WebDriver driver) {
//		String text = Switch(driver).getText();
//		System.out.println("Text of JS Alert Pop up:"+text);
//	}

}
}
