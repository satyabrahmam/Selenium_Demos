package Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		String Name = driver.findElement(By.id("txtUsername")).getAttribute("value");
		System.out.println(Name);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Performance")).click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		//String[] linktext = new String[links.size()];
		//int i=0;
		for (WebElement e:links)
		{
			String linktext=e.getText();
			System.out.println(linktext);
			
			
			
		}

	}

}