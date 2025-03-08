package linkText;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int count_links=links.size();
		System.out.println(count_links);
		
		int nullLinks=0;
		
		for(int i=0; i<count_links; i++)
		{
			WebElement single_link=links.get(i);
			String links_name=single_link.getAttribute("href");
			System.out.println(links_name);
			
			if(links_name==null)
			{
				nullLinks++;
			}
		}
		
		System.out.println("Null links count : "+nullLinks);
		
	}

}
