package windowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount");
		
		WebElement google=driver.findElement(By.xpath("//span[.='Google']"));
		google.click();
		
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);
		
		Iterator<String> g1=s1.iterator(); //return type of iterator is Iterator itself
		String s2=g1.next(); //1st time-it gives parent window
		String s3=g1.next(); //2nd time-it gives child window
		
		driver.switchTo().window(s3); //switching to child window
		
		driver.findElement(By.id("identifierId")).sendKeys("jaya@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		
		//driver.close(); //now child will close becoz it has control
		
		//driver.quit();
	}

}
