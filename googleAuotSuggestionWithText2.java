package module6.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleAuotSuggestionWithText2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@role='combobox']")).sendKeys("orange");
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		for(WebElement e : list) {
			
			String Textoflink = e.getText();
			System.out.println(Textoflink);
			
			if(Textoflink.equalsIgnoreCase("orange cap in ipl 2025")) {
				e.click();
			}
			
			/*if(Textoflink.equals("indian army")) {
				e.click();*/
			
		}
		
		
		
	}

}
