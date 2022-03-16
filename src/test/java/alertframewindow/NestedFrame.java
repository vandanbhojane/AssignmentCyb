package alertframewindow;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NestedFrame {
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
    		driver.findElement(By.xpath("//span[contains(text(),'Nested Frames')]")).click();
                //Number of Frames on a Page
                int countIframesInPage = driver.findElements(By.tagName("iframe")).size();
                System.out.println("Number of Frames on a Page:" + countIframesInPage);
                
                //Locate the frame1 on the webPage
                WebElement frame1=driver.findElement(By.id("frame1"));
                
                //Switch to Frame1
                driver.switchTo().frame(frame1);
                
                //Locate the Element inside the Frame1
                WebElement frame1Element= driver.findElement(By.tagName("body"));
                
                //Get the text for frame1 element
                String frame1Text=frame1Element.getText();
                System.out.println("Frame1 is :"+frame1Text);
                
                //Number of Frames on a Frame1
                int countIframesInFrame1 =driver.findElements(By.tagName("iframe")).size();
                System.out.println("Number of iFrames inside the Frame1:" + countIframesInFrame1);
                
                //switch to child frame
                driver.switchTo().frame(0);
                
                int countIframesInFrame2 =driver.findElements(By.tagName("iframe")).size();
                System.out.println("Number of iFrames inside the Frame2:" + countIframesInFrame2);
                
                driver.close();
        }
}