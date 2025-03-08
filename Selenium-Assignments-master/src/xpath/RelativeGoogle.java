package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeGoogle {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement search=driver.findElement(By.xpath("(//textarea)[1]")); //relative xpath
		search.sendKeys("India");
		
		Thread.sleep(2000);
		
		WebElement btn=driver.findElement(By.xpath("(//input)[1]")); //relative xpath
		btn.click();
	}

}
