package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssTagClassAttribute {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		
		WebElement  ele=driver.findElement(By.cssSelector("textarea.gLFyf[name='q']"));
		ele.sendKeys("India");
	}

}
