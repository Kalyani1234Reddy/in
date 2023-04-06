package TSRTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RTC_TC {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty( "webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.tsrtconline.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[text()='Bus on Contract'])")).click();
		driver.findElement(By.id("origin-input")).sendKeys("warangal");
		driver.findElement(By.id("destination-input")).sendKeys("hyderbad");
		
		driver.findElement(By.id("startTxtJourneyDate")).click();
		driver.findElement(By.xpath("(//a[text()='25'])[1]")).click();
		driver.findElement(By.id("startTime")).sendKeys("01:00");
		
		driver.findElement(By.id("endTxtJourneyDate")).click();
		driver.findElement(By.xpath("(//a[text()='28'])[1]")).click();
		driver.findElement(By.id("endTime")).sendKeys("05:00");
		
		driver.findElement(By.id("searchBtn")).click();
		driver.switchTo().alert().accept();
		
		
		
		
		
		

	}

}
