package home_work_10_22;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation2 {
public static WebDriver driver;

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.bbc.com/news/world-asia-china-63358627");
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
	  //  String actualCurrentUrl = "https://www.bbc.com/news/world-asia-china-63358627";
		//String expectedCurrentUrl = driver.getCurrentUrl();
		//String actualtitle = 
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bbc.com/news/world-asia-china-63358627");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String actualCurrentUrl = "https://www.bbc.com/news/world-asia-china-63358627";
		String expectedCurrentUrl = driver.getCurrentUrl();
		String actualtitle = "Hu Jintao: The mysterious exit of China's former leader from party congress - BBC News";
		String expectedtitle = driver.getTitle();
		
		if(actualCurrentUrl.equals(expectedCurrentUrl) && actualtitle.equals(expectedtitle)) {
			System.out.println("My URL is correct");
		} else {
			System.out.println("My URL is not correct");
		}
	}

}
