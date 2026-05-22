package module6.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPaymentScree {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/payments/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		 WebElement e1 = driver.findElement(By.name("cardNumber"));
		 e1.sendKeys("569874123652");
		 WebElement e2 = driver.findElement(By.name("expiryDate"));
		 e2.sendKeys("10/15");
		 WebElement e3 = driver.findElement(By.name("cvv"));
		 e3.sendKeys("869");
		 WebElement e4 = driver.findElement(By.name("amount"));
		 e4.sendKeys("8810");
		 WebElement e5 = driver.findElement(By.name("currency"));
		 e5.sendKeys("USD");
		 
		 
	}

}
