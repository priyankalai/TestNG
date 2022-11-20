package casetestng;

import org.testng.annotations.Test;

public class GrpTstng2 {
	
	@Test(groups = "Smoke", priority = 1)
	public void GTNG0101() {
		System.out.println("gtng ---1-Sm---101");
	}
	
	@Test(groups = "Sanity", priority = 4)
	public void GTNG0111() {
		System.out.println("gtng --Sa--4---111");
	}

	@Test(groups = "Regression")
	public void GTNG0121() {
		System.out.println("gtng --Re-----121");
	}

	@Test(groups = "Smoke")
	public void GTNG0131() {
		System.out.println("gtng ---Sm----131");
	}

	@Test(groups = "Sanity", priority = 2)
	public void GTNG0141() {
		System.out.println("gtng --Sa--2---141");
	}

	@Test(groups = "Regression")
	public void GTNG0151() {
		System.out.println("gtng -Re------151");
	}


}
