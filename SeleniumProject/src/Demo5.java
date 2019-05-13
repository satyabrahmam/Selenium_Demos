import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement homeLink = driver.findElement(By.xpath("//*[text() = 'Home']"));
		//homeLink.click();
		Actions action = new Actions(driver);
		action.moveToElement(homeLink).build();
		homeLink.click();
		action.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER).perform();
		//act.perform();
		//action.sendKeys(homeLink, (Keys.ENTER)).perform();

	}

}
