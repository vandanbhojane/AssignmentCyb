

package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Reszable {
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

		// For Reszable
		driver.findElement(By.xpath("//span[contains(text(),'Resizable')]")).click();
		
        WebElement resizeElement = driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']"));

        Actions actionsResize = new Actions(driver);
        
        //provide the x and y offset values
        actionsResize.dragAndDropBy(resizeElement, 500, 300).perform();
        
        System.out.println("Done Resizing");
		
		
		
	}}