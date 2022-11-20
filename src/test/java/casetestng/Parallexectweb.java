package casetestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallexectweb {
	
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void PrE(String browser) {
		if (browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		
		else if (browser.equals("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
	}

}
