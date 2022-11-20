package casetestng;

import org.testng.annotations.Test;

public class PrallExecut1 {
	
	@Test
	public void pe1() {
		System.out.println("PE_ - _ _ 1=="+Thread.currentThread().getId());
	}
	
	@Test
	public void pe2() {
		System.out.println("PE_ - _ _ 2=="+Thread.currentThread().getId());
	}

	@Test
	public void pe3() {
		System.out.println("PE_ - _ _ 3=="+Thread.currentThread().getId());
	}

	@Test
	public void pe4() {
		System.out.println("PE_ - _ _ 4=="+Thread.currentThread().getId());
	}

	@Test
	public void pe5() {
		System.out.println("PE_ - _ _ 5=="+Thread.currentThread().getId());
	}


}
