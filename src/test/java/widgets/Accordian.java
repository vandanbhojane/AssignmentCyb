
package widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accordian {

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
		js1.executeScript("window.scrollBy(0,250)", "");

		// For Accordion
		driver.findElement(By.xpath("//span[contains(text(),'Accordian')]")).click();

		// Selecyt Lorem ipsum
		driver.findElement(By.xpath("//div[@id='section1Heading']")).click();

		// Selecyt Come From
		driver.findElement(By.xpath("//div[@id='section2Heading']")).click();
		Thread.sleep(3000);
		// Selecyt Come From
		driver.findElement(By.xpath("//div[@id='section2Heading']")).click();

		// Selecyt Use It
		driver.findElement(By.xpath("//div[@id='section3Heading']")).click();

	}
}