package AutomateME;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser 
{
    public static void main(String[] args) throws InterruptedException 
    
    {
		System.setProperty("webdriver.ie.driver", "H:\\New folder\\Shivaji Automation\\AUTOMATION SEKE\\IE Driver\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
		
		WebDriver driver= new InternetExplorerDriver();
		driver.get("https://www.google.in");
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		
	}
}
