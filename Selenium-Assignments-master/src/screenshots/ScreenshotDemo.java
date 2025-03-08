package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException  {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		WebElement Choice1=driver.findElement(By.xpath("(//select[@id='Choice1'])[1]"));
		Select dd=new Select(Choice1);
		dd.selectByIndex(1);
		WebElement Choice2=driver.findElement(By.xpath("(//select[@id='Choice2'])[1]"));
		Select dd1=new Select(Choice2);
		dd1.selectByIndex(2);
		WebElement Choice3=driver.findElement(By.xpath("(//select[@id='Choice3'])[1]"));
		Select dd2=new Select(Choice3);
		dd2.selectByVisibleText("Power4");
		WebElement Choice4=driver.findElement(By.xpath("(//select[@id='Choice4'])[1]"));
		Select dd3=new Select(Choice4);
		dd3.selectByIndex(4);
		WebElement Choice5=driver.findElement(By.xpath("(//select[@id='Choice5'])[1]"));
		Select dd4=new Select(Choice5);
		dd4.selectByVisibleText("Day2");
		WebElement Choice6=driver.findElement(By.xpath("(//select[@id='Choice6'])[1]"));
		Select dd5=new Select(Choice6);
		dd5.selectByIndex(7);
		WebElement Choice7=driver.findElement(By.xpath("(//select[@id='Choice7'])[1]"));
		Select dd6=new Select(Choice7);
		dd6.selectByVisibleText("Night2");
		WebElement Choice8=driver.findElement(By.xpath("(//select[@id='Choice7 '])[1]"));
		Select dd7=new Select(Choice8);
		dd7.selectByIndex(7);
		WebElement Choice9=driver.findElement(By.xpath("(//select[@id='Choice8'])[1]"));
		Select dd8=new Select(Choice9);
		dd8.selectByIndex(4);
		WebElement Choice10=driver.findElement(By.xpath("(//select[@id='Choice9'])[1]"));
		Select dd9=new Select(Choice10);
		dd9.selectByIndex(7);
		WebElement Choice11=driver.findElement(By.xpath("(//select[@id='Choice10'])[1]"));
		Select dd10=new Select(Choice11);
		dd10.selectByIndex(5);
		
		TakesScreenshot tss= driver;
		File source=tss.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject\\Screenshots\\Pic.png");
		FileHandler.copy(source, destination);

	}

}
