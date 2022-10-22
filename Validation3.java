package home_work_10_22;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation3 {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.nbcnews.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String actualcurentUrl = "https://www.nbcnews.com/";
		String expectedCurrentUrl = driver.getCurrentUrl();
		String actusaltitle = "NBC News - Breaking News & Top Stories - Latest World, US & Local News | NBC News";
		String expectedtitle = driver.getTitle();
		
		//
		//if(actualCurrentUrl.equals(expectedCurrentUrl) && actualtitle.equals(expectedtitle)) {
		//	System.out.println("My URL is correct");
		//} else {
		//	System.out.println("My URL is not correct");
		//}
	    	if(actualcurentUrl.equals(expectedCurrentUrl) && actusaltitle.equals(expectedtitle)) {
			System.out.println("My URL is correct");
		}else {
			System.out.println("\"My URL is NOT correct\"");
			
		}
		
		

	}

}
