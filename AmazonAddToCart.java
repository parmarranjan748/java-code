package module6.SeleniumPractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonAddToCart {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("incognito");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("Shoes");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@role='rowgroup']/div/div"));
		int count = list.size();
		System.out.println(count);
		Thread.sleep(2000);
		list.get(count-5).click();
		
		WebElement product = driver.findElement(By.xpath("//div[@role='listitem'][5]"));
		product.click();
		
		Set<String> windid =driver.getWindowHandles();
		Iterator<String> master = windid.iterator();
		String Pid = master.next();
		String cid = master.next();
		
		driver.switchTo().window(cid);
		Thread.sleep(3000);
		
		WebElement e2 = driver.findElement(By.id("add-to-cart-button"));
		e2.click();
		WebElement proceedPayment = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		proceedPayment.click();
	}

}
