package Backbencher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrowserLaunch {
	public static void main( String [] args) {
		
// configure the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rhkee\\eclipse-workspace\\happy\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
// launch URL
		driver.get("http://www.facebook.com/");
// Maximize windows
		driver.manage().window().maximize();
		
//		 //to inspect username Webelement
//		WebElement Username = driver.findElement(By.name("email"));
//		Username.sendKeys("hello");
//		// to inspect password Webelement
//		WebElement Password = driver.findElement(By.id("pass"));
//		Password.sendKeys("message");
//		// to click button
//		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
//		loginButton.click();
		
		WebElement courses = driver.findElement(By.xpath("//strong[text()='Courses']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(courses);	
		
		WebElement selenium = driver.findElement(By.xpath("(//a[(text(),'Selenium')])[1]"));
		actions.moveToElement(selenium).build().perform();
		
		
		
	}
}