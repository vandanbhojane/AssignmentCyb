
package alertframewindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium\\driver98\\chromedriver.exe");

		driver = new ChromeDriver();

		// Maximze
		driver.manage().window().maximize();

		// Open Below Website
		driver.get("https://demoqa.com/");

		// For Scrolling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");

		// For Alerts, Frame & Windows
		driver.findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]")).click();

		// For Browser Windows
		driver.findElement(By.xpath("//span[contains(text(),'Browser Windows')]")).click();
		
		// For New Tab
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
		        //For Switching Child Window 
				// It will return the parent window name as a String
				String parent=driver.getWindowHandle();

				Set<String>s=driver.getWindowHandles();

				// Now iterate using Iterator
				Iterator<String> I1= s.iterator();

				while(I1.hasNext())
				{

				String child_window=I1.next();


				if(!parent.equals(child_window))
				{
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());
				
				Thread.sleep(3000);
				driver.close();
				//switch to the parent window
				driver.switchTo().window(parent);
		
		// For New Window
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		// For New Window Message
		driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
	}
}}}