package tagNameLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/OneDrive/Documents/learningHTML1.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.tagName("a")).click();
		
	}

}
