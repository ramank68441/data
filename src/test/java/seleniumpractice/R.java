package seleniumpractice;

import 
org.openqa.selenium.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class R {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html#");
		
		driver.findElement(By.id("name")).sendKeys("raman");
		
		System.out.println("successfuutly excutedc");
		
		driver.switchTo().frame(driver.findElement(By.id("frm2")));
		
		
	
		
		
		driver.findElement(By.id("name")).sendKeys("irksi");
		
	}

}
