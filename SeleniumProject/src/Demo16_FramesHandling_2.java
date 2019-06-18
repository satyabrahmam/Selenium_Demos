import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo16_FramesHandling_2 {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://hugelearning.com/iframe-practice-page/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> framesList = driver.findElements(By.xpath("//iframe"));
		
		System.out.println("Number of Frames in the Page : "+framesList.size());
		
		for(WebElement str : framesList)
		{
			System.out.println("Frames count : " +str.getAttribute("id").toString());
		}
		driver.switchTo().frame("iframe1");
		driver.findElement(By.xpath("//*[@name = 'First_Name']")).sendKeys("satya");
		Select selectDay = new Select(driver.findElement(By.xpath("//*[@name = 'Birthday_day']")));
		selectDay.selectByIndex(8);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("iframe2");
		WebElement text = driver.findElement(By.xpath("//*[@id = 'post-364']/div/h2[2]"));
		String stringText = text.getText().toString();
		System.out.println("Retrieved Text : "+stringText);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text() = 'Blog']")).click();
		driver.navigate().back();
		
		driver.switchTo().frame("iframe1");
		driver.findElement(By.xpath("//*[@name = 'Hobby_Drawing']")).click();
		driver.findElement(By.xpath("//*[@name = 'Hobby_Singing']")).click();
		driver.switchTo().defaultContent();
		
		
	}

}
