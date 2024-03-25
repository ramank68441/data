package seleniumpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandles {
	
	
	@Test
	public void window() {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.findElement(By.id("name")).sendKeys("ekidkei");
		
		
		String parent= driver.getWindowHandle();
		
		driver.findElement(By.id("newTabBtn")).click();
		
		
		 Set<String> window=driver.getWindowHandles();
		
		 
		 for(String child:window) {
			 
			 System.out.println(child);
			 
			 if(!child.endsWith(parent)) {
				
				
				 driver.switchTo().window(child);
				 
				 driver.manage().window().maximize();
				 
				// driver.findElement(By.id("firstName")).sendKeys("kahtirk");
				 
				 
				 
				 
				 
			 }
			 
			 
			 System.out.println(driver.getTitle());
			
			driver.switchTo().window(parent);
			
			driver.findElement(By.id("name")).clear();
			
			driver.findElement(By.id("name")).sendKeys("123424");
		
//			 String ram=driver.getCurrentUrl();
//			 
//			 driver.findElement(By.id("newTabBtn")).click();
//			 
////			 
//			 Set<String> set= driver.getWindowHandles();
//			 
//			 for(String ch:set) {
//				 System.out.println(ch);
////				 if(!ch.equals(ram)) {
//					 
//					 driver.switchTo().window(ch);
//					 
//					 driver.manage().window().maximize();
//					 
//					 //driver.findElement(By.id("alertBox")).click();
////				 }
		// }
		 }
		 driver.quit();
	}
	
	

}
