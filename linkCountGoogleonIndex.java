package module6.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkCountGoogleonIndex {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		List<WebElement> link	= driver.findElements(By.tagName("a"));
		
		WebElement n1 = link.get(0);
		
		String name = n1.getText();
		
		System.out.println(name);

	}

}
