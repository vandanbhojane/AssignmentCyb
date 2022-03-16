
package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectable {
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

		// For interactions
		driver.findElement(By.xpath("//h5[contains(text(),'Interactions')]")).click();
		
		// For Scrolling
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,600)", "");

		// For Selectable
		driver.findElement(By.xpath("//span[contains(text(),'Selectable')]")).click();
		
		// For Selectable1
		driver.findElement(By.xpath("//li[contains(text(),'Cras justo odio')]")).click();
		
		// For Selectable2
		driver.findElement(By.xpath("//li[contains(text(),'Porta ac consectetur ac')]")).click();
		
		//For Grid //a[@id='demo-tab-grid']
		// For Selectable
		driver.findElement(By.xpath("//a[@id='demo-tab-grid']")).click();
		
		// For Selectable1
		driver.findElement(By.xpath("//li[contains(text(),'Four')]")).click();
		
		// For Selectable2
		driver.findElement(By.xpath("//li[contains(text(),'Nine')]")).click();
	}
}