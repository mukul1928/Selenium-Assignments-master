package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraBrokenLinks {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//count all the links in a web page
		List<WebElement> links = driver.findElements(By.tagName("a"));

		int linkcount=links.size();
		System.out.println(linkcount);
		for(int i=0; i<linkcount; i++)
		{
			
			WebElement msg = links.get(i);
			String url=msg.getAttribute("href");
			System.out.println(url);
			verify_the_link(url);
			System.out.println("end");
			
		}
		}
		static void verify_the_link(String url) throws IOException
		{
		try {
		URL u1=new  URL(url);
		
		HttpURLConnection h1=(HttpURLConnection) u1.openConnection();

		h1.connect();

		if(h1.getResponseCode()==200)
		{
		System.out.println("The link is valid "+url);	
		}
		else
		{
		System.out.println("The link is not valid " + h1.getResponseCode()+ h1.getResponseMessage() + url);	
		}
		}
		catch(NullPointerException a1)
		{
			
		}
		catch(MalformedURLException a2)
		{
			
		}
		catch(SocketException a3)
		{
			
		}
		
	}

}
