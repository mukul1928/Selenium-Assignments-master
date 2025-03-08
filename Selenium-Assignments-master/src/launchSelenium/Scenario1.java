package launchSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		
		//Thread.sleep(2000);
		//driver.close();

	}

}
