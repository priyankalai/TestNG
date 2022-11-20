package casetestng;

import org.testng.annotations.Test;

public class prallExecut3 {
	
	@Test
	public void pe10() {
		System.out.println("PE_ - _ _ 10=="+Thread.currentThread().getId());
	}
	
	@Test
	public void pe20() {
		System.out.println("PE_ - _ _ 20=="+Thread.currentThread().getId());
	}

	@Test
	public void pe30() {
		System.out.println("PE_ - _ _ 30=="+Thread.currentThread().getId());
	}

	@Test
	public void pe40() {
		System.out.println("PE_ - _ _ 40=="+Thread.currentThread().getId());
	}

	@Test
	public void pe50() {
		System.out.println("PE_ - _ _ 50=="+Thread.currentThread().getId());
	}



}
