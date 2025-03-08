package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSubstring {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement  ele=driver.findElement(By.cssSelector("input[aria-label^='Search']"));
		ele.sendKeys("mobiles");
		ele.sendKeys(Keys.ENTER);

	}

}
