package module6.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkCountGoogle2 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> link	= driver.findElements(By.tagName("a"));
		
		for(int i =0; i<link.size(); i++) {
				 
				WebElement li2 = link.get(i);
				String linkName = li2.getText();
				System.out.println(linkName);
		}
		

	}

}
