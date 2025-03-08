package launchSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("9986263210");
		driver.findElement(By.id("pass")).sendKeys("12345");
		
		driver.findElement(By.name("login")).click();

	}

}
