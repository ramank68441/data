package zzzzzzzzzzzzzzzzzzztest12;

import org.testng.annotations.Test;

import io.cucumber.cucumberexpressions.Group;

public class Parallel1 {
	
	
	
	
	@Test
	public void test1() {
		
		System.out.println("test one"+Thread.currentThread().getId());
	}
	@Test(groups={"Smoke","functional","sanity",})
	public void test2() {
		
		System.out.println("test two"+Thread.currentThread().getId());
	}
	
	@Test
	public void test3() {
		
		System.out.println("test Threee"+Thread.currentThread().getId());
	}
	@Test
	public void test4() {
		
		System.out.println("test Foure"+Thread.currentThread().getId());
	}

}
