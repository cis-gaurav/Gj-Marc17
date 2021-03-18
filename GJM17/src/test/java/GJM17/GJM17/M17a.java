package GJM17.GJM17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class M17a {
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
		driver.findElement(By.name("user[login]")).sendKeys("gaurav.j");
		driver.findElement(By.name("user[password]")).sendKeys("123456789");
		driver.findElement(By.name("commit")).click();	
	}
	
	@AfterTest
	public void Teardown() {
		driver.close();
	}
}
