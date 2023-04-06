package TSRTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RTC_login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty( "webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.tsrtconline.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[text()='eTicket Login'])")).click();
		driver.findElement(By.id("userName")).sendKeys("kalyani");
		driver.findElement(By.id("password")).sendKeys("srinivasreddy");
		driver.findElement(By.id("submitBtn")).click();
		driver.findElement(By.xpath("(//a[text()='SignUp'])")).click();
		
		
		
		
		
		
		
		
		

	}

}
