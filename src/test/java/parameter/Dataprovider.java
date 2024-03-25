package parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider {
	
	@Test(dataProvider = "ra")
	public void ram(String username,String password) {
		
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password,Keys.ENTER);
	
		driver.quit();
		
	}
	
	
	@DataProvider(parallel = true
			
			)
	public  Object[][] data() {
		
		Object[][] a={ {"kathrik","12342"},{"kdiekaikei","134243"},{"iekks","123434"}
		,{"kdiekaikei","134243"},{"iekks","123434"}};
		
		return a;
	}

}
