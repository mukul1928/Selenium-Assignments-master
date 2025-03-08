package launchSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopup {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		
		WebElement clk=driver.findElement(By.xpath("//button[@class='btnjs']"));
		clk.click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept(); //accept the popup
		
		//driver.switchTo().alert().dismiss(); //dismiss the popup
	}

}
