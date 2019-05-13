import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//http://realestate.upskills.in
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://retail.upskills.in/admin/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button")).click();
		
		WebElement catalog = driver.findElement(By.id("menu-catalog"));
		Actions action = new Actions(driver);
		action.moveToElement(catalog).build().perform();
		driver.findElement(By.xpath("//*[contains(text(), 'Downloads')]")).click();
		

	}

}







//driver.findElement(By.xpath("//*[contains(text(), 'Products')]")).click();

		/*List<WebElement> CatalogElements = driver.findElements(By.id("menu-catalog"));
		List<String> StringElements =  new ArrayList<>();
		for(WebElement e : CatalogElements)
		{
			String str = e.getText();
			StringElements.add(str);
			
		}
		for (String str1 : StringElements)
		{
			System.out.println(str1);
			if(str1.equalsIgnoreCase("Products"))
			{
					System.out.println("satya");
			}
		}
		/*for(int i = 0 ; i<CatalogElements.size();i++)
		{
			System.out.println(CatalogElements.get(i));
		}
		//System.out.println(CatalogElements.size());
		for(int i = 1 ; i<2; i ++)
		{
			CatalogElements.get(i).click();
		}*/
