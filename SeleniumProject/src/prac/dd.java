package prac;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class dd {

	public static void main(String[] args) {
		
		 // WebDriver is a Interface
		WebDriver driver = new ChromeDriver();
		
		WebElement testDropDown = driver.findElement(By.id("testingDropdown"));  
		Select dropdown = new Select(testDropDown);

		Actions action = new Actions(driver);
		//action.
		}

}
