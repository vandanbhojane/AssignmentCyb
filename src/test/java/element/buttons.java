
package element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class buttons {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Selenium\\driver98\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		//Maximze
		driver.manage().window().maximize();
		
		//Open Below Website
		driver.get("https://demoqa.com/");
		
		//For Elements
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
		
		//For Scrolling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		//For Buttons
		driver.findElement(By.xpath("//span[contains(text(),'Buttons')]")).click();
		
		//For Double Click
		Actions act = new Actions(driver);

		//Double click on element
		WebElement ele = driver.findElement(By.xpath("//button[@id='doubleClickBtn']")); 
		act.doubleClick(ele).perform();
		
		//RightClick
		WebElement elementLocator = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act.contextClick(elementLocator).perform();
		
		//For Click
		driver.findElement(By.id("As8Ft")).click();
		
		//For Checking 
		// This will capture error message
		String actual_msg=driver.findElement(By.xpath("//p[@id='rightClickMessage']")).getText();
		System.out.println(actual_msg);
		// Store message in variable
		String expect= "You have done a right click";
		                
		// Here Assert is a class and assertEquals is a method which will compare two values if// both matches it will run fine but in case if does not match then if will throw an 
		//exception and fail testcases
		 
		// Verify error message
		Assert.assertEquals(actual_msg, expect);
		
	}
	}