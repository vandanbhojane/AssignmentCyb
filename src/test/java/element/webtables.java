
package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class webtables {
	
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
		
		//For WebTables
		driver.findElement(By.xpath("//span[contains(text(),'Web Tables')]")).click();
		
		//Click Add
		driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
		
		//For name
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Suraj");
		
		//For name
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("T");
		
		//For Email
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Suraj@gmail.com");
		
		//For Age
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("27");
		
		//For Salary
		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("1000");
		
		//For Department
		driver.findElement(By.xpath("//input[@id='department']")).sendKeys("CVbnjj");
		
		//For Submit
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
	}
	}