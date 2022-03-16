
package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {
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
		driver.findElement(By.xpath("//span[contains(text(),'Dragabble')]")).click();
		
		// For Simple Drag
		driver.findElement(By.xpath("//a[@id='draggableExample-tab-simple']")).click();
		
		//Element which need to drag.		
	    WebElement From=driver.findElement(By.xpath("//div[@id='dragBox']"));					
	  
	    //Using Action class for drag and drop.		
	    Actions act=new Actions(driver);					
	  
	    Thread.sleep(3000);
	    //Drag and Drop by Offset.		
	    act.dragAndDropBy(From,135, 40).build().perform();
	    
		
	}
}
		
		