package webdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class webdriverhandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.xpath("//*[@id=\"search2\"]")).sendKeys("java");
		driver.findElement(By.xpath("//*[@id=\"learntocode_searchicon\"]")).click();
		
				
				
				
				
				
				
				
	
		

	}

}
