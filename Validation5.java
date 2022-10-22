package home_work_10_22;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation5 {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.intimissimi.com/us/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String actualcurentUrl = "https://www.theguardian.com/us";
		String expectedCurrentUrl = driver.getCurrentUrl();
		
		String actusaltitle = "Underwear, Lingerie and Sleepwear Online Shop | Intimissimi";
		String expectedtitle = driver.getTitle();
		
		if(actualcurentUrl.equals(expectedCurrentUrl) && actusaltitle.equals(expectedtitle)) {
			System.out.println("My URL is correct");
		}else {
			System.out.println("\"My URL is NOT correct\"");
		}
	}
	
	////My result https://www.intimissimi.com/us/
	///Underwear, Lingerie and Sleepwear Online Shop | Intimissimi
	////"My URL is NOT correct"

}
