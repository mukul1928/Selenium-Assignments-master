package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		WebElement source=driver.findElement(By.id("drag1"));
		WebElement dest=driver.findElement(By.id("div2"));
		
		Actions a1=new Actions(driver);
		a1.dragAndDrop(source, dest).perform();
	}

}
