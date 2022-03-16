package element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
	
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
		
		//For Textbox
		driver.findElement(By.xpath("//span[contains(text(),'Text Box')]")).click();
		
		//For Username
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Suraj");
		
		//For Email
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Suraj@gmail.com");
		
		//For Current Address
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Abcde");
		
		//For Permanent Address
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("CVbnjj");
		
		//For Scrolling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		//For Submit
		driver.findElement(By.id("submit")).click();
		
	}

}