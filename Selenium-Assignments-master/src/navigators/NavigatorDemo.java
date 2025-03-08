package navigators;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/"); //other way to open url
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();	

	}

}
