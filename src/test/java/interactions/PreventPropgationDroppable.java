

package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class PreventPropgationDroppable {
 
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

		//For Droppable
		driver.findElement(By.xpath("//span[contains(text(),'Droppable')]")).click();
		
		//For PreventPropgationDroppable
		driver.findElement(By.xpath("//a[@id='droppableExample-tab-preventPropogation']")).click();
		
		//Actions class method to drag and drop		
				Actions builder = new Actions(driver);
				 
				WebElement from = driver.findElement(By.xpath("//div[@id='dragBox']"));
				 
				WebElement to = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/p[1]"));	 
				//Perform drag and drop
				builder.dragAndDrop(from, to).perform();
				Thread.sleep(5000);
				//verify text changed in to 'Drop here' box 
				String textTo = to.getText();

				if(textTo.equals("Dropped!")) {
					System.out.println("PASS: Source is dropped to target as expected Outer Droppable");
				}else {
					System.out.println("FAIL: Source couldn't be dropped to target as expected");
				}
				
		WebElement from1 = driver.findElement(By.xpath("//div[@id='dragBox']"));
				 
				WebElement to1 = driver.findElement(By.xpath("//div[@id='notGreedyInnerDropBox']"));	 
				//Perform drag and drop
				builder.dragAndDrop(from1, to1).perform();
				Thread.sleep(5000);
				//verify text changed in to 'Drop here' box 
				String textTo1 = to.getText();

				if(textTo1.equals("Dropped!")) {
					System.out.println("PASS: Source is dropped to target as expected Inner Droppable");
				}else {
					System.out.println("FAIL: Source couldn't be dropped to target as expected");
				}
			
				driver.close();
		
	}}