package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssTagNameAttribute {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement serach = driver.findElement(By.cssSelector("textarea[role='combobox']"));
		serach.sendKeys("India");
		serach.sendKeys(Keys.ENTER);
	}

}
