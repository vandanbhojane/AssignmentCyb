
package element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploaddownload {
	
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
		
		//For uploaddownload
		driver.findElement(By.xpath("//span[contains(text(),'Upload and Download')]")).click();
		
		//For download
		driver.findElement(By.xpath("//a[@id='downloadButton']")).click();
		
		//For Upload
		// FILE UPLOADING USING SENDKEYS ....
		 
		   WebElement browse = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		   //click on ‘Choose file’ to upload the desired file
		   browse.sendKeys("C:\\Users\\surajt\\Desktop\\New Text Document.txt"); //Uploading the file using sendKeys
		   System.out.println("File is Uploaded Successfully");
	}
}