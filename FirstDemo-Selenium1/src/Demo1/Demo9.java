package Demo1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Software\\selenium server\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println("tabs = " + tabs.size());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(3000);
		driver.switchTo().window(tabs.get(0));

	}

}
