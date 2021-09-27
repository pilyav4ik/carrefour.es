/**
 * 
 */
package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;



public class Hook {

	private static WebDriver driver;
	
	@Before("@web")
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//main//resources//drivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
