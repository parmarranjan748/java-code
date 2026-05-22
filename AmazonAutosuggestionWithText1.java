package module6.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonAutosuggestionWithText1 {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//input[@role='searchbox']"));
		e1.sendKeys("phone");
		
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@role='rowgroup']/div/div"));
		int linkCount = list.size();
		System.out.println(linkCount);
		
	for(WebElement w : list) {
			String TextLink = w.getText();
			System.out.println(TextLink);
			
			if(TextLink.equals("phone under 25k+")) {
				w.click();
			}
		}
		

	}

}
