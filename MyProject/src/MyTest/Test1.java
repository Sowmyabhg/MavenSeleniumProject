package MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	WebDriver driver;
	
	@Test
	public void setup()
	{
		   System.setProperty("webdriver.http.factory", "jdk-http-client");
		   WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	       // driver.manage().window().maximize();
	        driver.get("https://amazon.in");
	        
	        driver.quit();
	}
	

}
