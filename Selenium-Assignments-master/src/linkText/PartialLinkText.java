package linkText;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			driver.findElement(By.partialLinkText("Service")).click();
	}

}
