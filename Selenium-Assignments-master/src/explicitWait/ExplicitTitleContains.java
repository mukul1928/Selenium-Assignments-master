package explicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitTitleContains {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		
		WebElement ele=	driver.findElement(By.name("q"));
		
		WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.titleContains("Mobiles"));
		
		String title=driver.getTitle();
		System.out.println(title);
		
		ele.sendKeys("mobiles");
		ele.sendKeys(Keys.ENTER);
		
	}

}
