package home_work_10_22;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation1 {

	public static void main(String[] args) {
		WebDriver driver;
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://abcnews.go.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String actualCurrentUrl = "https://abcnews.go.com/";
		String expectedCurrentUrl = driver.getCurrentUrl();
		String actualtitle = "ABC News – Breaking News, Latest News, Headlines & Videos - ABC News";
		String expectedtitle = driver.getTitle();
		
		if(actualCurrentUrl.equals(expectedCurrentUrl) && actualtitle.equals(expectedtitle)) {
			System.out.println("My URL is correct");
		} else {
			System.out.println("My URL is not correct");
		}

	}

}
