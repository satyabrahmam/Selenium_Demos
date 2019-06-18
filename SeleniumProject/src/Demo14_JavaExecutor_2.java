import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo14_JavaExecutor_2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		WebElement user = driver.findElement(By.xpath("//*[@name = 'userName']"));
		user.sendKeys("sunil");
		//String username = user.getAttribute("value");
		//System.out.println("Username value :"+username);
		driver.findElement(By.xpath("//*[@name = 'password']")).sendKeys("sunil");
		driver.findElement(By.xpath("//*[@name = 'login']")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> lists = driver.findElements(By.xpath("//*[@id = 'resultTable']"));
		
		System.out.println(lists);

	}

}
