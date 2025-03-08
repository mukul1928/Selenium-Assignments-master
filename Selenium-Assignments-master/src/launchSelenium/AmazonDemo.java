package launchSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D150668181581%26hvpone%3D%26hvptwo%3D%26hvadid%3D678802104140%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D598129879765448413%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007768%26hvtargid%3Dkwd-10544572015%26hydadcr%3D5621_2412643%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(15000);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ap_email")).sendKeys("ayaajmy@gmail.com");
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("Ayaj@19930");
		driver.findElement(By.id("signInSubmit")).click();

	}

}
