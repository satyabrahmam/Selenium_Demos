import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement user = driver.findElement(By.xpath("//*[@name = 'userName']"));
		user.sendKeys("sunil");
		String username = user.getAttribute("value");
		System.out.println("Username value :"+username);
		driver.findElement(By.xpath("//*[@name = 'password']")).sendKeys("sunil");
		driver.findElement(By.xpath("//*[@name = 'login']")).click();
		driver.findElement(By.xpath("//*[@value = 'oneway']")).click();
		WebElement passenger = driver.findElement(By.xpath("//*[@name = 'passCount']"));
		Select selectPassenger = new Select(passenger);
		selectPassenger.selectByIndex(0);
		List<WebElement> lists = selectPassenger.getOptions();	
		for(WebElement ele: lists)
		{
			System.out.println(ele.getText());
		}
		WebElement depFrom = driver.findElement(By.xpath("//*[@name = 'fromPort']"));
		Select selectdepFrom = new Select(depFrom);
		selectdepFrom.selectByValue("London");
		driver.findElement(By.name("servClass")).click();
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("sunil");
		driver.findElement(By.name("passLast0")).sendKeys("kumar");
		driver.findElement(By.name("creditnumber")).sendKeys("213123123123");
		List<WebElement> check = driver.findElements(By.xpath("//*[@name = 'ticketLess']"));
		//check.size();
		for(int i =1 ;i<=check.size();i++)
		{
			check.get(i).click();
		}
		//driver.findElement(By.xpath("//*[contains(text(), 'Tick')]/preceding-sibling::input")).click();
		//driver.findElement(By.xpath("//*[contains(text(), 'Same')]/preceding-sibling::input")).click();
		//driver.findElement(By.xpath("buyFlights")).click();
		
		
		
	}

}
