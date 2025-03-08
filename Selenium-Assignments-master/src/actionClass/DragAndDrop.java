package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
			
		Actions a1=new Actions(driver);
		a1.dragAndDrop(driver.findElement(By.id("drag7")), driver.findElement(By.id("div2"))).perform();
		
	}

}
