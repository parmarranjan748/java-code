package module6.SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class facebookregis 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com/reg/?entry_point=login&next=");
		driver.manage().window().maximize();
	
		/*Options o1=	driver.manage();
		Window w1=	o1.window();
		w1.maximize();*/
		Thread.sleep(5000);
		WebElement year=	driver.findElement(By.xpath("//Div[@aria-label='Select year']"));
		
		year.click();
		
		
		/*Thread.sleep(2000);
		year.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		year.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);year.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);year.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);*/
	}
}