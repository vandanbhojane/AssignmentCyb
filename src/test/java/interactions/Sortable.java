
package interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {
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

		// For Sortable
		driver.findElement(By.xpath("//span[contains(text(),'Sortable')]")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//* [@id='demo-tabpane-list']/div/div"));
	    
		for(int i =1;i<list.size();i++) {
		        
		WebElement element = driver.findElement(By.xpath("//*[@id='demo-tabpane-list']/div/div["+ i +"]"));
		        
		        WebElement destination6 = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]"));
		        WebElement destination5 = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]"));
		        WebElement destination4 = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]"));
		        WebElement destination3 = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]"));
		        WebElement destination2 = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]"));
		        WebElement destination1 = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]"));
		        
		        Actions action = new Actions(driver);
		        
		        if(element!=null) {
		        action.dragAndDrop(element, destination6).perform();
		        action.dragAndDrop(element, destination5).perform();
		        action.dragAndDrop(element, destination4).perform();
		        action.dragAndDrop(element, destination3).perform();
		        action.dragAndDrop(element, destination2).perform();
		        action.dragAndDrop(element, destination1).perform();
		        break;
		        }
		    }

		
	}}