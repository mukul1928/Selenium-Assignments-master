package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SBI_Demo {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/userdrivenregdetails.htm");
		driver.navigate().refresh();
		
		WebElement accNo=driver.findElement(By.id("accountNo"));
		accNo.sendKeys("1234567890");
		
		WebElement cifNo=driver.findElement(By.id("cifNo"));
		cifNo.sendKeys("567890");
		
		WebElement branch=driver.findElement(By.id("branchCode"));
		branch.sendKeys("100");
		
		WebElement country=driver.findElement(By.id("selCountry"));
		Select s1=new Select(country);
		s1.selectByValue("91");
		
		WebElement mobile=driver.findElement(By.id("mobileNo"));
		mobile.sendKeys("9976423456");
		
		WebElement facility=driver.findElement(By.id("txnRights"));
		Select s2=new Select(facility);
		s2.selectByValue("09");
		
		WebElement capta=driver.findElement(By.name("captchaValue"));
		capta.sendKeys("F7FA0");
		
		driver.findElement(By.id("iAgreeconsent")).click();
		
		driver.findElement(By.id("go")).click();
	}

}
