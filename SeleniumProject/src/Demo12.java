import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://realestate.upskills.in");		
		driver.findElement(By.xpath("//*[@class = 'right-side-menu-item']/a")).click();
		driver.findElement(By.name("log")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		
		WebElement postpanel = driver.findElement(By.xpath("//*[@class = 'wp-menu-name' and text() = 'Posts']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(postpanel).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement posts = driver.findElement(By.xpath("//*[text() = 'All Posts']"));
		wait.until(ExpectedConditions.elementToBeClickable(posts)).click();
		//posts.click();
		
		driver.findElement(By.xpath("//*[@id='the-list']/tr[1]/td/strong/a/parent::strong/parent::td//preceding-sibling::th/child::input")).click();
		
		
		
	}

}
