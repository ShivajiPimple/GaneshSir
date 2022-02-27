package AutomateME;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.gecko.driver", "H:\\New folder\\Shivaji Automation\\AUTOMATION SEKE\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver ();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(3500);
        js.executeScript("window.scrollBy(0,-750)", "");
        driver.findElement(By.xpath("//a[@href='//www.phptravels.net/login']']"));
        
		
		Thread.sleep(3000);
		

	}

}
