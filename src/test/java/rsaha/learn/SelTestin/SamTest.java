package rsaha.learn.SelTestin;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Test
public class SamTest {
	

	WebDriver driver;
	
	public void TestMthd() throws MalformedURLException {
		
		System.out.println("New Project");
//		Set grid Hub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
//		String HubUrl = "http://169.254.210.252:4444/wd/hub";
		String host = System.getProperty("hubHost");
        
		driver = new RemoteWebDriver(new URL("http://" + host + ":4444/wd/hub"), options);
		
//		WebDriver driver = new RemoteWebDriver(new URL(HubUrl),options);
		driver.navigate().to("https://outlook.live.com/owa/");
		
		
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rana\\Desktop\\Softwares\\chromedriver_win32\\chromedriver.exe");
//		String path = System.getProperty("user.dir");
//		System.out.println(path);
//		System.out.println("Welcome Rana");
//		System.setProperty("webdriver.gecko.driver",path+"\\resources\\geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver",path+"\\resources\\chromedriver.exe");
        
        // Instantiate a ChromeDriver class.     
//   driver=new ChromeDriver();  
//	 driver = new FirefoxDriver();
     
      // Launch Website  
//   driver.navigate().to("https://outlook.live.com/owa/");  
     
//    //Maximize the browser  
//     driver.manage().window().maximize();  
//     
//     //Scroll down the webpage by 5000 pixels  
//   JavascriptExecutor js = (JavascriptExecutor)driver;  
//   js.executeScript("scrollBy(0, 5000)");   
//     
//    // Click on the Search button  
//   driver.findElement(By.linkText("Core Java")).click();
   
   try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	
	e.printStackTrace();
}
   
   driver.quit();
   
	}



}
