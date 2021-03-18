package GJM17.GJM17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class M17 {
public static WebDriver driver;

	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver89\\chromedriver.exe"); // Path of chromedriver 
		driver = new ChromeDriver();
	}
	
	@Test
	public void OpenBrowser() {
		driver.get("next.testmd.co.uk/");

	}
	
	@AfterTest
	public void Teardown() {
		driver.close();
	}
}
