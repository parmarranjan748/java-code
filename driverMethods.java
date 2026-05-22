package module6.SeleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class driverMethods {

	public static void main(String[] args) throws InterruptedException {
		
		  {
              ChromeDriver driver=new ChromeDriver();        
              driver.get("https://www.amazon.in");
              Thread.sleep(3000);
              
              String title=        driver.getTitle();
              System.out.println(title);
              
              
              String url=        driver.getCurrentUrl();
              System.out.println(url);
      }
	}

}
