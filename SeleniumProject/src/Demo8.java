import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo8 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://realestate.upskills.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@class = 'right-side-menu-item']/a")).click();
		driver.findElement(By.name("log")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
		WebElement admin = driver.findElement(By.xpath("//*[@class = 'display-name']"));
		Actions action = new Actions(driver);
		action.contextClick(admin).build().perform();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		//robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
	}

}
 