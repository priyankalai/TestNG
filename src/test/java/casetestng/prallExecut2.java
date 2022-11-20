package casetestng;

import org.testng.annotations.Test;

public class prallExecut2 {
	

	@Test
	public void pe100() {
		System.out.println("PE_ - _ _ 100=="+Thread.currentThread().getId());
	}
	
	@Test
	public void pe200() {
		System.out.println("PE_ - _ _ 200=="+Thread.currentThread().getId());
	}

	@Test
	public void pe300() {
		System.out.println("PE_ - _ _ 300=="+Thread.currentThread().getId());
	}

	@Test
	public void pe400() {
		System.out.println("PE_ - _ _ 400=="+Thread.currentThread().getId());
	}

	@Test
	public void pe500() {
		System.out.println("PE_ - _ _ 500=="+Thread.currentThread().getId());
	}



}
