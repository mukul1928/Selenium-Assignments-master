package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpathDemo {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/OneDrive/Documents/learningHTML1.html");
		
		WebElement uname=driver.findElement(By.xpath("(html/body/input)[1]"));
		uname.sendKeys("jayashree@gmail.com");
		
		WebElement hint=driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("Hello");
		
		WebElement pwd=driver.findElement(By.xpath("(html/body/input)[3]"));
		pwd.sendKeys("Jaya@#$12");
	
		WebElement fname=driver.findElement(By.xpath("(html/body/form/input)[1]"));
		fname.sendKeys("Jayashree");
		
		WebElement lname=driver.findElement(By.xpath("(html/body/form/input)[2]"));
		lname.sendKeys("Sureban");
		
		WebElement submit=driver.findElement(By.xpath("(html/body/form/input)[3]"));
		submit.click();
		
		WebElement check=driver.findElement(By.xpath("(/html/body/input)[6]"));
		check.click();
		
		WebElement rel=driver.findElement(By.xpath("(/html/body/select/option)[2]"));
		rel.click();	
		
	}

}
