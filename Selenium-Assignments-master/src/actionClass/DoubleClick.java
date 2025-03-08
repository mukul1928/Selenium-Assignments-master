package actionClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		
		WebElement course=driver.findElement(By.linkText("Courses"));
		
		Actions a1=new Actions(driver); //actions class
		a1.doubleClick(course).perform();
	}

}
