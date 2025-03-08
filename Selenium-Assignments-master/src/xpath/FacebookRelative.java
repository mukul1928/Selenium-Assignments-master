package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRelative {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement uname = driver.findElement(By.xpath("//input[@name='email']"));
		uname.sendKeys("jaya@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("jay123");
		
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();

	}

}
