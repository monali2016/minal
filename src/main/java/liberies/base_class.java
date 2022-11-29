package liberies;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class {
	public WebDriver driver;
	
	public void intiliaze()
	{
	System.setProperty("webdriver.chrome.driver","E:\\selinium\\chromedriver.exe");
	 driver=new ChromeDriver();
	 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	}
}
