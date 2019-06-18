import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Alerts_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		/*driver.findElement(By.xpath("//*[text() = 'Click for Prompt Box']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		String areMsg = alert.getText() ;
		System.out.println(areMsg);
		alert.sendKeys("Nooo");
		Thread.sleep(3000);
		alert.accept();
		*/
		//--------- Java Script executor --------------------
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		driver.findElement(By.xpath("//*[text() = 'Click for Prompt Box']")).click();
		Thread.sleep(4000);
		js.executeScript("prompt('Please enter your name','Enter name')");
		Thread.sleep(4000);
		Alert popup = driver.switchTo().alert();
		popup.sendKeys("Noo");
		Thread.sleep(4000);
		
		
		
		/*
		 * Simple Alert Example
		 * 
		 */
		/*driver.findElement(By.xpath("//*[text() = 'Prompt Pop up']")).click();
		Alert alert = driver.switchTo().alert();
		//alert.accept(); // to click on Okay button
		//alert.dismiss(); // to click on cancel button
		String are = alert.getText() ; // to get the alert text
	//	alert.sendKeys("Yes"); // to pass the values in alert
		//alert.wait(3000);
		alert.sendKeys("111");
		System.out.println(are);
		//alert.accept();
		
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[text() = 'Prompt Pop up']")).click();
		Thread.sleep(10000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(10000);
		String alre = alert.getText();
		System.out.println(alre);
		alert.sendKeys("Noooooooooo");
		Thread.sleep(10000);
		alert.accept();
		
		driver.findElement(By.xpath("//*[text() = 'Software Testing']")).click();
		*/
		
	}

}
