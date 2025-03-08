package launchSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroTechMindsLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		/*driver.findElement(By.partialLinkText("Automate")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Read")).click();*/
		
		driver.findElement(By.name("email")).sendKeys("jaya@gmail.com");
		driver.findElement(By.id("password")).sendKeys("jay123");
		
		driver.findElement(By.id("Female")).click();
		
		Thread.sleep(2000);
		WebElement skills=driver.findElement(By.xpath("(//select)[6]"));
		Select s1=new Select(skills);
		s1.selectByValue("select1");
		//s1.selectByIndex(1);
		
		WebElement tech=driver.findElement(By.xpath("(//select)[7]"));
		Select s2=new Select(tech);
		s2.selectByVisibleText("Core Java");
		
		WebElement country=driver.findElement(By.id("Country"));
		Select s3=new Select(country);
		s3.selectByValue("India");
		
		WebElement present=driver.findElement(By.id("Present-Address"));
		present.sendKeys("JP Nagar Bangalore");
		present.sendKeys(Keys.CONTROL+"a");
		present.sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.name("relocate")).click();
		
		WebElement permanent=driver.findElement(By.name("Permanent-Address"));
		permanent.sendKeys(Keys.CONTROL+"v");
		
		driver.findElement(By.id("Pincode")).sendKeys("591102");
		
		WebElement rel=driver.findElement(By.name("Relegion"));
		Select s4=new Select(rel);
		s4.selectByIndex(1);
		
		WebElement upload=driver.findElement(By.id("file"));
		upload.sendKeys("C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject\\src\\navigators");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='relocate']")).click();
		
		
		driver.findElement(By.xpath("//button[@name='Submit']")).click();
		
	}
}
