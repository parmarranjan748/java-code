package module6.SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) throws InterruptedException {
	
		 {
             ChromeDriver driver=new ChromeDriver();        
             driver.get("https://www.amazon.in");
             Thread.sleep(3000);
             
             String title=        driver.getTitle();
             System.out.println(title);
             
             
             String url=        driver.getCurrentUrl();
             System.out.println(url);
             
             String parentid=        driver.getWindowHandle();
             System.out.println(parentid);
             Set<String> pcid=        driver.getWindowHandles();
             System.out.println(pcid);

     }

	}

}
