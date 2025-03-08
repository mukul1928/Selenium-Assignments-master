package launchSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptHtmlFile {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/OneDrive/Documents/learningHTML1.html");
		
		driver.switchTo().alert().accept();

	}

}
