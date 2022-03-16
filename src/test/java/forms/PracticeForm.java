
package forms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {

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

		// For Forms
		driver.findElement(By.xpath("//h5[contains(text(),'Forms')]")).click();

		// For Practice Form
		driver.findElement(By.xpath("//span[contains(text(),'Practice Form')]")).click();

		// For FirstName
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Suraj");

		// For LastName
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Tavhare");

		// For Email
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Suraj@gmail.com");

		// For Gender
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();

		// For MobileNumber
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("8787878787");

		// For DOB
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		// For Month
		Select se = new Select(driver.findElement(By.className("react-datepicker__month-select")));

		List<WebElement> lst = se.getOptions();

		// Looping through the options and printing dropdown options
		System.out.println("The dropdown options are:");
		for (WebElement options : lst)
			System.out.println(options.getText());

		// Select the option by index
		se.selectByIndex(7);

		// Select by VisibleText
		// se.selectByVisibleText("Magenta");

		// For Year
		Select se1 = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		// Select the option by index
		// se.selectByIndex(7);

		// Select by VisibleText
		se1.selectByVisibleText("1995");

		// For Date

		driver.findElement(By.xpath(
				"//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]"))
				.click();
		/*
		 * Select se2 = new Select(driver.findElement(By.
		 * className("class=\"react-datepicker__day react-datepicker__day--002 react-datepicker__day--weekend"
		 * ))); // Select the option by index se.selectByIndex(7);
		 */

		// Select by VisibleText
		// se2.selectByVisibleText("2");

		// Selecting the first checkbox using XPath
		driver.findElement(By.xpath("//label[text()='Sports']")).click();

		// Selecting the second checkbox using Xpath
		driver.findElement(By.xpath("//label[text()='Reading']")).click();

		// For MobileNumber
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("8787878787");

		// For Current Address
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Abcde");

		// For Scrolling
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,500)", "");

		// To zoom in 3 times
		/*
		 * for(int i=0; i<3; i++){
		 * driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.
		 * ADD)); } // To zoom out 3 times for(int i=0; i<5; i++){
		 * driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.
		 * SUBTRACT)); } //To set the browser to default zoom level ie., 100%
		 * driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,
		 * "0"));
		 */

		// For Submit
		driver.findElement(By.xpath("//button[@id='submit']")).click();

	}
}