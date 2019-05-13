import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id = 'txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id = 'txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id = 'btnLogin']")).click();
		
		WebElement performance = driver.findElement(By.partialLinkText("Perfor"));
		Actions action = new Actions(driver);
		action.moveToElement(performance).build().perform();
		WebElement config = driver.findElement(By.partialLinkText("Config"));
		action.moveToElement(config).build().perform();
		driver.findElement(By.partialLinkText("KPI")).click();
		action.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
		
	}

}
