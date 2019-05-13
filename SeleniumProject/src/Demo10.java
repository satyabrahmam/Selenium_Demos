import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	System.out.println(driver.getWindowHandle());
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String parentWindow = driver.getWindowHandle();
	
	WebElement buttonClick = driver.findElement(By.xpath("//*[@id = 'button1']"));
	
	for (int i = 0; i< 3 ; i++)
	{
		buttonClick.click();
	}
	
	List<String> windowhandles = new ArrayList<>(driver.getWindowHandles());
	System.out.println(windowhandles);
	String lastWindow  = "";
	for(int i = 1; i< windowhandles.size();i++)
	{
		driver.switchTo().window(windowhandles.get(i));
		driver.navigate().to("https://www.google.co.in");
		lastWindow = windowhandles.get(i).toString();
		
		
	}
	System.out.println("last window : "+lastWindow);
	driver.switchTo().window(parentWindow);
	System.out.println("parent window : "+parentWindow);
	}

}
