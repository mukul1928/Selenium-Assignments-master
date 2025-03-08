package windowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriPopup {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount");
		
		WebElement google=driver.findElement(By.xpath("//span[.='Google']"));
		google.click();
		
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);
	}

}
