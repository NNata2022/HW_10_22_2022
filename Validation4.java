package home_work_10_22;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation4 {
public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.theguardian.com/us");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String actualcurentUrl = "https://www.theguardian.com/us";
		String expectedCurrentUrl = driver.getCurrentUrl();
		String actusaltitle = "News, sport and opinion from the Guardian's US edition | The Guardian";
		String expectedtitle = driver.getTitle();
		if(actualcurentUrl.equals(expectedCurrentUrl) && actusaltitle.equals(expectedtitle)) {
			System.out.println("My URL is correct");
		}else {
			System.out.println("\"My URL is NOT correct\"");
			
		}
	}

}
