
package widgets;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoComplete {

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

		// For AutoComplete
		driver.findElement(By.xpath("//span[contains(text(),'Auto Complete')]")).click();
		
		// For Green
		//driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
	
		
	    WebElement autoOptions= driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
	    autoOptions.sendKeys("Gree");

	    List<WebElement> optionsToSelect = driver.findElements(By.tagName("li"));
	    String textToSelect = "Green";
	    for(WebElement option : optionsToSelect){
	        System.out.println(option);
	        if(option.getText().equals(textToSelect)) {
	            System.out.println("Trying to select: "+textToSelect);
	            option.click();
	            break;
		}
	    }
	    }
		}
		

		

	
		


