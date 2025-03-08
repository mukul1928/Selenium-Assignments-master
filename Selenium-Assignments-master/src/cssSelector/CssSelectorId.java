package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorId {

	public static void main(String[] args) {
		
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();

			WebElement ele=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
			ele.sendKeys("shoes");
	}
}
