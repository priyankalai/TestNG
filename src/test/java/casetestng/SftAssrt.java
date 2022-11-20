package casetestng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SftAssrt {
	
	@Test
	public void at1() {
		System.out.println("At ----1");
	}
	
	@Test
	public void at2() {
		//Assertion  pass
		//Soft assert
		System.out.println("At ----2");
		
		System.out.println(1);
		SoftAssert s = new SoftAssert();
		s.assertEquals("hello", "hello");
		System.out.println("1stconpass");
		System.out.println(2);
		s.assertEquals("hello", "heo");     // ("hello", "hel")
		System.out.println(5);
		s.assertTrue(true);   // false
		System.out.println("next");
		System.out.println("enty");
		System.out.println(15);
	}
	
	@Test
	public void at3() {
		System.out.println("At ----3");
	}

}
