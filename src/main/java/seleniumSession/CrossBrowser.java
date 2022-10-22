package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	static WebDriver driver;
	public static void main(String[] args) {
		
		String Browser = "fireFox";
		switch (Browser.toLowerCase()) {
		case "chrome":
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\AjitabhS\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Open in "+Browser);
			break;
		case "firefox":
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\AjitabhS\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("Open in chrome"+Browser);
			break;	
		default:
			System.out.println("Please enter vslid user :"+Browser);
			break;
		}
	
		driver.get("https://trackon.in/");
	}

}
