package Syntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class setProperty {

	public static void main(String[] args) {
		
		
		//------Chrome Initialization 

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//------geodriver Initialization
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		//------Interexplorer Initialization
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\ie.exe");
		WebDriver driver2 = new InternetExplorerDriver();
		
	}

}
