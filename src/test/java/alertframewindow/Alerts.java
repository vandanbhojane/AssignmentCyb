
package alertframewindow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

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
		
		// For Scrolling
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,300)", "");

		// For Alerts
		driver.findElement(By.xpath("//span[contains(text(),'Alerts')]")).click();
		
		// For 1 Alert
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		Thread.sleep(3000);
		
		//Accept Alert
		driver.switchTo().alert().accept();
		
		// For 2 Alert
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.alertIsPresent());
		
		//Accept Alert
		driver.switchTo().alert().accept();
		
		// For 3 Alert
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		Thread.sleep(3000);
		
		//Accept Alert
		driver.switchTo().alert().accept();
		
		// For 4 Alert
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		driver.switchTo().alert().sendKeys("Textssaa");
		Thread.sleep(3000);
		
		//Accept Alert
		driver.switchTo().alert().accept();
	}}