package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {
	
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
		
		//For CheckBox
		driver.findElement(By.xpath("//span[contains(text(),'Check Box')]")).click();
		
		//For Tick
		driver.findElement(By.xpath("//span[contains(text(),'Home')]")).click();
		
		//For Checking Checkbox tick or Not
		// This will capture error message
		String actual_msg=driver.findElement(By.xpath("//span[contains(text(),'home')]")).getText();
		System.out.println(actual_msg);
		// Store message in variable
		String expect= "home";
		                
		// Here Assert is a class and assertEquals is a method which will compare two values if// both matches it will run fine but in case if does not match then if will throw an 
		//exception and fail testcases
		 
		// Verify error message
		Assert.assertEquals(actual_msg, expect);
		
	}
	}