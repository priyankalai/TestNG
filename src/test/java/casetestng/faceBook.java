package casetestng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class faceBook {
	
	@Parameters({"mail","password"})
	@Test
	public void tc(@Optional("kalai@gmail.com") String email, String password) {
			WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get("https://en-gb.facebook.com/");
				driver.manage().window().maximize();
				WebElement txtemail = driver.findElement(By.id("email"));
				txtemail.sendKeys(email);
				WebElement txtpass = driver.findElement(By.id("pass"));
				txtpass.sendKeys(password);
				WebElement btnlogin = driver.findElement(By.name("login"));
				btnlogin.click();
		}
	
	
	}
	
	
	


