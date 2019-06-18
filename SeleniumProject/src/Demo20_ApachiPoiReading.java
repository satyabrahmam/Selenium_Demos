import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo20_ApachiPoiReading {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		// File Reading
		File filePath = new File("C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\Selenium Jars\\apachi_poi.xlsx");
		FileInputStream inputStream = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);		
		int rowCount = sheet.getLastRowNum();
		for(int i = 0; i<=rowCount ; i++)
		{
			String userName = sheet.getRow(i).getCell(0).toString();
			String passWord = sheet.getRow(i).getCell(1).toString();
			
			System.out.println("UserName " + i +" : " + userName);
			System.out.println("Password : " + passWord);
			
			driver.findElement(By.xpath("//*[@id = 'txtUsername']")).sendKeys(userName);
			driver.findElement(By.xpath("//*[@id = 'txtPassword']")).sendKeys(passWord);
			driver.findElement(By.xpath("//*[@id = 'btnLogin']")).click();
			driver.findElement(By.xpath("//*[@id = 'welcome']")).click();
			WebElement logout =  driver.findElement(By.xpath("//*[text() = 'Logout']"));
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(logout));
			logout.click();
		}
		
		// File Writing
		

	}

}
