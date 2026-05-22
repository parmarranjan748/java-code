package module6.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipKartAutoSuggestion1 {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath("//span[text()='✕']"));
		e1.click();
		Thread.sleep(2000);
		WebElement e2 =driver.findElement(By.name("q"));
		e2.sendKeys("Laptop");
		
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//form/ul/li"));
		int countofLink = list.size();
		Thread.sleep(5000);
		System.out.println(countofLink);
		
		list.get(countofLink-3).click();
		
		
		
		

	}

}
