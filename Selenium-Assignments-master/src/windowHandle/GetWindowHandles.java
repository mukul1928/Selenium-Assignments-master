package windowHandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetWindowHandles {

	public static void main(String[] args) throws AWTException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		
		Actions a1=new Actions(driver);
		a1.contextClick(gmail).perform();
		
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);
	}

}
