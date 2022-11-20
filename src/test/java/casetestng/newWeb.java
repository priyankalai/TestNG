package casetestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newWeb {
	@Parameters({"username","password"})
	@Test
	public void wp(String username, String password ) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	
		WebElement txtname = driver.findElement(By.id("username"));
		txtname.sendKeys(username);
	
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys(password);
	
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	}

}
