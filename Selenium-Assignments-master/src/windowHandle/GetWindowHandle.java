package windowHandle;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		
		String s1=driver.getWindowHandle();
		System.out.println(s1);
		
		Set<String> s2=driver.getWindowHandles();
		System.out.println(s2);

	}
}
