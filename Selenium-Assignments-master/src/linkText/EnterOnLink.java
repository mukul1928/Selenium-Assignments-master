package linkText;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//how to click on a link without using click method?

public class EnterOnLink {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement ele=driver.findElement(By.partialLinkText("miniTV"));
		ele.sendKeys(Keys.ENTER);
	}

}
