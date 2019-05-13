import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		System.out.println(driver.getWindowHandle());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		Thread.sleep(2000);
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//*[@id = 'identifierId']")).sendKeys("satya");
		//driver.findElement(By.xpath("//*[@class = 'h-c-header__cta-list header__nav--ltr']/li[2]/a")).click();
		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.xpath("//*[@title = 'Search']")).sendKeys("satya");
		

	}

}
