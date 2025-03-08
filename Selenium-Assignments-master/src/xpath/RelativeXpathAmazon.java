package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathAmazon {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//WebElement search=driver.findElement(By.xpath("(//input)[5]")); //indexing
		
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("shoes");
		
		//WebElement submit=driver.findElement(By.xpath("(//input)[6]")); //indexing
		
		WebElement submit=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		submit.click();
		
		WebElement first=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		first.click();
	}
	
}
