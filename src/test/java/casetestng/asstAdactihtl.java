package casetestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class asstAdactihtl {
	@Parameters({"username","password"})
	
	@Test
	public void AADhtl(String username, String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("adactinhotelapp");
		System.out.println(contains); // true
		Assert.assertTrue(contains);  // pass
	
		WebElement txtname = driver.findElement(By.id("username"));
		txtname.sendKeys(username);
		String attribute = txtname.getAttribute("value");
		Assert.assertEquals(attribute, "kalaishadow"); //01 pass //02 fail
	
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys(password);
	
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	}

}
