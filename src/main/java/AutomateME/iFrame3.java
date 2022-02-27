package AutomateME;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame3 
{
   public static void main(String[] args) 
   {
	  System.setProperty("webdriver.chrome.driver", "H:\\\\New folder\\\\Shivaji Automation\\\\AUTOMATION SEKE\\\\chromedriver_win32\\\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  
	  driver.get("https://api.jquery.com/contents/");
	  
	  JavascriptExecutor js= (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,2400)", "");
	  
	  WebElement wb=driver.findElement(By.xpath("//iframe[@src='https://api.jquery.com/']"));
	  driver.switchTo().frame(wb);
	  
	  driver.findElement(By.xpath("//a[@href='https://js.foundation/']")).click();
	  
	  
	  //js.executeScript("window.scrollBy(0,200)", "");
	  
	  
	  
	  

	 /* WebElement Element=driver.findElement(By.linkText("jQuery API']"));
	  js.executeScript("arguments[0].scrollIntoView();", Element); */
	  
	 
	 
	  
	  
	  
	  
   }
}
