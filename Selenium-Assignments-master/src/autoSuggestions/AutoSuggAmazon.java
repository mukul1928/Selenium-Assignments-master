package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggAmazon {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement  search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		
		Thread.sleep(4000);
		
		List<WebElement> auto=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count=auto.size(); //List<WebElement> method bcs it has multiple elements
		System.out.println(count); //gives count of auto suggestions

		Thread.sleep(4000);
		auto.get(3).click();
		
	}

}
