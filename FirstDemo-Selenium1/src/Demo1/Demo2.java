package Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		String username = driver.findElement(By.name("userName")).getAttribute("value");
		System.out.println(username);
		driver.findElement(By.name("password")).sendKeys(username);
		driver.findElement(By.xpath("//*[@name='login' and @value='Login']")).click();
		Thread.sleep(5000);
		if(driver.findElement(By.xpath("//*[@name='tripType'and @value='roundtripp']")).isSelected()){
		driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		}
		WebElement DD =driver.findElement(By.name("passCount"));
		Select sel = new Select(DD);
		List<WebElement> data = sel.getOptions();
		System.out.println(data.size());
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i).getText());
		}
		sel.selectByVisibleText("2");
		driver.findElement(By.xpath("//*[@type='radio'and @value='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("sunil");
		driver.findElement(By.name("passLast0")).sendKeys("Nagaraj");
		driver.findElement(By.name("passFirst1")).sendKeys("manzoor");
		driver.findElement(By.name("passLast1")).sendKeys("mehadi");
		driver.findElement(By.name("creditnumber")).sendKeys("1234 1234 1234 1234");
		List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));
		for(WebElement e:checkbox)
		{
			e.click();
		}
		driver.findElement(By.name("buyFlights")).click();
		
		
		
	}

}
