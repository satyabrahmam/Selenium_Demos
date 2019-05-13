package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement link = driver.findElement(By.linkText("Car Rentals"));
		//WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Car Rentals')]"));
		
		Actions build = new Actions(driver);
		Action moverover = build.moveToElement(link).build();
		moverover.perform();
		build.sendKeys(link,(Keys.ENTER)).perform();

	}

}
