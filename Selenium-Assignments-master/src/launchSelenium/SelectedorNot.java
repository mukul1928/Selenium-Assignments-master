package launchSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectedorNot {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement search=driver.findElement(By.xpath("(//textarea)[1]"));
		
		if(search.isDisplayed()==true && search.isEnabled()==true)
		{
			search.sendKeys("India");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnK']")).click();

	}

}
