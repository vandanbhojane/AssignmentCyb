
package alertframewindow;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frames {
        public static void main(String[] args){
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

    		// For Alerts, Frame & Windows
    		driver.findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]")).click();
    		
    		// For Scrolling
    		JavascriptExecutor js1 = (JavascriptExecutor) driver;
    		js1.executeScript("window.scrollBy(0,300)", "");

    		// For NestedFrame
    		driver.findElement(By.xpath("//span[contains(text(),'Frames')]")).click();
    		
            //Locating frame1 using its id
            WebElement frame1=driver.findElement(By.id("frame1"));
            
            //Switching the WebDriver context to frame1
            driver.switchTo().frame(frame1);
            
            //Identifying the frame heading in a WebElement
            WebElement frame1Heading= driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
            
            //Finding the text of the frame1 heading
            String frame1Text=frame1Heading.getText();
            
            //Print the heading
            System.out.println("Text of the frame1 heading is:"+frame1Text);
            
            //closing the driver
            driver.close();
            
        }}