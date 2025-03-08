package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggGoogle {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Bangalore");
		
		Thread.sleep(2000);
		
		List<WebElement> auto=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count=auto.size(); //List<WebElement> method bcs it has multiple elements
		System.out.println(count); //gives count of auto suggestions

		Thread.sleep(4000);
		auto.get(3).click(); //selecting 4th auto suggestion and click on that
		//auto.get(count-7).click(); //can be write like this
		//auto.get(count-10).click(); //1st auto suggestion or 0th index
	}

}
