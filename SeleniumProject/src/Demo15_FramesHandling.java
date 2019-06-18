import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo15_FramesHandling {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//http://5elementslearning.com/iframe-practice-page.php
		List<WebElement> frames = driver.findElements(By.xpath("//iframe"));
		
		//List<WebElement> frames1 = driver.findElements(By.xpath("*"));
		System.out.println(frames.size());
		for(int i = 0; i< frames.size();i++)
		{
			System.out.println(frames.get(i).getAttribute("Name"));
		}
		driver.switchTo().frame("iframe1");
		driver.findElement(By.xpath("//*[@class = 'ngg-singlepic ngg-none aligncenter lazyloaded']")).click();
		
	}

}
