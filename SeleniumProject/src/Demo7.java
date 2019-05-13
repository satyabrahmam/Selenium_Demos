import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://realestate.upskills.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@class = 'right-side-menu-item']/a")).click();
		driver.findElement(By.name("log")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		
		WebElement admin = driver.findElement(By.xpath("//*[@class = 'display-name']"));
		Actions action = new Actions(driver);
		action.moveToElement(admin).build().perform();
		
		WebElement element = driver.findElement(By.xpath("//*[@id = 'wp-admin-bar-user-actions']/li[2]/a"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		
	}

}
