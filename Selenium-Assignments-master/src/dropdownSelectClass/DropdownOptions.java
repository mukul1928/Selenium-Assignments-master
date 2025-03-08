package dropdownSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//count the number of options in a dropdown

public class DropdownOptions {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.xpath("(//select)[1]"));
		
		Select s1=new Select(dropdown);
		List<WebElement> ls=s1.getOptions();
		int count=ls.size();
		System.out.println(count);
	}

}
