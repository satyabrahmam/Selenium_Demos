import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Demo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		String expectedTitle = driver.getTitle();
		System.out.println("Expected Title :"+expectedTitle);
		
		
		driver.findElement(By.xpath("//*[@id = 'txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id = 'txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id = 'btnLogin']")).click();
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title : "+actualTitle);
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("both are same");
			driver.findElement(By.xpath("//*[@id = 'welcome']")).click();
			WebElement logout =  driver.findElement(By.xpath("//*[text() = 'Logout']"));
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(logout));
			logout.click();
		}
		else
		{
			System.out.println("both are not same");
		}
		driver.close();
		
	}

}
