package zzzzzzzzzzzzzzzzzzztest12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel2 {

	
	

	@Test(groups = {"@ram"})
	public void test5() {
		
		System.out.println("test Five"+Thread.currentThread().getId());
	}
	@Test(groups={"Smoke","functional","sanity",})
	public void test6() {
		
		System.out.println("test six"+Thread.currentThread().getId());
	}
	
	@Test
	public void test7() {
		
		System.out.println("test seven"+Thread.currentThread().getId());
	}
	@Test
	public void test8() {
		
		System.out.println("test 8"+Thread.currentThread().getId());
	}
}
