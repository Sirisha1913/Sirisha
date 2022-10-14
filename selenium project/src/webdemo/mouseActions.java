package webdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Cheru\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromiumDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/");
		System.out.println(driver.getTitle());
		
		
		//Action methode

		Actions mouse = new Actions(driver);
		mouse
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-4131\"]/a")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-4157\"]/a")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-4134\"]/a/span")))
		.click()
		.perform();



	}

}
