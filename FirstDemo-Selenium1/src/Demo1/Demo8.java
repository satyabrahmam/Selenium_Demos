package Demo1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "D:\\Software\\selenium server\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://realestate.upskills.in/admin");
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
		Actions RC = new Actions(driver);
		RC.contextClick(link).build().perform();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
	}

}
