package casetestng;

import org.testng.annotations.Test;

public class GrpTstng3 {
	
	@Test(groups = "Smoke", priority = 0 )
	public void GTNG0100() {
		System.out.println("gtng ---0--Sm--100");
	}
	
	@Test(groups = "Sanity", priority = 3 )
	public void GTNG0110() {
		System.out.println("gtng ---Sa-3---110");
	}

	@Test(groups = "Regression")
	public void GTNG0120() {
		System.out.println("gtng ---Re----120");
	}

	@Test(groups = "Smoke", priority = -2)
	public void GTNG0130() {
		System.out.println("gtng ---Sm--/2--130");
	}

	@Test(groups = "Sanity", priority = 1)
	public void GTNG0140() {
		System.out.println("gtng --Sa--1---140");
	}

	@Test(groups = "Regression")
	public void GTNG0150() {
		System.out.println("gtng ---Re----150");
	}


}
