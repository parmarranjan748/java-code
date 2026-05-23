package module6.SeleniumPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyntraAddToCart {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("Incognito");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.myntra.com/");
		WebElement e1 = driver.findElement(By.xpath("//input[@data-reactid='1039']"));
		e1.sendKeys("jeans");
		Thread.sleep(3000);
		
		List<WebElement> allSearchSug =  driver.findElements(By.xpath("//div[@class=' desktop-autoSuggest desktop-showContent']/ul/li"));
		int count = allSearchSug.size();
		System.out.println(count);
		Thread.sleep(3000);
		allSearchSug.get(count-4).click();
		String TitleOfPage = driver.getTitle();
		System.out.println("Title of the Page" + TitleOfPage);
		Thread.sleep(3000);
		
		List<WebElement> allProduct = driver.findElements(By.xpath("//li[@class='product-base']"));
		for(int i =0; i<10; i++) {
			allProduct.get(i).click();
		}
		Thread.sleep(3000);
		Set<String> allWindowTab = driver.getWindowHandles();
		List<String> windowlist = new ArrayList<>(allWindowTab);
		
		driver.switchTo().window(windowlist.get(5));
		String currentTitle = driver.getTitle();
		System.out.println(currentTitle);
		
		Thread.sleep(3000);
		
		WebElement sizeButton = driver.findElement(By.xpath("//div[@class='size-buttons-tipAndBtnContainer'][3]"));
		sizeButton.click();
		
		Thread.sleep(2000);
		WebElement addToCart = driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']"));
		addToCart.click();
		
		
	}

}
