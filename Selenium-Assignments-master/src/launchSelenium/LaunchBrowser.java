package launchSelenium;
import java.util.Arrays;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com"); //get method
		
		String title=driver.getTitle(); //gives title of any web page
		System.out.println("Title: " + title);
		
		String titleWords[] = title.split("\\s+");
		System.out.println(Arrays.toString(titleWords));
		
		driver.close();
		
		driver.quit();
	}

}
