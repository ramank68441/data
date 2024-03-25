package groups;

import org.testng.annotations.Test;

public class Test1 {
	
	
	@Test(priority=1,groups = {"sanity","smoke","regression"})
	public void ram1() {
		
		System.out.println("ram1 test>>>"+Thread.currentThread().getId());
	}
	@Test(groups = {"sanity","smoke"},invocationCount = 4)
	public void ram2() {
		
		System.out.println("ram2 test>>>"+Thread.currentThread().getId());
	}
	
	@Test(groups = {"sanity","ram"},threadPoolSize = 5)
	public void ram3() {
		
		System.out.println("ram3 test>>>"+Thread.currentThread().getId());
	}
}
