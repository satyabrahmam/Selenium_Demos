import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		for(int i = 0; i<=6; i++)
		{
			List<WebElement> lists = driver.findElements(By.xpath("//*[@class = 'mouseOut']"));
		
		
			String pagename= lists.get(i).getText();
			lists.get(i).click();
			String pageTitle = driver.getTitle();
			if(pageTitle.startsWith("Under"))
			{
				System.out.println( pagename +" :  page is not working");
				
			}
			else
			{
				System.out.println( pagename +" : page is working");
				
			}
		}
	}

}
