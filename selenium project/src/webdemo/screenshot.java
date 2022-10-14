package webdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Cheru\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromiumDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/");
		System.out.println(driver.getTitle());
		
		TakesScreenshot tee = (TakesScreenshot) driver;
		File source = tee.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("C:\\Users\\Cheru\\Downloads\\sourcefile\\image.png "));
		System.out.println("screenshot is taken ");
		

	}
	

}
