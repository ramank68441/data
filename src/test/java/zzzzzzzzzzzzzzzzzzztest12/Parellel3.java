package zzzzzzzzzzzzzzzzzzztest12;

import org.testng.annotations.Test;

public class Parellel3 {


	@Test(groups = "@smoke")
	public void test9() {
		
		System.out.println("test nine"+Thread.currentThread().getId());
	}
	@Test(groups={"Smoke","functional","sanity",})
	public void test10() {
		
		System.out.println("test ten"+Thread.currentThread().getId());
	}
	
	@Test
	public void test11() {
		
		System.out.println("test Leven"+Thread.currentThread().getId());
	}
	@Test
	public void test12() {
		
		System.out.println("test twel"+Thread.currentThread().getId());
	}
	
	
}
