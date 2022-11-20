package casetestng;

import org.testng.annotations.Test;

public class Friendslist {
	
	@Test (priority = 0)
	public void name() {
		System.out.println("name of the friend");
	}
	
	@Test(priority = 1)
	public void kirupa() {
		System.out.println("01 kirupa ");
	}
	
	@Test(priority = 2)
	public void sidesh() {
		System.out.println("02 sidesh");
	}
	
	@Test(priority = 3)
	public void machi() {
		System.out.println("03 machi");
	}
	@Test(priority = 4)
	public void sithesh() {
		System.out.println("04 sithesh");
	}
	

}
