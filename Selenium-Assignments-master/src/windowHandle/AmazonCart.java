package windowHandle;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AmazonCart {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		
		WebElement search_btn=driver.findElement(By.id("nav-search-submit-button"));
		search_btn.click();
		
		WebElement first_shoe=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		first_shoe.click();
		
		Set<String> s1=driver.getWindowHandles(); //browser id
		System.out.println(s1);
		
		Iterator<String> ite=s1.iterator(); //object of iterator
		String parent_window=ite.next();
		String child_window=ite.next();
		driver.switchTo().window(child_window); //switching window to child 
		
		WebElement cart=driver.findElement(By.id("add-to-cart-button"));
		cart.click();
		
		TakesScreenshot tss=driver;
		File source=tss.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject\\Screenshots\\One.png");
		FileHandler.copy(source, destination);

	}

}
