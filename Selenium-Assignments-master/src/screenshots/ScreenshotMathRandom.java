package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotMathRandom {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement ele=driver.findElement(By.partialLinkText("miniTV"));
		ele.sendKeys(Keys.ENTER);
		
		TakesScreenshot tss=driver;
		File source=tss.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject\\Screenshots\\One"+Math.random()+".png");
		FileHandler.copy(source, destination);

	}

}
