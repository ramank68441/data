package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framehandling {
	WebDriver driver;
	
	
	@Test
	public void ra() {
		
		WebDriverManager.chromedriver().setup();
		
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	
	driver.findElement(By.id("name")).sendKeys("kahtirki");

	//driver.switchTo().frame(driver.findElement(By.id("frm1")));
	
	Select ram= new Select(driver.findElement(By.id("course")));
	
	ram.selectByIndex(0);
	
		
		
	}
	
	//@Test
	public void fra() {
		
		
		
		driver.switchTo().frame("frm1");
		
		Select ram= new Select(driver.findElement(By.id("course")));
		
		ram.selectByIndex(0);
		
		
		
		
	}
	
	

}
