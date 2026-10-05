package Selenium.practice;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ch20_HasAuth_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username ="admin";
		String password ="admin";
		WebDriver driver = new ChromeDriver();
		
		//Basic Authentication Popup
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
		//HasAuthentication PopUp
		//((HasAuthentication)driver).register(() -> new UsernameAndPassword(username, password));
		HasAuthentication ha = (HasAuthentication)driver;
		ha.register(() -> new UsernameAndPassword(username, password));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
	}

}
