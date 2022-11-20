package casetestng;

import org.testng.annotations.Test;

public class GrpTstng1 {
	
	@Test(groups = "Smoke", priority = 2 )
	public void GTNG010() {
		System.out.println("gtng --2--Sm---10");
	}
	
	@Test(groups = "Sanity")
	public void GTNG011() {
		System.out.println("gtng ---Sa----11");
	}

	@Test(groups = "Regression")
	public void GTNG012() {
		System.out.println("gtng ---Re----12");
	}

	@Test(groups = "Smoke")
	public void GTNG013() {
		System.out.println("gtng ---Sm----13");
	}

	@Test(groups = "Sanity")
	public void GTNG014() {
		System.out.println("gtng --Sa-----14");
	}

	@Test(groups = "Regression")
	public void GTNG015() {
		System.out.println("gtng --Re-----15");
	}

	
	

}
