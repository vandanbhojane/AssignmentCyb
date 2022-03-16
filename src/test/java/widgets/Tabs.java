
package widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {
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

		// For Widgets
		driver.findElement(By.xpath("//h5[contains(text(),'Widgets')]")).click();
		
		// For Scrolling
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,400)", "");

		// For Tabs
		driver.findElement(By.xpath("//span[contains(text(),'Tabs')]")).click();
		
		// For Origin
		driver.findElement(By.xpath("//a[@id='demo-tab-origin']")).click();
		
		//For Use
		driver.findElement(By.xpath("//a[@id='demo-tab-use']")).click();
	
	}}