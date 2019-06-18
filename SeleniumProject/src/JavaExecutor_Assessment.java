import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutor_Assessment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
			
		driver.findElement(By.xpath("//*[@id = 'txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id = 'txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id = 'btnLogin']")).click();
		driver.findElement(By.xpath("//*[text() = 'PIM']")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('ohrmList_chkSelectRecord_5').scrollIntoView()");
		
		String table = js.executeScript("return document.getElementById('resultTable').innerText").toString();
		System.out.println(table);
		
		//js.executeScript("window.history.")
		
		
	}

}
