package navigators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshRegistrationForm {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://grotechminds.com/registeration-form/");
				
		WebElement fname=driver.findElement(By.id("firstName"));
		fname.sendKeys("Jayashree");
		
		WebElement lname=driver.findElement(By.name("lastName"));
		lname.sendKeys("Sureban");
		
		WebElement email=driver.findElement(By.cssSelector("#email"));
		email.sendKeys("jaya@gmail.com");
		
		WebElement phone=driver.findElement(By.cssSelector("input#phone"));
		phone.sendKeys("9987653210");
		
		
	}

}
