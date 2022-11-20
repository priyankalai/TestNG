package casetestng;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class sample {



		@BeforeClass
		public void beforeclass() {
			System.out.println("Browser launch .configurtioan");
		}
		
		@AfterClass
		public void afterclass() {
			System.out.println("close /quit");
		}
		
		@BeforeMethod
		public void beforeEachMethod() {
			Date d = new Date();
			System.out.println("Start time ....."+d);
		}
		@AfterMethod
		public void afterEachMethod() {
			Date d = new Date();
			System.out.println("End time ......"+d);
		}
		
		@Test(priority = 0)
		public void tc1() {
			System.out.println("tc.. 0 ...1");
		}
		
		@Test(priority = 5)
		public void tc2() {
			System.out.println("tc... 5 ..2");
		}
		@Ignore
		@Test(priority = -3)
		public void tc3() {
			System.out.println("tc... -3 ..3");
		}
		
		@Test(priority = 2, enabled = false)
		public void tc5() {
			System.out.println("tc..  2  ...5");
		}
		
		@Test(priority = -2 , invocationCount = 3)
		public void tc4() {
			System.out.println("tc.. -2 ...4");
		}
		
		@Test(priority = -4)
		public void tc6() {
			System.out.println("tc.. -4 ...6");
		}
		
		@Test(priority = 3)
		public void tc7() {
			System.out.println("tc.. 3 ...7");
		}
		
}
