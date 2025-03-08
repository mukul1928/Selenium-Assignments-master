package explicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		
		WebElement ele = driver.findElement(By.name("jaya")); //throws NoSuchElementException
		
		//WebElement ele = driver.findElement(By.cssSelector("[name='q']")); 
		ele.sendKeys("selenium");
		ele.sendKeys(Keys.ENTER);

	}

}
