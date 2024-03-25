package groups;

import org.testng.annotations.Test;

public class Test2 {

	

	@Test(priority=1,groups = {"sanity","smoke","regression"})
	public void ram5() {
		
		System.out.println("ram5 test>>>"+Thread.currentThread().getId());
	}
	@Test(groups = {"sanity","smoke"},invocationCount = 4)
	public void ram6() {
		
		System.out.println("ram 6test>>>"+Thread.currentThread().getId());
	}
	
	@Test(groups = {"sanity","ram"},threadPoolSize = 5)
	public void ram7() {
		
		System.out.println("ram7 test>>>"+Thread.currentThread().getId());
	}
}


