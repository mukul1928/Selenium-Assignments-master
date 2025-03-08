package exam;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MyntraDemo {

	public static void main(String[] args) throws IOException {
		
		//Launch myntra.com
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		//Search shoe->Click on the 6th auto suggestion
		WebElement  search=driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		search.sendKeys("shoes");
		
		List<WebElement> auto=driver.findElements(By.xpath("//div[@class=' desktop-autoSuggest desktop-showContent']/ul/li"));
		int count=auto.size();
		System.out.println(count);
		
		auto.get(5).click();
		
		//From the list of shoes click on the 10th shoe
/*		driver.findElement(By.xpath("(//picture[@class='img-responsive'])[10]")).click();
		
		//Click on "Add to Bag"->Click on  "Go to Bag"
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
		driver.findElement(By.xpath("//span[@class='pdp-goToCart pdp-add-to-bag pdp-button pdp-flex pdp-center ']")).click();
		
		//Click on place order
		driver.findElement(By.xpath("(//div[@class='css-xjhrni'])[3]")).click();
		
		//Take the screenshot before closing the browser
		TakesScreenshot tss=driver;
		File source=tss.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject\\Screenshots\\One"+Math.random()+".png");
		FileHandler.copy(source, destination);
		
		driver.close();
		
*/
	}

}
