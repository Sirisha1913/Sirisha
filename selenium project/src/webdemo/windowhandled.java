package webdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class windowhandled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Cheru\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/");
		//	    Table handling
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='product']/tbody/tr"));
		int rowcount=rows.size();
		System.out.println(rowcount);
		List<WebElement> colunm=driver.findElements(By.xpath("//table[@id='product']/tbody/tr[1]/th"));
		int colunmcount=colunm.size();
		System.out.println(colunmcount);
		//------------------------------
		for(int i = 1; i<=1; i++) 
		{
			for(int j = 1; j<=colunmcount; j++)
			{
				System.out.print(driver.findElement(By.xpath("//table[@id=\"product\"]/tbody/tr["+i+"]/th["+j+"]")).getText()+ "  ");
			}


		}

	}
}
