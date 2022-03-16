
package widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTips {
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
		js1.executeScript("window.scrollBy(0,500)", "");

		// For ToolTips
		driver.findElement(By.xpath("//span[contains(text(),'Tool Tips')]")).click();

		// Mouse Hover
		WebElement element = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		// Creating object of an Actions class
		Actions action1 = new Actions(driver);
		// Performing the mouse hover action on the target element.
		action1.moveToElement(element).perform();
		
		Thread.sleep(3000);
		
		// Mouse Hover
		WebElement element1 = driver.findElement(By.xpath("//input[@id='toolTipTextField']"));
		// Creating object of an Actions class
		Actions action2 = new Actions(driver);
		// Performing the mouse hover action on the target element.
		action2.moveToElement(element1).perform();
		
	}}
