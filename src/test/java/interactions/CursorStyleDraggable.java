

package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CursorStyleDraggable {
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
		
		// For CursorStyleDraggable
		driver.findElement(By.xpath("//a[@id='draggableExample-tab-cursorStyle']")).click();
		
		//Element which need to drag. - Center	
	    WebElement From=driver.findElement(By.xpath("//div[@id='cursorCenter']"));					
	  
	    //Using Action class for drag and drop.		
	    Actions act=new Actions(driver);					
	  
	    Thread.sleep(3000);
	    //Drag and Drop by Offset.		
	    act.dragAndDropBy(From,135, 40).build().perform();
	    
		//Element which need to drag. -Top Left	
	    WebElement Fromy=driver.findElement(By.xpath("//span[contains(text(),'My cursor is at bottom')]"));					
	  
	    //Using Action class for drag and drop.		
	    Actions acty=new Actions(driver);					
	  
	    Thread.sleep(3000);
	    //Drag and Drop by Offset.		
	    acty.dragAndDropBy(Fromy,135, 40).build().perform();
	    
	    
		//Element which need to drag. -Top Right
	    WebElement Fromz=driver.findElement(By.xpath("//div[@id='cursorTopLeft']"));					
	  
	    //Using Action class for drag and drop.		
	    Actions actz=new Actions(driver);					
	  
	    Thread.sleep(3000);
	    //Drag and Drop by Offset.		
	    actz.dragAndDropBy(Fromz,135, 40).build().perform();
	    Thread.sleep(3000);
		driver.close();
	    
		
	}
}
	