package webdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class brokedown_file {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Cheru\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromiumDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		
		
//		========================================
		driver.get("https://www.mercurytravels.co.in/");
//		===================================
		
	List<WebElement> links = driver.findElements(By.tagName("a"));
		int size =links.size();
		System.out.println(size);
		for(WebElement allLinks:links) {
			System.out.println(allLinks.getText() + " "+ allLinks.getDomAttribute("href"));
			
		}
driver.switchTo().frame(0);
driver.findElement(By.id(" ")).sendKeys("dasdsd");
driver.switchTo().defaultContent();
// ===================================


	}

}
