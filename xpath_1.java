package home_work_10_22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_1 {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		//1 type - //html[@attributes1 = 'valueoftheattribure'
		//2 type - //html[contains(text(), 'textcontent')]- this one I forgot how to do
		//3 type - //html[contains(@attributes, 'value]
		
		driver.findElement(By.xpath("//a[@class = 'mailicon']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Rediffmail')]")).click();
		driver.findElement(By.xpath("//a[contains(@class, 'mailicon')]")).click();
		
		
		driver.findElement(By.xpath("//a[@class = 'moneyicon relative']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Money')]")).click();
		driver.findElement(By.xpath("//a[contains(@class, 'moneyicon relative')]")).click();
		
		driver.findElement(By.xpath("//a[@class = 'bmailicon relative']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Business Email')]")).click();
		driver.findElement(By.xpath("//a[contains(@class, 'bmailicon relative')]")).click();
		
		
		
		driver.findElement(By.xpath("//a[@class = 'vdicon']")).click();
		driver.findElement(By.xpath("//a[contains (text(), 'Videos')]")).click();
		driver.findElement(By.xpath("//a[contains(@class, 'vdicon')]")).click();
		
		
		
		driver.findElement(By.xpath("//a[@class = 'shopicon relative']")).click();
		driver.findElement(By.xpath("//a[contains (text(), 'Shopping')]")).click();
		driver.findElement(By.xpath("//a[contains(@class, 'shopicon relative')]")).click();
		
		
		driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		driver.findElement(By.xpath("//a[contains (text(), 'Sign in')]")).click();
		driver.findElement(By.xpath("//a[contains(@class, 'signin')]")).click();
		
		driver.findElement(By.xpath("//a[@title = 'Create Rediffmail Account']")).click();
		driver.findElement(By.xpath("//a[contains (text(), 'Create Account')]")).click();
		driver.findElement(By.xpath("//a[contains(@title, 'Create Rediffmail Account')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@id, 'login1')]")).click();
		driver.findElement(By.xpath("//input[@id = 'login1']")).click();
		// ??? driver.findElement(By.xpath("//a[contains (text(), '??????')]")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'password')]")).click();
		driver.findElement(By.xpath("//input[@id = 'password']")).click();
		//#3 ????
		
		
		driver.findElement(By.xpath("//input[contains(@title, 'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@title = 'Sign in']")).click();
		//#3 ????
		
		driver.findElement(By.xpath("//input[contains(@class, 'rd_logout')]")).click();
		driver.findElement(By.xpath("//input[@class = 'rd_logout']")).click();
		//#3 ????
		
		
		
		
		
		
	
		
		
	}

}
