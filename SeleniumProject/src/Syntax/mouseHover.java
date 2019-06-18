package Syntax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) {

		//---Mouse over


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		WebElement postpanel = driver.findElement(By.xpath("//*[@class = 'wp-menu-name' and text() = 'Posts']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(postpanel).build().perform();
	}

}
