
package widgets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMenu {
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
		js1.executeScript("window.scrollBy(0,600)", "");

		// For SelectMenu
		driver.findElement(By.xpath("//span[contains(text(),'Select Menu')]")).click();

		// For Colour
		// Create object of the Select class
		Select se = new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));

		List<WebElement> lst = se.getOptions();

		// Looping through the options and printing dropdown options
		System.out.println("The dropdown options are:");
		for (WebElement options : lst)
			System.out.println(options.getText());

		// Select the option by index
		se.selectByIndex(3);

		// Select by VisibleText
		// se.selectByVisibleText("Magenta");

		// Select by Value
		// se.selectByValue("6");

	}
}
