package module6.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBILogin {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
		driver.get("https://retail.sbi.bank.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 =	driver.findElement(By.xpath("//a[@aria-label='Login to Personal Banking']"));
		e1.click();
		Thread.sleep(2000);
		WebElement e2 =	driver.findElement(By.xpath("//div[@class='continue_btn']"));
		e2.click();
		Thread.sleep(3000);
		
		WebElement e3 = driver.findElement(By.xpath("//input[@id='username']"));
		e3.sendKeys("ranjan7737");
		
		WebElement e4 = driver.findElement(By.xpath("//input[@name='password']"));
		e4.sendKeys("test123");
		
		
	}

}
