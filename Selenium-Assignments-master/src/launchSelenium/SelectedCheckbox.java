package launchSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectedCheckbox {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/is-selected/");
		
		WebElement chk=driver.findElement(By.xpath("//input[@id='vehicle2']"));
		
		boolean ans=chk.isSelected();
		System.out.println(ans);
		
		if(ans==false)
		{
			chk.click();
		}
		
		boolean ans1=chk.isSelected();
		System.out.println(ans1);

	}

}
