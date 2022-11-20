package casetestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDataprovider {
	
	@Test(dataProvider = "signup")
	public void signuptest(String first, String last, long phone, String pass) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/reg/");
			WebElement txtfirst = driver.findElement(By.name("firstname"));
			txtfirst.sendKeys(first);
			WebElement txtlast = driver.findElement(By.name("lastname"));
			txtlast.sendKeys(last);
			WebElement txtphone = driver.findElement(By.name("reg_email__"));
			txtphone.sendKeys(String.valueOf(phone));
			WebElement txtpass = driver.findElement(By.name("reg_passwd__"));
			txtpass.sendKeys(pass);
			
	}

	@DataProvider(name = "signup")
	public Object[][] data() {
		return new Object[][] {
			{"kalai","priyan",6380725303l,"ftyuj4@"},
			{"kirupagaran","palaniivel",8883367590l,"kirupa@259"},
			{"machi","naveen",6887625534l,"machu9@95"}
		
	};
}
}
