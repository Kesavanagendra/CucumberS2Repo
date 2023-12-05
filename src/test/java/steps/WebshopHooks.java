package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class WebshopHooks {

	static WebDriver driver;
	
	@Before
	public void setup() {

		ChromeOptions options = new ChromeOptions();
       
		
options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems


		
options.addArguments('--ignore-ssl-errors=yes');
options.addArguments('--ignore-certificate-errors');
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
	}
	
	@After
	public void teardown() {
		
		driver.close();
	}
}
