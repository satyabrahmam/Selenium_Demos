import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo18_ExtrendReport {

	public static void main(String[] args) {
		
		ExtentReports extent;
		ExtentTest logger ;
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/satya.html",true);
		//extent.loadConfig(new File(System.getProperty("user.dir")+"\\extend-config.html"));
		
		logger = extent.startTest("First Tes");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		String title = driver.getTitle();
		logger.log(LogStatus.INFO, "Google home Page opened");
		logger.log(LogStatus.PASS, "Test case passed");
		extent.endTest(logger);
		extent.flush();
		extent.close();
		
		
		
	}

}
