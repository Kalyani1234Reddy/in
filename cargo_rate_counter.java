package TSRTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cargo_rate_counter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty( "webdriver.chrome.driver","C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tsrtcparcel.in/Tscounter");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@class='nav navbar-nav navbar-right'])/li[4]")).click();
		driver.findElement(By.id("origin")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Hanamkonda");
		driver.findElement(By.name("shipmentvalue")).sendKeys("1");
		driver.findElement(By.xpath("(//option[text()='Parcel'])")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("DeliveryOptionId")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("on time delivery");
		Thread.sleep(2000);
		driver.findElement(By.name("weight")).sendKeys("5");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//option[text()='General'])")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("noOfPieces")).sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(By.name("noOfPieces")).sendKeys("1");
		
		
		
	}

}
