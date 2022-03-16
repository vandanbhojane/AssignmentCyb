
package element;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class links {
	
	public static void main(String[] args) throws InterruptedException, IOException {
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
		
		//For links
		driver.findElement(By.xpath("//span[contains(text(),'Links')]")).click();
		
		//For Created
		driver.findElement(By.xpath("//a[@id='created']")).click();

		//For Home
		//driver.findElement(By.xpath("//a[@id='simpleLink']")).click();*/
		
		
		// broken URL

		// Step 1 - IS to get all urls tied up to the links using Selenium

		// Java methods will call URL's and gets you the status code

		// if status code >400 then that url is not working-> link which tied to url is
		// broken

		// a[href*="soapui"]'

		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links = driver.findElements(By.xpath("//span[contains(text(),'Links')]"));

		SoftAssert a = new SoftAssert();

		for (WebElement link : links)

		{

			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

			conn.setRequestMethod("HEAD");

			conn.connect();

			int respCode = conn.getResponseCode();

			System.out.println(respCode);

			a.assertTrue(respCode < 400, "The link with Text" + link.getText() + " is broken with code" + respCode);

		}

		a.assertAll(); //For soft assert at last we are getting all the errors at the end

	}

	private static Object getReturnCode(WebElement link) {

		// TODO Auto-generated method stub

		return null;

	}

}

		
	