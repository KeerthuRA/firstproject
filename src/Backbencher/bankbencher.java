package Backbencher;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bankbencher {
	public static void main( String [] args) throws IOException {
		
		// configure the browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\rhkee\\eclipse-workspace\\Banner\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		// launch URL
				driver.get("https://adactinhotelapp.com/");
		// Maximize windows
				driver.manage().window().maximize();
				
		// Screenshot
				TakesScreenshot ts = (TakesScreenshot)driver;
				File sourcefile = ts.getScreenshotAs(OutputType.FILE);
				File targetfile = new File ("C:\\Users\\rhkee\\Downloads\\Selenium Scrnshot\\test.png");
				FileUtils. copyFile(sourcefile, targetfile);
				
				//Enter values for login
				WebElement username = driver.findElement(By.id("username"));
				username.sendKeys("keerthi1111");
				WebElement password = driver.findElement(By.name("password"));
				password.sendKeys("123456");
				WebElement loginbutton = driver.findElement(By.id("login"));
				loginbutton.click();
				
				//Selecting preference
				WebElement location = driver.findElement(By.name("location"));
				Select l = new Select(location);
				l.selectByValue("Paris");
				
				WebElement hotels = driver.findElement(By.name("hotels"));
				Select h = new Select(hotels);
				h.selectByIndex(2);
				
				WebElement roomtype = driver.findElement(By.name("room_type"));
				Select r = new Select(roomtype);
				r.selectByVisibleText("Deluxe");
				
				WebElement indate = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
				indate.getAttribute("18/08/2023");
				indate.clear();
				indate.sendKeys("19/08/2023");
				
				WebElement outdate = driver.findElement(By.xpath("(//input[@class='date_pick'])[2]"));
				outdate.getAttribute("19/08/2023");
				outdate.clear();
				outdate.sendKeys("20/08/2023");
				
				WebElement adultno = driver.findElement(By.id("adult_room"));
				Select a = new Select(adultno);
				a.selectByValue("2");
				
				WebElement childno = driver.findElement(By.id("child_room"));
				Select c = new Select(childno);
				c.selectByValue("1");
				
				WebElement searchbutton = driver.findElement(By.id("Submit"));
				searchbutton.click();
				
				WebElement raidobutton = driver.findElement(By.id("radiobutton_0"));
				raidobutton.click();
				
				WebElement proceed = driver.findElement(By.id("continue"));
				proceed.click();
				
				WebElement fname = driver.findElement(By.id("first_name"));
				fname.sendKeys("Keerthi");
				
				WebElement lname = driver.findElement(By.id("last_name"));
				lname.sendKeys("vasan");
				
				WebElement address = driver.findElement(By.id("address"));
				address.sendKeys("chennai");
				
				WebElement cc = driver.findElement(By.id("cc_num"));
				cc.sendKeys("1234567891234567");
				
				WebElement cctype = driver.findElement(By.id("cc_type"));
				Select t = new Select(cctype);
				t.selectByValue("VISA");
				
				WebElement exdate = driver.findElement(By.id("cc_exp_month"));
				Select e = new Select(exdate);
				e.selectByValue("4");
				
				WebElement exyear = driver.findElement(By.id("cc_exp_year"));
				Select y = new Select(exyear);
				y.selectByValue("2026");
				
				WebElement v = driver.findElement(By.id("cc_cvv"));
				v.sendKeys("4563");				
				
				WebElement bookbutton = driver.findElement(By.id("book_now"));
				bookbutton.click();
				
				WebElement orderno = driver.findElement(By.id("order_no"));
				String orderid = orderno.getAttribute("value");
				System.out.println(orderid);
				
				
				
							
				
			
			
				
	
	    // to click new account button using text xpath
		//		WebElement loginButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
		//		loginButton.click();
		// to clik new account using contains text
				//WebElement mainbranches = driver.findElement(By.xpath("(//p[@style='text-align: center;'])[1]"));
				//mainbranches.click();
				
				
				//WebElement containsText = driver.findElement(By.xpath("//p[contains(text(),'Greens Technology Velachery is the best IT Training Institute')]"));
                        
				//String text = containsText.getText();
				//System.out.println(text);
}

	private static void clear() {
		// TODO Auto-generated method stub
		
	}
}
