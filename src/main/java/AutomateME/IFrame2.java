package AutomateME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame2 
{
	 public static void main(String[] args) throws InterruptedException 
	  {
		   System.setProperty("webdriver.chrome.driver", "H:\\New folder\\Shivaji Automation\\AUTOMATION SEKE\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   
		   driver.get("https://www.w3schools.com/html/html_iframe.asp");
		   //Thread.sleep(1000);
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   
		   WebElement wb= driver.findElement(By.xpath("//iframe[@src='default.asp']"));
		   driver.switchTo().frame(wb);
		   driver.findElement(By.xpath("//a[@onclick='open_menu()']")).click();
		   
		   driver.findElement(By.xpath("//a[@onclick='gSearch(this)']")).click();
		 
		   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Auttomate");
		  // driver.findElement(By.xpath("//input[@title='search']")).sendKeys("Automation");
		   
		   
		   
		  // driver.findElement(By.id("w3loginbtn")).click();
		   
		   
		   /* WebElement wb= driver.findElement(By.xpath("(//div[@style='display: none; position: absolute; z-index: 3; right: 111px; height: 44px; background-color: rgb(40, 42, 53); text-align: right; padding-top: 9px;']/following-sibling::div/div/div)[1]"));
		   driver.switchTo().frame(wb);
		   
		   driver.findElement(By.xpath("//a[@onclick='gSearch(this)']")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.id("gsc-i-id1")).sendKeys("Automation");
		   Thread.sleep(1000); */
		   //driver.close();
		   
	  }
}
