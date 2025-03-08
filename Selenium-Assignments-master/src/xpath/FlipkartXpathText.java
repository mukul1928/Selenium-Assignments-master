package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartXpathText {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//<span>Mobiles</span>
		WebElement mobiles=driver.findElement(By.xpath("(//span[.='Mobiles'])[2]")); //mobile text
		mobiles.click();
		
		//<span role="button" class="_30XB9F">✕</span> //login popup
		WebElement cross=driver.findElement(By.xpath("//span[.='✕']"));
		cross.click();
	}

}
