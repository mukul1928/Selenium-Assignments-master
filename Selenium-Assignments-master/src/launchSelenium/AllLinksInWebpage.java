package launchSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksInWebpage {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		//count all the links in a web page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linkcount=links.size();
		System.out.println(linkcount);
		
		//get all the link text in a web page
		int emptyLink=0;
		
		for(int i=0; i<linkcount; i++)
		{
			WebElement msg=links.get(i);
			String linkText=msg.getText();
			System.out.println(linkText);
			
			if (linkText.isEmpty())
			{
				emptyLink++;
			}
		}
		System.out.println("Empty links count : " +emptyLink);
				
	}
}
