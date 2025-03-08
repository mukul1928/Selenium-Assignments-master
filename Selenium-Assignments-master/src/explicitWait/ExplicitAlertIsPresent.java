package explicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitAlertIsPresent {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		
		WebElement ele = driver.findElement(By.cssSelector("[name='q']"));
		
		WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.alertIsPresent()); //alert means popup - throws exception bcoz no popup is here.
		
		ele.sendKeys("selenium");
		ele.sendKeys(Keys.ENTER);

	}

}
