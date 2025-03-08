package explicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		
		WebElement ele = driver.findElement(By.cssSelector("[name='q']"));
		
		WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10)); //Explicit wait
		//w1.until(ExpectedConditions.titleIs("jaya")); //title is not jaya, it will throw TimeOutException after 10 seconds
		
		w1.until(ExpectedConditions.titleIs("Google")); 
		
		ele.sendKeys("India");
		ele.sendKeys(Keys.ENTER);

	}

}
