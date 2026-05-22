package module6.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentRegistration {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		 WebElement e1 = driver.findElement(By.id("firstName"));
		 e1.sendKeys("Ranjan");
		 WebElement e2 = driver.findElement(By.id("lastName"));
		 e2.sendKeys("parmar");
		 WebElement e3 = driver.findElement(By.id("email"));
		 e3.sendKeys("ranjan7737@gmail.com");
		 WebElement e4 = driver.findElement(By.id("phone"));
		 e4.sendKeys("8810214601");
		 WebElement e5 = driver.findElement(By.id("aadhaar"));
		 e5.sendKeys("123456987789");
		 WebElement e6 = driver.findElement(By.id("pan"));
		 e6.sendKeys("ASDFG3456Q");
		 WebElement e7 = driver.findElement(By.name("Submit"));
		 e7.click();
		 
		 
		 
		 
		 
	}

}
