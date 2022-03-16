
package widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DatePicker {
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
		js1.executeScript("window.scrollBy(0,300)", "");

		// For DatePicker 1
		driver.findElement(By.xpath("//span[contains(text(),'Date Picker')]")).click();
		
	    WebElement dateBox = driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']"));

	    dateBox.sendKeys(Keys.CONTROL + "a");
	    dateBox.sendKeys(Keys.DELETE);
	    //Fill date as mm/dd/yyyy as 09/25/2013

	    dateBox.sendKeys("09/05/2013");
	    dateBox.sendKeys(Keys.ENTER);
	    
	    // For DatePicker 2
	//	driver.findElement(By.xpath("//span[contains(text(),'Date Picker')]")).click();
		
	    WebElement dateBox1 = driver.findElement(By.xpath("//input[@id='dateAndTimePickerInput']"));

	    dateBox1.sendKeys(Keys.CONTROL + "a");
	    dateBox1.sendKeys(Keys.DELETE);
	    //Fill date as mm/dd/yyyy as 09/25/2013

	    dateBox1.sendKeys("March 24, 2022 11:44 PM");
	    dateBox1.sendKeys(Keys.ENTER);
	    
	}}