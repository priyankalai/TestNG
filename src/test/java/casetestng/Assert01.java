package casetestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert01 {
	
	@Test
	public void at1() {
		System.out.println("At ----1");
	}
	
	@Test
	public void at2() {
		//Assertion  pass
		//hard assert
		System.out.println("At ----2");
		
		System.out.println(1);
		Assert.assertEquals("hello", "hello");
		System.out.println("dfg");
		System.out.println(2);
		Assert.assertEquals("hello", "hello");     // ("hello", "hel")
		System.out.println(5);
		Assert.assertTrue(true);   // false
		System.out.println("rtyui");
		System.out.println("erty");
		System.out.println(1586);
	}
	
	@Test
	public void at3() {
		System.out.println("At ----3");
	}
	
	
}