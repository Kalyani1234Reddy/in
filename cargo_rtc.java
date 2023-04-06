package TSRTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cargo_rtc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty( "webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.tsrtcparcel.in/Tscounter");
		driver.manage().window().maximize();
		
	    Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//ul[@class='nav navbar-nav navbar-right'])/li[5]")).click();
		driver.findElement(By.id("username")).sendKeys("kalyani");
		driver.findElement(By.id("password")).sendKeys("kalyanireddy");

		driver.findElement(By.xpath("(//button[text()='Sign In'])")).click();
		
		

	}

}
