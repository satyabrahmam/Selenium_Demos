package Demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Software\\selenium server\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		//This is to identify my parent window
		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent window Name --->" + parentwindow);
		WebElement Clickbutton = driver.findElement(By.id("button1"));
		//To click on the button
		for(int i=0; i<3;i++)
		{
			Clickbutton.click();
			Thread.sleep(2000);
		}
		//This is to identify my child window
		List<String> childwindow = new ArrayList<>(driver.getWindowHandles());
		System.out.println("Child Window Name -->" + childwindow);
		String lastwindow = "";
		for(int i=1;i<childwindow.size();i++)
		{
			driver.switchTo().window(childwindow.get(i));
			driver.navigate().to("http://www.google.com");
			lastwindow = childwindow.get(i).toString();
		}
		//switching back to my parent window
		driver.switchTo().window(parentwindow);
		driver.navigate().to("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(lastwindow);
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.quit();

	}

}
