import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo13_JavaExecutor {

	public static void main(String[] args) throws InterruptedException, AWTException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//String title = js.executeScript("return document.title").toString();
		//String url= js.executeScript("return document.URL").toString();
		//String domain = js.executeScript("return document.domain").toString();
		//System.out.println(title);
		
		
		// js.executeScript("history.go(0)"); // to refresh the screen
		js.executeScript("document.getElementById('txtUsername').value = 'admin'");
		js.executeScript("document.querySelector('input#txtPassword').value = 'admin123'");
		js.executeScript("document.getElementById('btnLogin').click()");
		js.executeScript("document.getElementById('menu_pim_viewPimModule').click()");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('menu_pim_viewEmployeeList').click()");
		
		//WebElement element = 
		//Actions action = new Actions(driver);
		//action.sendKeys(Keys.PAGE_DOWN).perform();
		
		//Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		js.executeScript("window.scrollBy(0,300)");
		js.executeScript("window.scrollBy(0,document.body.)");
		
	}

}
