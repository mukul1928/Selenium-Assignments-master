package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoveroverAmazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement login=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(login).perform();

	}

}
